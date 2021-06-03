package usta.fis;

import usta.fis.Vehicle;

import javax.swing.*;

public class Main {
    private static Vehicle myVehicle;


    public static void main(String[] params) {
		myVehicle = new Vehicle();
		String value, showInfo, row, column;
		int valueConfirmDialog;
		//read the value
		value = JOptionPane.showInputDialog("Please type the of rows of your vehicle");
		//set the value in the serviceType variable
		myVehicle.createPlacesArray(value);//1.1
		myVehicle.initPlacesArray();//2
		do {
		showInfo = myVehicle.arrayToShow();

		JOptionPane.showMessageDialog(null, showInfo);
		row = JOptionPane.showInputDialog("Hell, for your place, please type the Column to fill: ");
		column = JOptionPane.showInputDialog("Hello, for your place, please type the Column to fill: ");
		showInfo = myVehicle.fillPlace(row, column);
		JOptionPane.showMessageDialog(null, showInfo);
		valueConfirmDialog = JOptionPane.showConfirmDialog(null, "Do you want to include another passenger(YES)?, \n" + "or leave away the bus (NO)");


	}while (valueConfirmDialog == JOptionPane.YES_OPTION);
		showInfo = myVehicle.statusOfBusPlaces();
		JOptionPane.showMessageDialog(null, showInfo);
    }

}
