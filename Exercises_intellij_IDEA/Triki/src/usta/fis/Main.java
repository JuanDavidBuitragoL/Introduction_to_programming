package usta.fis;

import usta.fis.Game;

import javax.swing.*;

public class Main {
    private static Game myTriki;



    public static void main(String[] params) {
        myTriki = new Game();
        String value, value2, showInfo, row, column;
        int valueConfirmDialog;
        //read the value
        value = JOptionPane.showInputDialog("Please type the rows of your vehicle");
        value2 = JOptionPane.showInputDialog("Please type the columns of your vehicle");
        //set the value in the serviceType variable
        myTriki.createPlacesArray(value);//1.1
        myTriki.createPlacesArray2(value2);
        myTriki.initPlacesArray();//2
        do {
            showInfo = myTriki.arrayToShow();

            JOptionPane.showMessageDialog(null, showInfo);
            row = JOptionPane.showInputDialog("Hello, for your place, please type the Column to fill: ");
            column = JOptionPane.showInputDialog("Hello, for your place, please type the Column to fill: ");
            showInfo = myTriki.fillPlace(row, column);
            JOptionPane.showMessageDialog(null, showInfo);
            JOptionPane.showMessageDialog(null, "Next turn");
            valueConfirmDialog = 0;



        }while (valueConfirmDialog == JOptionPane.YES_OPTION);
        showInfo = myTriki.statusOfTrikiPlaces();
        JOptionPane.showMessageDialog(null, showInfo);
    }

}
