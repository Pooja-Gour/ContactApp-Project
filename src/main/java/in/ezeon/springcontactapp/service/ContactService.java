
package in.ezeon.springcontactapp.service;

import in.ezeon.springcontactapp.domain.Contact;
import java.util.List;

/**
 *
 
 */
public interface ContactService {
    public void save(Contact c);
    public void update(Contact c);
    public void delete(Integer contactId);
    public void delete(Integer[] contactId);
    
    //this method returns all user contact user who locked  in (userId)
    
    public List<Contact>findUserContact(Integer userId);
    //method search con. for userId besed on givens free text cre
    
    public List<Contact>findUserContact(Integer userId,String txt);
    
}
