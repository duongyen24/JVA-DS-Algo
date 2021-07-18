import java.util.List;
import java.util.ArrayList;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4};
//		List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(3);
//        list.add(4);
//        list.add(5);
		reserveData(data);
		
		
	}
	
	public static void reserveData (int[] validData) {
		for(int i=validData.length-1; i>=0; i--){
			  System.out.println(validData[i]);
			 }
	}
		
		/*	 
	  public static List<Integer> reverseArray(List<Integer> a) {
    
        List<Integer> reversedA = new ArrayList<Integer>();
        for(int i = a.size()-1;i>=0;i--){
            reversedA.add(a.get(i));
        }
        return reversedA;
    }
    
     */
	

}
