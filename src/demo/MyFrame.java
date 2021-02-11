package demo;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    private int frameSize;


    public MyFrame(int i){
        this.frameSize = i;

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(frameSize,frameSize);
        this.setLocation(500,25);
        this.setVisible(false);
        this.setBackground(Color.black);

    }

    public void addSquare(JLabel j){
        this.add(j);
    }

    public void addPlayer(JLayeredPane p){
        this.add(p);
    }

    public int getFrameSize(){
        return this.frameSize;
    }

    public void showBoard(){
        this.setVisible(true);
    }

}
