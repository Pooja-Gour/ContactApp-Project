package in.ezeon.springcontactapp.service;


import in.ezeon.springcontactapp.dao.BaseDao;
import in.ezeon.springcontactapp.dao.ContactDao;
import in.ezeon.springcontactapp.domain.Contact;
import in.ezeon.springcontactapp.rm.ContactRowMapper;

import java.util.List;

public class ContactServiceImpl extends BaseDao implements ContactService {

    private ContactDao contactDao;

    @Override
    public void save(Contact c) {
        contactDao.save(c);
    }

    @Override
    public void update(Contact c) {

        contactDao.update(c);
    }

    @Override
    public void delete(Integer contactId) {
        contactDao.delete(contactId);
    }

    @Override
    public void delete(Integer[] contactIds) {
        // String ids =StringUtil.toCommaS()

        String sql = "DELETE FROM contact WHERE contactId IN()";
        getJdbcTemplate().update(sql);
    }

    @Override
    public List<Contact> findUserContact(Integer userId) {
        return contactDao.findByProperty("userId", userId);

    }

    @Override
    public List<Contact> findUserContact(Integer userId, String txt) {
        String sql = "SELECT contactId,userId,name,phone,email, address,reamrk FROM contact WHERE userId=? AND(name LIKE '%" + txt + "%' OR phone LIKE '%" + txt + "%' OR address LIKE '%" + txt + "%' OR email LIKE '%" + txt + "%' OR remark LIKE '%" + txt + "%')";
        return getJdbcTemplate().query(sql, new ContactRowMapper(), userId);

    }

}
