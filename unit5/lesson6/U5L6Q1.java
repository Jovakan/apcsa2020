public class Vehicle {
  
  private int location;
  
  public Vehicle() {
    location = 0; }
  
  public Vehicle(int loc) {
    if((loc >= - 20) && (loc <= 20))
      location = loc;
    else
      location = 0; }

  public void forward() {
    if(location < 20)
    location++; }

  public void backward() {
  if(location > -20)
    location--; }
  
  public int getLocation() {
    return location; }

  public String toString() {
    String o = "";
    for(int i = -20; i < location; i++) {
      o += " ";
    }
    o += "@";
    return o;
  }
  }
