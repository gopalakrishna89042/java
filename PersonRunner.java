package in.nit.workshop;
	
public class PersonRunner {

	public static void main(String[] args) {
	
		System.out.println("main method is started");
		
		// assign the value
		Person.country ="india";
		
		Person.state ="karnataka";
		System.out.println("country is:"+Person.country);
        System.out.println("state is :"+Person.state);
        
        
        //create object
        
        
        Person person = new Person();
        person.personName = "gopal";
        System.out.println("person name is:"+person .personName);
        person.addarnumber = "765786077554";
        System.out.println("addar number is:"+person .addarnumber);
        
      //invoke the method 
        
        Person.displayInfo();
        person.getInformation();
	}

}