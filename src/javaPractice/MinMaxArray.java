package javaPractice;

public class MinMaxArray {

    public static int max(int [] array, int length) {
          int max = 0;
         
          for(int i=0; i<length; i++ ) {
             if(array[i]>max) {
                max = array[i];
             }
          }
          return max;
       }
       public static int min(int [] array, int length) {
          int min = array[0];
         
          for(int i=0; i<length; i++ ) {
             if(array[i]<min) {
                min = array[i];
             }
          }
          return min;
       }
       
     public static int sum(int [] array, int length)
       {
          int max= max(array, length);
          int min= min(array, length);
        return min + max;
       }
       
     
    public static int product(int [] array, int length)
     {
          int max= max(array, length);
          int min= min(array, length);
      
         return min * max;
     }
       public static void main(String args[]) {
           int [] array = { 12, 1234, 45, 67, 1 };
            int length= array.length;   
          System.out.println("sum is ::"+sum(array, length));
          System.out.println("product is::"+product(array, length));
       }


}

