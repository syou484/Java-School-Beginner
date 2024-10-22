import java.util.Random;

public class Practice08_04 {
    public static void main(String[] agrs) {
        Random rand = new Random();
        int color = rand.nextInt(5) + 1;
        // color++;

        switch (color) {
            case 1:
                System.out.println("今日のラッキーカラーはピンクです");

                break;

            case 2, 3, 4:
                System.out.println("今日のラッキーカラーはレッドです");

                break;

            case 5:
                System.out.println("今日のラッキーカラーはゴールドです");

        }
        System.out.println(color);

        // https://www.javadrive.jp/start/if/index4.html
    }

}
