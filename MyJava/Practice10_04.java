import java.util.Random;

public class Practice10_04 {
    public static void main(String[] agrs){
        int color = new Random().nextInt(5)+1;

        System.out.println(color);

            switch(color){
                case 1:
                    System.out.println("今日のラッキーカラーはピンクです");
                    break;
                case 2,3,4:
                    System.out.println("今日のラッキーカラーはレッドです");
                    break;
                case 5:
                    System.out.println("今日のラッキーカラーはゴールドです");
                    break;
            }
    }
}
