
package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;
import in.ezeon.springcontactapp.dao.UserDao;
import in.ezeon.springcontactapp.domain.Contact;

import in.ezeon.springcontactapp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestUserDaoSave {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig. class);
        UserDao userDao = ctx.getBean(UserDao.class);
        //user detelles will be taken user reg**
        Contact cc = new Contact();
       
        User u = new User();
        u.setName("krishna");
        u.setPhone("70756555");
        u.setEmail("pooja@12345");
        u.setAddress("Indore");
        u.setLoginName("kpp000");
        u.setPassword("amit@123");
        u.setRole(1);//active
        u.setLoginStatus(1);//active
        userDao.save(u);
        
        System.out.println("userId  "+u.getUserId());
        
        
        
        
        
    }
}
