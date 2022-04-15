package in.ezeon.springcontactapp.test;

import in.ezeon.springcontactapp.config.SpringRootConfig;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class TestDataSource {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        DataSource ds = ctx.getBean(DataSource.class);
        NamedParameterJdbcTemplate jt = new NamedParameterJdbcTemplate(ds);
//        String sql = "INSERT  INTO user value(:name, :phone, :email, :address, :loginName, :password, :role, :loginStatus)"; 
        String sql = "INSERT  INTO user(name, phone, email, address, loginName, password, role, loginStatus)"
                + " VALUES(:n, :p, :e, :address, :loginName, :password, :role, :loginStatus)";

//        Map<String, Object> map = new HashMap<String, Object>();
//        map.put("n", "pooja");
//        map.put("p", "90898797");
//        map.put("e", "pooja@tcs.com");
//        map.put("address", "Bhopal");
//        map.put("loginName", "poojaG");
//        map.put("password", "pooja@123");
//        map.put("role", "1");
//        map.put("loginStatus", "2");
//        jt.update(sql, map);

        MapSqlParameterSource m = new MapSqlParameterSource();
        m.addValue("n", "gour");
        m.addValue("p", "7354233062");
        m.addValue("e", "poojaGour@123.com");
        m.addValue("address", "Hoshngabad");
        m.addValue("loginName", "poojaGour");
        m.addValue("password", "pooja@1234");
        m.addValue("role", "1");
        m.addValue("loginStatus", "1");
        jt.update(sql, m);
        System.out.println(".......sql executed.......");
    }

}
