public class SumOfArray{  
    public static void main(String[] args) {  
      
        int [] arr = new int [] {9,8,7,6,5,4,3};  
        int sum = 0;  
         
        for (int i = 0; i < arr.length; i++) {  
           sum = sum + arr[i];  
        }  
        System.out.println("Sum of all the elements of an array: " + sum);  
    }  
}  