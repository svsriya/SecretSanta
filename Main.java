//import java.util.ArrayList<>;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class Main{
	
	public static final String ACCOUNT_SID = "AC83c60cbe3a56d9219d3d9fa88b15573c";
	public static final String AUTH_TOKEN = "63e737b151d9e1a42b3472f22ed4e526";
	
	public static void main(String[] args){
		//Your new Phone Number is +19735002775
		Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
		
		Message message = Message.creator(new PhoneNumber("+19735002775"),
			new PhoneNumber("+18624859969"),
			"Hello World").create();

		System.out.println(message.getSid());
		





		//make an array list of Person objects

		//wait for everyone to sign up (while loop probbaly)

		//make a second copy of the arraylist

		//and do everything else on the post it notes

		//

		//
	}
}