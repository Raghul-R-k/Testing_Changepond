package Local;

public class AmazonCreateAnAccountPage {
	public String YourName(String Firstnm,String Lastnm) {
		return ("FirstName"+"LastName");
	}
	public String MobiNoAndEmailID(long expectedMobNo, String expectedEmailID) {
		return (expectedMobNo + "EmailID");
	}
	public boolean CheckPassword(String pass) {
		return pass.length() == 6;
	}
	public boolean ClickContinue(String name,String email,String password) {
		return true;
	}
}
