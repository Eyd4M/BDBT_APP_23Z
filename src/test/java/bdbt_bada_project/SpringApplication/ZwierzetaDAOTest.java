package bdbt_bada_project.SpringApplication;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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

        assertTrue(listZwierze.isEmpty());
    }

    @Test
    void testSave() {
    }

    @Test
    void testGet() {
    }

    @Test
    void testUpdate() {
    }

    @Test
    void testDelete() {
    }
}