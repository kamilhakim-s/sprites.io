package sprites.io.driver.tools;

import sprites.io.UI.canvaspanel.Canvas;

import java.awt.*;

public class Eraser extends Brush {
    

    @Override
    public void draw(Canvas canvas, Color color, boolean isMousePressed, int mousePressLocation, int mouseCurrentLocation, int currentSize) {
        super.draw(canvas, Color.WHITE, isMousePressed, mousePressLocation, mouseCurrentLocation, currentSize);
    }
}
