public class RightTriangle {
  
  private double base;
  private double height;
  private double area;
  private double hypotenuse;
  private double perimeter;
  
  public RightTriangle() {
    base = 1;
    height = 1;
  }
  
  public RightTriangle(double bs, double ht) {
  if(bs > 0) {
    base = bs; }
  else {
    base = 1; }
    
  if (ht > 0) {
    height = ht; }
  else {
    height = 1; }
}
  public boolean equals(RightTriangle other){
  if(base == other.getBase() && height == other.getHeight()) 
    return true;
    else
    return false; 
  }
  
  public double getArea() {
    area = (base * height) / 2;
    return area;
  }
  
  public double getBase() {
    return base;
  }

  public double getHeight() {
    return height;
  }
  
  public double getHypotenuse() {
  hypotenuse = (base * base) + (height * height);
  hypotenuse = Math.sqrt(hypotenuse);
  return hypotenuse;
  }  
 
  public double getPerimeter() {
  hypotenuse = (base * base) + (height * height);
  hypotenuse = Math.sqrt(hypotenuse);
  perimeter = hypotenuse + base + height;
  return perimeter;
  }  
 
  public void setBase(double bs) {
  if(bs > 0)
    base = bs; 
  }
  
  public void setHeight(double ht) {
  if(ht > 0)
    height = ht; 
  }

  public java.lang.String toString() {
  hypotenuse = (base * base) + (height * height);
  hypotenuse = Math.sqrt(hypotenuse);
  return "right triangle with base " + base + ", height " + height + ", hypotenuse " + hypotenuse; }
}
