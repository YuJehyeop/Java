// 상속
//class Animal {
//    String name;
//
//    public void cry() {
//        System.out.println(name + "is crying.");
//    }
//}
//class Dog extends Animal {
//    Dog(String name) {
//        this.name = name;
//    }
//
//    public void swim() {
//        System.out.println(name + " is swimming.");
//    }
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//        Dog dog = new Dog("코코");
//        dog.cry();
//        dog.swim();
//
//        Animal dog2 = new Dog("미미");
//        dog2.cry();
////        dog2.swim();
//    }
//}

//// 오버로딩
//public class Inheritance {
//    public static void main(String[] args) {
//        // write your code here
//
//    }
//    int add(int x, int y, int z){
//        return x+y+z;
//    }
//
//    long add(int a, int b, long c){
//        return a+b+c;
//    }
//
//    int add(int a, int b){
//        return a+b;
//    }
//}

// Overrride
class Animal {
    String name;
    String color;

    public Animal(String name, String color) {
        this.name = name;
    }

    public Animal(String name) {
    }

//    @Override
      void cry() {
        System.out.println(name + " is crying");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void cry() {
        System.out.println(name + " is barking");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal dog = new Dog("코코");
        dog.cry();
    }
}