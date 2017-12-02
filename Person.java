public class Person{
	
	private String name;
	private int phoneNumber;
	private boolean availability = true;

	
	//***************
	//we should check if we get the same number
	//so maybe a global arraylist of numbers and 
	//check each time a number is added that it is not 
	//in that global arraylist already
	public Person(String n, int phone){
		this.name = n;
		this.phoneNumber = phone;
	}
	/*should not need this at all. we need to store the number
	public Person(String n){
		this.name=n;
		this.phoneNumber = -1;
	}
	*/
	public String getName(){
		return name;
	}

	public int getPhoneNumber(){
		return phoneNumber;
	}

	public boolean isAvailable(){
		return availability;
	}

	public void changeAvailability(){
		availability = !availability;
	}



}