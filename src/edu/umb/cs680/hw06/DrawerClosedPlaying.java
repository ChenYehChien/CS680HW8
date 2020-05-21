package edu.umb.cs680.hw06;

//singleton
public class DrawerClosedPlaying implements State {
	private DrawerClosedPlaying() {}
	private static DrawerClosedPlaying instance = null;
	private static DVDPlayer player = DVDPlayer.getInstance();
	
	public static DrawerClosedPlaying getInstance() {
		if (instance == null)
			instance = new DrawerClosedPlaying();
		return instance;
	}
	
	public void openCloseButtonPushed() {
		player.stop();
		player.open();
		player.changeState(DrawerOpen.getInstance());
	}
	public void playButtonPushed() {
		//does nothing
	}
	public void stopButtonPushed() {
		player.stop();
		player.changeState(DrawerClosedNotPlaying.getInstance());
	}
	
	
}