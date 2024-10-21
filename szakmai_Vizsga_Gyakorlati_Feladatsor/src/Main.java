import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//1.feladat
public class Main {
    public static void main(String[] args) {
        //fájl olvasás
        System.out.println("4.feladat: ");
        ArrayList<String> autoLista = new ArrayList<>();

        try{
            File f = new File("autok.csv");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
                autoLista.add(line);
            }

            scanner.close();
        }catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        //System.out.println("A fájlban szereplő adatok: " + autoLista);
        auto();
    }

    public static void auto(){
        Auto auto1 = new Auto(16, "Ford", "Mustang", 1969, "fekete", 3000, 10000000);
        System.out.println(auto1);
    }
}