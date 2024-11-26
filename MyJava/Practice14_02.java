import java.util.Random;

public class Practice14_02 {
    public static void main(String[] agrs){
        try{
            test();

        } catch (ArithmeticException e) {
            System.out.println("計算例外をキャッチしました。");
        } catch (NullPointerException e){
            System.out.println("ぬるぽをキャッチしました。");
        } finally {
            System.out.println("finally 計算終了");
        }
        System.out.println("処理終了");
    }

    static void test() {
        int i = new Random().nextInt(2);
        
        //System.out.println(i);
        
        if (i == 0){
            i = 10/0;
        } else {
            String x = null;
            System.out.println(x.toString());
        }
    
    }
    
}
