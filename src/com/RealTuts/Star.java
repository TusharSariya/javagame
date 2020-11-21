package com.RealTuts;

import java.awt.*;

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
        g.fillRect(X,Y,4,4);
    }
}
