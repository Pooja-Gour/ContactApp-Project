
package in.ezeon.springcontactapp.rm;

import in.ezeon.springcontactapp.domain.Contact;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ContactRowMapper implements RowMapper<Contact> {

    @Override
    public Contact mapRow(ResultSet rs, int i) throws SQLException {
        Contact c = new Contact();
        int ctid = rs.getInt("contactId");
        c.setContactId(ctid);
        
        c.setContactId(rs.getInt("contactId"));
        c.setUserId(rs.getInt("userId"));
        c.setName(rs.getString("name"));
        c.setPhone(rs.getNString("phone"));
        c.setEmail(rs.getString("email"));
        c.setAddress(rs.getString("address"));
       c.setRemark(rs.getString("remark"));
        return c;
    }
    
}
