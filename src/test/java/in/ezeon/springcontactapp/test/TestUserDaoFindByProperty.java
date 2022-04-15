package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;
import in.ezeon.springcontactapp.dao.UserDao;

import in.ezeon.springcontactapp.domain.User;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDaoFindByProperty {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDao userDao = ctx.getBean(UserDao.class);
        //List<User> users =userDao.findByProperty("userId", 1);
        List<User> users =userDao.findByProperty("role", 1);
        
        for(User u : users){
            System.out.println(u.getUserId()+ " "+ u.getName()+" "+u.getPhone()+" "+u.getEmail()+" "+u.getAddress()+" "+u.getLoginName()+" "+u.getLoginStatus()+" "+u.getRole());
        }


    }
}
