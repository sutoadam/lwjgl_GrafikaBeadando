package examples;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

public class TimerDemo {

	private long lastFrame;
	
	private long getTime(){
		return (Sys.getTime() * 1000 / Sys.getTimerResolution());
	}
	
	private int getDelta(){
		long currentTime = getTime();
		int delta = (int) (currentTime- lastFrame);
		lastFrame = getTime();
		return delta;
	}
	
	public TimerDemo() {
		//létrehozom az ablakot
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("State Demo");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int x = 100;
		int y = 100;
		int dx = 1;
		int dy = 1;
		
		//inicializálja az OpenGL-t
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 640, 480, 0, 1, -1); //megadjuk a nézetet
		glMatrixMode(GL_MODELVIEW);
		
		
		lastFrame = getTime();
		
		//program-loop amíg be nem zárom az ablakot
		while(!Display.isCloseRequested()){
			
			glClear(GL_COLOR_BUFFER_BIT);
			
			int delta = getDelta();
			x += delta*dx *0.1;
			y += delta*dy *0.1;
			
			glRecti(x,y,x+30,y+30);
			
			Display.update();
			Display.sync(60); //60 fps-el frissíti
		}
		
		Display.destroy();
		
	}
	
	public static void main(String[] args) {
		new TimerDemo();

	}

}
