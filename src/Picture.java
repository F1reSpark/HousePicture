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
    private Square door1;
    private Square door2;
    private Circle doorknob;
    private Triangle roof1;
    private Triangle roof2;
    private Circle sun;
    private Square sky;
    private Square step;
    private Square ground1;
    private Square ground2;
    private Person mefr;
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
        door1 = new Square();
        door2 = new Square();
        doorknob = new Circle();
        roof1 = new Triangle();
        roof2 = new Triangle();
        sun = new Circle();
        sky = new Square();
        step = new Square();
        ground1 = new Square();
        ground2 = new Square();
        mefr = new Person();


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

            ground1.changeColor("green");
            ground1.moveHorizontal(-340);
            ground1.moveVertical(135);
            ground1.changeSize(1200);
            ground1.makeVisible();

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

            step.changeColor("grey");
            step.moveHorizontal(-84);
            step.moveVertical(130);
            step.changeSize(76);
            step.makeVisible();

            mefr.changeColor("black");
            mefr.moveHorizontal(40);
            mefr.moveVertical(27);
            mefr.changeSize(76,50);
            mefr.makeVisible();

            ground2.changeColor("green");
            ground2.moveHorizontal(-340);
            ground2.moveVertical(150);
            ground2.changeSize(1200);
            ground2.makeVisible();

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
            windowin1.moveHorizontal(-272);
            windowin1.moveVertical(48);
            windowin1.changeSize(15);
            windowin1.makeVisible();

            windowin2.changeColor("amber");
            windowin2.moveHorizontal(-253);
            windowin2.moveVertical(48);
            windowin2.changeSize(15);
            windowin2.makeVisible();

            windowin3.changeColor("amber");
            windowin3.moveHorizontal(-272);
            windowin3.moveVertical(67);
            windowin3.changeSize(15);
            windowin3.makeVisible();

            windowin4.changeColor("amber");
            windowin4.moveHorizontal(-253);
            windowin4.moveVertical(67);
            windowin4.changeSize(15);
            windowin4.makeVisible();

            windowin5.changeColor("amber");
            windowin5.moveHorizontal(-197);
            windowin5.moveVertical(67);
            windowin5.changeSize(15);
            windowin5.makeVisible();

            windowin6.changeColor("amber");
            windowin6.moveHorizontal(-178);
            windowin6.moveVertical(67);
            windowin6.changeSize(15);
            windowin6.makeVisible();

            windowin7.changeColor("amber");
            windowin7.moveHorizontal(-197);
            windowin7.moveVertical(48);
            windowin7.changeSize(15);
            windowin7.makeVisible();

            windowin8.changeColor("amber");
            windowin8.moveHorizontal(-178);
            windowin8.moveVertical(48);
            windowin8.changeSize(15);
            windowin8.makeVisible();

            door1.changeColor("wood1");
            door1.moveHorizontal(-70);
            door1.moveVertical(45);
            door1.changeSize(50);
            door1.makeVisible();

            door2.changeColor("wood1");
            door2.moveHorizontal(-70);
            door2.moveVertical(80);
            door2.changeSize(50);
            door2.makeVisible();

            doorknob.changeColor("grey");
            doorknob.moveHorizontal(42);
            doorknob.moveVertical(111);
            doorknob.changeSize(10);
            doorknob.makeVisible();

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
