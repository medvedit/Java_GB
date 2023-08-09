/*
 *  toArray(): возвращает массив из элементов списка
 */

package ru.medwedSA.Java_Core_GB.Lectures.Lecture_4;

import java.util.Arrays;
import java.util.LinkedList;

public class Car {

    String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }

    public static void main(String[] args) {
        LinkedList<Car> cars = new LinkedList<>();
        Car ferrari = new Car("Ferrari 360 Spider");
        Car bugatti = new Car("Bugatti Verona");
        Car Lamborghini = new Car("Lamborghini Diablo");

        cars.add(ferrari);
        cars.add(bugatti);
        cars.add(Lamborghini);
        // Предположим, что нам необходимо формированный список LinkedList преобразовать в массив элементов:
        System.out.println(cars.size()); // 3 получаем длину списка
        System.out.println(cars + " " + cars.getClass()); // Печать LinkedList в консоль.
// [Car{model='Ferrari 360 Spider'}, Car{model='Bugatti Verona'}, Car{model='Lamborghini Diablo'}] class java.util.LinkedList

        Car[] carsArray = cars.toArray(new Car[5]); // Создали массив по cars, по всем трем элементам +
        // два последних элемента со значением null. Вязано это с тем, что в списке cars было только три элемента,
        // а массив carsArray мы создаем длинной 5 элементов.
        System.out.println(Arrays.toString(carsArray));
// [Car{model='Ferrari 360 Spider'}, Car{model='Bugatti Verona'}, Car{model='Lamborghini Diablo'}, null, null]

    }
}
