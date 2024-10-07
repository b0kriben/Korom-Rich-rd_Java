import java.util.Scanner;

public class Main {
    public static boolean armstrong(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy számot: ");
        int szam = scanner.nextInt();

        int valtozo = 0;
        int eredmeny = 0;
        for(int i = 1; i <= szam; i++){
            valtozo = Math.pow(szam);
            eredmeny += valtozo;
        }

        if(szam >= eredmeny){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(armstrong());
    }
}