package minecraft;

public enum BlockType {
	STONE("src/res/stone.png"), AIR("src/res/air.png"), GRASS("src/res/grass.png"), DIRT("src/res/dirt.png");
	public final String location;
	private BlockType(String location) {
		this.location = location;
	}
}
