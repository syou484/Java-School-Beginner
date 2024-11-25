public class Practice14_01 {
    public static void main(String[] agrs){
        try{
            String x = null;
            System.out.println(x.toString());


        } catch (NullPointerException e) {
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finallyブロックです。");
        }

        }

    }
