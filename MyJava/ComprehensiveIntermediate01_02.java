import java.util.Scanner;
import java.util.InputMismatchException;

public class ComprehensiveIntermediate01_02 {
    public static void main(String[] agrs){
        
        int i;
        Scanner sc = new Scanner(System.in);

        while(true){

            try{
                System.out.println("整数を三つ入力してください");
                System.out.println("一つ目");
                int inNum = sc.nextInt();
                System.out.println("二つ目");
                int inNum2 = sc.nextInt();
                System.out.println("三つ目");
                int inNum3 = sc.nextInt();

                if (inNum > inNum2){
                    i = 1;
                } else if (inNum2 > inNum3){
                    i = 1;
                } else {
                    i = 0;
                }

                switch (i){
                    case 0: 
                    System.out.println("OK");
                    break;
                    case 1:
                    System.out.println("NG");
                    break;
                }
                break;

            } catch (InputMismatchException e) {
                System.out.println("整数を入力してください");
                break;
            }

        }
        
    }
    
}
