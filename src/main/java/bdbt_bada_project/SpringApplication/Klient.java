package bdbt_bada_project.SpringApplication;
import java.util.Date;

public class Klient {
    private int nr_klienta;
    private String imie;
    private String drugie_imie;
    private String nazwisko;
    private String plec;
    private Integer pesel;
    private int nr_telefonu;
    private int nr_schroniska;
    private int nr_adresu;

    public Klient() {
        super();
    }

    public Klient(int nr_klienta, String imie, String nazwisko, String plec, Integer pesel, Date data_zatrudnienia, int nr_schroniska, Date data_zwolnienia,int nr_telefonu,Integer nr_konta, int nr_adresu) {
        this.nr_klienta = nr_klienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.pesel = pesel;
        this.nr_schroniska = nr_schroniska;
        this.nr_telefonu = nr_telefonu;
        this.nr_adresu = nr_adresu;
    }

    //Getters
    public int getNr_klienta() {
        return nr_klienta;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public Integer getPesel() {
        return pesel;
    }

    public int getNr_telefonu() {
        return nr_telefonu;
    }

    public int getNr_schroniska() {
        return nr_schroniska;
    }

    public int getNr_adresu() {
        return nr_adresu;
    }

    //Setters

    public void setNr_klienta(int nr_klienta) {
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

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public void setNr_telefonu(int nr_telefonu) {
        this.nr_telefonu = nr_telefonu;
    }

    public void setNr_schroniska(int nr_schroniska) {
        this.nr_schroniska = nr_schroniska;
    }

    public void setNr_adresu(int nr_adresu) {
        this.nr_adresu = nr_adresu;
    }

    //ToString

    @Override
    public String toString() {
        return "Pracownik{" +
                "nr_pracownika=" + nr_klienta +
                ", imie='" + imie + '\'' +
                ", drugie_imie='" + drugie_imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec='" + plec + '\'' +
                ", pesel=" + pesel +
                ", nr_telefonu=" + nr_telefonu +
                ", nr_schroniska=" + nr_schroniska +
                ", nr_adresu=" + nr_adresu +
                '}';
    }
}
