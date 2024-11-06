public class Practice11_04 {
    public static void main(String[] agrs){

        while(true){
            System.out.println("何段＞");
            int inputNum = new java.util.Scanner(System.in).nextInt();

            if (inputNum >= 1 && inputNum <= 5){
                for(int i = 0; i < inputNum; i++){
                    for(int j = 0; j < inputNum - i; j++){
                        System.out.print(" ");
                    }
                    for(int k = 0; k <= i; k++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            }
        } 
    }
}
