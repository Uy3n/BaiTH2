import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        float a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextFloat();
        System.out.print("Nhap b: ");
        b = sc.nextFloat();
        if ( a==0 && b==0) {
            System.out.println("PT vo so nghiem");
        } else if ( a==0 && b!=0) {
            System.out.println("PT vo nghiem");
        } else {
            System.out.println("PT co nghiem x =" + (-b/a));
        }
    }
}
