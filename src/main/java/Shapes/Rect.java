package Shapes;

import java.awt.*;

public class Rect extends Shape {
    protected int width;
    protected int height;


    public Rect(Point initPos, Color col, int w, int h){
        super(initPos, col);
        width = w;
        height = h;
    }

    public void draw(Graphics g) {
        g.setColor(col);
        g.fillRect(pos.x,pos.y,width,height);
    }
}
