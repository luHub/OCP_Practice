package chapter7;
import java.io.IOException;

public class SuppressedExceptionsChap7_ALT_3 {
	
	public static void main(String[] args) {
		try (One one = new One().count(); Two two = new Two().count();) {
			throw new Exception("Try");
			//System.out.println("End Try");
		} catch (Exception e) {
			System.err.println("catch: "+e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.err.println("suppressed:" + t);
			}
		}
		System.out.println("End Main");
	}
	static class One implements AutoCloseable {
		int count=0;
		public One count(){
			count++;
			return this;
		}
		
		public void close() throws IOException {
			System.out.println("close() "+(count));
			throw new IOException("Closing "+count);
		}
	}
	
	static class Two implements AutoCloseable {
		int count=1;
		public Two count(){
			count++;
			return this;
		}
		
		public void close() throws IOException {
			System.out.println("close() "+(count));
			throw new IOException("Closing "+count);
		}
	}
}







	







