package bdbt_bada_project.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AppController implements WebMvcConfigurer {

    @Autowired
    private ZwierzetaDAO dao;

    @RequestMapping("/animals_user")
    public String viewAnimalsUserPage(Model model) {
        /* IMport java.util.List */
        List<Zwierze> listZwierze = dao.list();
        model.addAttribute("listZwierze", listZwierze);
        return "user/animals_user";
    }

    @RequestMapping("/animals_admin")
    public String viewAnimalsAdminPage(Model model) {
        /* IMport java.util.List */
        List<Zwierze> listZwierze = dao.list();
        model.addAttribute("listZwierze", listZwierze);
        return "admin/animals_admin";
    }




    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/animals").setViewName("animals");


        registry.addViewController("/animals_user").setViewName("user/animals_user");
        registry.addViewController("/animals_admin").setViewName("admin/animals_admin");
        registry.addViewController("/main_user").setViewName("user/main_user");
        registry.addViewController("/main_admin").setViewName("admin/main_admin");
        registry.addViewController("/index_admin").setViewName("admin/index_admin");
        registry.addViewController("/index_user").setViewName("user/index_user");
    }

    @Controller
    public class AnimalsController
    {
        @RequestMapping
                ("/animals")
        public String defaultAfterLogin
                (Model model, HttpServletRequest request) {
            /* IMport java.util.List */
            List<Zwierze> listZwierze = dao.list();
            model.addAttribute("listZwierze", listZwierze);
            if
            (request.isUserInRole
                    ("ADMIN")) {
                return "redirect:/animals_admin";
            }
            else if
            (request.isUserInRole
                            ("USER")) {
                return "redirect:/animals_user";
            }
            else
            {
                return "/animals";
            }
        }
    }

    @Controller
    public class DashboardController
    {
        @RequestMapping
                ("/main")
        public String defaultAfterLogin
                (HttpServletRequest request) {
            if
            (request.isUserInRole
                    ("ADMIN")) {
                return "redirect:/main_admin";
            }
            else if
            (request.isUserInRole
                            ("USER")) {
                return "redirect:/main_user";
            }
            else
            {
                return "redirect:/index";
            }
        }
    }

    @Controller
    public class LoginPageController
    {
        @RequestMapping
                ("/login")
        public String defaultAfterLogin
                (HttpServletRequest request) {
            if
            (request.isUserInRole
                    ("ADMIN")) {
                return "redirect:/main_admin";
            }
            else if
            (request.isUserInRole
                            ("USER")) {
                return "redirect:/main_user";
            }
            else
            {
                return "/login";
            }
        }
    }

    @Controller
    public class IndexController
    {
        @RequestMapping
                ("/index")
        public String defaultAfterLogin
                (HttpServletRequest request) {
            if
            (request.isUserInRole
                    ("ADMIN")) {
                return "redirect:/index_admin";
            }
            else if
            (request.isUserInRole
                            ("USER")) {
                return "redirect:/index_user";
            }
            else
            {
                return "/index";
            }
        }
    }




    @RequestMapping(value={"/main_admin"})
    public String showAdminPage(Model model) {
        return "admin/main_admin";
    }
    @RequestMapping(value={"/main_user"})
    public String showUserPage(Model model) {
        return "user/main_user";
    }

}
