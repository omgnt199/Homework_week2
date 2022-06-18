import java.util.Scanner;

public class Exercies1 {
    public enum Month{
        THANG1(31),THANG2(28),THANG3(31),THANG4(30),THANG5(31),THANG6(30),THANG7(31),
        THANG8(31),THANG9(30),THANG10(31),THANG11(30),THANG12(31);
        private int value;
        Month(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap thang ma ban muon tim:");
        int month = input.nextInt();

        //Cach 1 : Su dung enum
        switch(month){
            case 1 : System.out.println("So ngay trong thang 1 la:" + Month.THANG1.value  );break;
            case 2 : System.out.println("So ngay trong thang 2 la:" + Month.THANG2.value  );break;
            case 3 : System.out.println("So ngay trong thang 3 la:" + Month.THANG3.value  );break;
            case 4 : System.out.println("So ngay trong thang 4 la:" + Month.THANG4.value  );break;
            case 5 : System.out.println("So ngay trong thang 5 la:" + Month.THANG5.value  );break;
            case 6 : System.out.println("So ngay trong thang 6 la:" + Month.THANG6.value  );break;
            case 7 : System.out.println("So ngay trong thang 7 la:" + Month.THANG7.value  );break;
            case 8 : System.out.println("So ngay trong thang 8 la:" + Month.THANG8.value  );break;
            case 9 : System.out.println("So ngay trong thang 9 la:" + Month.THANG9.value  );break;
            case 10 : System.out.println("So ngay trong thang 10 la:" + Month.THANG10.value  );break;
            case 11 : System.out.println("So ngay trong thang 11 la:" + Month.THANG11.value  );break;
            case 12 : System.out.println("So ngay trong thang 12 la:" + Month.THANG12.value  );break;
        }
        //Cach 2 : Khong su dung enum
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) System.out.println("So ngay trong thang "+month+"la:31");
        else if(month==2) System.out.println("So ngay trong thang 2 la 28");
        else System.out.println("So ngay trong thang "+month+" la : 30");

    }
}
