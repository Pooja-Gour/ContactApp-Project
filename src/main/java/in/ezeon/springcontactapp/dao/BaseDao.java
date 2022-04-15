package in.ezeon.springcontactapp.dao;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import sun.tools.tree.SuperExpression;

public class BaseDao extends NamedParameterJdbcDaoSupport {
   @Autowired
    public void SetDataSource2(DataSource ds) {

        super.setDataSource(ds);
    }

}
