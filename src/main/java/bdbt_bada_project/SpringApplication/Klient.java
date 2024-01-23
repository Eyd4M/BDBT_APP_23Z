package bdbt_bada_project.SpringApplication;
import java.util.Date;

public class Klient {
    private Integer nr_klienta;
    private String imie;
    private String drugie_imie;
    private String nazwisko;
    private String plec;
    private String pesel;
    private String nr_telefonu;
    private int nr_schroniska = 1;
    private int nr_adresu;

    private String login;



    public Klient() {
        super();
    }

    public Klient(Integer nr_klienta, String drugie_imie, String imie, String nazwisko, String plec, String pesel, int nr_schroniska,String nr_telefonu, int nr_adresu, String login) {
        this.nr_klienta = nr_klienta;
        this.drugie_imie = drugie_imie;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.pesel = pesel;
        this.nr_schroniska = nr_schroniska;
        this.nr_telefonu = nr_telefonu;
        this.nr_adresu = nr_adresu;
        this.login = login;
    }

    //Getters
    public Integer getNr_klienta() {
        return nr_klienta;
    }

    public String getImie() {
        return imie;
    }

    public String getDrugie_imie() {
        return drugie_imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public String getPesel() {
        return pesel;
    }

    public String getNr_telefonu() {
        return nr_telefonu;
    }

    public int getNr_schroniska() {
        return nr_schroniska;
    }

    public int getNr_adresu() {
        return nr_adresu;
    }

    public String getLogin() {
        return login;
    }

    //Setters

    public void setNr_klienta(Integer nr_klienta) {
        this.nr_klienta = nr_klienta;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setDrugie_imie(String drugie_imie) {
        this.drugie_imie = drugie_imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setNr_telefonu(String nr_telefonu) {
        this.nr_telefonu = nr_telefonu;
    }

    public void setNr_schroniska(int nr_schroniska) {
        this.nr_schroniska = nr_schroniska;
    }

    public void setNr_adresu(int nr_adresu) {
        this.nr_adresu = nr_adresu;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    //ToString

    @Override
    public String toString() {
        return "Klient{" +
                "nr_klienta=" + nr_klienta +
                ", imie='" + imie + '\'' +
                ", drugie_imie='" + drugie_imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec='" + plec + '\'' +
                ", pesel='" + pesel + '\'' +
                ", nr_telefonu=" + nr_telefonu +
                ", nr_schroniska=" + nr_schroniska +
                ", nr_adresu=" + nr_adresu +
                ", login='" + login + '\'' +
                '}';
    }
}
