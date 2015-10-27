package examples;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import static org.lwjgl.opengl.GL11.*;

public class RenderTeszt {

	public RenderTeszt() {
		//létrehozom az ablakot
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("State Demo");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//inicializálja az OpenGL-t
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 640, 480, 0, 1, -1); //megadjuk a nézetet
		glMatrixMode(GL_MODELVIEW);
		
		//program-loop amíg be nem zárom az ablakot
		while(!Display.isCloseRequested()){
			
			glClear(GL_COLOR_BUFFER_BIT);
			
			glBegin(GL_QUADS);
				glVertex2i(400, 400); //felsõ bal
				glVertex2i(450, 400); //felsõ jobb
				glVertex2i(450, 450); //alsó jobb
				glVertex2i(400, 450); //alsó bal
			glEnd();
				
			
			glBegin(GL_LINES);
				glVertex2i(100, 100);
				glVertex2i(200, 200);
			glEnd();
			
			Display.update();
			Display.sync(60); //60 fps-el frissíti
		}
		
		Display.destroy();
		
	}
	
	public static void main(String[] args) {
		new RenderTeszt();

	}

}
