import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // prím nyereményjáték
        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg a csoki gyartasi sorszamat: ");
        int sorszam = scanner.nextInt();
        System.out.println("sorszam = " + sorszam);

        boolean p = true;

        for(int i = 2; i < sorszam; i++){
            if(sorszam % i == 0){
                p = false;
                break;
            }
        }

        if(p){
            System.out.println("Nyert.");
        }
        else {
            System.out.println("Nem nyert.");
        }
    }
}