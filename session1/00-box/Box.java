
public class Box {
	/* Attributes of the box */
	private int length;
	private int width;
	private int height;

	/* Constructor */
	public Box(int length, int width, int height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	/* Methods */
	public int getVolume() {
		int volume = length * width * height;
		return volume;
	}

	public void grow() {
		length = length + 1;
		width = width + 1;
		height = height + 1;
	}

	public void shrink() {
		length = length - 1;
		width = width - 1;
		height = height - 1;
	}
}
