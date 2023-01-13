import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        for(int i = 1; i <=test; i++){
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            System.out.println(A+B);
        }
    }
}