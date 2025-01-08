import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class MenuManager{
    HashMap<String,ArrayList> map = new HashMap<>();

    MenuManager(){
        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        map.put("sandwitch",list);

        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("コーヒー");
        map.put("drink",list);

        list = new ArrayList<>();
        list.add("フライドチキン");
        list.add("チキンナゲット");
        list.add("アップルパイ");
        map.put("sidemenu",list);
    }
    public void showMenu(String a){
        
        if(a == "sandwitch"){
            System.out.println(map.get(a));

        } else if(a == "drink"){
            System.out.println(map.get(a));

        } else if (a == "sidemenu"){
            System.out.println(map.get(a));

        } 
    }
    public void setMenu(String b,String c){
        if(b == "sandwitch"){
            List<String> list = (List<String>) map.get("sandwitch");
            list.add(c);
            map.put("sandwitch",list);

        }

    }
    public void searchMenu(){
        System.out.println();

    }

}

public static void main(String[] args){
    MenuManager manager = new MenuManager();

    manager.showMenu("sandwitch");

    manager.setMenu("sandwitch","ビッグバーガー");

    manager.showMenu("sandwitch");

    //manager.searchMenu("ホットミルク");

    //manager.searchMenu("オレンジジュース");
}
