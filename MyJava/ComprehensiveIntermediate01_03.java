import java.util.Scanner;
import java.util.InputMismatchException;

public class ComprehensiveIntermediate01_03 {
    public static void main(String agrs[]){
        
        Scanner cs = new Scanner(System.in);


        while(true){
            double a = 0;
            double b = 0;
            double c = 0;
            double d = 0;

            try{
                System.out.println("ax^2 + bx + c = 0 acbの数値を入力してください");
                System.out.print("a:");
                a = cs.nextDouble();
                System.out.print("b:");
                b = cs.nextDouble();
                System.out.print("c:");
                c = cs.nextDouble();

                d = b * b - 4 * a * c; //解判断

                if (d > 0){
                    System.out.println("実数解です");
                    break;
                    
                } else if(d == 0){
                    System.out.println("重解です");
                    break;
                
                } else {
                    System.out.println("虚数解です");
                    break;

                }

            } catch (InputMismatchException e) {
                System.out.println("数字を入力してください");
                break;
            }

        } 
    }
    
}

//https://manabitimes.jp/math/1005 判断式
