package bdbt_bada_project.SpringApplication;

import java.util.Date;

public class Pracownik {

    private int nr_pracownika;
    private String imie;
    private String drugie_imie;
    private String nazwisko;
    private String plec;
    private Integer pesel;
    private int nr_telefonu;
    private Date data_zatrudnienia;
    private Date data_zwolnienia;
    private Integer nr_konta;
    private int nr_schroniska;
    private int nr_adresu;

    public Pracownik() {
        super();
    }

    public Pracownik(int nr_pracownika, String imie, String nazwisko, String plec, Integer pesel, Date data_zatrudnienia, int nr_schroniska, Date data_zwolnienia,int nr_telefonu,Integer nr_konta, int nr_adresu) {
        this.nr_pracownika = nr_pracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.pesel = pesel;
        this.nr_schroniska = nr_schroniska;
        this.nr_telefonu = nr_telefonu;
        this.data_zatrudnienia = data_zatrudnienia;
        this.data_zwolnienia = data_zwolnienia;
        this.nr_konta = nr_konta;
        this.nr_adresu = nr_adresu;
    }

    //Getters
    public int getNr_pracownika() {
        return nr_pracownika;
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

    public Date getData_zatrudnienia() {
        return data_zatrudnienia;
    }

    public Date getData_zwolnienia() {
        return data_zwolnienia;
    }

    public Integer getNr_konta() {
        return nr_konta;
    }

    public int getNr_schroniska() {
        return nr_schroniska;
    }

    public int getNr_adresu() {
        return nr_adresu;
    }

    //Setters

    public void setNr_pracownika(int nr_pracownika) {
        this.nr_pracownika = nr_pracownika;
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

    public void setData_zatrudnienia(Date data_zatrudnienia) {
        this.data_zatrudnienia = data_zatrudnienia;
    }

    public void setData_zwolnienia(Date data_zwolnienia) {
        this.data_zwolnienia = data_zwolnienia;
    }

    public void setNr_konta(Integer nr_konta) {
        this.nr_konta = nr_konta;
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
                "nr_pracownika=" + nr_pracownika +
                ", imie='" + imie + '\'' +
                ", drugie_imie='" + drugie_imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec='" + plec + '\'' +
                ", pesel=" + pesel +
                ", nr_telefonu=" + nr_telefonu +
                ", data_zatrudnienia=" + data_zatrudnienia +
                ", data_zwolnienia=" + data_zwolnienia +
                ", nr_konta=" + nr_konta +
                ", nr_schroniska=" + nr_schroniska +
                ", nr_adresu=" + nr_adresu +
                '}';
    }
}
