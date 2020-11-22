package com.RealTuts;

import java.awt.*;

import static java.lang.Math.*;

public class Star extends GameObject{
    public Star(int X, int Y) {
        super(X, Y, ID.Star);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        //center is 800 to 320
        //dots range from 0 to 6 height and width
        //dot size is calculated by the radius from the center
        double temp = Math.pow(abs(X-400),2);
        double temp2 = Math.pow(abs(Y-320),2);
        double temp3 = sqrt(temp+temp2);
        int size = (int)Math.ceil(temp3/85);
        g.fillRect(X,Y,size,size);
    }
}
