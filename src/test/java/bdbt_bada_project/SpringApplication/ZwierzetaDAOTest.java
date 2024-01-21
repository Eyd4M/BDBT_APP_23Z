package bdbt_bada_project.SpringApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.Types;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZwierzetaDAOTest extends Object {

    private ZwierzetaDAO dao;

    @BeforeEach
    void setUp() throws Exception{
        DriverManagerDataSource datasource = new DriverManagerDataSource();
        datasource.setUrl("jdbc:oracle:thin:@194.29.170.4:1521:xe");
        datasource.setUsername("BDBTGRB07");
        datasource.setPassword("BDBTGRB07");
        datasource.setDriverClassName("oracle.jdbc.OracleDriver");

        /* Import JdbcTemplate */
        dao = new ZwierzetaDAO(new JdbcTemplate(datasource));
    }

    @Test
    void testList() {
        /* Import java.util */
        List<Zwierze> listZwierze = dao.list();
        System.out.print(listZwierze);

        assertTrue(!listZwierze.isEmpty());
    }

    @Test
    void testSave() {
        Zwierze zwierze = new Zwierze(null,"Test", "Test Test",  "M", "Zdrowy", "2017-01-01", 1, 1, null , null, 1);
        dao.save(zwierze);
    }

    @Test
    void testGet() {
        int nr_zwierzecia = 42;
        Zwierze zwierze = dao.get(nr_zwierzecia);
        assertNotNull(zwierze);
    }

    @Test
    void testUpdate() {
        Zwierze zwierze = new Zwierze();
        zwierze.setNr_zwierzecia(42);
        zwierze.setImie("TestUpdate");
        zwierze.setOpis("TestUpdate");
        zwierze.setPlec("M");
        zwierze.setData_urodzenia("2005-05-31");
        zwierze.setStan_zdrowia("Zdrowy");
        zwierze.setNr_klatki(1);
        zwierze.setNr_klienta_oddajacy(null);
        zwierze.setNr_klienta_adoptujacy(null);
        zwierze.setNr_rasy(3);

        dao.update(zwierze);
    }

    @Test
    void testDelete() {
        Integer nr_zwierzecia = 42;
        dao.delete(nr_zwierzecia);
    }
}