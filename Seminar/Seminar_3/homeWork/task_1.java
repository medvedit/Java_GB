/*
 * Задача 1
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */

 package Java_GB.Seminar.Seminar_3.homeWork;

 import java.util.ArrayList;
 import java.util.List;
 import java.util.Random;

 public class task_1 {

     public static void main(String[] args) {

         List<Integer> randomList = myNumbers();
         maxMinAverage(randomList);

     }
     public static ArrayList<Integer> myNumbers(){
         ArrayList<Integer> numberList = new ArrayList<>();
         Random random = new Random();

         for (int i = 0; i < 11; i++) {
             numberList.add(random.nextInt(0, 100));
         }System.out.println(numberList);
         return numberList;

     }
     public static void maxMinAverage(List<Integer> numList){

         int numMax = numList.get(0);
         int numMin = numList.get(0);
         double sum = numList.get(0);

         for (int i = 1; i < numList.size(); i++) {
             sum = sum + numList.get(i);
             if(numList.get(i) > numMax){
                 numMax = numList.get(i);
             }if(numList.get(i) < numMin){
                 numMin = numList.get(i);
             }

         }System.out.printf("Max %d, Min %d, Average %.2f\n",numMax, numMin, sum/numList.size());

     }

 }
