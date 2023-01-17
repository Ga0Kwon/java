import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();

        int Array[] = new int[N];
        for(int i = 0; i < Array.length; i++){
            Array[i] = scanner.nextInt();
        }

        for(int j = 0 ; j < Array.length; j++){
            if(Array[j] < X){
                System.out.print(Array[j]+" ");
            }
        }

    }
}
