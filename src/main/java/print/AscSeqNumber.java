package print;

public class AscSeqNumber {
    // 2.написать метод, печатающий 1, 2, 3, 4, 5
    static String str = ", ";

//    public static void numbers(int num, String str) {
//
//        for (int i = 1; i <= num; i++) {
//            if (i == num) {
//                System.out.print(i);
//
//            } else {
//                System.out.print(i + str);
//            }
//        }
//    }

    public static void numbers (int num) {
        for (int i = 1; i < num; i ++) {
            System.out.print(i + str);
        }
        System.out.print(num);
    }





        // 1. Print 1, 2, 3, 4, 5
        // конкатенация (a + b), печать строки ("1, 2 ..."), печать массива
        // цикл for делает за нас повторения

        public static void main (String[]args) {
            int a = 1;
            int b = 2;
            int c = 3;
            int d = 4;
            int e = 5;

            String str = ", ";
            System.out.println();
            System.out.print(a + str + b + str + c + str + d + str + e + str);
            System.out.println();

            System.out.print("1, 2, 3, 4, 5");


            for (int i = 1; i <= 1000; i++) {
                System.out.print(i + str);
            }
            System.out.println();

            //numbers(5, str);

            numbers(5);

        }

}


