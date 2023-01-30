package sprites.io.driver;

import java.awt.Color;
import sprites.io.UI.canvaspanel.Canvas;
import sprites.io.driver.tools.Eraser;
import sprites.io.driver.tools.PenTool;
import sprites.io.driver.tools.Tool;
import sprites.io.driver.tools.Brush;
import sprites.io.driver.tools.FillTool;

/**
 * Manages all the tools to draw on the canvas
 */
public class Driver {

    private Canvas canvas;
    private boolean isMousePressed = false;
    private int mousePressLocation = 0;
    private int mouseCurrentLocation = 0;
    private Tool currTool = new PenTool();
    private Color currColor = new Color(0, 0, 0);
    private int brushSize = 1;

    public Driver(Canvas canvas) {
        this.canvas = canvas;
    }

    /**
     * call the current tool to draw on the canvas
     */
    public void draw() {
        currTool.draw(canvas, currColor, isMousePressed, mousePressLocation, mouseCurrentLocation);
    }

    public void setCurrToolToPen() {this.currTool = new PenTool();}
    public void setCurrToolToEraser() {this.currTool = new Eraser();}
    public void setCurrToolToBrushSize() {this.currTool = new Brush();}
    public void setCurrToolToFillTool() {this.currTool = new FillTool();}

    /**
     * change the current color
     * @param currColor the color to be changed
     */
    public void setCurrColor(Color currColor) {
        this.currColor = currColor;
    }

    public void setMousePressed(boolean mousePressed) {
        isMousePressed = mousePressed;
    }

    public void setMousePressLocation(int mousePressLocation) {
        this.mousePressLocation = mousePressLocation;
    }

    public void setMouseCurrentLocation(int mouseCurrentLocation) {
        this.mouseCurrentLocation = mouseCurrentLocation;
    }

    public void setBrushSize(int brushSize) {
        this.brushSize = brushSize;
    }

    public int getBrushSize() {
        return brushSize;
    }
}
