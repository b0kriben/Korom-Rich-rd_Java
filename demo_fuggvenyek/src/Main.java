import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        // idő számolás
        int lastSecond = 0;

        while (true){
            LocalTime time = LocalTime.now();
            if (lastSecond != time.getSecond()){
                System.out.println("time = " + time);
                lastSecond = time.getSecond();
            }
        }

        // idő változtatások
        /*LocalDate date = LocalDate.now();
        date = date.plusWeeks(2);
        System.out.println("date = " + date);

        LocalTime time = LocalTime.now();
        time = time.plusHours(5);
        System.out.println(time.getHour());
        //System.out.println("time = " + time);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("datetime = " + datetime);
        System.out.println(datetime.getDayOfMonth());*/

        // egyforma szöveg
        /*String sz1 = "alma";
        String sz2 = "körte";

        if(sz1.equals(sz2)){
            System.out.println("Egyenlőek");
        }*/
    }
}