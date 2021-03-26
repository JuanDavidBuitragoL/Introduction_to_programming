package usta.fis;

import java.util.Scanner;

/*AUTHOR     : Juan D Buitrago L
  DATE       : 23 March of 2021
  DESCRIPTION: This software calculate time between two cities
 */
public class Main {

    public static void main(String[] args) {
        p_show_info_program();
        int v_distance = p_user_distance();
    }
    public static void p_show_info_program(){
        //DATE: 23 March of 2021
        //DESCRIPTION: This metod show the info software
        System.out.println("---------------------------------------------");
        System.out.println("!         SOFTTIMECYCLE VERSION 1.0         !");
        System.out.println("!         MAKER: Juan D Buitrago L          !");
        System.out.println("DESCRIPTIO: Calculate time between two cities");
        System.out.println("---------------------------------------------");
    }
    public static int p_user_distance(){
        Scanner keyboard = new Scanner(System.in); // Use la variable KWYBOARD como instancia para el teclado
        int v_distance;
        System.out.println("Input/type the distance between two cities: ");
        v_distance= keyboard.nextInt(); //pidiendo por teclado la variable de V_DISTANCE
        while (v_distance<0){
            System.err.println("ERR: The distance should be grater than zero, input/type again the distance between two cities");
            v_distance= keyboard.nextInt(); //pidiendo por teclado la variable de V_DISTANCE

        }
        return v_distance;
    }
}
