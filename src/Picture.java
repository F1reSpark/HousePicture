public class Picture
{
    private Square wall1;
    private Square wall2;
    private Square window;
    private Triangle roof;
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
        window = new Square();
        roof = new Triangle();
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

            ground.changeColor("black");
            ground.moveHorizontal(-350);
            ground.moveVertical(140);
            ground.changeSize(1200);
            ground.makeVisible();

            wall1.changeColor("offwhite");
            wall1.moveHorizontal(-140);
            wall1.moveVertical(20);
            wall1.changeSize(120);
            wall1.makeVisible();

            wall2.changeColor("offwhite");
            wall2.moveHorizontal(-140);
            wall2.moveVertical(20);
            wall2.changeSize(120);
            wall2.makeVisible();

            window.changeColor("amber");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();

            roof.changeColor("grey");
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();

            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
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
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall1.changeColor("offwhite");
        wall2.changeColor("offwhite");
        window.changeColor("black");
        roof.changeColor("green");
        sun.changeColor("yellow");
    }
}
