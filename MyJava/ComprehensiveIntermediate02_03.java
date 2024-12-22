import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_03 {
    public static void main(String[] args){

        System.out.println("ゾロ目で大当たり！チャンスは30回");
        System.out.println("begin と入力してください");

        while(true){

            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            int i;
            String p = "begin";

            if(input.equals(p)){
                System.out.println(1);
                for(i = 0; i < 30; i++){
                    int r1 = new Random().nextInt(9);
                    int r2 = new Random().nextInt(9);
                    int r3 = new Random().nextInt(9);

                    System.out.println((i + 1) + "回目:" + r1 + r2 + r3);
                    if(r1 == r2 && r2 == r3){
                        System.out.println((i + 1) + "回目で大当たりです。おめでとうございます！");
                        System.exit(0);
                    }
                }
                System.out.println("残念でした。終わります。");
                break;
            }
        }
    }
    
}
