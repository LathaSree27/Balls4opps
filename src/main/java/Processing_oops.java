import processing.core.PApplet;
public class Processing_oops extends PApplet{
    public static void main(String[] args) {
        PApplet.main("Processing_oops", args);
    }
    Window window = new Window();
    Circle circle = new Circle();
    @Override
    public void settings() {
        super.settings();
        size(window.getWidth(),window.getHeight());
    }

    @Override
    public void draw() {
        ellipse(circle.circle1(), window.getHeight()*1/5,circle.getDiameter(),circle.getDiameter());
        ellipse(circle.circle2(), window.getHeight()*2/5,circle.getDiameter(),circle.getDiameter());
        ellipse(circle.circle3(), window.getHeight()*3/5,circle.getDiameter(),circle.getDiameter());
        ellipse(circle.circle4(), window.getHeight()*4/5,circle.getDiameter(),circle.getDiameter());

    }
}
