import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        float x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so km: ");
        x = sc.nextFloat();
        Float s = null;
        if (0<x && x<2){
            s = 15000 * x;
        } else if (2<=x && x<6){
            s = 13500 * x;
        } else if (6<=x){
            s = 11000 * x;
            if (x>=120){
                s = (float) (s - (s * 0.1));
            }
        }
        System.out.println(s);
    }
}
