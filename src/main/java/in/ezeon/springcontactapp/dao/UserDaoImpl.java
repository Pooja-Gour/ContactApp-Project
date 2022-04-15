package in.ezeon.springcontactapp.dao;

import in.ezeon.springcontactapp.domain.User;
import in.ezeon.springcontactapp.rm.UserRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository//class handling database
public class UserDaoImpl extends BaseDao implements UserDao {

    @Override
    public void save(User u) {
        String sql = "INSERT INTO user(name,phone,email,address,loginName,password,role,loginStatus)"
                + "VALUES(:name, :phone, :email, :address, :loginName, :password, :role, :loginStatus)";
        //Map m = new HashMap();
        MapSqlParameterSource m = new MapSqlParameterSource();
        m.addValue("name", u.getName());
        m.addValue("phone", u.getPhone());
        m.addValue("email", u.getEmail());
        m.addValue("address", u.getAddress());
        m.addValue("loginName", u.getLoginName());
        m.addValue("password", u.getPassword());
        m.addValue("role", u.getRole());
        m.addValue("loginStatus", u.getLoginStatus());

        KeyHolder kh = new GeneratedKeyHolder();
        //SqlParameterSource sps = new MapSqlParameterSource(m);
        super.getNamedParameterJdbcTemplate().update(sql, m, kh);
        Integer userId = kh.getKey().intValue();//user all details accept userid outo primery key ko get krne k liye keyholder user ... 
        u.setUserId(userId);
    }

    @Override
    public void update(User u) {

        String sql = "UPDATE user"
                + " SET name=:name,"
                + " phone=:phone,"
                + " email=:email,"
                + " address=:address,"
                + " role=:role,"
                + " loginStatus=:loginStatus"
                + " WHERE userId=:userId";
        Map m = new HashMap();

        m.put("name", u.getName());
        m.put("phone", u.getPhone());
        m.put("email", u.getEmail());
        m.put("address", u.getAddress());

        m.put("role", u.getRole());
        m.put("loginStatus", u.getLoginStatus());
        m.put("userId", u.getUserId());
        getNamedParameterJdbcTemplate().update(sql, m);

    }

    @Override
    public void delete(User u) {
    this.delete(u.getUserId());
    }

    @Override
    public void delete(Integer userId) {
        String sql = "DELETE FROM user WHERE userId =?";
        getJdbcTemplate().update(sql,userId);
        
    }

    @Override
    public User findById(Integer userId) {
        String sql = "SELECT userId, name, phone, email, address, loginName, role, loginStatus"
                + " FROM user WHERE userId=?";
      User u =  getJdbcTemplate().queryForObject(sql, new UserRowMapper(),userId);
        return u;
    }



    @Override
    public List<User> findaAll() {
     String sql = "SELECT userId, name, phone, email, address, loginName, role, loginStatus"
                + " FROM user";
   /*  List<User>users = getJdbcTemplate().query(sql, new UserRowMapper());
     return users;*/
       return getJdbcTemplate().query(sql, new UserRowMapper());
    }

    @Override
    public List<User> findByProperty(String properName, Object propValue) {
       String sql = "SELECT userId, name, phone, email, address, loginName, role, loginStatus"
                + " FROM user WHERE "+properName+"=?";
       return getJdbcTemplate().query(sql, new UserRowMapper(),propValue);
    }

}
