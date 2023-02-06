import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arrays[] = new int[10];
        boolean bl;
        int count = 0;
        int loop = 0;

        for(int i = 0; i < arrays.length; i++) {
            arrays[i] = scanner.nextInt()% 42;
        }

        for(int i = 0; i < arrays.length; i++){
            bl = false;
            for(int j = 0; j < i; j++) {
                if(arrays[i] == arrays[j]){
                    bl = true;
                    break;
                }
            }
            if(bl == false){
                count++;
            }
        }
        System.out.println(count);
    }
}