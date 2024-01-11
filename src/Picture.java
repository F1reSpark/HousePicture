public class Picture
{
    private Square wall1;
    private Square wall2;
    private Square windowback1;
    private Square windowback2;
    private Square windowin1;
    private Square windowin2;
    private Square windowin3;
    private Square windowin4;
    private Square windowin5;
    private Square windowin6;
    private Square windowin7;
    private Square windowin8;

    private Triangle roof1;
    private Triangle roof2;
    private Circle sun;
    private Square sky;

    private Square ground;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall1 = new Square();
        wall2 = new Square();
        windowback1 = new Square();
        windowback2 = new Square();
        windowin1 = new Square();
        windowin2 = new Square();
        windowin3 = new Square();
        windowin4 = new Square();
        windowin5 = new Square();
        windowin6 = new Square();
        windowin7 = new Square();
        windowin8 = new Square();
        roof1 = new Triangle();
        roof2 = new Triangle();
        sun = new Circle();
        sky = new Square();
        ground = new Square();


        drawn = false;
    }

    public static void main(String[] args) {
        Picture picture = new Picture();
        picture.draw();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("blue");
            sky.moveHorizontal(-350);
            sky.moveVertical(-150);
            sky.changeSize(1200);
            sky.makeVisible();

            wall1.changeColor("offwhite");
            wall1.moveHorizontal(-290);
            wall1.moveVertical(20);
            wall1.changeSize(300);
            wall1.makeVisible();

            wall2.changeColor("offwhite");
            wall2.moveHorizontal(-170);
            wall2.moveVertical(-25);
            wall2.changeSize(180);
            wall2.makeVisible();

            ground.changeColor("grey");
            ground.moveHorizontal(-340);
            ground.moveVertical(140);
            ground.changeSize(1200);
            ground.makeVisible();

            windowback1.changeColor("black");
            windowback1.moveHorizontal(-275);
            windowback1.moveVertical(45);
            windowback1.changeSize(40);
            windowback1.makeVisible();

            windowback2.changeColor("black");
            windowback2.moveHorizontal(-200);
            windowback2.moveVertical(45);
            windowback2.changeSize(40);
            windowback2.makeVisible();

            windowin1.changeColor("amber");
            windowin1.moveHorizontal(-270);
            windowin1.moveVertical(45);
            windowin1.changeSize(10);
            windowin1.makeVisible();

            windowin2.changeColor("amber");
            windowin2.moveHorizontal(-275);
            windowin2.moveVertical(45);
            windowin2.changeSize(10);
            windowin2.makeVisible();

            windowin3.changeColor("amber");
            windowin3.moveHorizontal(-275);
            windowin3.moveVertical(45);
            windowin3.changeSize(10);
            windowin3.makeVisible();

            roof1.changeColor("wood1");
            roof1.changeSize(80, 250);
            roof1.moveHorizontal(20);
            roof1.moveVertical(-105);
            roof1.makeVisible();

            roof2.changeColor("wood2");
            roof2.changeSize(70, 200);
            roof2.moveHorizontal(-115);
            roof2.moveVertical(-70);
            roof2.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(150);
            sun.moveVertical(-70);
            sun.changeSize(80);
            sun.makeVisible();
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall1.changeColor("white");
        wall2.changeColor("white");
        windowback1.changeColor("white");
        roof1.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall1.changeColor("offwhite");
        wall2.changeColor("offwhite");
        windowback1.changeColor("black");
        roof1.changeColor("green");
        sun.changeColor("yellow");
    }
}
