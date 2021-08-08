import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args){
        float a,b,c;
        boolean x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap c: ");
        c = sc.nextInt();
        if ( a+b>c || b+c>a || c+a>b){
            x = true;
        } else {
            x = false;
        }
        System.out.println(x);
    }
}
