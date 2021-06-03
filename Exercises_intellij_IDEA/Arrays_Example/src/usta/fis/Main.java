package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        int p_total = 0;
        int v_average = 0;

        int[] p_array_or_vector = new int[3];


        for (counter = 0; counter < p_array_or_vector.length; counter++) {
            System.out.println("Por favor digite su calificacion del corte " + (counter + 1));
            p_array_or_vector[counter] = keyboard.nextInt();
        }
        System.out.println("El promedio es: "+(p_total/p_array_or_vector.length));

        for (counter = 0; counter < p_array_or_vector.length; counter++) {
            System.out.println("El resumen de sus calificaciones es:");
            System.out.println("Su calificacion del corte " + (counter + 1) + " es: " + p_array_or_vector[counter]);
            p_total = p_total + p_array_or_vector[counter];
        }

        for (counter = 0; counter < p_array_or_vector.length; counter++){
            if(counter == 0){
                System.out.println("El valor de la nota es: "+(p_array_or_vector[counter]));
            }

        }


    }


}

