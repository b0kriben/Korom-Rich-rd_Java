public class Auto extends Jarmu{
    private int kerekekszama;
    private int ajtokszama;

    public Auto(int loero, int vegsebesseg, String szin, int kerekekszama, int ajtokszama){
        super(loero, vegsebesseg, szin);

        this.kerekekszama = kerekekszama;
        this.ajtokszama = ajtokszama;
    }

    public void dudal(){
        System.out.println("duda");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "kerekekszama=" + kerekekszama +
                ", ajtokszama=" + ajtokszama +
                ", loero=" + loero +
                ", vegsebesseg=" + vegsebesseg +
                ", szin='" + szin + '\'' +
                '}';
    }
}
