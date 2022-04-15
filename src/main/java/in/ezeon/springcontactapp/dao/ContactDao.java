/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.ezeon.springcontactapp.dao;

import in.ezeon.springcontactapp.domain.Contact;
import in.ezeon.springcontactapp.domain.User;
import java.util.List;

/**
 *
 * @author pooja
 */
public interface ContactDao {
    public void save(Contact c);
    public void update(Contact c);
    public void delete(Contact c);
    public void delete(Integer ContactId);
    public Contact findById(Integer ContactId);
   
    public List<Contact> findaAll();
    public List<Contact> findByProperty(String properName, Object propValue);
}
