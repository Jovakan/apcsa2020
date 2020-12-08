public class Fraction
{
  /* Implement your Fraction class here */
  
  private int numerator;
  private int denominator;
  private static int numFractions;
  
  //creates a 1/1 fraction
  public  Fraction() {
    numerator = 1;
    denominator = 1;
    numFractions++;
  }
  
  //creates a fraction based on user input
  public Fraction(int n, int d) {
      this();
      setNumerator(n);
    
      setDenominator(d);
  }
  
  //gets the current numerator
  public int getNumerator() {
    if(numerator < 0)
    numerator = 1;
    return numerator; 
  }
  
  //gets the current denominator
  public int getDenominator() {
    if(denominator < 0)
    denominator = 1;
    return denominator;
  } 
  
  //returns how many fractions that are created
  public static int getNumFractions() {
    return numFractions;
  }
  
  //prints the fraction as a string, numerator over denominator, 1/1
  public String toString() {
    return numerator + "/" + denominator;
  }
  
  //*****
  public String mixedNumber() {
   //counts the whole number part of the fraction
   if (numerator/denominator<1) {
      return toString();
    }
    else if(numerator%denominator == 0)  {
      return "" + numerator/denominator;
    }
    else {
    return numerator / denominator + " " + numerator % denominator + "/" + denominator;
    }
  }

  //replaces the numerator
  public void setNumerator(int n) {
    if(n > 0)
    numerator = n;
  }
  
  //replaces the denominator
  public void setDenominator(int d) {
    if(d > 0) 
    denominator = d;
  }
  
  //adds a fraction to the create one
  public void add(int n, int d) {
    if(n > 0 && d > 0) {
      numerator = (numerator*d + denominator*n);
      denominator = denominator*d;
    }
  }
  
  //adds a fractioon to another
  public void add(Fraction other) {
   add(other.getNumerator(), other.getDenominator());
  }
  
  //multiplys fraction to another
  public void multiply(int n, int d) {
    if(n > 0 && d > 0) {
    numerator = numerator * n;
    denominator = denominator * d; }
}
  //multiplys fraction to another
  public void multiply(Fraction other) {
    numerator = numerator * other.getNumerator();
    denominator = denominator * other.getDenominator();
  }
}
