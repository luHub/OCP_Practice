package chapter7;
import java.io.Closeable;
import java.io.IOException;


public class EX_10_Chap7 {

	class Lamb implements Closeable{
		public void close(){
			throw new RuntimeException("a");
		}}
	
	public static void main(String[] args){
		new EX_10_Chap7().run();
	}
	
	public void run(){
		try(Lamb l = new Lamb()){
			throw new IOException();
		}catch(Exception e){
			throw new RuntimeException("c");
		}
	}
}
