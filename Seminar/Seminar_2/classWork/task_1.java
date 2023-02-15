
package Java_GB.Seminar.Seminar_2.classWork;

public class task_1 {

    public static void main(String[] args) {

        task_1(10, 'a', 'b');

    }

    public static void task_1(int n, char c1, char c2) {
        StringBuilder result = new StringBuilder();
        while (true) {
            result.append(c1);
            n--;
            if (n == 0)
                break;
            result.append(c2);
            n--;
            if (n == 0)
                break;
        }
        System.out.println(result);
    }

    public static String getString(int n, char c1, char c2) {
        StringBuilder result = new StringBuilder();
        if (n % 2 == 0){
            for (int i = 0; i < n; i++) {
                result.append(i % 2 == 0 ? c1 : c2);
            }
            return result.toString();
        }
        return null;
    }

    public static StringBuilder stringLength(int n, char c1, char c2) {
    StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(c1);
            result.append(c2);
        }
        return result;
    }
    public static String createStringForNumber(int n, char c1, char c2) {
        String result = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                result += c1;
            else
                result += c2;
        }
        return result;
    }
}
