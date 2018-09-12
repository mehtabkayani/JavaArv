
package shapes;

public class Triangle {
    
    private double base;
    private double height;
    private double side1;
    private double side2;
    private double side3;
            
    
    public Triangle(double base, double height){
        this.base = base;
        this.height = height; 
    }
    
    public Triangle(double side1, double side2, double side3){//double base, double height
    //this.base = base;
    //this.height = height;
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    }
    
    public double getBase(){
        return base;
        
    }
    
    public void setbase(double base){
        this.base = base;
    
    }
    
    public double getHeigth(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public double getSide1(){
        return side1;
    }
    
    public void setSide1(double side1){
        this.side1 = side1;
    }
    
    public double getSide2(){
        return side2;
    }
    
    public void setSide2(double side2){
        this.side2 = side2;
    }
    
    public double getSide3(){
        return side3;
    }
    
    public void setSide3(double side3){
        this.side3 = side3;
    }
    
    public double area(){
       double area = (base * height) / 2;
       return area;
       
    }
    
    public double circumference(){
        double circumference = (side1 * side2) + (side2 * side3) + (side3 * side1);
        return circumference;
    }
}
