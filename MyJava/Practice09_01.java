public class Practice09_01 {
    public static void main(String[] args)
    {
        for (int i = 1; i <= 20; i++){
            if (i < 10 && i % 2 == 1 || i == 8){
                continue;
            }else if (i > 10 && i / 10 == 1){
                continue;
            }
            System.out.println(i);
        } 
    }
}
