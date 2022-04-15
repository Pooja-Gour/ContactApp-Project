package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;
import in.ezeon.springcontactapp.dao.ContactDao;
import in.ezeon.springcontactapp.domain.Contact;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestContactDaoSave {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        ContactDao contactDao = ctx.getBean(ContactDao.class);

        Contact cc = new Contact();
        cc.setUserId(1);
        cc.setName("Tanya");
        cc.setPhone("780952");
        cc.setEmail("tanya@123");
        cc.setAddress("USA sar");
        cc.setContactId(2);
        cc.setRemark("buttiful");
        contactDao.save(cc);
        System.out.println("........contact save successfully..............");

    }

}
