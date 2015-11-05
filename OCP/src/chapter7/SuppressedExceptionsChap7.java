package chapter7;
import java.io.IOException;

public class SuppressedExceptionsChap7 {
	
	public static void main(String[] args) {
		SuppressedExceptionsChap7 a= new SuppressedExceptionsChap7();
		try (One one = a.new One()) {
			//throw new Exception("Try");
		} catch (Exception e) {
			System.err.println("catch: "+e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.err.println("suppressed:" + t);
			}
		}
	}
	class One implements AutoCloseable {
		public void close() throws IOException {
			throw new IOException("Closing");
		}
	}
}







	







