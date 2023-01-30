package sprites.io.driver.tools;

import sprites.io.UI.canvaspanel.Canvas;

import java.awt.*;

public class Eraser extends Brush {
    
    Color color = Color.WHITE;

    public Eraser() {
        super();
    }

    @Override
    public void draw(Canvas canvas, Color color, boolean isMousePressed, int mousePressLocation, int mouseCurrentLocation, int currentSize) {
        super.draw(canvas, color, isMousePressed, mousePressLocation, mouseCurrentLocation, currentSize);
    }
}
