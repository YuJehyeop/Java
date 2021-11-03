import org.omg.CORBA.INTERNAL;
import java.util.Arrays;

// 변수의 처음에 숫자를 넣지 않는다
// 낙타 케이스: 변수의 처음은 소문자 , 이어지는 다음 문자의 첫글자는 대문자

// 기본틀
public class Main {
    public static void main(String[] args){

// 1. 기본 자료형
        int number = 5;  // int
        System.out.println(number); // 단축 : sout + tab

        String sparta = "Hello sparta"; // 자료형
        System.out.println(sparta);

        sparta = "Good bye sparta";
        System.out.println(sparta);

        final int finalNumber = 1;  // 상수
        System.out.println(finalNumber);

// 2. 자료형 (숫자)

        //short: 2 바이트로 표현 가능한 정수형 자료형
        short s = 1;
        System.out.println(s);

        //int: 4 바이트로 표현 가능한 정수형 자료형
        int a = 3;
        System.out.println(a);

        //long: 8 바이트로 표현 가능한 정수형 자료형
        long b= 4;
        System.out.println(b);

        //float: 소수점 표현 가능한 자료형 (뒤에 F를 붙여줘야된다.)
        float f = 5.5F;
        System.out.println(f);

        //double: 좀더 큰 범위의 소수점 표현 가능한 자료형 (뒤에 F를 붙여줘야된다.)
        double d = 5.5F;
        System.out.println(d);

        // 자료형들이 보여줄 수 있는 최대값, 최소값 보기
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MAX_VALUE);

        System.out.println(Float.MAX_VALUE);

        System.out.println(Double.MAX_VALUE);

// 3. 자료형(문자)
        // 문자 하나를 표현해주는 자료형 (char는 한글자만 가능)
        char c = 'A';
        System.out.println(c);

        // 논리 자료형 (불리언)
        boolean fact = true;
        fact = false;
        System.out.println(fact);

        // 바이트
        byte data = 'd';
        System.out.println(data);

//// 4. 참조 자료형
//
//        int[] intEmptyArray = new int[5]; // 인덱스 방법
//        System.out.println(Arrays.toString(intEmptyArray));
//
//        int[] intArray = new int[] {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(intArray));
//
//        String[] stringEmptyArray = new String[5];
//        System.out.println(Arrays.toString(stringEmptyArray));
//
//        String[] season = {"봄", "여름", "가을", "겨울"};
//        System.out.println(Arrays.toString(season));
//
//        System.out.println(season[season.length -1]);
    }
}
//
//// 퀴즈 1: 문자 변수 'S' , 정수형 변수 10 를 선언 및 출력해보세요.
//
//public class Main {
//    public static void main(String[] args){
//        char str = 'S';
//        int num = 10;
//        System.out.println(str);
//        System.out.println(num);
//        System.out.println( str + "" + num );
//        System.out.println( str + "\n" + num );
//    }
//}