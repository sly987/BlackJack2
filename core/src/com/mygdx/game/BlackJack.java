package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Game;

public class BlackJack extends Game {



	private LoadingScreen loadingScreen;
	private MenuScreen menuScreen;
	private SoloScreen soloScreen;

	public final static int MENU = 0;
	public final static int SOLO = 1;

	@Override
	public void create() {
		loadingScreen = new LoadingScreen(this);
		setScreen(loadingScreen);

	}

	public void changeScreen(int screen){
		switch(screen){
			case MENU:
				if(menuScreen == null){
					menuScreen = new MenuScreen(this);
				}
				this.setScreen(menuScreen);
				break;

			case SOLO:
				if(soloScreen == null){
					soloScreen = new SoloScreen(this);
				}
				this.setScreen(soloScreen);
				break;
		}
	}


}
