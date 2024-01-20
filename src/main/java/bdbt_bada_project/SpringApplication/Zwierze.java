package bdbt_bada_project.SpringApplication;

import java.util.Date;

public class Zwierze {
    private String imie;
    private String opis;
    private String plec;
    private String stan_zdrowia;
    private Date data_urodzenia;
    private int nr_schroniska;
    private int nr_klatki;
    private Integer nr_klienta_oddajacy;
    private Integer nr_klienta_adoptujacy;
    private int nr_rasy;

    public Zwierze() {
        super();
    }

    public Zwierze(String imie, String opis, String plec, String stan_zdrowia, Date data_urodzenia, int nr_schroniska, int nr_klatki, Integer nr_klienta_oddajacy, Integer nr_klienta_adoptujacy, int nr_rasy) {
//        this.nr_zwierzecia = nr_zwierzecia;
        this.imie = imie;
        this.opis = opis;
        this.plec = plec;
        this.stan_zdrowia = stan_zdrowia;
        this.nr_schroniska = nr_schroniska;
        this.nr_klatki = nr_klatki;
        this.nr_klienta_oddajacy = nr_klienta_oddajacy;
        this.nr_klienta_adoptujacy = nr_klienta_adoptujacy;
        this.nr_rasy = nr_rasy;
        this.data_urodzenia = data_urodzenia;
    }

    //Getters

    public String getImie() {
        return imie;
    }

    public String getOpis() {
        return opis;
    }

    public String getPlec() {
        return plec;
    }

    public String getStan_zdrowia() {
        return stan_zdrowia;
    }
    public Date getData_urodzenia() {
        return data_urodzenia;
    }

    public int getNr_schroniska() {
        return nr_schroniska;
    }

    public int getNr_klatki() {
        return nr_klatki;
    }

    public Integer getNr_klienta_oddajacy() {
        return nr_klienta_oddajacy;
    }

    public Integer getNr_klienta_adoptujacy() {
        return nr_klienta_adoptujacy;
    }

    public int getNr_rasy() {
        return nr_rasy;
    }

    //Setters


    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public void setStan_zdrowia(String stan_zdrowia) {
        this.stan_zdrowia = stan_zdrowia;
    }

    public void setData_urodzenia(Date data_urodzenia) {
        this.data_urodzenia = data_urodzenia;
    }

    public void setNr_schroniska(int nr_schroniska) {
        this.nr_schroniska = nr_schroniska;
    }

    public void setNr_klatki(int nr_klatki) {
        this.nr_klatki = nr_klatki;
    }

    public void setNr_klienta_oddajacy(Integer nr_klienta_oddajacy) {
        this.nr_klienta_oddajacy = nr_klienta_oddajacy;
    }

    public void setNr_klienta_adoptujacy(Integer nr_klienta_adoptujacy) {
        this.nr_klienta_adoptujacy = nr_klienta_adoptujacy;
    }

    public void setNr_rasy(int nr_rasy) {
        this.nr_rasy = nr_rasy;
    }

    //ToString


    @Override
    public String toString() {
        return "Zwierze{" +
                ", imie='" + imie + '\'' +
                ", opis='" + opis + '\'' +
                ", plec='" + plec + '\'' +
                ", stan_zdrowia='" + stan_zdrowia + '\'' +
                ", nr_schroniska=" + nr_schroniska +
                ", nr_klatki=" + nr_klatki +
                ", nr_klienta_oddajacy=" + nr_klienta_oddajacy +
                ", nr_klienta_adoptujacy=" + nr_klienta_adoptujacy +
                ", nr_rasy=" + nr_rasy +
                ", data_urodzenia=" + data_urodzenia +
                '}';
    }
}
