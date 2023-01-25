import java.io.IOException;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrays[] = new int[31]; //출석번호가 1부터 30이기때문에 30이 들어가려면 31

        for(int i = 1; i < 29; i++){
            int index = scanner.nextInt();
            arrays[index] = 1;
        }

        for(int i = 1; i < arrays.length; i++){ //0번째는 무시해야함 -> 1부터 시작
            if(arrays[i] != 1){
                System.out.println(i);
            }
        }
    }
}