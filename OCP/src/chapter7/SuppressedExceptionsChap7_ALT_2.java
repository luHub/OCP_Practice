package chapter7;
import java.io.IOException;

public class SuppressedExceptionsChap7_ALT_2 {
	
	public static void main(String[] args) {
		SuppressedExceptionsChap7_ALT_2 a= new SuppressedExceptionsChap7_ALT_2();
		try (One one = a.new One()) {
			throw new Exception("Try");
		} catch (Exception e) {
			System.err.println("catch: "+e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.err.println("suppressed:" + t);
			}
		}
	}
	class One implements AutoCloseable {
		public void close() throws IOException {
			System.out.println("close()");
			throw new IOException("Closing");
		}
	}
}







	







