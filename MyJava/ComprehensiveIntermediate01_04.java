import java.util.Scanner;
import java.util.InputMismatchException;

class Fee {
    int fee;

    public int fee(int i, int j){
        if (i < 5){
            j = i * 600;
        } else if (5 <= i && i < 20){
            j = i * 550;
        } else if (20 <= i){
            j = i * 500;
        }
        return j;

    }


}

public class ComprehensiveIntermediate01_04 {
    public static void main(String agrs[]){
        
        Scanner cs = new Scanner(System.in);


        while(true){

            try{
                System.out.println("人数を入力してください");
                int fee = 0;
                Fee goukei = new Fee();
                int n = cs.nextInt();
                goukei.fee(n,fee);

                System.out.println("入場料金は" + goukei.fee(n,fee) + "円です");
                break;

            } catch (InputMismatchException e) {
                System.out.println("数を入れてください");
                break;
            }
            
        }

    }
    
}
