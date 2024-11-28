import java.util.ArrayList;

public class Practice15_01 {
    public static void main(String[] agrs){

        ArrayList<String> list = new ArrayList<>();

        list.add("kubo");
        list.add("mitoma");
        list.add("kamada");
        list.add("kamada");

        for(String s: list){
            System.out.println(s);
        }
    }
    
}
