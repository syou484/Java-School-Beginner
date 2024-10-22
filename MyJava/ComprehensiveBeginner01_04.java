public class ComprehensiveBeginner01_04 {
    public static void main(String[] agse){

        System.out.println("何段");
        int inpoutNum = new java.util.Scanner(System.in).nextInt();

        if(0 > inpoutNum || inpoutNum > 5){
            System.out.println("１～５までの整数を入力してください");
            System.exit(0);
        }
        for(int i = 0; i < inpoutNum; i++){
            for(int j = 0; j < inpoutNum - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }  
}
