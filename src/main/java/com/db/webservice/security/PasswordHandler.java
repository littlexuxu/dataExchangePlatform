package com.db.webservice.security;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;  

  
/** 
 * desc: comment PasswordHandler.java 
 * @author Chaisson(chengshengwang) 
 * @since Aug 19, 2011 5:08:30 PM 
 * @vision 1.0 
 */  
public class PasswordHandler implements CallbackHandler {  
  
	private Map<String, String> passwords = new HashMap<String, String>();

	public PasswordHandler() {
		passwords.put("serverpublickey", "keypass");
		passwords.put("clientprivatekey", "keypass");
	}

	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
		

		if (pc.getUsage() == WSPasswordCallback.USERNAME_TOKEN) {
			/*
			 * 客户端用户名、密码输入，以便服务器端做用户的验证
			 * 此处默认的用户是xml文件中配置的“user"，在这里可以修改成我们实际对接所用的用户、密码。
			 */
			System.out.println("CLient端开始用户认证===============================================================");
			pc.setIdentifier("李宗良");
			//由于换了生产库密码拿不到所以暂时直接查出数据库里的密码做校验，生产环境部署的时候采用下面注释方式的密码校验
			pc.setPassword("B9E291F828705BC43C8F2C4AE95FA50A");
			//pc.setPassword(Codec.SHA256("ZJscjy_201609284CC16D222000002309B5E08EF28A0E5D"));
			
			System.out.println("Calling PasswordHandle: Username Token, id=" + pc.getIdentifier());
		} else if (pc.getUsage() == WSPasswordCallback.SIGNATURE) {
			/*
			 * 客户端的签名： 客户端根据自己的私钥进行签名，
			 * 此处可以的id也可以根据需要设置，须保证此处id跟服务器端存储此用户公钥的alias名称保持一致。
			 */

		} else if (pc.getUsage() == WSPasswordCallback.DECRYPT) {
			/*
			 * 客户端加密： 客户端加密不会访问到这里的！ 客户端加密应该是根据xml里面配置的加密用户名，
			 * 然后根据这个用户名作为alias去store里面找对应的公钥进行自动加密， 所以不会到这里访问了。
			 */
		} else {
			System.out.println("Calling PasswordHandle: Other Usage, id=" + pc.getIdentifier());
		}

	}  
}  