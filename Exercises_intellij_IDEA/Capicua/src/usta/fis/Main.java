package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        p_show_info_program();
	int i, num, num_invertido = 0, num_faltante;
        Scanner N = new Scanner(System.in);

        do {
            System.out.print("Introdusca un numero mayor a 10: ");
            i = N.nextInt();
        }while (i < 10);

        num = i;
        while (num != 0){
            num_faltante = num % 10;//Conocer el ultimo numero de la cantidad ingresada
            num = num / 10;// Se quita el ultimo numero de la cantidad dividiendolo en 10
            num_invertido = num_invertido * 10 + num_faltante;//num_faltante ayuda a que el numero que quitamos anteriormente se agregue de nuevo
        }
        if (i == num_invertido){
            System.out.println("El numero "+i+" es capicua");
        }else{
            System.out.println("El numero "+i+" no es capicua");
        }
    }
    public static void p_show_info_program() {
        //DESCRIPTION: This method show info program (software)
        System.out.println("-----------------------------------------------------");
        System.out.println("|                 Capicua V1.0                       | ");
        System.out.println("|           Maker: Juan D Buitrago L                 | ");
        System.out.println("|            Date: 2021-March-26                     |");
        System.out.println("-----------------------------------------------------");
    }
}
