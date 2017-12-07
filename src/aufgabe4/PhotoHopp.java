package aufgabe4;

import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import javax.swing.*;

public class PhotoHopp {
   
   
    public static void main(String[] args) throws IOException {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image srcImage1 = toolkit.getImage("river.gif");
        Image srcImage2 = toolkit.getImage("fki_start.jpg");
        Image srcImage3 = toolkit.getImage("farbenkreis_b.gif");


        ImageFilter colorfilter = new TestFilter();
        Image filteredImage1 = toolkit.createImage(
            new FilteredImageSource(srcImage1.getSource(),colorfilter));
        Image filteredImage2 = toolkit.createImage(
            new FilteredImageSource(srcImage2.getSource(),colorfilter));
        Image filteredImage3 = toolkit.createImage(
                new FilteredImageSource(srcImage3.getSource(),colorfilter));
        
        JFrame frame = new JFrame("Images and pixelwise filtering");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.RED);  
        Panel allImagesPanel = new Panel();
        allImagesPanel.setLayout(new GridLayout(0,3));
        allImagesPanel.add(new ImagePanel(srcImage1));
        allImagesPanel.add(new ImagePanel(srcImage2));
        allImagesPanel.add(new ImagePanel(srcImage3));
        allImagesPanel.add(new ImagePanel(filteredImage1));
        allImagesPanel.add(new ImagePanel(filteredImage2));
        allImagesPanel.add(new ImagePanel(filteredImage3));
        frame.getContentPane().add(allImagesPanel);
        frame.setBounds(50,50,1000,500);
        frame.setVisible(true);          
     }
}

class ImagePanel extends JPanel  {
    private Image image;

    public ImagePanel(Image image)  {
        this.image = image;
    }
    
    public void paintComponent(Graphics g) {   
        super.paintComponent(g);
//        System.out.println("paintComponent" + this + image.getWidth(this) + " " + image.getHeight(this));
        g.drawImage(image, 10, 10,image.getWidth(this) , image.getHeight(this), this); 
    }
}
    
    

class TestFilter extends RGBImageFilter {
  
    public int filterRGB(int x, int y, int pixel) { //Pixel ist der gegebene Pixelwert!
       
       int aufgabe=3;
       
       int filteredPixel= (pixel & 0xFF000000);
       
       switch(aufgabe) {
          case 1: {             
             filteredPixel = (pixel & 0xFF0F0F00); 
             break;
          }
          case 21: {             
             filteredPixel = (pixel & 0xFFFF0000);
             break;
          }
          case 22: {
             filteredPixel = (pixel & 0xFF00FF00);
             break;
          }
          case 23: {
             filteredPixel = (pixel & 0xFF0000FF);
             break;
          }
          case 3: {
             int pixelMaskBlue = 0x000000FF & pixel;           
             int pixelMaskRed = 0x00FF0000 & pixel;
             int pixelMaskMin = 0xFFFF0000 & pixel;
             System.out.println(Integer.toBinaryString(pixelMaskRed));
             pixelMaskRed = pixelMaskRed >>16;
             pixelMaskBlue = pixelMaskBlue << 16;
             System.out.println(Integer.toBinaryString(pixel));
             System.out.println(Integer.toBinaryString(pixelMaskBlue));
             System.out.println(Integer.toBinaryString(pixelMaskRed));
             System.out.println(Integer.toBinaryString(pixelMaskMin));
             
             filteredPixel = ((pixelMaskMin&pixelMaskBlue)&pixelMaskRed)^0xFF000000;
             return filteredPixel;
          }
             
             
             
          
       }
       
       
      
       return filteredPixel;
       
       
       // enjoy working on pixels here    
       // extract one color part as an example 
        
       
    }
}