package com.CSC1302;
import java.awt.*;
//Name: Talha Ansari
//this program creates a class of objects called NBAcourtPanel, and is a subclass of Canvas
//it creates a representation of a basketball court using the Graphics class, and prints out the names of every team member
public class NBAcourtPanel extends Canvas {
    private NBATeam team;
    private int height = 300;
    private int width = 500;
    public NBAcourtPanel(NBATeam team) { this.team = team; }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.YELLOW);
        g.fillRect(0,0, width, height);
        g.setColor(Color.red);
        g.fillOval(width/2 - height/4, height/4, height/2, height/2);
        g.setColor(Color.white);
        g.drawOval(-width/4, height/8, width/2, height/4 * 3);
        g.drawOval(width - width/4, height/8, width/2, height/4 * 3);
        g.drawLine(width/2, 0, width/2, height);
        int h = 25;
        for (String s : team.team.keySet()) {
            g.drawString(s, width - 25, h);
            h+=10;
        }
    }
    public void repaint(Graphics g) {
        super.paint(g);
        Font stringFont = new Font( "SansSerif", Font.PLAIN, 20 );
        g.setFont(stringFont);
        g.setColor(Color.YELLOW);
        g.fillRect(0,0, width, height);
        g.setColor(Color.red);
        g.fillOval(width/2 - height/4, height/4, height/2, height/2);
        g.setColor(Color.white);
        g.drawOval(-width/4, height/8, width/2, height/4 * 3);
        g.drawOval(width - width/4, height/8, width/2, height/4 * 3);
        g.drawLine(width/2, 0, width/2, height);
        int h = 25;
        for (String s : team.team.keySet()) {
            //for some reason i can't seem to change text color
            g.setColor(Color.black);
            g.drawString(s, width - 80, h);
            h+=30;
        }
    }
}
