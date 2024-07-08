package Local;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class AmazonCreateAnAccountPageTest {

//@Test
void testYourName() {

AmazonCreateAnAccountPage a = new AmazonCreateAnAccountPage();

String expectedFirstnm = "Raghul";
String expectedLastnm = "Kumar";

String actualResult = a.YourName(expectedFirstnm, expectedLastnm);

assertSame(a.YourName(expectedFirstnm, expectedLastnm),actualResult,"Please Provide Your FirstName and LastName");
assertEquals(a.YourName(expectedFirstnm, expectedLastnm), actualResult);
}
//@Test
void testMobNoAndEmailiD() {
AmazonCreateAnAccountPage a = new AmazonCreateAnAccountPage();

long expectedMobNo = 1234567890l;
String expectedEmailID = "raghul@gmail.com";
String actualResult = a.MobiNoAndEmailID(expectedMobNo, expectedEmailID);

assertAll(() ->  equals(a.MobiNoAndEmailID(1234567890,"raghul@gmail.com")),
() -> equals(a.MobiNoAndEmailID(99888888,"raghul@gmail.com"))
);

}
//@Test
void testMobNoAndEmailiD1() {
AmazonCreateAnAccountPage a = new AmazonCreateAnAccountPage();

long expectedMobNo = 1234567890l;
String expectedEmailID = "raghul@gmail.com";
String actualResult = a.MobiNoAndEmailID(expectedMobNo, expectedEmailID);

assertAll(() ->  equals(a.MobiNoAndEmailID(1234567890,""))

);

}
//@Test
void testCheckPassword() {

AmazonCreateAnAccountPage a = new AmazonCreateAnAccountPage();

String expectedpass = "raghul";
boolean actualResult = a.CheckPassword(expectedpass);
assertTrue(a.CheckPassword("suresh"));

}
//@Test
void testCheckPassword1() {

AmazonCreateAnAccountPage a = new AmazonCreateAnAccountPage();

String expectedpass = "12345";
boolean actualResult = a.CheckPassword(expectedpass);
assertFalse(a.CheckPassword("12345"));

}
@Test
void testCheckPassword2() {

AmazonCreateAnAccountPage a = new AmazonCreateAnAccountPage();

String expectedpass = "";
boolean actualResult = a.CheckPassword(expectedpass);
assertFalse(a.CheckPassword(""));

}



}
