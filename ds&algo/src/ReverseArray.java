
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {1,2,3,4};
		reserveData(data);
		
	}
	
	public static void reserveData (int[] validData) {
		for(int i=validData.length-1; i>=0; i--){
			  System.out.println(validData[i]);
			 }
		
	}

}
