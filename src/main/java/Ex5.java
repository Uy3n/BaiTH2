import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        int a,b,c,d,min;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap c: ");
        c = sc.nextInt();
        System.out.print("Nhap d: ");
        d = sc.nextInt();
        if (a<=b && a<=c && a<=d){
            min = a;
        } else if (b<=a && b<=c && b<=d ){
            min = b;
        } else if (c<=a && c<=b && c<=d ){
            min = c;
        } else {
            min = d;
        }
        System.out.println(min);
    }
}
