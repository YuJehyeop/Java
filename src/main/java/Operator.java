import com.sun.imageio.spi.RAFImageOutputStreamSpi;
import org.omg.CORBA.INTERNAL;

import java.util.Arrays;

// 3. 연산자
public class Operator {
    public static void main(String[] args) {

// 1. 사칙연산
        int num1 = 10;
        int num2 = 5;

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(0);


// 2. 대입 연산자

        int num3 = 10;
        int num4 = 5;

        System.out.println(num3);

        num1 += num4;
        System.out.println(num3); // 15

        num1 -= num4;
        System.out.println(num3); //10

        num1 *= num4;
        System.out.println(num3); //50

        num1 /= num4;
        System.out.println(num3); //10

        num1 %= num4;
        System.out.println(num3); // 0

// 3. 관계 연산자

        int num5 = 10;
        int num6 = 5;

        System.out.println(num5);

        num5 += num6;
        System.out.println(num5); // 15

        num1 -= num6;
        System.out.println(num5); //10

        num1 *= num6;
        System.out.println(num5); //50

        num1 /= num6;
        System.out.println(num5); //10

        num1 %= num6;
        System.out.println(num5); // 0

// 논리 연산자
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // and : 둘 다 참인경우
        System.out.println(a || b); // or
        System.out.println(!b); // NOT

    }
}


