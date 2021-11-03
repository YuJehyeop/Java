// 클래스
class Phone {
    String model;
    String color;
    int price;
}

public class object_oriented_language {
    public static void main(String[] args) {
        Phone galaxy = new Phone();
        galaxy.model = "Galaxy10";
        galaxy.color = "Black";
        galaxy.price = 100;

        Phone iphone = new Phone();
        iphone.model = "iPhoneX";
        iphone.color = "Black";
        iphone.price = 200;

        System.out.println("철수는 이번에" + galaxy.model + galaxy.color + " + 색상을 " + galaxy.price + "만원에 샀다.");
        System.out.println("영희는 이번에" + iphone.model + iphone.color + " + 색상을 " + iphone.price + "만원에 샀다.");
    }
}

//// 매소드
//class Calculation {
//    int add(int x, int y) {
//        return x + y;
//    }
//    int subtract(int x, int y) {
//        return x - y;
//    }
//}
//
//public class object_oriented_language {
//    public static void main(String[] args){
//        Calculation calculation = new Calculation();
//        int addResult = calculation.add(1,2);
//        int subtracResult = calculation.subtract(5,3);
//
//        System.out.println(addResult);
//        System.out.println(subtracResult);
//    }
//}
