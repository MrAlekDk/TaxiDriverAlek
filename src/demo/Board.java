package demo;

import java.util.Random;

public class Board {
    //---------------Attributes-------------//
    private Square[][] squares;
    private Random r;
    private int scale=50;

    //---------------Constructor-------------//
    public Board() {
        this.r = new Random();
        squares = new Square[scale][scale];
        createSquares();
    }


    //---------------Methods-------------//

    public Square[][] getSquares() {
        return this.squares;
    }


    public void createSquares() {
        //---------------------Create start and end squares----------//
        Square start = new Square(r.nextInt(scale), r.nextInt(scale), 0);
        squares[start.xCord][start.yCord] = start;
        Square end = null;

        boolean endPlaced = false;
        while (!endPlaced) {
            int endX = r.nextInt(scale);
            int endY = r.nextInt(scale);

            if (endX != start.xCord | endY != start.yCord) {
                end = new Square(endX, endY, 1);
                squares[end.xCord][end.yCord] = end;
                endPlaced = true;
            }
        }
        //----------Create road from start to finish square---------//
        boolean connected = false;
        Square tmp;
        int roadLength=0;
        int xLocation = start.xCord;
        int yLocation = start.yCord;

        while (connected==false) {

            tmp = new Square(xLocation,yLocation,2);

            int random = r.nextInt(2);

            if(random==0){
                if (tmp.xCord != end.xCord) {
                    if (tmp.xCord < end.xCord) {
                        xLocation += 1;
                    } else if (tmp.xCord > end.xCord) {
                        xLocation += -1;
                    }
                    squares[xLocation][yLocation] = new Square(xLocation,yLocation,2);
                    roadLength++;
                }
            }
            else if(random==1){
                if (tmp.yCord != end.yCord) {
                    if (tmp.yCord < end.yCord) {
                        yLocation += 1;
                    } else if (tmp.yCord > end.yCord) {
                        yLocation += -1;
                    }
                    squares[xLocation][yLocation] = new Square(xLocation,yLocation,2);
                    roadLength++;
                }
            }

            if(tmp.xCord==end.xCord&&tmp.yCord==end.yCord){
                connected=true;
                squares[xLocation][yLocation] = new Square(xLocation,yLocation,1);
            }

        }


        //---------------------Create remaining squares----------//
        for (int i = 0; i < scale;i++) {
            for (int j = 0; j < scale; j++) {
                if (squares[i][j] == null) {
                    Square tmpS = new Square(i, j);
                    squares[i][j] = tmpS;
                }
            }

        }
    }

    public void checkIfMapIsPlayable() {

    }

    public void print() {

    }


}
