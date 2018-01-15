package com.neo.cs106aclass;

import acm.graphics.GImage;
import acm.graphics.GMath;
import acm.program.GraphicsProgram;

public class GreyImage extends GraphicsProgram{
    public void run() {
        //  get the original image
        GImage image = new GImage("milkmaid.jpg");
        GImage greyImage = createGreyScaleImage(image);

        //  compare both images side by side
        add(image);
        add(greyImage, 600, 0);
    }

    /**
     * creates a grey version of the original
     * iamge
     * @param image the image to convert to grey
     * @return the greyscale version of the original image
     */
    private GImage createGreyScaleImage(GImage image) {
        //  gets copy of the pixel array from the image
        int[][] array = image.getPixelArray();

        int height = array.length;
        int width = array[0].length;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int pixel = array[i][j];
                int r = GImage.getRed(pixel);
                int g = GImage.getGreen(pixel);
                int b = GImage.getBlue(pixel);

                int xx = computeLuminosity(r,g,b);

                array[i][j] = GImage.createRGBPixel(xx, xx, xx);
            }
        }
        return new GImage(array);
    }

    /* Calculate the luminosity of a pixel using NTSC formula */
    private int computeLuminosity(int r, int g, int b) {
        return GMath.round(0.299 * r + 0.597 * g + 0.114 * b);
    }
}
