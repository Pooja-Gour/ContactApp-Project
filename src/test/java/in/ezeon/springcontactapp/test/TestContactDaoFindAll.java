
package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;
import in.ezeon.springcontactapp.dao.ContactDao;
import in.ezeon.springcontactapp.dao.UserDao;
import in.ezeon.springcontactapp.domain.Contact;
import java.util.List;
import jdk.internal.util.StaticProperty;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestContactDaoFindAll {

    
    public static void main(String[] args) {
        ApplicationContext cxt = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        ContactDao contactDao = cxt.getBean(ContactDao.class);
        List<Contact> contacts = contactDao.findaAll();
        for(Contact c: contacts){
            System.out.println(c.getContactId()+" "+ c.getUserId() +""+ c.getName()+" "+ c.getEmail()+" "+c.getRemark()+" "+c.getAddress());
        }
    
    }
}
