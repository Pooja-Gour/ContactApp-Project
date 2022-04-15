package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;
import in.ezeon.springcontactapp.dao.UserDao;

import in.ezeon.springcontactapp.domain.User;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDaoFindAll {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDao userDao = ctx.getBean(UserDao.class);
        List<User> users =userDao.findaAll();
        for(User u : users){
            System.out.println(u.getUserId()+ " "+ u.getName()+" "+u.getPhone()+" "+u.getEmail()+" "+u.getAddress()+" "+u.getLoginName()+" "+u.getLoginStatus()+" "+u.getRole());
        }


    }
}
