
package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;


import in.ezeon.springcontactapp.domain.User;
import in.ezeon.springcontactapp.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestUserServiceRegister {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserService userService = ctx.getBean(UserService.class);
        
        //user detelles will be taken user reg**
        User u = new User();
        u.setName("ppp");
        u.setPhone("123");
        u.setEmail("krisha@12345");
        u.setAddress("uk");
        u.setLoginName("khhh55");
        u.setPassword("kkk@123");
        u.setRole(UserService.ROLE_ADMIN);
        u.setLoginStatus(UserService.LOGIN_STATUSE_ACTIVE);
        userService.register(u);
       
        System.out.println("......Ragisration successful........");
        
        
        
        
        
    }
}
