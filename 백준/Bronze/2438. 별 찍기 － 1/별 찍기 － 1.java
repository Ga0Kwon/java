import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st;
        for(int i = 1; i <= count; i++){
            for(int j = 0; j < i; j++){
                bufferedWriter.write("*");
            }
            bufferedWriter.write("\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}