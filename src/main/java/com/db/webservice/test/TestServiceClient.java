package com.db.webservice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbVO;
import cn.ccccltd.webservice.construction.projectbaseinfo.GhscgzjzbWs;

  
/** 
 * desc: comment TestServiceClient.java 
 * @author Chaisson(chengshengwang) 
 * @since May 13, 2011 2:17:04 PM 
 * @vision 1.0 
 */  
public class TestServiceClient {  
  
    /** 
     * desc: 
     * @Chaisson(chengshengwang) 
     * @since May 13, 2011 
     * @version 1.0 
     * @param args 
     */  
    public static void main(String[] args) {  
        /*JaxWsProxyFactoryBean  factory = new JaxWsProxyFactoryBean (); 
        factory.setServiceClass(TestService.class); 
        factory.setAddress("http://localhost:8080/TestCXF/services/MyService"); 
        TestService service =(TestService)factory.create(); 
        service.sayHello("Chaisson"); 
         
        User user = new User(); 
        user.setAge(10); 
        user.setName("Chaisson"); 
        user.setDesc("He is a good man"); 
        System.out.println(service.printMan(user));*/  
          
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");  
        
        GhscgzjzbWs client = (GhscgzjzbWs)ctx.getBean("client");  
          
        GhscgzjzbVO projectBaseInfo = new GhscgzjzbVO();  
        projectBaseInfo.setCxmid("201991");  
        System.out.println(client.addBaseInfo(projectBaseInfo));  
        //System.out.println(client.sayHello("admin"));
    }  
  
} 