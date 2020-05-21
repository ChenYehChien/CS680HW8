package edu.umb.cs680.hw06;

//singleton
public class DrawerClosedNotPlaying implements State{
	private DrawerClosedNotPlaying() {}
	private static DrawerClosedNotPlaying instance = null;
	
	public static DrawerClosedNotPlaying getInstance() {
		if (instance == null)
			instance = new DrawerClosedNotPlaying();
		return instance;
	}
	
	private static DVDPlayer player = DVDPlayer.getInstance();
	
	public void openCloseButtonPushed() {
		player.open();
		player.changeState(DrawerOpen.getInstance());
	}
	public void playButtonPushed() {
		if (!player.isDVDExist())
			System.out.println("DVD not found");
		else {
			player.play();
			player.changeState(DrawerClosedPlaying.getInstance());
		}
	}
	public void stopButtonPushed() {
		//does nothing
	}
}