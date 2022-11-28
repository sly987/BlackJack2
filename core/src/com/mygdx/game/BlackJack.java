package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.view.LoadingScreen;
import com.mygdx.game.view.MenuScreen;
import com.mygdx.game.view.PreferenceScreen;
import com.mygdx.game.view.SoloScreen;

public class BlackJack extends Game {



	private LoadingScreen loadingScreen;
	private MenuScreen menuScreen;
	private SoloScreen soloScreen;
	private PreferenceScreen preferenceScreen;
	private AppPreferences preferences;

	public final static int MENU = 0;
	public final static int SOLO = 1;
	public final static int PREFERENCE = 2;

	@Override
	public void create() {
		loadingScreen = new LoadingScreen(this);
		preferences = new AppPreferences();
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

			case PREFERENCE:
				if(preferenceScreen == null){
					preferenceScreen = new PreferenceScreen(this);
				}
				this.setScreen(preferenceScreen);
				break;
		}
	}
	public AppPreferences getPreferences(){
		return this.preferences;
	}


}
