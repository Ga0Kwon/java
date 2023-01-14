import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt(); //입력받는 총가격
        int count = scanner.nextInt(); //입력받는 물건의 총 가격
        int checkPrice = 0;

        for(int i = 0; i < count; i++){
            int goodsPrice = scanner.nextInt();
            int goodsCount = scanner.nextInt();

            checkPrice += goodsPrice*goodsCount;
        }

        if(checkPrice == price){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}