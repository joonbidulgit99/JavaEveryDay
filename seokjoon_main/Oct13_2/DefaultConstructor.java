class Animal{
    String name;

    void SetName(String name){
        this.name = name;
    }
}

class Dog extends Animal {
    void Sleep() {
        System.out.println(this.name + " ZZZ");
    }
}

class HouseDog extends Dog {
    HouseDog(String name) {
        this.SetName(name);
    }
    HouseDog(int type) {
        if (type == 1) {
            this.SetName("yorkshire");
        } else if (type == 2) {
            this.SetName("bulldog");
        }
    }
}



public class DefaultConstructor {
    public static void  main(String[] args) {
        HouseDog dog1 = new HouseDog("milk");
        HouseDog dog2 = new HouseDog(2);

        System.out.println(dog1.name);
        System.out.println(dog2.name);
    }

}
