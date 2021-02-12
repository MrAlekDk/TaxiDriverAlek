package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controls implements KeyListener {

    private String direction;



    public Controls(){
        direction = "null";
    }


    public int[] getDirection(){

        while(true)
            switch(direction){
                case "UP":
                    return new int[]{0,-1};
                case "DOWN:":
                    return new int[]{0,1};
                case "LEFT":
                    return new int[]{-1,0};
                case "RIGHT":
                    return new int[]{1,0};
                default:
                    System.out.println("No current direction");
                    return new int[]{25,0};
            }
    }


    @Override
    public void keyTyped(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_UP:
                System.out.println("UP");
                direction="UP";
                break;
            case KeyEvent.VK_LEFT:
                direction="LEFT";
                break;
            case KeyEvent.VK_RIGHT:
                direction="RIGHT";
                break;
            case KeyEvent.VK_DOWN:
                direction="DOWN";
                break;
            case KeyEvent.VK_SPACE:
                break;
            default:
                System.out.println(e.getKeyChar() + " is not a valid key");
                direction="null";
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
