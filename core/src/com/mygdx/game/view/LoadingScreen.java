package com.mygdx.game.view;

import com.badlogic.gdx.Screen;
import com.mygdx.game.BlackJack;

public class LoadingScreen implements Screen {
    private BlackJack parent;

    public LoadingScreen(BlackJack blackJack){

        parent = blackJack;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
    }

    @Override
    public void render(float delta) {
        // TODO Auto-generated method stub
        parent.changeScreen(BlackJack.MENU);
    }

    @Override
    public void resize(int width, int height) {
        // TODO Auto-generated method stub
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
    }

    @Override
    public void resume() {
        // TODO Auto-generated method stub
    }

    @Override
    public void hide() {
        // TODO Auto-generated method stub
    }

    @Override
    public void dispose() {
        // TODO Auto-generated method stub
    }
}
