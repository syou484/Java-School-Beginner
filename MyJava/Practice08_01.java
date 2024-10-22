import java.util.Random;

public class Practice08_01 {
    public static void main(String[] args) {
        Random rand = new Random(); // 引用 新・明解Java入門（書籍）
        int random = rand.nextInt(2);

        if (random == 0) {
            System.out.println("あなたは男です");

        } else {
            System.out.println("あなたは女です");
        }

    }

}
