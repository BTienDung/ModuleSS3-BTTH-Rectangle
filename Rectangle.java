package season_3.Rectangle;

public class Rectangle {
    double width;
    double height;

    public Rectangle(){};
    public Rectangle(double w, double h){
        width = w;
        height = h;
    }

    public double getArea(){
        return width*height;
    }

    public double getPerimeter(){
        return (width+height)*2;
    }
    public void display(){
        System.out.printf("Area is: "+getArea());
        System.out.printf("\n cddxPerimeter is: "+getPerimeter());
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(1,2);
        rec.getArea();
        rec.getPerimeter();
        rec.display();
    }
}