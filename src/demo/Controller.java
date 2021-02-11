package demo;

public class Controller {

    private Board gameBoard;
    private Controls playerControl;
    private GUI userInterface;

    public Controller(){
        playerControl = new Controls();
        gameBoard = new Board();
        userInterface = new GUI(gameBoard.getSquares());
    }

    public void run(){

        while(true){
            userInterface.frameUpdate();
        }


    }







}
