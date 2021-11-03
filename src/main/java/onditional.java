// 조건문
// if 문
public class onditional {
    public static void main(String[] args){
        int check = 100;
        int num1 = 150;

        System.out.println("100보다 큰수 입니다.");

// switch 문
        char score = 'A';
        System.out.println("A등급 축하합니다.");

// 삼항 연산자  조건문? True : Fales
        int a= 5;
        String result = "10보다 작습니다.";
        System.out.println(result);

// for 문
        int sum = 0;
        for ( int i=0; i<10; i++){
            sum += i;
        }
        System.out.println(sum);

// for ehch 문
        // write your code here
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for(String day : days){
            System.out.println(day);
        }

//// while 문
//        int i =0;
//        int sum = 0;
//        while (i < 10){
//            if (i ==4){
//                i++;
//                continue; // i == 4일때 i+1하고 이어서 아래 코드 동작
//            }
//            sum += (i+1);
//            i++;
//        }
//        System.out.println(sum);
//
//// do while 문 do 부분을 동작한 후 while문 동작
//        int i =0;
//        int sum = 0;
//        do{
//            sum += (i+1);
//            i++;
//        } while (i < 10){
//            if (i ==4){
//                i++;
//                continue; // i == 4일때 i+1하고 이어서 아래 코드 동작
//            }
//            sum += (i+1);
//            i++;
//        }
//        System.out.println(sum);
    }
}