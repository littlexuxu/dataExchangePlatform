/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.db.webservice.security;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.security.AccessController;
import java.security.MessageDigest;
import java.security.PrivilegedAction;
import java.security.SecureRandom;
import java.util.Comparator;

import sun.misc.Unsafe;

public final class GUID implements Serializable, Comparable<GUID> {
	public static final Comparator<GUID> comparator = new Comparator<GUID>() {
		public int compare(GUID o1, GUID o2) {
			return o1.compareTo(o2);
		}
	};
	private final long mostSigBits;
	private final long leastSigBits;
	private static final int h2b_A_10 = 55;
	private static final int h2b_a_10 = 87;
	public static final GUID emptyID = new GUID(0L, 0L);

	public static final GUID minID = emptyID;

	public static final GUID maxID = new GUID(-1L, -1L);

	private static ThreadLocal<MD5Digest> md5s = new ThreadLocal() {
		protected GUID.MD5Digest initialValue() {
			return new GUID.MD5Digest();
		}
	};

	private static ThreadLocal<SHA256Digest> sha256 = new ThreadLocal() {
		protected GUID.SHA256Digest initialValue() {
			return new GUID.SHA256Digest();
		}
	};

	private static final byte[] bytes16 = new byte[16];
	private static final byte[] bytes8 = new byte[8];
	private static final long serialVersionUID = 2686938417664634277L;
	private static final SecureRandom numberGenerator = new SecureRandom();

