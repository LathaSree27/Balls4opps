import processing.core.PApplet;
public class Window extends PApplet{

    public int height,width;

    public Window(){
        height=480;
        width=640;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
}
