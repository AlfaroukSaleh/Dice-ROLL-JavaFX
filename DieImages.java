
package javafxapplication6;

import javafx.scene.image.Image;


public class DieImages
{
    final Image die1 = new Image("http://clipartmag.com/images/picture-of-dice-1.gif",100,100,false,false);
    final Image die2 = new Image("http://clipartmag.com/images/picture-of-dice-16.gif",100,100,false,false);
    final Image die3 = new Image("http://clipartmag.com/images/picture-of-dice-17.gif",100,100,false,false);
    final Image die4 = new Image("http://clipartmag.com/images/picture-of-dice-18.gif",100,100,false,false);
    final Image die5 = new Image("http://clipartmag.com/images/picture-of-dice-13.gif",100,100,false,false);
    final Image die6 = new Image("http://clipartmag.com/images/dice-1-6-18.gif",100,100,false,false);

    final Image[] images = new Image[6];

    public DieImages()
    {
        images[0] = die1;
        images[1] = die2;
        images[2] = die3;
        images[3] = die4;
        images[4] = die5;
        images[5] = die6;
    }

    public Image[] getImages()
    {
        return images;
    }
}