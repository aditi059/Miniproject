// We have developed a Airline Reservation Management system using CRUD operations.
package miniproject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.lang.*;
import java.util.Scanner;

/*switch case options
First register, second login with predefined login,third book a ticket,Then display,search and cancel reservation. 
If everything is done then exit.
*/
class Register {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String emailId;
    private long phoneNo;
	

    public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getRegno() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Flight extends Register{
	int Fno;
	String Source;
	String Destination;
	String date;
	String time;
	int Pno;//No. of Passengers
	String Pname;//Passenger names
	int regno;
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public Flight(int fno,String source,String destination,String date,String time,int pno,String pname,int regno)
	{		
			this.Fno = fno;
			this.Source = source;
			this.Destination = destination;
			this.date = date;
			this.time = time;
			this.Pno = pno;
			this.Pname = pname;
			this.regno = regno;
	}
		public String toString() {
			return Fno+" "+Source+" "+Destination+" "+date+" "+time+" "+Pno+" "+Pname+" "+regno;
		}
	public int getSeatno() {
		return regno;
	}
	public void setSeatno(int seatno) {
		regno = seatno;
	}
	public int getFno() {
		return Fno;
	}
	public void setFno(int fno) {
		Fno = fno;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getPno() {
		return Pno;
	}
	public void setPno(int pno) {
		Pno = pno;
	}
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	
	
}

public  class airline_reservation {
	
		static Register register = new Register();
		private static Object input;
		
				
		public static void main(String[] args) throws java.lang.Exception{
			List<Register> ar = new ArrayList<Register>();
			List<Flight> al = new ArrayList<Flight>();
			Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
			Scanner sc2 = new Scanner(System.in);
			Scanner sc3 = new Scanner(System.in);
			
			
				    
			int ch;
			do {
				System.out.println("1. REGISTER");
				System.out.println("2. LOGIN");
				System.out.println("3. BOOK TICKET");
				System.out.println("4. DISPLAY RESERVATION");
				System.out.println("5. SEARCH RESERVATION");
				System.out.println("6. CANCEL RESERVATION");
				System.out.println("7. EXIT");
				System.out.println("Enter value of your choice");
				ch = sc.nextInt();
				
				//				switch case
				switch(ch)  {
				case 1:
					System.out.println(" REGISTER");
					Scanner scanner = new Scanner(System.in); 
				        System.out.print(" Enter firstName => ");
				        String firstName = scanner.nextLine();
				        register.setFirstName(firstName);

				        System.out.print(" Enter lastName => ");
				        String lastName = scanner.nextLine();
				        register.setLastName(lastName);

				        System.out.print(" Enter userName => ");
				        String userName = scanner.nextLine();
				        register.setUserName(userName);

				        System.out.print(" Enter password => ");
				        String password = scanner.nextLine();
				        register.setPassword(password);

				        System.out.print(" Enter emailId => ");
				        String emailId = scanner.nextLine();
				        register.setEmailId(emailId);

				        System.out.print(" Enter phoneNo => ");
				        long phoneNo = scanner.nextLong();
				        register.setPhoneNo(phoneNo);

				        System.out.println("Successfully Registered");
				        break; 
				         
	
				case 2:
					System.out.println("LOGIN");
					Scanner scanner1 = new Scanner(System.in);
			            System.out.print(" Enter user name => ");
			            String userName1 = scanner1.nextLine();
			            System.out.print(" Enter password => ");
			            String password1 = scanner1.nextLine();

			            if ("UName".equals(userName1) && "password".equals(password1)) {
			                System.out.println(" User successfully logged-in.. ");
			            } 
			            else {
			                System.out.println(" In valid userName of password ");
			            }
			           
					break;
					
				case 3:
					System.out.println("BOOK TICKET");
					System.out.print("Enter Flight Number: ");
					int Fno = sc2.nextInt();
					System.out.print("Enter Source Location: ");
					String Source = sc3.nextLine();
					System.out.print("Enter Destination Location : ");
					String Destination = sc3.nextLine();
					System.out.print("Enter Date of journey : ");
					String date = sc3.nextLine();
					System.out.print("Enter Time: ");
					String time = sc3.nextLine();
					System.out.print("Enter Number of Passengers: ");
					int Pno = sc2.nextInt();
					System.out.println("Enter Names of the Passengers: ");
					String Pname = sc3.nextLine();
					System.out.print("Enter Register Number: ");
					int regno = sc2.nextInt();
					al.add(new Flight(Fno,Source,Destination,date,time,Pno,Pname, regno));
					System.out.println("Ticket book successfully....!");
					
					
					break;
				case 4:
					System.out.println("Display operation");
					Iterator<Flight> i = al.iterator();
					while(i.hasNext()) {
						Flight e = i.next();
						System.out.println(e);
					}
					break;
				case 5:
					boolean found = false;
					System.out.println("Search operation");
					System.out.println("Enter Reg no to search :");
					int rno = sc3.nextInt();
					i = al.iterator();
					while(i.hasNext()) {
						Flight e = i.next();
						if(e.getRegno()==rno) {
						System.out.println(e);
						found = true;
						}
					}
					if (!found) {
						System.out.println("Record not found");
					}
					
					break;
				case 6:
					System.out.println("Cancel RESERVATION");
					found = false;
					System.out.println("Enter Reg no to cancel :");
					rno = sc3.nextInt();
					i = al.iterator();
					while(i.hasNext()) {
						Flight e = i.next();
						if(e.getRegno()==rno) {
						i.remove();
						found = true;
						}
					}
					if (!found) {
						System.out.println("Record not found");
					}
					else {
						System.out.println("Record is deleted successfully");
					}
					break;
				case 7:
					System.out.println("Exit!!");
					break;
				}


			}
			while(ch>=1 && ch<=6);
			
			}
		}
			
		
			
					

				    

