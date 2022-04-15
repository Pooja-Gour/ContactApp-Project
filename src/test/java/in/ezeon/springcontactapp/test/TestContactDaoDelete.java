
package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;
import in.ezeon.springcontactapp.dao.ContactDao;
import in.ezeon.springcontactapp.domain.Contact;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author pooja
 */
public class TestContactDaoDelete {

   
    public static void main(String[] args) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig. class);
        ContactDao contactDao = ctx.getBean(ContactDao.class);
        contactDao.delete(3);
        Contact c = new Contact();
         c.setContactId(2);
        contactDao.delete(c);
       
    }
    
}
