public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Adj meg egy szöveget: ");
        String szoveg = scanner.nextLine();
        System.out.println("szoveg = " +szoveg);

        System.out.println("Adja meg az egész számot:");
        int szam = scanner.nextInt();
        System.out.println("szam = " + szam);
    }
}