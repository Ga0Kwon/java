import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =  scanner.nextInt();
        int arrays[] = new int[count];
        for(int i = 0; i < arrays.length; i++){
            arrays[i] = scanner.nextInt();
        }
        int findInt = scanner.nextInt();
        int counts = 0;
        for(int i = 0; i < arrays.length; i++){
            if(arrays[i] == findInt){
                counts++;
            }
        }
        System.out.println(counts);

    }
}