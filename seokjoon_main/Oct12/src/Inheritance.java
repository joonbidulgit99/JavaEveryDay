class JustLikeAnimals {
    String name;

    //methods

    void SetName(String name){
        this.name = name;
    }
}

class Dog extends JustLikeAnimals {

    void Sleep() {
        System.out.println(this.name + " ZZZZZZZ");
    }
}

class HouseDog extends Dog {

    void Sleep() {
        System.out.println(this.name + " ZZZZZZ in the house");

    }
    void Sleep(int hour) {
        System.out.println(this.name + " zzz in house for " + hour + "hours");
    }
    // parameter 만 다른 동일한 이름의 메소드를 생성하였다. 이것은 메소드 오버로딩이라고 한다.
}


public class Inheritance {
    public static void main(String[] args){
    Dog dog1 = new Dog();
    HouseDog dog2 = new HouseDog();

        dog1.SetName("Milk");
        dog2.SetName("Choco");
        System.out.println(dog1.name + dog2.name);
        dog1.Sleep();
        dog2.Sleep(); // HouseDog Class and Dog Class both have a sleep method.
        // But in this case Sleep method in House dog class gets priority.
        // This is called method overriding.  최상단 하이어라키의 메소드를 파생 클래스가 동일한 형태(여기서는 Sleep)로
        // 구현하는 것을 메소드 오버라이딩이라고함.

        dog2.Sleep(5);
    }

}
