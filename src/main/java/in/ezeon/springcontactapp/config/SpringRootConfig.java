
package in.ezeon.springcontactapp.config;

import org.springframework.context.annotation.Bean;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages ={"in.ezeon.springcontactapp.service","in.ezeon.springcontactapp.dao","in.ezeon.springcontactapp.controller"} )
@Configuration
public class SpringRootConfig {
  //Datasourse 
    @Bean
    public BasicDataSource getBasicDataSource(){
        
        BasicDataSource ds = new BasicDataSource();
        
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://127.0.0.1:3306/capp_db");
        ds.setUsername("root");
        ds.setPassword("PoojaKrishna@123");
//        ds.setMaxTotal(2);
//        ds.setInitialSize(1);
//        ds.setTestOnBorrow(true);
//        ds.setValidationQuery("SELECT :");
//        ds.setDefaultAutoCommit(true);
        return ds;
        
    }
}
