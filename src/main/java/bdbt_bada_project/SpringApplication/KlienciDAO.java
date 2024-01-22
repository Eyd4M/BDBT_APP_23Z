package bdbt_bada_project.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KlienciDAO {
    /* Import org.springframework.jd....Template */
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public KlienciDAO(JdbcTemplate jdbcTemplate) {
        super();
        this.jdbcTemplate = jdbcTemplate;
    }

    /* Import java.util.List  (zawiera info z bazy danych) */
    public List<Klient> list(){
        String sql = "SELECT * FROM KLIENCI";

        List<Klient> listKlient = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Klient.class));

        return listKlient;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Klient klient) {
    }
    /* Read – odczytywanie danych z bazy */
    public Klient get(int nr_klienta) {
        String sql = "SELECT * FROM KLIENCI WHERE nr_klienta = ?";
        Object[] args = {nr_klienta};
        Klient klient = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Klient.class));

        return klient;
    }

    public Klient get1(int nr_klienta) {
        Object[] args = {nr_klienta};
        String sql = "SELECT * FROM KLIENCI WHERE nr_klienta = " + args[0];
        Klient klient = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Klient.class));

        return klient;
    }
    /* Update – aktualizacja danych */
    public void update(Klient klient) {
        String sql = "UPDATE KLIENCI SET imie=:imie, drugie_imie=:drugie_imie, nazwisko=:nazwisko, plec=:plec, pesel=:pesel, nr_telefonu=:nr_telefonu, " +
                "nr_adresu=:nr_adresu WHERE nr_zwierzecia=:nr_zwierzecia ";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(klient);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int nr_klienta) {
        String sql = "DELETE FROM KLIENCI WHERE nr_klienta = ?";
        jdbcTemplate.update(sql,nr_klienta);
    }

}
