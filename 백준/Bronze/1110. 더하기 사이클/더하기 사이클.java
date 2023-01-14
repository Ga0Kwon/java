import java.io.IOException;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = scanner.nextInt();
        int temp = number;
        int first, second, third;
        while (true){
           if(temp < 10){
               first = 0;
               second = temp;
               temp = temp*10 + temp;
               count++;
           }else {
                first = temp/10;
                second = temp%10;
                third = first+second;

                temp = second*10 + third%10;
                count++;
           }
            if(temp == number){
                break;
            }
        }
        System.out.println(count);
    }
}