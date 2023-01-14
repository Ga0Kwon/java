import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)  throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(bufferedReader.readLine());

        StringTokenizer st;
        for(int i = 0; i < count; i++){
            st = new StringTokenizer(bufferedReader.readLine());
            bufferedWriter.write((Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken())+"\n"));
        }
        bufferedWriter.flush();

    }
}