
package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;
import in.ezeon.springcontactapp.dao.UserDao;
import in.ezeon.springcontactapp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDaoDelete {

    
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDao userDao = ctx.getBean(UserDao.class);
        userDao.delete(2);
        User u = new User();
        u.setUserId(Integer.SIZE);
        u.setUserId(1);
        userDao.delete(u);
        
    }
    
}
