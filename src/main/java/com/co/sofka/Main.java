package com.co.sofka;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

   static List<Integer> listA = new ArrayList<>();
   static List<Integer> listB = new ArrayList<>();

    public static void main(String[] args) {

        int arreglo1[] = {1,2,3,6,4};
        int arreglo2[] = {7,8,9,4,5};



        System.out.println("suma ");
        IntStream.range(0, arreglo1.length)
                .mapToObj(index -> sumar(arreglo1[index] , arreglo2[index]))
                .forEach(System.out::println);

        System.out.println("resta ");
        IntStream.range(0, arreglo1.length)
                .mapToObj(index -> restar(arreglo1[index] , arreglo2[index]))
                .forEach(System.out::println);

        System.out.println("multiplicacion ");
        IntStream.range(0, arreglo1.length)
                .mapToObj(index -> multiplicar(arreglo1[index] , arreglo2[index]))
                .forEach(System.out::println);

        System.out.println("Division ");
        IntStream.range(0, arreglo1.length)
                .mapToObj(index -> dividir(arreglo1[index] , arreglo2[index]))
                .forEach(System.out::println);

        System.out.println("Modulo ");
        IntStream.range(0, arreglo1.length)
                .mapToObj(index -> modulo(arreglo1[index] , arreglo2[index]))
                .forEach(System.out::println);

        System.out.println("Elevar ");
        IntStream.range(0, arreglo1.length)
                .mapToObj(index -> elevar(arreglo1[index] , arreglo2[index]))
                .forEach(System.out::println);

    }

    public static int sumar(int number1, int number2){
        return number1 + number2;
    }

    public static int restar(int number1, int number2){
        return number1 - number2;
    }

    public static int multiplicar(int number1, int number2){
        return number1 * number2;
    }

    public static int dividir(int number1, int number2){
        number2 = number2 == 0 ?  1 : number2;
        return number1 / number2;
    }

    public static int modulo(int number1, int number2){
        return number1 % number2;
    }

    public static double elevar(int number1, int number2){
        return Math.pow(number1, number2);
    }

}
