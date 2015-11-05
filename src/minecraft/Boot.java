package minecraft;

import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;


import static org.lwjgl.opengl.GL11.*;

import java.io.File;

public class Boot {
	BlockGrid grid;
	private State state = State.MAIN_MENU;
	private static enum State {
		MAIN_MENU,GAME;
	}
	
	public Boot() {
		//létrehozom az ablakot
		try {
			Display.setDisplayMode(new DisplayMode(640, 480));
			Display.setTitle("Minecraft 2D");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		grid = new BlockGrid();
		grid.setAt(10, 10, BlockType.STONE);
		
		//inicializálja az OpenGL-t
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 640, 480, 0, 1, -1); //megadjuk a nézetet
		glMatrixMode(GL_MODELVIEW);
		glEnable(GL_TEXTURE_2D);
		
		//program-loop amíg be nem zárom az ablakot
		while(!Display.isCloseRequested()){
			glClear(GL_COLOR_BUFFER_BIT);
			
			input();
			if(state == State.GAME){
				grid.draw();
			}
			if (state == State.MAIN_MENU){
				
			}
			Display.update();
			Display.sync(60); //60 fps-el frissíti
		}
		
		Display.destroy();
		
	}
	
	private void input(){
		System.out.println("state: " + state.toString());
		boolean escpressed;
		if(state == State.GAME){
			if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)){
				state = state.MAIN_MENU;
			}
			int mousex = Mouse.getX();
			int mousey = 480 - Mouse.getY() - 1;
			boolean mouseClicked = Mouse.isButtonDown(0);
			if(mouseClicked) {
				int grid_x = Math.round(mousex/World.BLOCK_SIZE);
				int grid_y = Math.round(mousey/World.BLOCK_SIZE);
				grid.setAt(grid_x, grid_y, BlockType.STONE);
			}
			while (Keyboard.next()){
				if (Keyboard.getEventKey() == Keyboard.KEY_S){
					grid.save(new File("save.xml"));
				}
				if(Keyboard.getEventKey() == Keyboard.KEY_L){
					grid.load(new File("save.xml"));
				}
				if(Keyboard.getEventKey() == Keyboard.KEY_ESCAPE && Keyboard.getEventKeyState()){
					//escpressed = true;
					state = state.MAIN_MENU;
				}
			}
		}
		if(state == State.MAIN_MENU){
			if(Keyboard.isKeyDown(Keyboard.KEY_BACK)){
				state = State.GAME;
			}
			
		}

		
		
		
		
		
		/*System.out.println("state: " + state.toString());
		switch(state){
		case GAME:
			if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)){
				state = state.MAIN_MENU;
				break;
			}
			int mousex = Mouse.getX();
			int mousey = 480 - Mouse.getY() - 1;
			boolean mouseClicked = Mouse.isButtonDown(0);
			if(mouseClicked) {
				int grid_x = Math.round(mousex/World.BLOCK_SIZE);
				int grid_y = Math.round(mousey/World.BLOCK_SIZE);
				grid.setAt(grid_x, grid_y, BlockType.STONE);
			}
			while (Keyboard.next()){
				if (Keyboard.getEventKey() == Keyboard.KEY_S){
					grid.save(new File("save.xml"));
				}
				if(Keyboard.getEventKey() == Keyboard.KEY_L){
					grid.load(new File("save.xml"));
				}
			}
			break;
		case MAIN_MENU:
			if(Keyboard.isKeyDown(Keyboard.KEY_ESCAPE)){
				state = State.GAME;
			}
			break;
		}*/
		
	}
	
	public static void main(String[] args) {
		new Boot();

	}

}