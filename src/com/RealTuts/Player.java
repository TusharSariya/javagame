package com.RealTuts;

import java.awt.*;

public class Player extends GameObject{

    Player(int X, int Y){
        super(X,Y,ID.Player);
    }
    @Override
    public void tick() {
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(X,Y,32,32);
    }
}
