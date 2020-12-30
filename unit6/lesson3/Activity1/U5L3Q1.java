public class U6_L3_Activity_One{

    public static String findLongest(String[] words)
    {
      String markerStrin = "";
      int marker = 0;
      
      for(int i=0; i<words.length; i++){
        if(words[i].length() > marker){
          marker = words[i].length();
          markerStrin = words[i];
        }
      }
      
      
      return markerStrin;
    }
  
  }
