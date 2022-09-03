import java.net.ConnectException;

public class Main {
    public static void main(String[] args) {
        // Задание 3.1
        System.out.println("Задача 3.1");
        int yearsOld =45;
        if (yearsOld >2 && yearsOld<=6) {
            System.out.println("Если возраст человека равен" + yearsOld + "то ему надо ходить в детский сад");
        }else if (yearsOld >= 7 && yearsOld <= 18) {
            System.out.println("Если возраст человека равен" + yearsOld + "то ему надо ходить  в школу");
        }else if (yearsOld >=18 && yearsOld <=24) {
            System.out.println("Если возраст человека равен" + yearsOld + "то ему надо ходить в университет");
        }else if (yearsOld >=24){System.out.println("Если возраст человека равен" + yearsOld + "то ему надо идти на работу");
        }
        //Задание 3.2
        System.out.println("Задача 3.2");
         int ageKid = 4;
         if (ageKid <5){
         System.out.println("Если возраст ребенка меньше 5 лет, кататься на аттракционе нельзя!" );
         }else if (ageKid >=5 && ageKid <=14){
         System.out.println("Ребенок может кататься на аттракционе в сопровождении взрослого.");
         }else if (ageKid > 14){
         System.out.println("Ребенок может кататься без сопровждения взрослого.");
         }
         //Задание 3.3
         System.out.println("Задача 3.3");
         int one = 80;
         int two = 90;
         int three = 3;
         if (one > two) {
         if (one >=three) {
         System.out.println("Максимальное число -" + one);
         }else{ System.out.println("Максимальное число -" + three);
         }}else if (two > one) {
         if ( two>= three){
         System.out.println("Максимальное чило -" + two);
         }else {System.out.println("Максимальное число-" + three);
         }
         }else {
         if ( one > three) {
         System.out.println("Максимальное число -" + one);
         }else if ( three > one) {
         System.out.println("Максимальное число - "+ three);
         }else if (three > one) {
         System.out.println("Максимальное число -" + three);
         }else {
         System.out.println("Все три числа равны");
         }



    }
    }
}