    public static void printCallStatck(String title) {
        Throwable ex = new Throwable();
        StackTraceElement[] stackElements = ex.getStackTrace();
        if (stackElements != null) {
        	System.out.println("        -------------AAAAAAAA: Call Stack Info for " + title + "   ----------------------");
            for (int i = 0; i < stackElements.length; i++) {
            	
                System.out.print("        " + i+ ".   CLASS=" + stackElements[i].getClassName()+"     ");
                //System.out.print("FileName=" + stackElements[i].getFileName()+"     ");
                System.out.print("METHOD=" + stackElements[i].getMethodName()+"     ");               
                System.out.println("LNUM=" + stackElements[i].getLineNumber());
            }
        }
    }
	
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj instanceof GUID) {
			GUID one = (GUID) obj;

			return ((this.leastSigBits == one.leastSigBits) && (this.mostSigBits == one.mostSigBits));
		}
		return false;
	}

	public boolean isEmpty() {
		return ((this.leastSigBits == 0L) && (this.mostSigBits == 0L));
	}

	public boolean equals(GUID id) {
		return ((id == this)
				|| ((id != null) && (this.leastSigBits == id.leastSigBits) && (this.mostSigBits == id.mostSigBits)));
	}

	public byte[] toBytes() {
		return toBytes(null);
	}

	public byte[] toBytes(byte[] bytes) {
		if ((bytes == null) || (bytes.length != 16)) {
			bytes = new byte[16];
		}
		long sb = this.leastSigBits;
		for (int i = 15; i >= 8; --i) {
			bytes[i] = (byte) (int) sb;
			sb >>>= 8;
		}
		sb = this.mostSigBits;
		for (int i = 7; i >= 0; --i) {
			bytes[i] = (byte) (int) sb;
			sb >>>= 8;
		}
		return bytes;
	}

	public void toBytes(byte[] buf, int off) {
		if (buf == null) {
			throw new NullPointerException("buf");
		}
		int blen = buf.length;
		if ((off < 0) || (off > blen)) {
			throw new IndexOutOfBoundsException("buf's length: " + blen + ", off: " + off);
		}
		if (blen - off < 16) {
			throw new BufferUnderflowException();
		}

		long sb = this.leastSigBits;
		for (int i = off + 15; i >= off + 8; --i) {
			buf[i] = (byte) (int) sb;
			sb >>>= 8;
		}
		sb = this.mostSigBits;
		for (int i = off + 7; i >= off; --i) {
			buf[i] = (byte) (int) sb;
			sb >>>= 8;
		}
	}

	public static boolean equals(GUID id1, GUID id2) {
		if (id1 == id2) {
			return true;
		}

		return ((id1 != null) && (id2 != null) && (id1.leastSigBits == id2.leastSigBits)
				&& (id1.mostSigBits == id2.mostSigBits));
	}

	public final int hashCode() {
		return (int) (this.mostSigBits >>> 32 ^ this.mostSigBits ^ this.leastSigBits >>> 32 ^ this.leastSigBits);
	}

	public final int compareTo(GUID val) {
		long d = (this.mostSigBits >>> 1) - (val.mostSigBits >>> 1);
		if (d > 0L) {
			return 1;
		}
		if (d < 0L) {
			return -1;
		}
		d = (this.mostSigBits & 1L) - (val.mostSigBits & 1L);
		if (d > 0L) {
			return 1;
		}
		if (d < 0L) {
			return -1;
		}
		d = (this.leastSigBits >>> 1) - (val.leastSigBits >>> 1);
		if (d > 0L) {
			return 1;
		}
		if (d < 0L) {
			return -1;
		}
		d = (this.leastSigBits & 1L) - (val.leastSigBits & 1L);
		if (d > 0L) {
			return 1;
		}
		if (d < 0L) {
			return -1;
		}
		return 0;
	}

	public final long getMostSigBits() {
		return this.mostSigBits;
	}

	public final long getLeastSigBits() {
		return this.leastSigBits;
	}

	public final String toString() {
		return toString(false, true);
	}

	private static int parseChar(String s, int offset) throws ValueConvertException, StringIndexOutOfBoundsException {
		char c = s.charAt(offset);
		if (c >= '0') {
			if (c <= '9')
				return (c - '0');
			if (c >= 'A') {
				if (c <= 'F')
					return (c - '7');
				if ((c >= 'a') && (c <= 'f'))
					return (c - 'W');
			}
		}
		throw new ValueConvertException("��ƫ����" + offset + "��������Ч��ʮ������ַ�'" + c + "'");
	}

	private static void byteToHex(char[] hex, int index, byte b, boolean upperCase) {
		int h = b >>> 4 & 0xF;
		if (upperCase) {
			hex[index] = (char) ((h > 9) ? h + 55 : h + 48);
			h = b & 0xF;
			hex[(index + 1)] = (char) ((h > 9) ? h + 55 : h + 48);
		} else {
			hex[index] = (char) ((h > 9) ? h + 87 : h + 48);
			h = b & 0xF;
			hex[(index + 1)] = (char) ((h > 9) ? h + 87 : h + 48);
		}
	}

	private static void appendTo(Appendable hex, long l, boolean upperCase) throws IOException {
		int b = (int) (l >>> 56);
		int h = b >>> 4 & 0xF;
		if (upperCase) {
			hex.append((char) ((h > 9) ? h + 55 : h + 48));
			h = b & 0xF;
			hex.append((char) ((h > 9) ? h + 55 : h + 48));
		} else {
			hex.append((char) ((h > 9) ? h + 87 : h + 48));
			h = b & 0xF;
			hex.append((char) ((h > 9) ? h + 87 : h + 48));
		}
	}

	public final String toString(boolean withPrefix, boolean upperCase) {
		int j = (withPrefix) ? 34 : 32;
		char[] hex = new char[j];
		if (withPrefix) {
			hex[0] = '0';
			hex[1] = ((upperCase) ? 88 : 'x');
		}
		long sb = this.leastSigBits;
		j -= 2;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb = this.mostSigBits;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		j -= 2;
		sb >>>= 8;
		byteToHex(hex, j, (byte) (int) sb, upperCase);
		return UnsafeString.fastString(hex);
	}

	public final void appendTo(Appendable hex) {
		appendTo(hex, false, true);
	}

	public final void appendTo(Appendable hex, boolean withPrefix, boolean upperCase) {
		if (hex == null)
			throw new NullPointerException("hex is null");
		try {
			if (withPrefix) {
				hex.append('0');
				hex.append((upperCase) ? 'X' : 'x');
			}
			long sb = this.mostSigBits;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb = this.leastSigBits;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
			sb <<= 8;
			appendTo(hex, sb, upperCase);
		} catch (Throwable e) {
			UnsafeString.unsafe.throwException(e);
		}
	}

	public static GUID valueOf(long mostSigBits, long leastSigBits) {
		if ((mostSigBits == 0L) && (leastSigBits == 0L)) {
			return emptyID;
		}
		return new GUID(mostSigBits, leastSigBits);
	}

	public static GUID valueOf(byte[] bytes) {
		if (bytes == null) {
			return null;
		}
		int length = bytes.length;
		if (length == 0) {
			return emptyID;
		}
		int c = (length > 8) ? 8 : length;
		int index = 0;
		long msb,lsb;
		 msb = bytes[(index++)] & 0xFF;
		while (index < c)
			msb = msb << 8 | bytes[(index++)] & 0xFF;
		if (index < length) {
			 lsb = bytes[(index++)] & 0xFF;
			while (index < length)
				lsb = lsb << 8 | bytes[(index++)] & 0xFF;
		} else {
			lsb = 0L;
		}
		if ((msb == 0L) && (lsb == 0L)) {
			return emptyID;
		}
		
		//System.err.println("[msb, lsb] = [" + msb + ",  " + lsb + "]");
		return new GUID(msb, lsb);
	}

	public static GUID valueOf(byte[] buf, int off) {
		if (buf == null) {
			throw new NullPointerException("buf");
		}
		int blen = buf.length;
		if ((off < 0) || (off > blen)) {
			throw new IndexOutOfBoundsException("buf's length: " + blen + ", off: " + off);
		}
		if (blen - off < 16) {
			throw new BufferUnderflowException();
		}

		int end = off + 8;
		long msb = buf[(off++)] & 0xFF;
		while (off < end) {
			msb = msb << 8 | buf[(off++)] & 0xFF;
		}
		end = off + 8;
		long lsb = buf[(off++)] & 0xFF;
		while (off < end) {
			lsb = lsb << 8 | buf[(off++)] & 0xFF;
		}
		if ((msb == 0L) && (lsb == 0L)) {
			return emptyID;
		}
		return new GUID(msb, lsb);
	}

	public static GUID MD5Of(CharSequence message) {
/*        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        
        System.out.println(">>>>>>>>>>>>>>> 444444444444 input string = " + message +
        		"\n classname = " + className + "\n MethodName = " + methodName + "\n lineNumber = " + lineNumber + "\n");
*/
		return ((MD5Digest) md5s.get()).digest(message);
	}

	public static GUID MD5Of(String message) {
/*        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        
        System.out.println(">>>>>>>>>>>>>>> 3333333333333333 input string = " + message +
        		"\n classname = " + className + "\n MethodName = " + methodName + "\n lineNumber = " + lineNumber + "\n");
*/
		return ((MD5Digest) md5s.get()).digest(message);
	}

	public static long mostSigBitsMD5Of(CharSequence message) {
		return ((MD5Digest) md5s.get()).digestToLong(message);
	}

	public static byte[] MD5BytesOf(CharSequence message) {
		return ((MD5Digest) md5s.get()).digestTo16Bytes(message);
	}

	public static GUID SHA256Of(CharSequence message) {
/*        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
        
        System.out.println(">>>>>>>>>>>>>>> 2222222222222 input string = " + message +
        		"\n classname = " + className + "\n MethodName = " + methodName + "\n lineNumber = " + lineNumber + "\n");
*/
		return ((SHA256Digest) sha256.get()).digest(message);
	}

	public static GUID SHA256Of(String message) {
/*        String className = Thread.currentThread().getStackTrace()[2].getClassName();
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();

        
        System.out.println(">>>>>>>>>>>>>>> 1111111111111 input string = " + message +
        		"\n classname = " + className + "\n MethodName = " + methodName + "\n lineNumber = " + lineNumber + "\n");
*/
		return ((SHA256Digest) sha256.get()).digest(message);
	}

	public static long mostSigBitsSHA256Of(CharSequence message) {
		return ((SHA256Digest) sha256.get()).digestToLong(message);
	}

	public static byte[] SHA256BytesOf(CharSequence message) {
		return ((SHA256Digest) sha256.get()).digestTo16Bytes(message);
	}

	private static long hexToLong(String str, int start) {
		long temp = parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		temp = temp << 4 | parseChar(str, start++);
		return (temp << 4 | parseChar(str, start++));
	}

	private static GUID tryParse(String str, boolean throwException) {
		if (str == null) {
			return null;
		}
				
		int strl = str.length();
		if (strl == 32)
		try { 
			return valueOf(hexToLong(str, 0), hexToLong(str, 16));
		} catch (ValueConvertException e) {
			if (throwException) {
				throw e;
			}

			if (throwException)
				throw new ValueConvertException("GUID�ı���ʽ����:" + str);
		}
		return null;
	}

	public static GUID tryValueOf(String str) {
/*	       String className = Thread.currentThread().getStackTrace()[2].getClassName();
	        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
	        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
	        
	        System.out.println(">>>>>>>>>>>>>>> 555555555555 input string = " + str +
	        		"\n classname = " + className + "\n MethodName = " + methodName + "\n lineNumber = " + lineNumber + "\n");
*/
		return tryParse(str, false);
	}

	public static GUID valueOf(String str) {
/*	       String className = Thread.currentThread().getStackTrace()[2].getClassName();
	        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
	        int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
	        
	        System.out.println(">>>>>>>>>>>>>>> 66666666666 input string = " + str +
	        		"\n classname = " + className + "\n MethodName = " + methodName + "\n lineNumber = " + lineNumber + "\n");
*/
		
		return tryParse(str, true);
	}

	public static GUID randomID() {
		long msb, lsb;
		synchronized (numberGenerator) {
			numberGenerator.nextBytes(bytes16);
			 msb = bytes16[0] & 0xFF;
			for (int i = 1; i < 8; ++i) {
				msb = msb << 8 | bytes16[i] & 0xFF;
			}
			 lsb = bytes16[8] & 0xFF;
			for (int i = 9; i < 16; ++i)
				lsb = lsb << 8 | bytes16[i] & 0xFF;
		}

		return new GUID(msb, lsb);
	}

	public static long randomLong() {
		synchronized (numberGenerator) {
			numberGenerator.nextBytes(bytes8);
			long msb = bytes8[0] & 0xFF;
			for (int i = 1; i < 8; ++i) {
				msb = msb << 8 | bytes8[i] & 0xFF;
			}
			return msb;
		}
	}

	private GUID(long mostSigBits, long leastSigBits) {
		this.mostSigBits = mostSigBits;
		this.leastSigBits = leastSigBits;
	}

	private Object readResolve() {
		if ((this.leastSigBits == 0L) || (this.mostSigBits == 0L)) {
			return emptyID;
		}
		return this;
	}

	private static class MD5Digest {
		private static Charset UTF8 = Charset.forName("UTF-8");
		private final MessageDigest md5;
		private final CharsetEncoder encoder;

		final GUID digest(CharSequence message) {
			if (message == null) {
				throw new IllegalArgumentException("message is null");
			}
			if (message.length() == 0)
				return GUID.emptyID;
			ByteBuffer bb;
			try {
				bb = this.encoder.encode(CharBuffer.wrap(message));
			} catch (CharacterCodingException e) {
				GUID.UnsafeString.unsafe.throwException(e);
				return null;
			}

			this.md5.update(bb);
			return GUID.valueOf(this.md5.digest());
		}

		final byte[] digestTo16Bytes(CharSequence message) {
			if (message == null) {
				throw new IllegalArgumentException("message is null");
			}
			if (message.length() == 0)
				return new byte[16];
			ByteBuffer bb;
			try {
				bb = this.encoder.encode(CharBuffer.wrap(message));
			} catch (CharacterCodingException e) {
				GUID.UnsafeString.unsafe.throwException(e);
				return null;
			}
			this.md5.update(bb);
			return this.md5.digest();
		}

		final long digestToLong(CharSequence message) {
			if (message == null) {
				throw new IllegalArgumentException("message is null");
			}
			if (message.length() == 0)
				return 0L;
			try {
				this.md5.update(this.encoder.encode(CharBuffer.wrap(message)));
			} catch (CharacterCodingException e) {
				GUID.UnsafeString.unsafe.throwException(e);
				return 0L;
			}
			byte[] buf = this.md5.digest();
			long msb = buf[0] & 0xFF;
			for (int i = 1; i < 8; ++i) {
				msb = msb << 8 | buf[i] & 0xFF;
			}

			return msb;
		}

		MD5Digest() {
			MessageDigest md5;
			try {
				md5 = MessageDigest.getInstance("MD5");
			} catch (Throwable e) {
				GUID.UnsafeString.unsafe.throwException(e);
				md5 = null;
			}
			this.md5 = md5;
			this.encoder = UTF8.newEncoder();
			this.encoder.onMalformedInput(CodingErrorAction.IGNORE);
			this.encoder.onUnmappableCharacter(CodingErrorAction.IGNORE);
		}
	}

	private static class SHA256Digest {
		private static Charset UTF8 = Charset.forName("UTF-8");
		private final MessageDigest sha256;
		private final CharsetEncoder encoder;

		final GUID digest(CharSequence message) {
			if (message == null) {
				throw new IllegalArgumentException("message is null");
			}
			if (message.length() == 0)
				return GUID.emptyID;
			ByteBuffer bb;
			try {
				bb = this.encoder.encode(CharBuffer.wrap(message));
			} catch (CharacterCodingException e) {
				GUID.UnsafeString.unsafe.throwException(e);
				return null;
			}
			this.sha256.update(bb);
			
			return GUID.valueOf(this.sha256.digest());
		}

		final byte[] digestTo16Bytes(CharSequence message) {
			if (message == null) {
				throw new IllegalArgumentException("message is null");
			}
			if (message.length() == 0)
				return new byte[16];
			ByteBuffer bb;
			try {
				bb = this.encoder.encode(CharBuffer.wrap(message));
			} catch (CharacterCodingException e) {
				GUID.UnsafeString.unsafe.throwException(e);
				return null;
			}
			this.sha256.update(bb);
			return this.sha256.digest();
		}

		final long digestToLong(CharSequence message) {
			if (message == null) {
				throw new IllegalArgumentException("message is null");
			}
			if (message.length() == 0)
				return 0L;
			try {
				this.sha256.update(this.encoder.encode(CharBuffer.wrap(message)));
			} catch (CharacterCodingException e) {
				GUID.UnsafeString.unsafe.throwException(e);
				return 0L;
			}
			byte[] buf = this.sha256.digest();
			long msb = buf[0] & 0xFF;
			for (int i = 1; i < 8; ++i) {
				msb = msb << 8 | buf[i] & 0xFF;
			}

			return msb;
		}

		SHA256Digest() {
			MessageDigest sha256;

			try {
				sha256 = MessageDigest.getInstance("SHA-256");
			} catch (Throwable e) {
				GUID.UnsafeString.unsafe.throwException(e);
				sha256 = null;
			}
			this.sha256 = sha256;
			this.encoder = UTF8.newEncoder();
			this.encoder.onMalformedInput(CodingErrorAction.IGNORE);
			this.encoder.onUnmappableCharacter(CodingErrorAction.IGNORE);
		}
	}

	private static class UnsafeString {
		static final Unsafe unsafe = getUnsafe();

		private static Unsafe getUnsafe() {
			Unsafe us;
			try {
				Field f = Unsafe.class.getDeclaredField("theUnsafe");

				AccessController.doPrivileged(new PrivilegedAction<Object>() {
					public Object run() {
						//GUID.UnsafeString.this.setAccessible(true);
						return null;
					}
				});
				us = (Unsafe) f.get(null);
			} catch (Throwable localThrowable) {
				us = null;
			}
			return us;
		}

		static String fastString(char[] chars) {
			int charCount = chars.length;
			if (charCount == 0) {
				return "";
			}
			return new String(chars);
		}
	}
}