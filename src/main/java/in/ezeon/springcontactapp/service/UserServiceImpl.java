
package in.ezeon.springcontactapp.service;

import in.ezeon.springcontactapp.dao.BaseDao;
import in.ezeon.springcontactapp.dao.UserDao;
import in.ezeon.springcontactapp.domain.User;
import in.ezeon.springcontactapp.exception.UserBlockedExeption;
import in.ezeon.springcontactapp.rm.UserRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Service;

/**
 *
 * @author pooja
 */
@Service
class UserServiceImpl extends BaseDao implements UserService{
    
    
    @Autowired
    private  UserDao userDao;
//    
    @Override
    public void register(User u) {
       userDao.save(u);
       
    
    }

    @Override
    public User login(String LoginName, String password) throws UserBlockedExeption {
          String sql = "SELECT userId,name,phone,email,address,role,loginStatus,loginName"
             + " FROM user WHERE loginName=:lg AND password=:pw";
            Map m= new HashMap();
            m.put("lg", LoginName);
            m.put("pw", password);
         try{  
            User u= getNamedParameterJdbcTemplate().queryForObject(sql, m,new UserRowMapper());
            if(u.getLoginStatus().equals(UserService.LOGIN_STATUSE_BLOCKED)){
                throw new UserBlockedExeption("Your account has been blocked.contact to addmin");
            }else{
                return u;
            }
         }catch(EmptyResultDataAccessException ex){
            return null;
         }
    }

    @Override
    public List<User> getUserList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void changeLoginStatus(Integer userIdIn, Integer loginId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
