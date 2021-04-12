package Practice4.Chapter6methods;

public class PassByPractice {
    public static void main(String[] args) {
//        int max = 0;
//        max(1, 2, max);
//        System.out.println(max);
//    }
//
//    public static void max(
//            int value1, int value2, int max) {
//        if (value1 > value2)
//            max = value1;
//        else
//            max = value2;
//    }
//}
//answer is 0, variable is not changed

//        b

        int i = 1;
        while (i<=6){
            method1(i,2);
            i++;
        }
    }

    public static void method1(int i, int num) {
        for (int j = 1; j<=i; j++){
            System.out.println(num + " ");
            num *=2;
        }
        System.out.println();

//        (b)
//                2
//        2 4
//        2 4 8
//        2 4 8 16
//        2 4 8 16 32
//        2 4 8 16 32 64
    }
}


