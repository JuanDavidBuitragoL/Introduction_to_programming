package usta.fis;

public class Vehicle {
    private String serviceType;
    private String color;
    private String brand;
    private float width;
    private float height;
    private int doorsNumber;
    private int wheelNumber;
    private String plates;
    private char [][] places;
    //setter and getter methods
    //set -> Poner, Establecer, COlocar
    //get -> Obtener

    public void setServiceType(String serviceTypeValue){
        serviceType = serviceTypeValue;
    }

    public String getServiceType(){
        return serviceType;
    }

    public String getColor() {
        return color;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public String getPlates() {
        return plates;
    }

    public void createPlacesArray(String rows){
        int rowsInt = Integer.parseInt(rows);
        places = new char[rowsInt][4];
    }

    public void initPlacesArray(){
        boolean letters = true;
        //this instruction loop the rows
        for (int i = 0; i < places.length ; i++){
            //this instruction loop the columns
            for (int j = 0; j < places[0].length; j++) {
                if (letters == true) {
                    places[i][j] = 'D';
                } else {
                    places[i][j] = 'X';
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
                return "The place is unavaible";
            }else{
                places[rowInt][columnInt] = '0';
                return "The place succefully filled";
            }
        }
        public String statusOfBusPlaces(){
            int filledPlaces = 0, emptyPlaces = 0;
            for (int i = 0; i < places.length; i++) {
                for (int j = 0; j < places[0].length; j++) {
                    if (places[i][j] == '0') {
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
