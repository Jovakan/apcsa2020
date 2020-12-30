public class U6_L2_Activity_Two{

    public static int numEven(int[] arr1){
      int check = 0;
      
      for(int i = 0; i<arr1.length; i++){
        if(arr1[i]%2==0){
          check++;
        }
      }
      return check;
      
    }
  
  }
