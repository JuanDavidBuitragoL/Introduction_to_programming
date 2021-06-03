package usta.fis;

import javax.management.StringValueExp;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int[][] matrix;
        int value;
        String columns, rows, input;
        columns = JOptionPane.showInputDialog("This program create dynamic bidimensional array, " +
                " \n please type the size of columns: ");
        rows = JOptionPane.showInputDialog("Please type the size of columns: ");
        matrix = new int[Integer.parseInt(rows)][Integer.parseInt(columns)];

        JOptionPane.showMessageDialog(null, "Please type the values" +
                "for the bidimensional array of: " + rows + " rows and " + columns + " columns");
        for (int i = 0; i < Integer.valueOf(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                input = JOptionPane.showInputDialog("Please typ the value array[" + i + "][" + j + "]=");
                value = Integer.parseInt(input);
                matrix[i][j] = value;
            }
        }


    }
    public static String toStringMatrix(int [][]matrix){
        String matrixReturn ="";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixReturn = matrixReturn + String.valueOf(matrix[i][j]) + " ";
            }
            matrixReturn = matrixReturn + " \n ";
        }
        return matrixReturn;
    }
    public static int findBiggestValueInMatrix(int [][] matrix){
        int biggest = matrix[0][0];
        for (int i= 0; i < matrix[i].length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                if (biggest < matrix[i][j]){
                    biggest = matrix[i][j];
                }
            }
        }
        return biggest;
    }

    public static int countDigitsNumber(int myNumber){
        String value = String.valueOf(myNumber);
        return value.length();

    }

}