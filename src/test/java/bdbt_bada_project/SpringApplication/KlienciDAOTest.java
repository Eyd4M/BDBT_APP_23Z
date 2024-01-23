package bdbt_bada_project.SpringApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import static org.junit.jupiter.api.Assertions.*;

class KlienciDAOTest extends Object {

    private KlienciDAO dao;

    @BeforeEach
    void setUp() {
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRB07");
        datasource.setPassword("BDBTGRB07");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        /* Import JdbcTemplate */
        dao = new KlienciDAO(new JdbcTemplate(datasource));
    }

    @Test
    void list() {
    }

    @Test
    void save() {
        Klient klient = new Klient(null,"Albert","Mario","Dust","M","34567895435",1,"111222333",6,"Mario2");
        dao.save(klient);
    }

    @Test
    void get() {
        int nr_klienta =21;
        Klient klient = dao.get(nr_klienta);
        assertNotNull(klient);
    }

    @Test
    void get1() {
    }

    @Test
    void update() {
        Klient klient = new Klient();
        klient.setNr_klienta(21);
        klient.setImie("TestUpdate");
        klient.setNazwisko("TestUpdate");
        klient.setPlec("M");
        klient.setDrugie_imie("Marek");
        klient.setNr_telefonu("123456789");
        klient.setNr_adresu(1);
        dao.update(klient);
    }

    @Test
    void delete() {
    }
}