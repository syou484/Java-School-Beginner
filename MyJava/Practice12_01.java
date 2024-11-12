public class Practice12_01 {
    public static void main(String[] agrs){

        int x = 5;
        int y = 3;

        int sum = sumDown(x ,y);

        System.out.println("sum = " + sum);
    }

    private static int sumDown(int x, int y){
        return x - y;
    }
    
}
