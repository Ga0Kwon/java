import java.io.IOException;
import java.util.Scanner;


public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arrays[] = new int[N];
        int min, max;
        for(int i = 0; i < arrays.length; i++){
            arrays[i] = scanner.nextInt();
        }

        min = arrays[0];
        max = arrays[0];
        for(int i = 0; i < arrays.length; i++){
            if(min > arrays[i]){
                min = arrays[i];
            }
            if (max < arrays[i]){
                max = arrays[i];
            }
        }
        System.out.printf("%d %d", min, max);

    }
}