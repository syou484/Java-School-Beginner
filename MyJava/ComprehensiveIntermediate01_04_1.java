import java.util.Scanner;

public class ComprehensiveIntermediate01_04_1 {
    
    public static void main(String[] args){
        
        System.out.println("人数を入力してください");
        //Fee goukei = new Fee();
        Fee.fee();

        
    }
}
class Fee{

    public static void fee(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j;
        
        if (i < 5){
            j = i * 600;
            System.out.println("入場料金は" + j + "円です");
        } else if (5 <= i && i < 20){
            j = i * 550;
            System.out.println("入場料金は" + j + "円です");
        } else if (20 <= i){
            j = i * 500;
            System.out.println("入場料金は" + j + "円です");
        }

    }


}

