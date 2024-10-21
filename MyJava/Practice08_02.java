import java.util.Random;

public class Practice08_02 {
    public static void main(String[] agrs) {
        Random rand = new Random();
        int random = rand.nextInt(21);

        if (random <= 3) {
            System.out.println("あなたはbabyです");

        } else if (3 < random && random < 18) {
            System.out.println("あなたはKidです");

        } else {
            System.out.println("あなたはadultです");
        }

    }

}
