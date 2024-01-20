package bdbt_bada_project.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PracownicyDAO {
    /* Import org.springframework.jd....Template */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public PracownicyDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import java.util.List  (zawiera info z bazy danych) */
    public List<Pracownik> list(){
        String sql = "SELECT * FROM PRACOWNICY";

        List<Pracownik> listPracownik = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Pracownik.class));

        return listPracownik;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Pracownik pracownik) {
    }
    /* Read – odczytywanie danych z bazy */
    public Pracownik get(int nr_pracownika) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Pracownik pracownik) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int nr_pracownika) {
    }


}
