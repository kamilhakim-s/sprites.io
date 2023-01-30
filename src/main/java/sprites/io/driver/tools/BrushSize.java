package sprites.io.driver.tools;

import java.awt.*;
import sprites.io.UI.canvaspanel.Canvas;

public class BrushSize extends Tool {

    public void draw(Canvas canvas, Color color, boolean isMousePressed, int mousePressLocation, int mouseCurrentLocation){
        if(isMousePressed){
            // color the pixel
            canvas.pixel[mousePressLocation].setBackground(color);
            
            // color the pixels in the 8 directions around it
            if(mousePressLocation + 51 < 2500 && mousePressLocation % 50 != 49){
                canvas.pixel[mousePressLocation + 51].setBackground(color);
            }
            if(mousePressLocation - 51 >= 0 && mousePressLocation % 50 != 0){
                canvas.pixel[mousePressLocation - 51].setBackground(color);
            }
            if(mousePressLocation + 49 < 2500 && mousePressLocation % 50 != 0){
                canvas.pixel[mousePressLocation + 49].setBackground(color);
            }
            if(mousePressLocation - 49 >= 0 && mousePressLocation % 50 != 49){
                canvas.pixel[mousePressLocation - 49].setBackground(color);
            }
            if(mousePressLocation + 50 < 2500){
                canvas.pixel[mousePressLocation + 50].setBackground(color);
            }
            if(mousePressLocation - 50 >= 0){
                canvas.pixel[mousePressLocation - 50].setBackground(color);
            }
            if(mousePressLocation + 1 < 2500 && mousePressLocation % 50 != 49){
                canvas.pixel[mousePressLocation + 1].setBackground(color);
            }
            if(mousePressLocation - 1 >= 0 && mousePressLocation % 50 != 0){
                canvas.pixel[mousePressLocation - 1].setBackground(color);
            }
            
            
            //recursively color the pixels around it
            /* 
            if(mousePressLocation - 1 >= 0 && mousePressLocation % 50 != 0){
                draw(canvas, color, isMousePressed, mousePressLocation - 1, mouseCurrentLocation);
            }*/

        }
    };


    
}
