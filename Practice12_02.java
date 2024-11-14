public class Practice12_02 {
    static public void main(String[] ages){

        String greet;

        greet = greetings("朝");
        System.out.println(greet);

        greet = greetings("昼");
        System.out.println(greet);

        greet = greetings("夜");
        System.out.println(greet);

    }
    static public String greetings(String greet1){

        if(greet1 == "朝") {
            return "Good morning!!";
        }else if (greet1 == "昼") {
            return "Good afternoon!!";
        }else {
            return "Good evening!!";
        }
    }
} 
