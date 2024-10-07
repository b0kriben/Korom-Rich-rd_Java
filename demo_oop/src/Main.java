public class Main {
    public static void main(String[] args) {
        Szemely szemely1 = new Szemely("Lajos", 17);
        System.out.println(szemely1.getNev());
        szemely1.setKor(30);
        System.out.println("szemely1 = " + szemely1);
    }
}