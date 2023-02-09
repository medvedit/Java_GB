package Java_GB.Lecture.Lecture_1;

/**
 * program
//  */
// public class program { // cl
//     public static void main(String[] args) { // ma
//         System.out.println("Hello world 2023"); // sys
//     }

// }
/**
 * program
 */
// public class program { //cl
//     public static void main(String[] args) { //ma
//         float e = 2.7f; //тип float требует к присвоенному значению добавления буквы f.
//         double pi = 3.1323d; // у типа double добавление буквы не обязательно, но можно добавлять d.
//         System.out.println(e); //sys
//         System.out.println(pi); //sys
//     }

// }

/**
 * program
*/
// public class program {
//     public static void main(String[] args) {
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1); // true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2); // true
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3); // false
//     }

// }

/**
 * program
 */
// public class program {
//     public static void main(String[] args) {
//         var a = 123;
//         System.out.println(a); // 123
//         var d = 123.456;
//         System.out.println(d); // 123.456
//         System.out.println(getType(a)); // Integer
//         System.out.println(getType(d)); // Double
//         d = 1022;
//         System.out.println(d); // 1022.0
//         //d = "mistake";
//         //error: incompatible types:
//         //String cannot be converted to double
//     }
//     static String getType(Object a){
//         return a.getClass().getSimpleName();
//     }

// }


/**
 * program
 */
// public class program {
//     public static void main(String[] args) {
//         int num = 1_349_908_872; // тип данных int и можно использовать нижнее подчеркивание для наглядности разрядности.
//         System.out.println(Integer.BYTES); //обертка для типа данных int является Integer.
//     }

// }


/**
 * program
 */
public class program { //cl
    public static void main(String[] args) { // ma
        String s = "djfdks";
        s.charAt(1); // обращение к элементу строки по индексу через charAt.
        System.out.println(s.charAt(1)); // печать элемента по индексу. //sys
    }

}