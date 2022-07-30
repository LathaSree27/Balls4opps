import processing.core.PApplet;
public class Circle extends PApplet{
    public int diameter,speed1,speed2,speed3,speed4;
    public Circle(){
        diameter = 10;
        speed1 = speed2 = speed3 = speed4 = 0;
    }
    public int getDiameter() {
        return diameter;
    }
    public int circle1(){
        return speed1+=1;
    }
    public int circle2(){
        return speed2+=2;
    }
    public int circle3(){
        return speed3+=3;
    }
    public int circle4(){
        return speed4+=4;
    }
}
