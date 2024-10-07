import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // fájl olvasás
        ArrayList<String> szoveg = new ArrayList<>();

        try{
            File f = new File("szoveg.txt");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println("line = " + line);
                szoveg.add(line);
            }

            scanner.close();
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
        
        System.out.println("A fájlban szereplő adatok: " + szoveg);



        // fájl írás
        /*ArrayList<String> nevek = new ArrayList<>();

        nevek.add("Pisti");
        nevek.add("Sanyi");

        System.out.println("nevek = " + nevek);

        try{
            FileWriter writer = new FileWriter("szoveg.txt");

            for (String nev : nevek){
                writer.write(nev + "\n");
            }

            //writer.write("Elso sor\n");
            //writer.write("Masodik sor\n");

            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }*/
    }
}