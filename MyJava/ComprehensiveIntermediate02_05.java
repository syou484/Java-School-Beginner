import java.util.ArrayList;

class Coffee{
    public static void buyDrink(){

        int i;

        ArrayList<String> list = new ArrayList<>();
        list.add("ボス");
        list.add("ジョージア");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("控え目");
        list2.add("甘め");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("無し");
        list3.add("有り");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(110);
        list4.add(120);

        for(i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + "の甘さは" + list2.get(i) + "、ミルク" + list3.get(i) + "です。" + list4.get(i) + "円になります。");
        }
    }
}
class Juice{
    public static void buyDrink(){

        int i;

        ArrayList<String> list = new ArrayList<>();
        list.add("バヤリース");
        list.add("午後の紅茶");
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("オレンジ");
        list2.add("レモンティー");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(130);
        list3.add(150);

        for(i = 0; i < list.size(); i++){
            System.out.println(list.get(i) + "の" + list2.get(i) + "味です。" + list3.get(i) + "円になります。");
        }


    }
}


public class ComprehensiveIntermediate02_05 {
    public static void main(String[] args){

        Juice.buyDrink();
        Coffee.buyDrink();
    }
    
}
