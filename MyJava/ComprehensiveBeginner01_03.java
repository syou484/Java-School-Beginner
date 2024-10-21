import java.util.Random;

public class ComprehensiveBeginner01_03 {
    public static void main(String[] agse){

        Random rand = new Random();
        int man = rand.nextInt(3) + 1;
        int woman = rand.nextInt(3) + 1;
        int child = rand.nextInt(3) + 1;

        //System.out.println(man);
        //System.out.println(woman);
        //System.out.println(child);

        if((man == woman && man == child && woman == child) || (man != woman && man != child && woman != child) ){
            System.out.println("あいこです"); //すべて同じまたはすべて異なる
        } else if(man == woman){
            if(man < child){
                if(man == 1 && child == 3){
                    System.out.println("manとwomanが勝ちました");
                } else {
                    System.out.println("childが勝ちました");
                }
            } else if(man > child){
                if(man == 3 && child == 1){
                    System.out.println("childが勝ちました");
                } else{
                    System.out.println("manとwomanが勝ちました");
                }
            }
        } else if (man == child){
            if(man < woman){
                if(man == 1 && woman == 3){
                    System.out.println("manとchildが勝ちました");
                } else{
                    System.out.println("womanが勝ちました");
                }
            } else if(man > woman){
                if(man == 3 && woman == 1){
                    System.out.println("womanが勝ちました");
                } else{
                    System.out.println("manとchildが勝ちました");
                }
            }
        } else if(woman == child){
            if(man < child){
                if(man == 1 && woman == 3){
                    System.out.println("manが勝ちました");
                } else{
                    System.out.println("womanとchildが勝ちました");
                }
            } else if(man > child){
                if(man == 3 && woman == 1){
                    System.out.println("womanとchildが勝ちました");
                } else{
                    System.out.println("manが勝ちました");
                }
            }
        }
    }
}