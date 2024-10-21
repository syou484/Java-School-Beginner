import java.util.Random;

public class Practice09_03 {
    public static void main(String[] args)
    {

        for (int i = 1; i <= 10; i++){
            Random rand = new Random();
            int num = rand.nextInt(6) + 1;

            //System.out.println(num);

            if (num % 2 == 1){
                System.out.println(i + "回目" + num + "が出ました");
            }
        }
    }
}
