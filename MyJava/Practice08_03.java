import java.util.Random;

public class Practice08_03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int age = rand.nextInt(21);
        int gender = rand.nextInt(2);

        if (age <= 3) {
            if (gender == 0) {
                System.out.println("あなたはbabyな男です");
            } else {
                System.out.println("あなたはbabyな女です");
            }
        }

        else if (age > 3 && age < 6) {
            if (gender == 0) {
                System.out.println("あなたはchildな男です");
            } else {
                System.out.println("あなたはchildな女です");
            }
        }

        else if (age >= 6 && age < 18) {
            if (gender == 0) {
                System.out.println("あなたはkidな男です");
            } else {
                System.out.println("あなたはkidな女です");
            }
        }

        else {
            if (gender == 0) {
                System.out.println("あなたはadultな男です");
            } else {
                System.out.println("あなたはadultな女です");
            }
        }

    }

}
