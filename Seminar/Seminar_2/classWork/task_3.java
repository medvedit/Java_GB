/*
 * Напишите метод, который принимает на вход строку (String) и
 * определяет является ли строка палиндромом (возвращает boolean значение).
 */

package Java_GB.Seminar.Seminar_2.classWork;

public class task_3 {
    public static void main(String[] args) {
        System.out.println(isPolindrom("наворован"));
        palindrom("наворован");
        System.out.println(isPalindrome("наворован"));
        System.out.println(palindro("наворован"));
    }

    public static boolean isPolindrom(String str) {

        str = str.replaceAll("\\s", "");
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr += str.charAt(i);
        }
        return str.equals(reverseStr);

    }
    public static void palindrom(String incomingString){
        StringBuilder invertString = new StringBuilder(incomingString).reverse();
        if (incomingString.equals(invertString.toString())){
            System.out.printf("Строка %s - палиндром\n",incomingString);
        }else {
            System.out.printf("Строка %s - не палиндром\n",incomingString);
        }
    }
    static boolean isPalindrome(String str) {
        char[] strX = str.toCharArray();
        int y = strX.length - 1;
        for (int i = 0; i < strX.length/2; i++) {
            if (strX[i] != strX[y - i]){

                return false;
            }
        }
        return true;
    }
    public static boolean palindro(String incomingString){
        return  (incomingString.equals(new StringBuilder(incomingString).reverse().toString()));
    }

}
