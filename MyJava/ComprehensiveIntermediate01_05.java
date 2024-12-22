public class ComprehensiveIntermediate01_05 {
    public static void main(String agrs[]){
        for(int i = 0; i < 9; i++){
            System.out.print(i + 1 + "の段　");
            for(int j = 0; j < 9; j++){
                System.out.print((i + 1) * (j + 1) + "\t");
            }
            System.out.println();
        }
    }
}
