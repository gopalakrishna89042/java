package in.nit.workshop;

public class brandna {
	public static void main(String args[]) {
		//declare array 
		String brandna[] = {"puma","sparx"};
	System.out.println("brandna:"+brandna.length);
	
	//display array elements
	System.out.println("displaying array elements");
	System.out.println(brandna[0]);
	System.out.println(brandna[1]);
	
	//declare array
	String brandna1 [] = {"puma","sparx"};
	for(int index = 0; index < brandna1.length; index++) {
		System.out.println(brandna1[index]);
			
	}
	
	System.out.println("reverse array elements");
	for(int index = brandna1 .length-1; index>=0;index--) {
		System.out.println(brandna1[index]);
		
		}
	
	}

}
