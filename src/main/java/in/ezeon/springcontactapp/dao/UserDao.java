
package in.ezeon.springcontactapp.dao;

import in.ezeon.springcontactapp.domain.User;
import java.util.List;


public interface UserDao {
    public void save(User u);
    public void update(User u);
    public void delete(User u);
    public void delete(Integer userId);
    public User findById(Integer userId);
    
    public List<User> findaAll();
    public List<User> findByProperty(String properName, Object propValue);
}
