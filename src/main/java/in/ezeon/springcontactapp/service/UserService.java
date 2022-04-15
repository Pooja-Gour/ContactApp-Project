package in.ezeon.springcontactapp.service;

import in.ezeon.springcontactapp.domain.User;
import in.ezeon.springcontactapp.exception.UserBlockedExeption;
import java.util.HashMap;

import java.util.List;
import java.util.Map;


public interface UserService {

    public static final Integer LOGIN_STATUSE_ACTIVE = 1;
    public static final Integer LOGIN_STATUSE_BLOCKED = 2;

    public static final Integer ROLE_ADMIN = 1;
    public static final Integer ROLE_USER = 2;

    //the method the user regisrationtask
    //u new ditails
    public void register(User u);
//method hendale login opration (automatical using given credentails
// reteun user object when success and null when faild.uesr account block
//@param LoginName,Password/
//throw userAccont block

    public User login(String LoginName, String password) throws UserBlockedExeption;
   
     
    public List<User> getUserList();

    public void changeLoginStatus(Integer userIdIn, Integer loginId);
}
