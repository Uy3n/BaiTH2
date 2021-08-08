import java.util.Scanner;

public class Ex8 {
    public static void main (String[] args){
        int month, year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        year = sc.nextInt();
        System.out.print("Nhap thang: ");
        month = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("Thang co 31 ngay.");
        } else if (month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println("Thang co 30 ngay.");
        } else if (month == 2)
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println("Thang co 29 ngay.");
            } else {
                System.out.println("Thang co 28 ngay.");
            }
    }
}
