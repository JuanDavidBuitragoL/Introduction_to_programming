package usta.fis;

public class Game {
    private char [][] places;
    //setter and getter methods

    public void createPlacesArray(String rows){
        int rowsInt = Integer.parseInt(rows);
        places = new char[rowsInt][3];

    }
    public void createPlacesArray2(String column){
        int columnInt = Integer.parseInt(column);
        places = new char[columnInt][3];

    }

    public void initPlacesArray(){
        boolean letters = true;
        //this instruction loop the rows
        for (int i = 0; i < places.length ; i++){
            //this instruction loop the columns
            for (int j = 0; j < places[0].length; j++) {
                if (letters == true) {
                    places[i][j] = '▭';
                } else {
                    places[i][j] = '▭';
                }
            }
            if (letters == true){
                letters = false;
            }else{
                letters = true;
            }
        }
    }
    public String arrayToShow(){
        String returnString = "";

        for (int i = 0; i < places.length; i++){
            for (int j = 0; j < places[0].length; j++){
                returnString = returnString + places[i][j]+" ";
            }
            returnString = returnString+"\n";
        }
        return returnString;
    }
    public String fillPlace(String row, String column){
        int rowInt = Integer.parseInt(row);
        int columnInt = Integer.parseInt(column);

        if (places[rowInt][columnInt] =='X'||places[rowInt][columnInt] =='0') {
            return "This place is already occupied";
        }else{
            places[rowInt][columnInt] = '0';
            places[rowInt][columnInt] = 'X';
            return "The place succefully filled";
        }

    }
    public String statusOfTrikiPlaces(){
        int filledPlaces = 0, emptyPlaces = 0;
        for (int i = 0; i < places.length; i++) {
            for (int j = 0; j < places[0].length; j++) {
                if (places[i][j] == 'X') {
                    filledPlaces++;
                }
                if (places[i][j] == '0') {
                    emptyPlaces++;
                }
            }
        }

        return "The amount of filled places is: "+filledPlaces+", the amount of empty places is: "+emptyPlaces;


    }

}

