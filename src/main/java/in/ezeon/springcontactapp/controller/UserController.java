package in.ezeon.springcontactapp.controller;

import in.ezeon.springcontactapp.command.LoginCommand;
import in.ezeon.springcontactapp.domain.User;
import in.ezeon.springcontactapp.exception.UserBlockedExeption;
import in.ezeon.springcontactapp.service.UserService;
import static java.lang.Compiler.command;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private UserService UserService;

    @RequestMapping(value = {"/","/index"})
    public String index(Model m) {
        m.addAttribute("command", new LoginCommand());
        return "index";//jsp view web idex page name 
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)//frent controller handling data  handleLohgin
    public String handleLogin(@ModelAttribute("command") LoginCommand cmd, Model m) {

        try {
            User loggedInUser = UserService.login(cmd.getLoginName(), cmd.getPassword());
            if (loggedInUser == null) {
                m.addAttribute("err", "Login failed! Emter valid credentals");
                return "index";//feild
            } else{
                if(loggedInUser.getRole().equals(UserService.ROLE_ADMIN)){
                    return "redirect:admin/dashboard";
                }else if(loggedInUser.getRole().equals(UserService.ROLE_USER)){
                    return "redirect:User/dashboard";
                }else{
                    m.addAttribute("err", "Invaild User ROLE");
                    return "index";
                }
            }
                
            
        } catch (UserBlockedExeption ex) {
            m.addAttribute("err", ex.getMessage());
            return "index";
        }

    }

    @RequestMapping(value = {"/user/dashboard"})
    public String userDashboard() {
        return "dashboard_user";//jsp view web idex page name 
    }

    @RequestMapping(value = {"/admin/dashboard"})
    public String adminDashboard() {
        return "dashboard_admin";//jsp view web idex page name 
    }
}
