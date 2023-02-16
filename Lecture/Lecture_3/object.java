/*
 *  Object
    Тип данных Object – «всему голова»
    Упаковка – любой тип можно положить в переменную типа Object
    Распаковка – преобразование Object-переменной в нужный тип
    Иерархия типов – любой тип «ниже» Object’а

 */

package Java_GB.Lecture.Lecture_3;

public class object {

    public static void main(String[] args) {

        Object o = 1; GetType(o); // java.lang.Integer
        o = 1.2; GetType(o); // java.lang.Double
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.2, 2.1));
        System.err.println(Sum("Маша", " -> Каша"));
    }
    static void GetType(Object obj){
        System.out.println(obj.getClass().getName());
    }
    static Object Sum(Object a, Object b) {
        // Метод принимает два объекта  object. Внутри метода делаем проверки на тип объекта,
        // если тип объекта отвечает условию if, то
        // преобразовываем object к нужному методу, делаем действия и для возврата
        // решения/ответа из функции вновь приводим, получено значение в объект object.
        // много действий. При большой нагруженности этого метода просадка скорости гарантирована.
        // Поэтому на применением такого метода стоит подумать.
        // Прибегать к такому методу стоит только в крайнем случае !!!!!!!!!!!!
        if (a instanceof Double && b instanceof Double) {
        return (Object)((Double) a + (Double) b);
        } else if(a instanceof Integer && b instanceof Integer) {
        return (Object)((Integer) a + (Integer) b);
        } else if (a instanceof String && b instanceof String){
        return (Object)((String) a + (String) b);
        } else return 0;
   }


}
