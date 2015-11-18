package chapter7;

public class AssertionChap7 {

	public static void main(String args[]){
	int j=7;
	assert(++j>7);
	assert(++j>8);
	assert(10>j):j=12;
//	assert(12==j):foo(); //Compilation Error, Should Return String
	assert(12==j):new AssertionChap7();
	}
	
	public static void foo(){}
	
}
