import java.util.Objects;

public class Student {

    private final String imie;
    private String nazwisko;
    private int rokStudiow;
    private int nrIndeksu;
    private int liczbaPrzedmiotow;


    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    public int getRokStudiow() {
        return rokStudiow;
    }

    public int getLiczbaPrzedmiotow() {
        return liczbaPrzedmiotow;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public Student(String imie, String nazwisko,int nrIndeksu, int rokStudiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.rokStudiow = rokStudiow;

    }

    @Override
    public String toString() {
        return "Student{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrIndeksu=" + nrIndeksu +
                ", RokStudiow=" + rokStudiow +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rokStudiow == student.rokStudiow && nrIndeksu == student.nrIndeksu && liczbaPrzedmiotow == student.liczbaPrzedmiotow && Objects.equals(imie, student.imie) && Objects.equals(nazwisko, student.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko, rokStudiow, nrIndeksu, liczbaPrzedmiotow);
    }
}
