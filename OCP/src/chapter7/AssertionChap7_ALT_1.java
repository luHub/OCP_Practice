package chapter7;
import java.net.Authenticator;


public class AssertionChap7_ALT_1 {

	public static void main(String args[]){
	int j=7;
	assert(++j>7);
	assert(++j>8);
	assert(10>j):j=12;
	assert(12==j):foo(); //Should Return String
	assert(12==j):new AssertionChap7_ALT_1();
	}
	
	public static String foo(){
		return "This Compiles";
	}
	
}
