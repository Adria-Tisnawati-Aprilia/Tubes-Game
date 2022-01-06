package com.cheeselevel.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.cheeselevel.game.CheeseGame;

public class CheeseLauncher {
    public static void main (String[] args)
    {
        CheeseGame myProgram = new CheeseGame();
        LwjglApplication launcher = new LwjglApplication(myProgram);
    }
}
