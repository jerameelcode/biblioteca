package pt.adentis.biblioteca.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;

@Configuration
public class WebSecurityConfig {

    public static final String USERS_BY_USERNAME= "SELECT email, password, status "
            + "from tb_user "
            + "where email = ?";
    public static final String ROLES_BY_USERNAME= "select email, role "
            + "from tb_authority "
            + "where email = ?";

    @Autowired
    private DataSource dataSource;


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth)
            throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery(USERS_BY_USERNAME)
                .authoritiesByUsernameQuery(ROLES_BY_USERNAME);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}
