package Week4Day2;

public class ArrayOuty {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Integer[] arr2 = {null};  
        
        try {
     
            //System.out.println(arr[69]); 
            
  
            System.out.println(arr2[0].toString());
            
        } catch (ArrayIndexOutOfBoundsException | NullPointerException arrEx) {
            arrEx.printStackTrace();  
            System.out.println("Exception message: "+ arrEx.getMessage());
        }
    }
}
