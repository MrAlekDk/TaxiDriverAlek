package demo;

import javax.swing.*;
import java.awt.*;

public class GUI {

    private MyFrame frame;
    private JLabel structure;
    private JLabel road;
    private JLabel start;
    private JLabel end;
    private JLabel player;
    private JPanel gamePanel;
    private Square[][] board;

    private int size;
    private int scale;

    public GUI(Square[][] board) {
        this.board = board;
        frame = new MyFrame(1000);
        drawMap(board);
    }

    public void frameUpdate(){

        frame.showBoard();

    }


    public void drawMap(Square[][] board) {
        scale = board.length;
        size = frame.getFrameSize()/scale;

        for (int i = 0; i < scale; i++) {
            for (int j = 0; j < scale; j++) {
                if (board[i][j].squareType == 0) {
                    start = new JLabel();
                    start.setSize(size, size);
                    start.setBackground(Color.green);
                    start.setLocation(board[i][j].xCord * size, board[i][j].yCord * size);
                    start.setOpaque(true);
                    start.setVisible(true);
                    frame.addSquare(start);

                    //---------Player tile---------------//
                    player = new JLabel();
                    player.setBackground(Color.yellow);
                    player.setLocation(board[i][j].xCord * size, board[i][j].yCord * size);
                    player.setOpaque(true);
                    player.setVisible(true);
                    frame.addSquare(player);


                } else if (board[i][j].squareType == 1) {
                    end = new JLabel();
                    end.setSize(size, size);
                    end.setBackground(Color.red);
                    end.setLocation(board[i][j].xCord * size, board[i][j].yCord * size);
                    end.setOpaque(true);
                    end.setVisible(true);
                    frame.addSquare(end);
                } else if (board[i][j].squareType == 2) {
                    road = new JLabel();
                    road.setSize(size, size);
                    road.setBackground(Color.LIGHT_GRAY);
                    road.setLocation(board[i][j].xCord * size, board[i][j].yCord * size);

                    road.setOpaque(true);
                    road.setVisible(true);
                    frame.addSquare(road);
                } else if (board[i][j].squareType == 3) {
                    structure = new JLabel();
                    structure.setSize(size, size);
                    structure.setBackground(Color.DARK_GRAY);
                    structure.setLocation(board[i][j].xCord * size, board[i][j].yCord * size);
                    structure.setOpaque(true);
                    structure.setVisible(true);
                    frame.addSquare(structure);
                }
            }
        }


    }


}
