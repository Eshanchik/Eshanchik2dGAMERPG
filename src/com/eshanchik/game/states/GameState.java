package com.eshanchik.game.states;

import com.eshanchik.game.util.KeyHandler;
import com.eshanchik.game.util.MouseHandler;

import java.awt.*;

public abstract class GameState {

    private GameStateManager gam;

    public GameState(GameStateManager gam) {
        this.gam = gam;

    }

    public abstract void update();
    public abstract void input(MouseHandler mouse, KeyHandler key);
    public abstract void render(Graphics2D g);



}
