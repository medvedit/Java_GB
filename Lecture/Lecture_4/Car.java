/*
 *  toArray(): возвращает массив из элементов списка
 */

package Java_GB.Lecture.Lecture_4;

import java.util.Arrays;
import java.util.LinkedList;

public class Car {

    String model;

    public Car(String model) {
        this.model = model;
    }

   //
   public static void main(String[] args) {
    LinkedList<Car> cars = new LinkedList<>();
    Car ferrari = new Car("Ferrari 360 Spider");
    Car bugatti = new Car("Bugatti Veyron");
    Car Lamborghini = new Car("Lamborghini Diablo");

    cars.add(ferrari);
    cars.add(bugatti);
    cars.add(Lamborghini);
    Car[] carsArray = cars.toArray(new Car[3]);
    System.out.println(Arrays.toString(carsArray)); // [Car{model='Ferrari 360 Spider'}, Car{model='Bugatti Veyron'}, Car{model='Lamborghini Diablo'}]
   }

   @Override
   public String toString() {
       return "Car{" +
               "model='" + model + '\'' +
               '}';
   }

}
