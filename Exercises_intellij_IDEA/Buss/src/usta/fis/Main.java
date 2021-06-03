package usta.fis;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int columns=4, rows=0, ocupy =0, columnaaocupar=0, again=1, contador1=0, contador2=0, contadorN=0;
        char [][] st;
        String answer;
        String matrix= "";

        answer= JOptionPane.showInputDialog("Type the rows of the bus");
        rows=Integer.valueOf(answer);
        st= new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i%2!=0){
                    st[i][j]= 'X';
                    contador1=contador1+1;
                }
                else {
                    st[i][j]= 'D';
                    contador2=contador2+1;
                }
            }
        }
        matrix = "";
        columns=4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix=matrix+" "+st[i][j];
            }
            matrix=matrix+"\n";
        }
        JOptionPane.showMessageDialog(null, "The matrix is:\n"+matrix+"\n seats free= "+contador1+"\nSits ocuped= "+contador1+"\nSits ocuped= "+contador2);
        while (again==1){
            answer= JOptionPane.showInputDialog("Type the row you want to ocupe");
            ocupy=Integer.valueOf(answer);
            answer= JOptionPane.showInputDialog("Type the column you want");
            columnaaocupar=Integer.valueOf(answer);
            if (st[ocupy][columnaaocupar]=='X'){
                JOptionPane.showMessageDialog(null, "It is already ocuped");
            }else {
                st[ocupy][columnaaocupar] = 'O';
                contadorN=contadorN+1;
                contador1=contador1-1;
            }
            //IMPRIME LA MATRIZ/
            matrix = "";
            columns=4;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix=matrix+" "+st[i][j];
                }
                matrix=matrix+"\n";
            }
            JOptionPane.showMessageDialog(null, "The matrix is:\n"+matrix+"\nSeats free= "+contador1+"\nSeats ocuped= "+contadorN+"\nSeats ocuped= "+contador2);
            answer= JOptionPane.showInputDialog("Â¿Do you want to use another seat?\n" +
                    "1: Yes\n" +
                    "0: No");
            again=Integer.valueOf(answer);
        }
    }
}