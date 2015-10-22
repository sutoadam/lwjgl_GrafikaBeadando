package displayteszt;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

public class LWJGLHelloWorld {

	public LWJGLHelloWorld() {
		//l�trehozom az ablakot
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("Hello LWJGL!");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//program-loop am�g be nem z�rom az ablakot
		while(!Display.isCloseRequested()){
			Display.update();
			Display.sync(60); //60 fps-el friss�ti
		}
		
		Display.destroy();
		
	}
	
	public static void main(String[] args) {
		new LWJGLHelloWorld();

	}

}
