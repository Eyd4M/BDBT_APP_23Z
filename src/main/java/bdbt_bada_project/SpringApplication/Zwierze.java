package bdbt_bada_project.SpringApplication;

import java.time.Year;
import java.util.Date;

public class Zwierze {

    private Integer nr_zwierzecia;
    private String imie;
    private String opis;
    private String plec;
    private String stan_zdrowia;
    private String data_urodzenia;
    private int nr_schroniska = 1;
    private int nr_klatki;
    private Integer nr_klienta_oddajacy;
    private Integer nr_klienta_adoptujacy;
    private int nr_rasy;

    public Zwierze() {
        super();
    }

    public Zwierze(Integer nr_zwierzecia, String imie, String opis, String plec, String stan_zdrowia, String data_urodzenia, int nr_schroniska, int nr_klatki, Integer nr_klienta_oddajacy, Integer nr_klienta_adoptujacy, int nr_rasy) {
        this.nr_zwierzecia = nr_zwierzecia;
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

    public Integer getNr_zwierzecia() {return nr_zwierzecia; }

    public String getImie() {
        return imie;
    }

    public String getOpis() {
        return opis;
    }

    public String getPlec() { return plec; }

    public String getStan_zdrowia() {
        return stan_zdrowia;
    }
    public String getData_urodzenia() {
        if(data_urodzenia != null){
            return data_urodzenia.substring(0,10);
        }else{
            return data_urodzenia;
        }
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

    public String getAge() {
        int now = Year.now().getValue();
        int data_urodzenia_year = Integer.parseInt(data_urodzenia.substring(0,4));
        int wiek = now - data_urodzenia_year;
        String lata;

        if ((wiek != 2) && (wiek != 3) && (wiek != 4) && (wiek != 22) && (wiek != 23) && (wiek != 24)) {
            if ((wiek == 1) || (wiek == 21)) {
                lata = "rok";
            }else{
                lata = "lat";
            }
        }
        else{
            lata = "lata";
        }
        return Integer.toString(wiek)  + ' ' + lata;
    }

    public String getRasa() {
        String nazwa_rasy;

        switch (nr_rasy) {
            case 1: return "Jamnik";
            case 2: return "Dalmatyńczyk";
            case 3: return "Husky Syberyjski";
            case 4: return "Kundel";
            case 5: return "Kot europejski";
            case 6: return "Kot brytyjski Krótkowłosy";
            case 7: return "Kot syjamski";
            case 8: return "Kot norweski leśny";
            default: return "Zwierze";
        }
    }

    public String getPlecText() {
        switch (plec) {
            case "M": return "Samiec";
            case "K": return "Samica";
            default: return plec;
        }
    }
    //Setters

    public void setNr_zwierzecia (int nr_zwierzecia){
        this.nr_zwierzecia = nr_zwierzecia;
    }


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

    public void setData_urodzenia(String data_urodzenia) {
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
