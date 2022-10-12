class Animal {
    String name;
    int age;
    int height;

    void SetName(String name){

        this.name = name;
    }
}

class Dog extends Animal {
    void Sleep(){
        System.out.println(this.name + " is now zzz NOT in the house");
    }

}

class HouseDog extends Dog {
    HouseDog(String name) {
        this.SetName(name);
    }
    //생성자의 규칙.
    //위 메소드처럼 메소드명이 클래스명과 동일하고 리턴 자료형을 정의하지 않는 메소드를 생성자(Constructor)라고 한다.

    //생성자의 규칙

    //클래스명과 메소드명이 동일하다.
    //리턴타입을 정의하지 않는다. (void도 사용하지 않는다.)
    void Sleep(){
        System.out.println(this.name + " is now zzz in the house");
    }

    void Sleep(int hour) {
        System.out.println(this.name + " is now zzz in the house for " + hour + "hours ");
    }

}



public class Practice {
    public static void  main(String[] args) {
        HouseDog dog1 = new HouseDog("choco");    // 생성자에서 name 이라는 객체의 변수에 값을 설정하도록 만들었다.
                                                        // 따라서 객체생성 new 할때 호출되므로 입력인수 choco.
                                                        //기능 :필수적인 행동을 객체 생성시에 제어할 수 있다.
        System.out.println(dog1.name);
    }

}
