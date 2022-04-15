package in.ezeon.springcontactapp.dao;

import in.ezeon.springcontactapp.domain.Contact;
import in.ezeon.springcontactapp.domain.User;
import in.ezeon.springcontactapp.rm.ContactRowMapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class ContactDAOImpli extends BaseDao implements ContactDao {

    @Override
    public void save(Contact c) {
        String sql = "INSERT INTO contact(userId, name, address, phone, email, remark)"
                + "VALUES(:userId, :name, :address, :phone, :email, :remark)";
        MapSqlParameterSource m = new MapSqlParameterSource();
        m.addValue("userId", c.getUserId());
        m.addValue("name", c.getName());
        m.addValue("phone", c.getPhone());
        m.addValue("email", c.getEmail());
        m.addValue("address", c.getAddress());
        m.addValue("remark", c.getRemark());
        KeyHolder kh = new GeneratedKeyHolder();
        getNamedParameterJdbcTemplate().update(sql, m, kh);
        c.setContactId(kh.getKey().intValue());

    }

    @Override
    public void update(Contact c) {
        String sql = " UPDATE contact SET "
                + " userId= :userId,"
                + " name =:name, "
                + "address =:address, "
                + "phone= :phone, "
                + "email = :email, "
                + "remark =:remark WHERE contactId=:contactId";
        Map m = new HashMap();
        m.put("contactId", c.getContactId());
        m.put("userId", c.getUserId());

        m.put("name", c.getName());
        m.put("phone", c.getPhone());
        m.put("email", c.getEmail());
        m.put("address", c.getAddress());
        m.put("remark", c.getRemark());
        getNamedParameterJdbcTemplate().update(sql, m);
    }

    @Override
    public void delete(Contact c) {
        this.delete(c.getContactId());
    }

    @Override
    public void delete(Integer ContactId) {
        String sql = "DELETE FROM contact WHERE contactId =?";
        getJdbcTemplate().update(sql, ContactId);

    }

    @Override
    public Contact findById(Integer ContactId) {
        String sql = "SELECT contactId,userId,name,phone,email, address,reamrk FROM contact WHERE contactId =?";
        return getJdbcTemplate().queryForObject(sql, new ContactRowMapper(), ContactId);

    }

    @Override
    public List<Contact> findaAll() {
        String sql = "SELECT contactId,userId,name,phone,email, address,remark FROM contact ";
        return getJdbcTemplate().query(sql, new ContactRowMapper());

    }

    @Override
    public List<Contact> findByProperty(String properName, Object propValue) {
        String sql = "SELECT contactId,userId,name,phone,email, address,reamrk FROM contact WHERE " + properName + "= ?";
        return getJdbcTemplate().query(sql, new ContactRowMapper(), propValue);

    }

}
