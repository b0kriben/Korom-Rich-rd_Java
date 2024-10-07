public class Szemely {
    private String nev;
    private int kor;

    public Szemely(String nev, int kor){
        this.nev = nev;
        this.kor = kor;
    }

    //Alt + Insert -> Getter and Setter
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }
    public int getKor() {
        return kor;
    }

    //Alt + Insert -> ToString()
    @Override
    public String toString() {
        return "Szemely{" +
                "nev='" + nev + '\'' +
                ", kor=" + kor +
                '}';
    }
}
