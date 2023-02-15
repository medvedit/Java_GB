
package Java_GB.Seminar.Seminar_2.classWork;

public class task_1 {

    public static void main(String[] args) {

        task_(9, 'a', 'b');
        System.out.println(createStringForNumber(9, 's', 'k'));

    }

    public static void task_(int n, char c1, char c2) {
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
