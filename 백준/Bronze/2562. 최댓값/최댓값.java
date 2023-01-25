import java.io.IOException;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrays[]  = new int[9];

        for(int i = 0; i < arrays.length; i++){
            arrays[i] = Integer.parseInt(scanner.nextLine());
        }

        int number = arrays[0];
        int index = 0;

        for(int i = 0; i < arrays.length; i++){
            if(number < arrays[i]){
                number = arrays[i];
                index = i;
            }
        }
        System.out.println(number);
        System.out.println(index+1);

    }
}