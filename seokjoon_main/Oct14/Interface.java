interface Predator{
    String GetFood();
}

class Animals {
    String name;

    void SetName(String name){

        this.name = name;
    }
}

class Tiger extends Animals implements Predator{
    public String GetFood() {
        return "호랑이밥";

    }
}

class Lion extends Animals implements Predator{
    public String GetFood(){
        return "사자밥";
    }

}

class Leopard extends Animals implements Predator {

    public String GetFood() {
        return "레오파드밥";
    }
}



class Feeder{

    void Feeding(Predator animal){
        System.out.println(animal.GetFood());
    }

}
public class Interface {
    public static void  main (String[] args){
        Tiger tiger1 = new Tiger();
        Lion lion1 = new Lion();
        Leopard leopard1 = new Leopard();
        Feeder feeder1 = new Feeder();

        feeder1.Feeding(tiger1);

        feeder1.Feeding(lion1);
        feeder1.Feeding(leopard1);

    }
}

