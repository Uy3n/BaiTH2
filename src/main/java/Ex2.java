import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        char x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chu: ");
        x = sc.nextLine().charAt(0);
        if (x>=65 && x<=90){
            x = (char)(x +32);
        } else if(x>=97 && x<=122){
             x = (char)(x-32);
          }
        System.out.println(x);
    }
}
