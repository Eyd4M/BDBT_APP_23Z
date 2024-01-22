package bdbt_bada_project.SpringApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PracownicyDAOTest extends Object {

    private PracownicyDAO dao;
    @BeforeEach
    void setUp() {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRB07");
        datasource.setPassword("BDBTGRB07");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        /* Import JdbcTemplate */
        dao = new PracownicyDAO(new JdbcTemplate(datasource));
    }

    @Test
    void list() {
        List<Pracownik> listPracownik = dao.list();
        System.out.print(listPracownik);
        assertTrue(!listPracownik.isEmpty());
    }

    @Test
    void testSave() {
        Pracownik pracownik = new Pracownik(null,"Albert","Dust","M","34567895435","2005-08-30",1,"2005-09-30","236238463453456","243235463492462354634523",6,null);
        dao.save(pracownik);
    }

    @Test
    void testGet() {
        int nr_pracownika = 2;
        Pracownik pracownik = dao.get(nr_pracownika);
        assertNotNull(pracownik);
    }

    @Test
    void testUpdate() {
        Pracownik pracownik = new Pracownik();
        pracownik.setNr_pracownika(21);
        pracownik.setImie("TestUpdate");
        pracownik.setDrugie_imie("TestUpdate");
        pracownik.setPlec("M");
        pracownik.setData_zatrudnienia("2005-05-31");
        pracownik.setData_zwolnienia("2005-07-30");
        pracownik.setNazwisko("Einstain");
        pracownik.setNr_konta("246235463452462354634523");
        pracownik.setNr_telefonu("246235463453456");
        pracownik.setPesel("24623546345");
        pracownik.setNr_adresu(8);
        dao.update(pracownik);
    }

    @Test
    void testDelete() {
        Integer nr_pracownika = 42;
        dao.delete(nr_pracownika);
    }
}