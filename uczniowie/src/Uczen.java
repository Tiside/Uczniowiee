public class Uczen {

    private String imie;
    private String nazwisko;
    private int wiek;
    private String klasa;

    public Uczen(String imie, String nazwisko, int wiek, String klasa){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.klasa = klasa;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return  false;
        Uczen uczen = (Uczen) o;
        return wiek == uczen.wiek && imie.equals(uczen.imie) && nazwisko.equals(uczen.nazwisko) && klasa.equals(uczen.klasa);
    }

    @Override
    public int hashCode(){
        return Objects.hash(imie, nazwisko, wiek, klasa);
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", klasa='" + klasa + '\'' +
                '}';
    }


}
