package ru.geekbrains.homework1;

import java.awt.*;

public class Background {
    Background(GameCanvas canvas) {
        canvas.setBackground(color());
    }
    private static int
    colorN1 = 0,
    colorN2 = 0,
    colorN3 = 0,
    backColor = 0;

    private static int[] caseColor()
    {
        int[] numOfColors = new int[3];
        switch (backColor)
        {
            case 0:
                backColor++;
                numOfColors[0] = 0;
                numOfColors[1] = 255;
                numOfColors[2] = 0;
                break;
            case 1:
                backColor++;
                numOfColors[0] = 0;
                numOfColors[1] = 255;
                numOfColors[2] = 255;
                break;
            case 2:
                backColor++;
                numOfColors[0] = 255;
                numOfColors[1] = 0;
                numOfColors[2] = 255;
                break;
                
        }
        return numOfColors;
    }

    private static Color color()
    {
        if (backColor == 4 && colorN1 < 255)
        {
            colorN1++;
            colorN2++;
            colorN3++;
        } else if ((colorN2 == 0 || backColor == 1) && colorN1 < 255)
        {
            colorN1++;
        } else if (colorN3 == 0 && colorN2 < 255)
        {
            colorN2++;
        } else if (colorN3 < 255)
        {
            colorN3++;
        } else {
            int[] forColor = caseColor();
            colorN1 = forColor[0];
            colorN2 = forColor[1];
            colorN3 = forColor[2];

        }
        return new Color(colorN1, colorN2, colorN3);
    }
}
