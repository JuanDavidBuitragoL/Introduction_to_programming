package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int [] mySingleArray ;
	int size = 0;
	int i = 0;
	int grade = 0;
	float averageResult = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the size for single array");
        size = keyboard.nextInt();
        mySingleArray = new int[size];

        System.out.println("Please type the grades you want to get the average");

        while (i < mySingleArray.length){
            System.out.println("Please type the "+(i+1)+" grade: ");
            grade = keyboard.nextInt();
            mySingleArray[i] = grade;
            i++;//Es lo mismo que decir i=i+1
        }
        averageResult = calculateAverage(mySingleArray);
        for (int j = 0; j < mySingleArray.length; j++){
            System.out.print(mySingleArray[j]+",");
        }
        System.out.println("The average of your grade is: "+averageResult);

    }
    //hacer un subprograma-metodo-funcion para que haga la sumatoria
    //
    // mostrar la sumatoria y el promedio de las notas digitadas
    public static int sumatory(int [] mySingleArray) {
        int counter = 0, sum = 0;
        while (counter < mySingleArray.length){
            sum = sum + mySingleArray[counter];
            counter++;
        }
        return sum;
    }
	public static float calculateAverage(int [] mySingleArray){
        int sum = 0;
        float average = 0;
        sum = sumatory(mySingleArray);

        average = sum / mySingleArray.length;
        return average;

        }

}
