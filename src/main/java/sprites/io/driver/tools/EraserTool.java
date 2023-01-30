package sprites.io.driver.tools;

import sprites.io.UI.canvaspanel.Canvas;

import java.awt.*;

public class EraserTool extends Tool {
    public void draw(Canvas canvas, Color color, boolean isMousePressed, int mousePressLocation, int mouseCurrentLocation) {
        if (isMousePressed) {
            canvas.getPixel(mouseCurrentLocation).setBackground(Color.WHITE);
        }
    }
}
