public class Fraction
{
  //nerd variables
  private int numerator;
  private int denominator; 
  private int fracnums;
  private static int calkers=0;
  
  //constructors
  public Fraction(){
    calkers++;
    numerator=1;
    denominator=1;
    fracnums=calkers;
    
  }
  
  public Fraction(int n, int d){
    calkers++;
    
    if(n>0){
      numerator=n;
    } else {
      numerator=1;
    }
    
    if(d>0){
      denominator=d;
    } else {
      denominator=1;
    }
    
    fracnums=calkers;
    
  }
  
  
  
  //Accessors
  public int getNumerator(){
    return numerator;
  }
  
  public int getDenominator(){
    return denominator;
  }
  
  public static int getNumFractions(){
    return calkers;
  }
  
  public String toString(){
    return numerator+"/"+denominator;
  }
  
  public String mixedNumber(){
    
    int modus;
    int forker;
    
      forker=numerator/denominator;
      modus=numerator%denominator;
    
    
    if(forker>0 && modus>0){
      return forker+" "+modus+"/"+denominator; 
      
    } else if(forker==0){
      return ""+modus+"/"+denominator;
    } else if(modus==0){
      return ""+forker; 
    }
    return null;
  }
  
  
  
  
  //Mutators
  public void setNumerator(int n){
    if(n>0){
      numerator=n;
    }
  } 
  
  public void setDenominator(int d){
    if(d>0){
      denominator=d;
    }
  }
  
  public void add(int n, int d){
    
    if(n>0 && d>0){
      numerator = numerator*d+n*denominator;
      denominator= denominator*d; 
    }
  }
  
  public void add(Fraction other){
    int upper=other.getNumerator();
    int downer=other.getDenominator();
    
    if(upper>0 && downer>0){
      numerator = numerator*downer+upper*denominator;
      denominator = denominator*downer;  
    }
    
  }
  
  
  public void multiply(int n, int d){
    if(n>0 && d>0){
      numerator=numerator*n;
      denominator=denominator*d;
    }
    
  }
  
  public void multiply(Fraction other){
    if(other.getNumerator()>0 && other.getDenominator()>0){
      numerator=numerator*other.getNumerator();
      denominator=denominator*other.getDenominator();
    }
    
  }
  
}