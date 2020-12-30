public class U6_L2_Activity_One{

    public static boolean allNegative(double[] arr1){
      boolean neg = true;
      
      for(int i=0; i<arr1.length; i++){
        if(arr1[i]>=0){
          neg = false;
        }
        
       
      }
       return neg;
    }
  
  }
