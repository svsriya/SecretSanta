public class Person
{	
	private String name;
	private String phoneNumber; //tell user not to input spaces or parenthesis
	private boolean hasSanta;
	private Person reciever;		//reciever of the gift
	
	public static int numPeople = 0;	//keeps track of the number of secret santa participants
	
	//***************
	//we should check if we get the same number
	//so maybe a global arraylist of numbers and 
	//check each time a number is added that it is not 
	//in that global arraylist already
	public Person()
	{
		//does nothing
		name = "";
		phoneNumber = "";
		hasSanta = false;
	}
	
	public Person(String n, String phoneID)
	{
		this.name = n;
		this.phoneNumber = phoneID;
		this.hasSanta = false;
		numPeople++;				//incremented each time a person is entered
	}
	
	public String getName()
	{
		return name;
	}	
	
	public String getPhoneID()
	{
		return phoneNumber;
	}

	public boolean hasSanta()
	{
		return hasSanta;
	}

	public void changeStatus()
	{
		hasSanta = true;
	}
	
	public void setReciever( Person r )
	{
		reciever = r;
	}
	
	public Person getReciever()
	{
		return reciever;
	}
	
	public String toString()
	{
		return "Name: " + name + "\nPhone Number: " + phoneNumber;
	}
	/*
	public boolean equals( Object o )
	{
		if( o instanceof Person )
		{
			Person test = (Person)o;
			if( ( this.getPhoneID() ).equals( test.getPhoneID() ) && )
				
				
		}
	}
	*/
}