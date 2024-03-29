package Composite.exemplo;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends BaseShape {
	
	public int width;
    public int height;

	Rectangle(int x, int y, Color color, int width, int height) {
		super(x, y, color);
		this.width = width;
        this.height = height;
	}
	
	@Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
    }

}
