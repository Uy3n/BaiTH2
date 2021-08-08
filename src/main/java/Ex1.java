import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so: ");
        x = sc.nextInt();
        if (1<=x || x>=9){
            System.out.println("So vua nhap la: "+ x);
        } else {
            System.out.println("Khong doc duoc");
        }
    }
}
