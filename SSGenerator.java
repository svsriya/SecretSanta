import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class SSGenerator 
{
	public static void main( String [] args )
	{
		Scanner in = new Scanner( System.in );
		boolean isRunning = true;

		
		ArrayList <Person> humans = new ArrayList<Person> (); 	//saves the people that participate
		ArrayList <String> savedNums = new ArrayList<String> ();	//saves peoples numbers, so it is easier to check for any duplicate numbers while the program is running
		
		String humanName = ""; 
		String phoneID = "";
		
		//add in all the sending message ish
	
		while( isRunning != false )
		{
			//somehow get the person's name and number here
			System.out.print( "Enter name: " );		//DELETE TEST
			humanName = in.nextLine();				//DELETE TEST
			System.out.print( "Enter phone number: " );	//DELETE TEST
			phoneID = in.nextLine();						//DELETE TEST
			
			if( !savedNums.contains( phoneID ) )							//checks to make sure there are no duplicate numbers
			{
				Person newPerson = new Person( humanName, phoneID );		//creates new person object for each person who sends a message
				humans.add(newPerson);
				savedNums.add( newPerson.getPhoneID() );
				System.out.println( humanName + " has been added to the list");	//this is so we know person is added to array list
			}
			else
			{
				System.out.println("This person is already in the system");		//this is for us to know if there is a duplicate
			}
			
			System.out.print( "Enter true or false to keep program running: " ); //do this per person recieved to keep creating people objects
			isRunning = in.nextBoolean();
			in.nextLine();
		}
		
		assignSanta( humans );		//once everyone is entered, this will assign everyone a reciever
		
		 //send each person's reciever to the person through twilio message 
		
		for( int i = 0; i < Person.numPeople; i++ )
		{
			Person human = humans.get(i);
			
			System.out.println( "====Santa====" );
			System.out.println( human );
			System.out.println( "===Reciever===" );
			System.out.println( human.getReciever() );
			System.out.println( "------------------------" );
		}
		
	}
	
	public static void assignSanta( ArrayList<Person> people )
	{
		//System.out.println( "In assignSanta..." );//DEBUG
		
		Random rand = new Random();								//using random class to generate the random ids
		int numPeeps = Person.numPeople;							//gets the number of people entered in the system
		Person reciever = new Person();
		
		for( int i = 0; i < numPeeps; i++ )						//loop goes through and sets a reciever
		{
			//System.out.println( "In for loop..." );//DEBUG
			Person santa = people.get(i);			//gets the current person being assigned a santa
			boolean matchFound = false;	
			int recieverID = -1;
			
			while( matchFound != true )
			{
				//System.out.println( "In whileloop..." );//DEBUG
				recieverID = rand.nextInt( numPeeps );	//generates the place in the arraylist where the reciever is
				//System.out.println(recieverID);  		//DEBUG
				reciever = people.get(recieverID);	//gets the potential reciever
				
				if( reciever.hasSanta() == false && reciever != santa )
					matchFound = true;
			}
			//System.out.println( "out of while loop" );//DEBUG
			santa.setReciever( reciever );
			reciever.changeStatus();
		}
		System.out.println( "\nSantas are all assigned \n" );
	}
}
