import java.util.Random;

public class Practice10_02 {
    public static void main(String[] agrs){
        int age = new Random().nextInt(21);

        System.out.println(age);

        switch(age){
            case 0,1,2,3:
                System.out.println("あなたはbabyです");
                break;
            case 4,5,6,7,8,9,10,11,12,13,14,15,16,17:
                System.out.println("あなたはkidです");
                break;
            case 18,19,20:
                System.out.println("あなたはadultです");
                break;
        }
    }
}
