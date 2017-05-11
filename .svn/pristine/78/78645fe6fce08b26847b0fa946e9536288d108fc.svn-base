package com.db.webservice.security;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.security.MessageDigest;
import java.util.Arrays;

/**
 * �ַ����롢����
 * 
 * @author waf
 */
public abstract class Codec {
	/**
	 * �Կո񡢱�㡢���������Լ�������ASCII�ַ���%xx���б���
	 * 
	 * @param src
	 *            ��������ַ���
	 * @return �ѱ�����ַ���
	 */
	public static String escape(String src) {
		int i;
		char j;
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length() * 6);
		for (i = 0; i < src.length(); i++) {
			j = src.charAt(i);
			if (Character.isDigit(j) || Character.isLowerCase(j) || Character.isUpperCase(j))
				tmp.append(j);
			else if (j < 256) {
				tmp.append("%");
				if (j < 16)
					tmp.append("0");
				tmp.append(Integer.toString(j, 16));
			} else {
				tmp.append("%u");
				tmp.append(Integer.toString(j, 16));
			}
		}
		return tmp.toString();
	}

	/**
	 * �Ա�����ַ������н���
	 * 
	 * @param src
	 *            ��������ַ���
	 * @return ������ַ���
	 */
	public static String unescape(String src) {
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length());
		int lastPos = 0, pos = 0;
		char ch;
		while (lastPos < src.length()) {
			pos = src.indexOf("%", lastPos);
			if (pos == lastPos) {
				if (src.charAt(pos + 1) == 'u') {
					ch = (char) Integer.parseInt(src.substring(pos + 2, pos + 6), 16);
					tmp.append(ch);
					lastPos = pos + 6;
				} else {
					ch = (char) Integer.parseInt(src.substring(pos + 1, pos + 3), 16);
					tmp.append(ch);
					lastPos = pos + 3;
				}
			} else {
				if (pos == -1) {
					tmp.append(src.substring(lastPos));
					lastPos = src.length();
				} else {
					tmp.append(src.substring(lastPos, pos));
					lastPos = pos;
				}
			}
		}
		return tmp.toString();
	}

	/**
	 * MD5�����㷨
	 * 
	 * @param s
	 *            ����
	 * @return ����
	 */
	public final static String md5(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

		try {
			byte[] strTemp = s.getBytes();

			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);

			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;

			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];

				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}

			return new String(str);
		} catch (Exception e) {
			return s;
		}
	}


	/**
	 * SHA256 �����㷨
	 * 
	 * @param s
	 *            ����
	 * @return ����
	 */
	
	public final static String SHA256(String message){
		final Charset UTF8 = Charset.forName("UTF-8");
		CharsetEncoder  encoder = UTF8.newEncoder();
		encoder.onMalformedInput(CodingErrorAction.IGNORE);
		encoder.onUnmappableCharacter(CodingErrorAction.IGNORE);
		
        char hexDigits[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};       
        try {
            MessageDigest mdInst = MessageDigest.getInstance("SHA-256");
            ByteBuffer bb = encoder.encode(CharBuffer.wrap(message));
            mdInst.update(bb);
            
            byte[] md = mdInst.digest();

            int j = md.length; 
            char str[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            
            // default result string is 16 length
            j = str.length;
            if(j > 32){
            	return new StringBuffer().append(Arrays.copyOfRange(str, 0, 16)).append(Arrays.copyOfRange(str, j-16, j)).toString();
            }else{
            	return new String(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    
	}
}
