import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        a = sc.nextFloat();
        System.out.print("Nhap b: ");
        b = sc.nextFloat();
        System.out.print("Nhap c: ");
        c = sc.nextFloat();
        float delta = b*b-4.0F*a*c;
        Float x1 = null, x2 = null;
        if (delta==0){
            x1 = x2 = (-b)/(2.0F*a);
        } else if (delta>0){
            float deltaSqrt =(float) Math.sqrt(delta);
            x1 = (-b + deltaSqrt)/(2.0F*a);
            x2 = (-b - deltaSqrt)/(2.0F*a);
        }

        System.out.println("x1 = "+ x1);
        System.out.println("x2 = "+ x2);
    }
}
