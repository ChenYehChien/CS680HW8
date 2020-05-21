package edu.umb.cs680.hw06;

//singleton
public class DrawerOpen implements State {
	private DrawerOpen() {}
	private static DrawerOpen instance = null;
	private static DVDPlayer player = DVDPlayer.getInstance();
	
	public static DrawerOpen getInstance() {
		if (instance == null)
			instance = new DrawerOpen();
		return instance;
	}
	
	public void openCloseButtonPushed() {
		player.close();
		player.changeState(DrawerClosedNotPlaying.getInstance());
	}
	
	public void playButtonPushed() {
		player.close();
		player.play();
		player.changeState(DrawerClosedPlaying.getInstance());
	}
	public void stopButtonPushed() {
		//does nothing
	}

	
}