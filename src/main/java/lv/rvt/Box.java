package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double lenght;

    public Box(double width, double height, double lenght){
        this.width = width;
        this.height = height;
        this.lenght = lenght;
    }

    public Box(double side) {
        this(side, side, side);
    }

    public Box(Box oldBox){
        this(oldBox.width(), oldBox.height(), oldBox.lenght());
    }
    
    public double volume(){
        return this.width * this.height * this.lenght;
    }

    public double faceArea(){
        return this.lenght * this.width;
    }

    public double topArea(){
        return this.lenght * this.height;
    }

    public double sideArea(){
        return  this.width * this.height;
    }

    public double area(){
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;  
    }
    
    public double lenght(){
        return this.lenght;
    }

    public double height(){
        return this.height;
    }

    public double width(){
        return this.width;
    }

    public Box biggerBox(Box oldBox){
        return new Box( 1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.lenght());
    }

    public Box smallerBox(Box oldBox){
        return new Box( 0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.lenght());
    }

    public boolean nests(Box outsideBox){
        return this.width < outsideBox.width() && this.height < outsideBox.height() && this.lenght < outsideBox.lenght();
    }
}
