package com.CSC1302;
import java.awt.*;
//Name: Talha Ansari
//PantherID: 002-587-754
//Due Date: June 29
public class Program2 {
    static DrawingPanel panel = new DrawingPanel(400, 400);
    static Graphics g = panel.getGraphics();
    public static void main(String[] args) {
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 400, 400);
        subfig(0, 0, 100, 5);
        subfigGrid(10, 120, 24, 4, 5);
        subfigGrid(150, 20, 40, 5, 6);
        subfigGrid(130, 275, 36, 3, 3);
    }
    public static void subfig (int x, int y, int size, int number) {
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);
        g.setColor(Color.GREEN);
        g.fillRect(x + 1, y + 1, size - 1, size - 1);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, size, size);
        g.setColor(Color.yellow);
        g.fillOval(x + 1, y + 1, size - 1, size - 1);
        g.setColor(Color.BLACK);
        int ratio = size/number;
        for (int i = number - 1; i > 0; i--)
            g.drawOval(x + (size - (ratio * i))/2, y + (size - (ratio * i))/2, ratio * i, ratio * i);
    }
    public static void subfigGrid (int x, int y, int size, int number, int colRow) {
        int xCoord = x;
        for (int i = 0; i < colRow; i++) {
            for (int j = 0; j < colRow; j++) {
                subfig(xCoord, y, size, number);
                xCoord+=size;
            }
            xCoord = x;
            y+=size;
        }
    }
}
