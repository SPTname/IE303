import java.util.*;
import java.text.DecimalFormat;
public class Bai2 {
    public static void main(String[] args){
        int r = 1;
        int insidecircle = 0;
        Random rand = new Random();
        long totalpoint = 1000000000;
        for(int i = 0; i < totalpoint; i++){
            double x = rand.nextDouble() * 2 * r - r;
            double y = rand.nextDouble() * 2 * r - r;
            if (x * x + y * y <= r * r) {
                insidecircle++;
            }
        }
        double pi = 4 * (double)insidecircle / totalpoint;
        DecimalFormat df = new DecimalFormat("#.##");
        String roundedNum = df.format(pi);
        System.out.println("Xap xi pi: " + roundedNum);
    }
}
