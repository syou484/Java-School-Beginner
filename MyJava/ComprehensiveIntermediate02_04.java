import java.util.Scanner;
import java.util.Random;

public class ComprehensiveIntermediate02_04 {
    public static void main(String[] args){

        inport:while(true){
            System.out.println("ジャンケン");

            int r = new Random().nextInt(3);
            int input;

            System.out.println("0:グー 1:チョキ 2:パー >数字を入力してください");
            Scanner sc = new Scanner(System.in);

            try{
                int i = sc.nextInt();
                input = i;

                if(0 > input || input >= 3){
                    continue inport;
                }


            } catch(java.util.InputMismatchException e){
                continue inport;
            }
            
            String Win = "勝利です";
            String Lose = "負けです";
            String Draw = "あいこです";

            switch (r) {
                case 0:
                    switch(input){
                        case 0:System.out.println(Draw);
                        break;
                        case 1:System.out.println(Lose);
                        break;
                        case 2:System.out.println(Win);
                        break;
                    }  
                    break;
                case 1:
                    switch(input){
                        case 0:System.out.println(Win);
                        break;
                        case 1:System.out.println(Draw);
                        break;
                        case 2:System.out.println(Lose);
                        break;
                    }
                    break;
                case 2:
                    switch(input){
                        case 0:System.out.println(Lose);
                        break;
                        case 1:System.out.println(Win);
                        break;
                        case 2:System.out.println(Draw);
                        break;
                    }
                    break;    
            }
            break;
        }
    }
    
}
