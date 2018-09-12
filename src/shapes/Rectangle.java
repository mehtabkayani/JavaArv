
package shapes;

public class Rectangle {
    
    private double length;
    private double width;
    
    public Rectangle(){
        
    }
    
    public Rectangle (double length, double width)
    {
        this.length = length;
        this.width = width;
    }
    
    public double getLenght(){
    this.length = length;
    return length;
    }
    
    public void setLength(double length){
        this.length = length;
    }
    
    public double getWidth(){
        this.width = width;
    return width;
    }
    
    public void setWidth(double witdh){
        this.width = width;
    }
    public double area(){
        
       double area = length * width;
       return area;
    
    }
    
    public double circumference(){
        
        double circumference = (length * 2) + (width * 2);
        return circumference;
    }
    
    
    
}
