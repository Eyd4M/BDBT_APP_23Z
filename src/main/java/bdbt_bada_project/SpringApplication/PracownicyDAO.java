package bdbt_bada_project.SpringApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
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
        String sql = "SELECT * FROM PRACOWNICY ORDER BY nr_zwierzecia ASC";

        List<Pracownik> listPracownik = jdbcTemplate.query(sql,
                BeanPropertyRowMapper.newInstance(Pracownik.class));

        return listPracownik;
    }

    /* Insert – wstawianie nowego wiersza do bazy */
    public void save(Pracownik pracownik) {
        SimpleJdbcInsert insertActor = new SimpleJdbcInsert(jdbcTemplate);
        insertActor.withTableName("pracownicy").usingColumns("imie", "nazwisko", "plec", "pesel", "data_zatrudnienia", "nr_schroniska", "data_zwolnienia","nr_telefonu","nr_konta", "nr_adresu");

        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownik);
        insertActor.execute(param);
    }
    /* Read – odczytywanie danych z bazy */
    public Pracownik get(int nr_pracownika) {
        String sql = "SELECT * FROM PRACOWNICY WHERE nr_pracownika = ?";
        Object[] args = {nr_pracownika};
        Pracownik pracownik = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Pracownik.class));
        return pracownik;
    }
    public Pracownik get1(int nr_pracownika) {
        Object[] args = {nr_pracownika};
        String sql = "SELECT * FROM PRACOWNICY WHERE nr_pracownika = " + args[0];
        Pracownik pracownik = jdbcTemplate.queryForObject(sql, args, BeanPropertyRowMapper.newInstance(Pracownik.class));

        return pracownik;
    }
    /* Update – aktualizacja danych */
    public void update(Pracownik pracownik) {
        String sql = "UPDATE PRACOWNICY SET imie=:imie, nazwisko=:nazwisko, plec=:plec, data_zatrudnienia=:data_zatrudnienia, pesel=:pesel, data_zwolnienia=:data_zwolnienia, nr_telefonu=:nr_telefonu, nr_konta=:nr_konta " +
                "nr_adresu=:nr_adresu WHERE nr_pracownika=:nr_pracownika ";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(pracownik);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);

        template.update(sql, param);
    }
    /* Delete – wybrany rekord z danym id */
    public void delete(int nr_pracownika) {
        String sql = "DELETE FROM PRACOWNICY WHERE nr_pracownika = ?";
        jdbcTemplate.update(sql,nr_pracownika);
    }


}
