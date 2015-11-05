package chapter7;
import java.io.Closeable;
import java.io.IOException;


public class EX_10_Chap7_ALT_2 {

	class Lamb implements Closeable{
		public void close(){
			System.out.println("Close()");
			throw new RuntimeException("a");
		}}
	
	public static void main(String[] args){
		new EX_10_Chap7_ALT_2().run();
	}
	
	public void run(){
		try(Lamb l = new Lamb()){
			throw new IOException();
		}catch(Exception e){
			System.out.println("e: "+e);
			for (Throwable t : e.getSuppressed())
			    System.err.println("suppressed: " + t);
			throw new RuntimeException("c");
			
		}
	}
}
