import java.util.InputMismatchException;
import java.util.Scanner;

public class ComprehensiveIntermediate01_01 {
    public static void main(String[] agrs){

        while(true){
            System.out.println("整数を入力してください");
            Scanner sc = new Scanner(System.in);

        try{
            int i = sc.nextInt();
            if(i < 0){
                System.out.println("マイナス値です");
            } else if (i % 2 == 0){
                System.out.println("even");  //偶数
                break;
            } else if (i % 2 == 1){
                System.out.println("odd");  //奇数
                break;
            }
            break;
         
    } catch (InputMismatchException e) {
        System.out.println("整数以外です");
    }
    }
    }
}
