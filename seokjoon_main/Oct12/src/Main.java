// This code is about Call by Value
// Difference b2w conveying  Primitive type and Reference type to the method's parameter.


// Updater class 는 int type parameter 를 받는 method 를 가진다
class UpDater {
    void update( Counter a) {
        a.count++;
    }
}

class Counter {
    int count = 0;
}

public class Main {
    public static void main(String[] args) {
        Counter MyCounter = new Counter();
        System.out.println("MyCounter.count = " + MyCounter.count);

        UpDater MyUpdater = new UpDater();
        MyUpdater.update(MyCounter);
        System.out.println("MyCounter.count = " + MyCounter.count);  // MyCounter 라는 object 의 count value 가 1로 바뀜 //



        System.out.println("Hello world!");
    }
}