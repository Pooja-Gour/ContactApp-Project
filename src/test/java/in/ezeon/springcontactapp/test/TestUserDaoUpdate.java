
package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;
import in.ezeon.springcontactapp.dao.UserDao;   

import in.ezeon.springcontactapp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestUserDaoUpdate {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig. class);
        UserDao userDao = ctx.getBean(UserDao.class);
        //user detelles will be taken user reg**
        User u = new User();
        u.setName("krishnapatel");
        u.setPhone("70756555");
        u.setEmail("poojaKrishna@12345");
        u.getUserId();
        u.getAddress();
        u.setRole(1);//active
        u.setLoginStatus(2);//active
        userDao.update(u);
        
        
        
        
        
        
        
    }
}
