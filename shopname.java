package in.nit.workshop;

public class shopname {
	
	public static void main(String args[]) {
		
		//declare array
		String shopname[] = {"coffeshop","teashop","bar","pub"};
		for(int index = 0; index < shopname.length; index++) {
			System.out.println(shopname[index]);
				
		}
		
		System.out.println("reverse array elements");
		for(int index = shopname.length-1; index>=0;index--) {
			System.out.println(shopname[index]);
			
			}
		// local variables
		boolean isGood = true;
		if(isGood == true) {
			System.err.println("is good is:"+isGood);
		}else {
			System.out.println("else condition");
			System.err.println("is good is:"+isGood);
		}
		
		
		
		}
		
	
	
	}