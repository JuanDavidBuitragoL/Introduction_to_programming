package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int []array = new int[10];
        Scanner keyboard = new Scanner(System.in);
        int digit = 0, counter = 0;

        System.out.println("Por favor digite el numero para verificar si es capicua, -1 para terminar");
        do {
            System.out.println("");
            digit = keyboard.nextInt();
            array[counter] = digit;
            counter++;
        }while (digit != 1);
        counter--;
        if (verifCapicua(array,counter)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }
    public static boolean verifCapicua(int []array, int size) {
        for (int i = 0; i < size; i++){
            if (array[size - (i+1)]!=array[i]){
                return false;
            }
        }
        return true;
    }
}
