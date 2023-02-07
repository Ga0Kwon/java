import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double arrays[] = new double[scanner.nextInt()];
//        double temp = 0;

        for(int i = 0; i < arrays.length; i++){
            arrays[i] = scanner.nextInt();
        }
        scanner.close(); //이제 입력을 받지 않으므로 close해줌.

/*        for(int i = 0; i < arrays.length; i++){
            if(i+1 < arrays.length){
                if(arrays[i] > arrays[i+1]){
                    temp = arrays[i];
                }else{
                    temp = arrays[i+1];
                }
            }else{
                break;
            }
        }*/
        double total = 0;
        Arrays.sort(arrays); //정렬해주는 패키지 [최댓값이 마지막원소가 됨.]

        for(int j = 0; j < arrays.length; j++){
            total+= (arrays[j]/arrays[arrays.length-1]*100);

        }

        System.out.println(total/arrays.length);
    }
}