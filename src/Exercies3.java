public class Exercies3 {
    //Cach 1
    static int sum1(){
        int sum = 0;
        int i = 1;
        while(i<=10000){
            sum+=i;
            i++;
        }
        return sum;
    }
    //Cach 2
    static int sum2(){
        int sum = 0;
        int i=1;
        do{
            sum+=i;
            i++;
        }while (i<=10000);
        return sum;
    }
    //Cach 3
    static int sum3(){
        int sum =0;
        for(int i=1;i<=10000;++i){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int s1 = sum1();
        int s2 = sum2();
        int s3 = sum3();
        System.out.println(s1 +" " +s2 +" " + s3);
    }
}
