package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int serie = 0;
        int i = 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the limit number to calculate the fibonacci serie");
        serie = keyboard.nextInt();
        int fibo_array[] = new int[100];
        fibo_array=serie_fibonacci(serie);
        System.out.println("The fibonacci serie for the number "+serie+" is:");
        while (fibo_array[i] != -1) {
            if (fibo_array[i+1]!=-1) {
                System.out.print(fibo_array[i] +", ");
            }else{
                System.out.print(fibo_array[i]);
            }
            i++;
        }
    }
    public static int [] serie_fibonacci(int limit){
        int fibo_array[] = new int[100];
        fibo_array[0] = 0;
        fibo_array[1] = 1;
        for (int i = 1; (fibo_array[i - 1]+ fibo_array[i])< limit; i++) {
            fibo_array[i + 1] = fibo_array[i - 1] + fibo_array[i];
            fibo_array[i + 2] = -1;

        }
        return fibo_array;

    }

}


