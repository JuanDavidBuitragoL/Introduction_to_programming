package usta.fis;

import java.util.Scanner;

public class Main {
    public static void p_show_info_program(){
        System.out.println("Maker Juan David Buitrago");
        System.out.println("Date: 19-04-2021");
        System.out.println("Description: This sofware works like a calculator operating two numbers");
    }
    public static void main(String[] args) {
        int v_number_one=0;
        int v_number_two=0;
        int v_operation=0;
        p_show_info_program();
        Scanner keyboard = new Scanner(System.in);
        do {
            //data read
            System.out.println("Por favor digite el primer numero");
            v_number_one = keyboard.nextInt();
            System.out.println("Por favor digite el segundo numero");
            v_number_two = keyboard.nextInt();
            System.out.println("Por favor digite 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir, 5 para numeros primos, 0 para cancelar");
            v_operation = keyboard.nextInt();
            //operate and show result
            System.out.println("El resultado es:" + p_operate_number(v_number_one, v_number_two, v_operation));
        }while (v_operation!=0);
    }

    public static int p_operate_number(int v_number_one, int v_number_two, int v_operation){
        int v_result = 0;
        String v_convert="";
        switch (v_operation){
            case 1:
                v_result = v_number_one + v_number_two;
                break;
            case 2:
                v_result = v_number_one-v_number_two;
                break;
            case 3:
                v_result = v_number_one*v_number_two;
                break;
            case 4:
                v_result = v_number_one/v_number_two;
                break;
            case 5:

        }
        return v_result;
    }
}
