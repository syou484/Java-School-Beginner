class Animal{
    String name = "Jhon";
    String type = "nothing";


public void cryAnimals(){
    System.out.println(
        switch (type){
            case "cat" -> "nya-";
            case "dog" -> "wan";
            default -> "特定できませんでした";
        }
    );
}

}

public class Practice13_01 {
    public static void main(String[] agrs){
        Animal dog = new Animal();
        dog.name = "pochi";
        System.out.println(dog.name);
        dog.type = "dog";
        dog.cryAnimals();

        Animal cat = new Animal();
        cat.name = "tama";
        System.out.println(cat.name);
        cat.type = "cat";
        cat.cryAnimals();
    }
    
    
}
