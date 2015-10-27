package examples;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import static org.lwjgl.opengl.GL11.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TextureDemo {

	private Texture wood;
	
	public TextureDemo() {
		//létrehozom az ablakot
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("Hello LWJGL!");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		wood = loadTexture("wood");
		
		//inicializálja az OpenGL-t
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 640, 480, 0, 1, -1); //megadjuk a nézetet
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
		
		//program-loop amíg be nem zárom az ablakot
		while(!Display.isCloseRequested()){
			
			glClear(GL_COLOR_BUFFER_BIT);
			
			wood.bind();
			
			glBegin(GL_QUADS);
				glTexCoord2f(0, 0);
				glVertex2i(400, 400); //felsõ bal
				glTexCoord2f(1, 0);
				glVertex2i(450, 400); //felsõ jobb
				glTexCoord2f(1, 1);
				glVertex2i(450, 450); //alsó jobb
				glTexCoord2f(0, 1);
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
	
	private Texture loadTexture(String key){
		try {
			return TextureLoader.getTexture("JPG", new FileInputStream(new File("src/res/" + key + ".jpg")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		new TextureDemo();

	}

}
