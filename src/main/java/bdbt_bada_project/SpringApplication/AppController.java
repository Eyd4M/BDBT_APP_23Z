package bdbt_bada_project.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AppController implements WebMvcConfigurer {

    @Autowired
    private ZwierzetaDAO dao;
    @Autowired
    private PracownicyDAO pracownicyDAO;
    @Autowired
    private KlienciDAO klienciDao;


    @RequestMapping("/animals_user")
    public String viewAnimalsUserPage(Model model) {
        /* IMport java.util.List */
        List<Zwierze> listZwierze = dao.list();
        model.addAttribute("listZwierze", listZwierze);

        List<Klient> listKlient = klienciDao.list();
        model.addAttribute("listKlient", listKlient);

        return "user/animals_user";
    }

    @RequestMapping("/animals_admin")
    public String viewAnimalsAdminPage(Model model) {
        /* IMport java.util.List */
        List<Zwierze> listZwierze = dao.list();
        model.addAttribute("listZwierze", listZwierze);
        return "admin/animals_admin";
    }

    @RequestMapping(value={"/main_admin"})
    public String showAdminPage(Model model) {
        /* Import java.util.List */
        List<Pracownik> listPracownik = pracownicyDAO.list();
        model.addAttribute("listPracownik", listPracownik);
        return "admin/main_admin";
    }

    @RequestMapping("/new")
    public String showNewForm(Model model) {
        Zwierze zwierze = new Zwierze();
        model.addAttribute("zwierze", zwierze);

        return "new_form";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("zwierze") Zwierze zwierze) {
        dao.save(zwierze);
        return "redirect:/animals";
    }

    @RequestMapping("/edit/{nr_zwierzecia}")
    public ModelAndView showeditForm(@PathVariable(name = "nr_zwierzecia") Integer nr_zwierzecia) {
        ModelAndView mav = new ModelAndView("edit_form");
        Zwierze zwierze = dao.get(nr_zwierzecia);
        mav.addObject("zwierze",zwierze);
        return mav;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute("zwierze") Zwierze zwierze){
        dao.update(zwierze);
        return "redirect:/animals_admin";
    }

    @RequestMapping("/delete/{nr_zwierzecia}")
    public String delete(@PathVariable(name = "nr_zwierzecia") Integer nr_zwierzecia){
        dao.delete(nr_zwierzecia);

        return "redirect:/animals_admin";
    }
    @RequestMapping("/new_p")
    public String showNewForm_p(Model model) {
        Pracownik pracownik = new Pracownik();
        model.addAttribute("pracownik", pracownik);

        return "new_form_pracownicy";
    }

    @RequestMapping(value = "/save_p", method = RequestMethod.POST)
    public String save(@ModelAttribute("pracownik") Pracownik pracownik) {
        pracownicyDAO.save(pracownik);
        return "redirect:/main_admin";
    }

    @RequestMapping("/edit_p/{nr_pracownika}")
    public ModelAndView showeditForm_p(@PathVariable(name = "nr_pracownika") Integer nr_pracownika) {
        ModelAndView mav = new ModelAndView("edit_form_pracownicy");
        Pracownik pracownik = pracownicyDAO.get(nr_pracownika);
        mav.addObject("pracownik",pracownik);
        return mav;
    }

    @RequestMapping(value = "/update_p", method = RequestMethod.POST)
    public String update_p(@ModelAttribute("pracownik") Pracownik pracownik){
        pracownicyDAO.update(pracownik);
        return "redirect:/main_admin";
    }


    @RequestMapping("/delete_p/{nr_pracownika}")
    public String delete_p(@PathVariable(name = "nr_pracownika") Integer nr_pracownika){
        pracownicyDAO.delete(nr_pracownika);
        return "redirect:/main_admin";
    }


    @RequestMapping("/main_user")
    public String showUserPage(Model model) {
        /* Import java.util.List */
        List<Klient> listKlient = klienciDao.list();
        model.addAttribute("listKlient", listKlient);

        List<Zwierze> listZwierze = dao.list();
        model.addAttribute("listZwierze", listZwierze);
        return "user/main_user";
    }

    @RequestMapping(value = "/update_k", method = RequestMethod.POST)
    public String update_k(@ModelAttribute("klient") Klient klient){
        klienciDao.update(klient);
        return "redirect:/main_user";
    }

    @RequestMapping("/edit_k/{nr_klienta}")
    public ModelAndView showEditForm_k(@PathVariable(name = "nr_klienta") Integer nr_klienta) {
        ModelAndView mav = new ModelAndView("edit_form_klienci");
        Klient klient = klienciDao.get(nr_klienta);
        mav.addObject("klient", klient);
        return mav;
    }

    @RequestMapping("/adopt/{nr_zwierzecia}_{nr_klienta}")
    public String adopt(@PathVariable("nr_zwierzecia")
                        Integer nr_zwierzecia, @PathVariable("nr_klienta") Integer nr_klienta){
        Zwierze zwierze = dao.get(nr_zwierzecia);
        zwierze.setNr_klienta_adoptujacy(nr_klienta);
        dao.adopt(zwierze);

        return "redirect:/animals_user";
    }



    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main").setViewName("main");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/animals").setViewName("animals");
        registry.addViewController("/new").setViewName("new_form");


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
    public class defaultSiteController
    {
        @RequestMapping
                ("/")
        public String defaultAfterLogin
                (HttpServletRequest request) {
            if
            (request.isUserInRole
                    ("ADMIN")) {
                return "redirect:/index_admin";
            } else if
            (request.isUserInRole
                            ("USER")) {
                return "redirect:/index_user";
            } else {
                return "/index";
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
}
