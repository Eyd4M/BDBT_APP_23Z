package bdbt_bada_project.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ZwierzetaDAO {
    /* Import org.springframework.jd....Template */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public ZwierzetaDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import java.util.List  (zawiera info z bazy danych) */
    public List<Zwierze> list(){
        String sql = "SELECT * FROM ZWIERZETA";

        List<Zwierze> listZwierze = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Zwierze.class));

        return listZwierze;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Zwierze zwierze) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("zwierzeta").usingColumns("imie","data_urodzenia","opis","plec","stan_zdrowia", "nr_schroniska","nr_klatki", "nr_klienta_oddajacy", "nr_klienta_adoptujacy", "nr_rasy");

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(zwierze);
        insertActor.execute(param);
    }
    /* Read – odczytywanie danych z bazy */
    public Zwierze get(int nr_zwierzecia) {
        return null;
    }
    /* Update – aktualizacja danych */
    public void update(Zwierze zwierze) {
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int nr_zwierzecia) {
    }


}
