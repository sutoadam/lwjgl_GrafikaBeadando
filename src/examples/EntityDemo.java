package examples;

import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;

import entities.AbstractEntity;
import entities.AbstractMoveableEntity;
import entities.Entity;
import entities.MoveableEntity;

import static org.lwjgl.opengl.GL11.*;

public class EntityDemo {
	
	private static long lastFrame;
	
	private static long getTime(){
		return (Sys.getTime() * 1000 / Sys.getTimerResolution());
	}
	
	private static int getDelta(){
		long currentTime = getTime();
		int delta = (int) (currentTime- lastFrame);
		lastFrame = getTime();
		return delta;
	}
	
	private static class Box extends AbstractMoveableEntity {

		public Box(double x, double y, double width, double height) {
			super(x, y, width, height);
		}

		@Override
		public void draw() {
			glRectd(x, y, x+width, y+height);
		}
	}
	
	private static class Point extends AbstractEntity{

		public Point(double x, double y) {
			super(x, y, 1 ,1);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void draw() {
			glBegin(GL_POINTS);
				glVertex2d(x, y);
			glEnd();
			
		}

		@Override
		public void update(int delta) {
			
			
		}
		
	}

	public EntityDemo() {
		//létrehozom az ablakot
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("Entity Demo");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//entitások inicializálása
		MoveableEntity box = new Box(100, 100, 50, 50);
		Entity point = new Point(10,10);
		
		//inicializálja az OpenGL-t
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 640, 480, 0, 1, -1); //megadjuk a nézetet
		glMatrixMode(GL_MODELVIEW);
		
		lastFrame = getTime();
		
		//program-loop amíg be nem zárom az ablakot
		while(!Display.isCloseRequested()){
			
			point.setLocation(Mouse.getX(), 480-Mouse.getY() - 1);
			
			
			glClear(GL_COLOR_BUFFER_BIT);
			
			int delta = getDelta();
			box.update(delta);
			point.update(delta);
			
			if(box.intersects(point)){
				box.setDX(0.2);
			}
			
			point.draw();
			box.draw();
			
			Display.update();
			Display.sync(60); //60 fps-el frissíti
		}
		
		Display.destroy();
		
	}
	
	public static void main(String[] args) {
		new EntityDemo();

	}

}