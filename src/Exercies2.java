import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercies2 {
    public static void main(String[] args) throws ParseException {
        Scanner input = new Scanner(System.in);
        String day1 ;
        String day2 ;
        Long d1,d2;
        System.out.print("Nhap ngay thu 1 (yyyy mm dd): ");
        day1 = input.nextLine();
        System.out.print("Nhap ngay thu 2 (yyyy mm dd): ");
        day2 = input.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy mm dd");
        d1 = sdf.parse(day1).getTime();
        d2 = sdf.parse(day2).getTime();
        System.out.println((d1-d2)/86400000);
    }
}
