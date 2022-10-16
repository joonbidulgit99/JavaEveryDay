interface Predator{
    String GetFood();
}

interface Barkable{
    String GetBark();
}


class Animals {
    String name;

    void SetName(String name){

        this.name = name;
    }
}

class Tiger extends Animals implements Predator, Barkable {

    Tiger(String name){
        this.SetName(name);
    }

    public String GetFood() {
        return "호랑이밥";

    }

    public String GetBark() {
        return "우흥~~";
    }
}

class Lion extends Animals implements Predator {

    public String GetFood() {
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

class BarkingMaker {
    void Barking(Barkable animal){
        System.out.printf(animal.GetBark());

    }
}
public class Interface {
    public static void  main (String[] args){
        Tiger tiger1 = new Tiger("Fucker");
        Lion lion1 = new Lion();
        lion1.SetName("Eon");
        Leopard leopard1 = new Leopard();


        Feeder feeder1 = new Feeder();


        System.out.println("name of tiger1 is " + tiger1.name ); // dot operator 를 이용해 객체 tiger1의 name 에 접근하였다. name은 animal class의 class variable 이다.


        feeder1.Feeding(tiger1);
        feeder1.Feeding(lion1);
        feeder1.Feeding(leopard1);

        System.out.println(tiger1.GetFood());

        BarkingMaker maker1 = new BarkingMaker();
        maker1.Barking(tiger1);


    }
}

