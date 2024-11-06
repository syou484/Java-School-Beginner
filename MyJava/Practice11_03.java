import java.util.Random;

public class Practice11_03 {
    public static void main(String[] agrs){

        int num;
        int X = 0;
        
        while (X < 10){
            num = new Random().nextInt(6)+1;

            //System.out.println(num);

            if (num % 2 == 1) {
                System.out.println((X + 1) + "回目、" + num + "が出ました");
            }
            X++;
        }
    }
}
