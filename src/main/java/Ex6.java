import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args){
        int a,b,c,d, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap c: ");
        c = sc.nextInt();
        System.out.print("Nhap d: ");
        d = sc.nextInt();
        if (a>b){
            temp = a;
            a = b;
            b = temp;
        }
        if (a>c){
            temp = a;
            a = c;
            c = temp;
        }
        if (a>d){
            temp = a;
            a = d;
            d = temp;
        }
        if (b>c){
            temp = b;
            b = c;
            c = temp;
        }
        if (b>d){
            temp = b;
            b = d;
            d = temp;
        }
        if (c>d){
            temp = c;
            c = d;
            d = temp;
        }
        System.out.println("Day so: " + a +b +c +d);
    }
}
