//2.feladat
public class Auto {
    private int sorszam;
    private String marka;
    private String modell;
    private int gyartasiEv;
    private String szin;
    private int eladottDarabszam;
    private int atlagosEladasiAr;

    //3.feladat
    public Auto(int sorszam, String marka, String modell, int gyartasiEv, String szin, int eladottDarabszam, int atlagosEladasiAr) {
        this.sorszam = sorszam;
        this.marka = marka;
        this.modell = modell;
        this.gyartasiEv = gyartasiEv;
        this.szin = szin;
        this.eladottDarabszam = eladottDarabszam;
        this.atlagosEladasiAr = atlagosEladasiAr;
    }

    public int getSorszam() {
        return sorszam;
    }
    public void setSorszam(int sorszam) {
        this.sorszam = sorszam;
    }

    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModell() {
        return modell;
    }
    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getGyartasiEv() {
        return gyartasiEv;
    }
    public void setGyartasiEv(int gyartasiEv) {
        this.gyartasiEv = gyartasiEv;
    }

    public String getSzin() {
        return szin;
    }
    public void setSzin(String szin) {
        this.szin = szin;
    }

    public int getEladottDarabszam() {
        return eladottDarabszam;
    }
    public void setEladottDarabszam(int eladottDarabszam) {
        this.eladottDarabszam = eladottDarabszam;
    }

    public int getAtlagosEladasiAr() {
        return atlagosEladasiAr;
    }
    public void setAtlagosEladasiAr(int atlagosEladasiAr) {
        this.atlagosEladasiAr = atlagosEladasiAr;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "sorszam=" + sorszam +
                ", marka='" + marka + '\'' +
                ", modell='" + modell + '\'' +
                ", gyartasiEv=" + gyartasiEv +
                ", szin='" + szin + '\'' +
                ", eladottDarabszam=" + eladottDarabszam +
                ", atlagosEladasiAr=" + atlagosEladasiAr +
                '}';
    }
}
