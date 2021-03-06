import java.util.*;

public class arraylist{
    public static void main(String[] args) {
        ArrayList<String> arrayList= new ArrayList<>();
        arrayList.add("Aravind");
        arrayList.add("William");
        arrayList.add("Tejas");
        arrayList.add("Nebin");
        System.out.println("The elements of the arraylist is - "+arrayList);
        
        Collections.sort(arrayList);
        System.out.println("\nThe ArrayList Sort : "+arrayList); // ArrayList Sort
        Collections.addAll(arrayList,"Vivek","Vikram","Shantanu","Willson","Godwin");
        System.out.println("\nAdding new items in the arraylist is : "+arrayList); // ArrayList AddAll 
        Collections.sort(arrayList, Collections.reverseOrder()); //Arraylist in reverse order
        System.out.println("\nThe reverse order of the arraylist : "+arrayList);
        System.out.println("\nThe maximum element of the arraylist : "+Collections.max(arrayList)); //Max elements in the arraylist
    }
}