
package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;
import in.ezeon.springcontactapp.dao.ContactDao;
import in.ezeon.springcontactapp.dao.UserDao;   
import in.ezeon.springcontactapp.domain.Contact;

import in.ezeon.springcontactapp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestContactDaoUpdate {
    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig. class);
        ContactDao contactDao = ctx.getBean(ContactDao.class);
        
        //contact detelles will be taken user reg**
         Contact c = new Contact();
          c.setUserId(1);
          c.setContactId(1);
          c.setName("Tanya");
          c.setAddress("USA");
          c.setPhone("412");
          c.setRemark("good");
          contactDao.update(c);
          
        
        
        
        
        
        
        
        
    }
}
