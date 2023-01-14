import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        StringTokenizer st;
        StringBuilder stringBuilder = new StringBuilder();

        while (true){
            st = new StringTokenizer(bufferedReader.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0 && B == 0){
                break;
            }
            stringBuilder.append(A+B).append("\n");

        }
        System.out.println(stringBuilder);


    }
}