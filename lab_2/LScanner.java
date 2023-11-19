import java.io.File;
import java.util.*;

// чтение данных с консоли
public class LScanner {
    public static void main(String[] args) {

        String dir = "user.dir/example.txt";
        System.out.println(dir);
        try {
            Scanner fin = new Scanner(new File(dir));
            System.out.println("Fin created");
            while(fin.hasNext()){
                System.out.println(fin.next());
            }
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}