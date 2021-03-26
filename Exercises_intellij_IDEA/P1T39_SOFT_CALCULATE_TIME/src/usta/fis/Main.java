package usta.fis;
/*
        * AUTHOR: Juan D Buitrago L
        * DATE: 25-March-2021
        * DESCRIPTION: This software calculate the total money saved in a year
        */
import java.util.Scanner;     //Library is for the use of our keyboard software

public class Main {

    public static void main(String[] args) {
	p_show_info_program();
    //Calculate TIME = DISTANCE / VELOCITY
    float v_time =0;   // La variable v_time es decimal = float / double
    int v_distance = p_user_distance();
	int v_velocity = p_user_velocity();
	v_time = v_distance/v_velocity;
	System.out.println("The time between two cities is "+v_time+" hours");
    }
    public static void p_show_info_program (){
        //DESCRIPTION: This method show info program (software)
           System.out.println("-----------");
           System.out.println("SoftCalculateTime V1.0");
           System.out.println("Maker: Juan D Buitrago L");
           System.out.println("Date: 2021-March-25");
           System.out.println("-----------");

    }
    public static int p_user_distance(){
        //DESCRIPTION: This method return the distance than user input
        Scanner keyboard = new Scanner(System.in); // we start the library
        System.out.println("Input the distance (KM) between two cities:");
        int v_distance = keyboard.nextInt();
        while (v_distance<=0){
            System.err.println("ERR: The distance should be greater than zero, input again the distance (KM)");
            v_distance=keyboard.nextInt();
        }
        return v_distance;
    }
    public static int p_user_velocity() {
        //DESCRIPTION: This method return the VELOCITY than user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the constance velocity (KM/H) between two cities:");
        int v_velocity = keyboard.nextInt();
        while (v_velocity == 0) {
            System.err.println("ERR: The velocity cannot be same zero, input again the velocity (KM/H)");
            v_velocity = keyboard.nextInt();
        }
        return v_velocity;
    }
}
