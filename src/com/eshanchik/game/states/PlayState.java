package com.eshanchik.game.states;

import com.eshanchik.game.util.KeyHandler;
import com.eshanchik.game.util.MouseHandler;

import java.awt.*;

public class PlayState extends GameState{

    public PlayState(GameStateManager gam) {
        super(gam);
    }

    public void update() {

    }

    public void input(MouseHandler mouse, KeyHandler key) {
        if (key.up.down) {
            System.out.println("W");
        }
    }

    public void render(Graphics2D g) {
        g.setColor(Color.BLACK);
        g.fillRect(100, 100, 64, 64);
    }

}
