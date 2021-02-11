package demo;

import java.util.Random;

public class Square {


    int squareType;  //0 = start, 1= finishSquare, 2=road, 3=structure
    int xCord;
    int yCord;
    static int numberOfStructures=0;


    public Square(int x, int y){
        xCord = x;
        yCord =y;

        squareType = chooseTileType();
    }

    public Square(int x, int y, int squareType){
        xCord = x;
        yCord =y;

        this.squareType = squareType;

    }

    public int chooseTileType(){
            Random r = new Random();
            return r.nextInt(2)+2;


    }

    public int getSquareType(){
        return this.squareType;
    }

    public int myType(){
        return this.squareType;
    }


}
