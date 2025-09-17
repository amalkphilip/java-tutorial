

interface Media{
	void play(); 
	void stop();
	default void pause() {
		System.out.println("paused..");
	}
	static void about() {
		System.out.println("This is a Media Interface.");
	}
}

interface advancedMedia extends Media{
	void nextTrack();
}

class MusicPlayer implements advancedMedia{
	public void play() {
		System.out.println("Music started..");
	}
	public void stop() {
		System.out.println("Music stopped..");
	}
	public void nextTrack() {
		System.out.println("Next track");
	}
	
}

public class Music_Player {
	public static void main(String[] args) {
		MusicPlayer mp = new MusicPlayer();
		mp.play();
		mp.nextTrack();
		mp.pause();
		Media.about();
		mp.stop();
	}
}
