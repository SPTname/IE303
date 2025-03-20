import java.util.*;
import java.text.DecimalFormat;
public class Bai1 {

    public static void main(String[] args){
        System.out.println("Nhap ban kinh: ");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        int term = 100000;
        double pi = 0;
        for(int i = 0; i < term; i++){
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        pi *= 4;
        double circlearea = pi * r * r;
        DecimalFormat df = new DecimalFormat("#.##");
        String roundedNumber = df.format(circlearea);
        System.out.println("Dien tich hinh tron: " + roundedNumber);
        scanner.close();
    }
}