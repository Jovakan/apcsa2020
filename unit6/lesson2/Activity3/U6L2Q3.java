public class U6_L2_Activity_Three{

    public static boolean hasDuplicates(int[] arr1){
      boolean doppler = false;
      
      for(int i=0; i<arr1.length; i++){
        
        for(int j=0; j<arr1.length; j++){
          
          if(arr1[i]==arr1[j] && i != j){
            
            doppler = true;
          }
        }
      }
      return doppler;
    }
  
  }
