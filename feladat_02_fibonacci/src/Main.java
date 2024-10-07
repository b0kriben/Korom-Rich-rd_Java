import java.util.ArrayList;

public class Main {
    public static int fibo(int n){
        ArrayList<Integer> szamok = new ArrayList<>();

        szamok.add(0);
        szamok.add(1);

        for(int i = 2; i <= n; i++){
            szamok.add(szamok.get(i - 1) + szamok.get(i - 2));
        }

        return szamok.get(n);
    }

    public static void main(String[] args) {

        System.out.println(fibo(10));
        System.out.println(fibo(42));
    }
}