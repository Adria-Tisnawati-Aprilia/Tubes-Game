package com.cheeselevel.game;

import com.badlogic.gdx.Game;

public class ZombieGame extends Game {

    public void create()
    {
        ZombieMenu cm = new ZombieMenu(this);
        setScreen( cm );
    }
}
