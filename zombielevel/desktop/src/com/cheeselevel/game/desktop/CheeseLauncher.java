package com.cheeselevel.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.cheeselevel.game.ZombieGame;

public class CheeseLauncher {
    public static void main (String[] args)
    {
        ZombieGame myProgram = new ZombieGame();
        LwjglApplication launcher = new LwjglApplication(myProgram);
    }
}
