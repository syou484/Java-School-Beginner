class Greeting{
    String country;
    String greet;

    public String greet(String c){
        if (c == "日本"){
            c = "こんにちは";
        } else if (c == "韓国"){
            c = "アンニョンハセヨ";
        } else if (c == "その他"){
            c = "わかりません";
        }
        return c;

    }

}

public class Practice13_03 {
    public static void main(String[] agrs){

        Greeting greetJapan = new Greeting();
        Greeting greetKorea = new Greeting();
        Greeting greetUnknown = new Greeting();

        String japan = "日本";
        String korea = "韓国";
        String unknown = "その他";

        greetJapan.country = japan;
        greetKorea.country = korea;
        greetUnknown.country = unknown;

        System.out.println(greetJapan.country + "は " + greetJapan.greet(japan));
        System.out.println(greetKorea.country + "は " + greetKorea.greet(korea));
        System.out.println(greetUnknown.country + "は " + greetUnknown.greet(unknown));

    }
    
}
