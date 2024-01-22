package bdbt_bada_project.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
//                .withUser("user")
//                .password("user")
//                .roles("USER")
//                .and()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN")
                .and()
                .withUser("MaNow")
                .password("1234")
                .roles("USER")
                .and()
                .withUser("ArBed")
                .password("5678")
                .roles("USER")
                .and()
                .withUser("ZdPod")
                .password("pass")
                .roles("USER");
    }
    @Bean
    public PasswordEncoder getPasswordEncoder() { return NoOpPasswordEncoder.getInstance();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/", "/index", "/animals").permitAll()
                .antMatchers("/resources/static/**").permitAll()
                .antMatchers("/main", "/new", "/edit/**", "/delete/**").authenticated()
                .antMatchers("/animals_admin", "/new", "/edit/**", "/delete/**").access("hasRole('ADMIN')")
                .antMatchers("/main_admin").access("hasRole('ADMIN')")
                .antMatchers("/main_user").access("hasRole('USER')")
                .antMatchers("/animals_user").access("hasRole('USER')")
                .antMatchers("/index_user").access("hasRole('USER')")
                .antMatchers("/index_admin").access("hasRole('ADMIN')")
                .antMatchers("/new_form").access("hasRole('ADMIN')")
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/main")
                .permitAll()
                .and()
                .logout()
                .logoutUrl("/index")
                .logoutSuccessUrl("/index")
                .permitAll();
    }
}