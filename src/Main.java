import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner doa = new Scanner(System.in);//get scanner
        System.out.print("Kaç adet sayı girmek istiyorsunuz?: ");//get value from user
        n = doa.nextInt();

        int number=2, min, max, value;//number=2 because we already get first number

        System.out.print("1. sayıyı giriniz: "); //get first number from user
        value = doa.nextInt();
        min = value;
        max = value;

        while (number <= n) {//get other numbers from user

            System.out.print(number + ". sayıyı giriniz: ");
            value = doa.nextInt();
            number++;

            if (value<min){
                min=value; //the min value is updated to value.
            }
            if(value>max){
                max=value; //the max value is updated to value.
            }
        }
        System.out.println("Max. değer: "+ max);
        System.out.println("Min. değer: " + min);
    }
}
