import java.util.Scanner;
public class WiFiDriver {
	
	public static boolean reply() {
		
		//user input var declared 
		String userInput="";
		
		//Scanner object created
		Scanner input = new Scanner(System.in);
		
		//prompting user var declared and initialized 
		String prompt = ("Are you able to connect with the internet? (yes or no)");
		
		//prompt printed
		System.out.println(prompt);
		
		//reply recorded
		userInput=input.nextLine();
		
		//conditional return 
		if(userInput.equalsIgnoreCase("yes")) {
		return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work.");
		
		//String array to hold steps
		String diagSteps [] = {"First step: reboot your computer",
				"Second step: reboot your router",
				"Third step: make sure the cables to your router are plugged in firmly and your router is getting power",
				"Fourth step: move your computer closer to your router",
				"Fifth step: contact your ISP "};
		
		String worked[]= {"Rebooting your computer seemed to work",
				"Rebooting your router seemed to work",
				"Checking the router's cables seemed to work",
				"Moving your computer closer to your router and reconnecting seemed to work",
				"Make sure your ISP is hooked up to your router."};
		
		
		System.out.println(diagSteps[0]);
		boolean reply = reply();
		if(reply==true) {
			System.out.println(worked[0]);
		}
		else {
			System.out.println(diagSteps[1]);
			reply = reply();
			if(reply==true) {
				System.out.println(worked[1]);
			}
			else {
				System.out.println(diagSteps[2]);
				reply = reply();
				if(reply==true) {
					System.out.println(worked[2]);
				}
				else {
					System.out.println(diagSteps[3]);
					reply = reply();
					if(reply==true) {
						System.out.println(worked[3]);
					}
					else {
						System.out.println(diagSteps[4]);
						reply = reply();
						if(reply==true||reply==false) {
							System.out.println(worked[4]);
						}
						
					}
				}
				
			}
			
		}


	}
}
