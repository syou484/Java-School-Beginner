import java.util.Random;

public class ComprehensiveBeginner01_02 {
    public static void main(String[] agse)
    {
        Random rand = new Random();
        int i;
        int total = 0;
        int[] arr;
        arr = new int[10];

        System.out.println("入力値");

        for(i = 0; i < arr.length; i++){
            int r = rand.nextInt(100) + 1;
            arr[i] = r;
            total += arr[i];

            System.out.println(r);

            if (total >= 100){
                break;
            }
        }
        System.out.println("合計値:" + total);

    }

}
