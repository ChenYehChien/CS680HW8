package edu.umb.cs680.hw06;

//singleton
public class DVDPlayer {
	private DVDPlayer() {}
	private static DVDPlayer instance = null;
	private static State state; 
	private boolean dvd = false; //new
	
	public static DVDPlayer getInstance() {
		if (instance == null)
			instance = new DVDPlayer();
		state = DrawerClosedNotPlaying.getInstance();
		return instance;
	}
	
	//change state between states
	//take one of the states as input to set the state to change to
	public void changeState(State state) {
		this.state = state;
	}
	
	//three actions from user
	public void openCloseButtonPushed() {
		state.openCloseButtonPushed();
	}
	public void playButtonPushed() {
		state.playButtonPushed();
	}
	public void stopButtonPushed() {
		state.stopButtonPushed();
	}
	
	//four actions from DVDPlayer
	public void open() {
		System.out.println("---Open the drawer---");
	}
	public void close() {
		System.out.println("---Close the drawer---");
	}
	public void play() {
		System.out.println("---Playing DVD---");
	}
	public void stop() {
		System.out.println("---Stop Playing DVD---");
	}
	
	//new
	public void insertDVD() {
		if (state == DrawerOpen.getInstance()) {
			dvd = true;
			System.out.println("---Insert DVD---");
		}
		else
			System.out.println("Drawer is not opened");
		
	}
	public void removeDVD() {
		if (!dvd || state == DrawerOpen.getInstance())
			System.out.println("DVD not found");
		else {
			dvd = false;
			System.out.println("---Remove DVD---");
		}
	}
	public boolean isDVDExist() {
		return dvd;
	}
	
	public static void main(String[] args) {
		DVDPlayer player = DVDPlayer.getInstance();
		player.openCloseButtonPushed();
		player.insertDVD();
		player.openCloseButtonPushed();
		player.playButtonPushed();
		player.stopButtonPushed();
		player.openCloseButtonPushed();
		player.removeDVD();
		player.openCloseButtonPushed();	
		System.out.println("---Cycle complete---");
		
		player.playButtonPushed(); // test playing DVD without DVD
	}
	
	
	
	
}