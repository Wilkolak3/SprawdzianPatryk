import java.util.Objects;

public class Przedmiot {

    private String nazwa;
    private int punkty;

    public Przedmiot(String nazwa, int punkty) {
        this.nazwa = nazwa;
        this.punkty = punkty;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPunkty() {
        return punkty;
    }

    public void setPunkty(int punkty) {
        this.punkty = punkty;
    }

    @Override
    public String toString() {
        return "Przedmiot{" + "nazwa='" + nazwa + '\'' + ", punkty=" + punkty + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Przedmiot przedmiot = (Przedmiot) o;
        return punkty == przedmiot.punkty && Objects.equals(nazwa, przedmiot.nazwa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nazwa, punkty);
    }
}
