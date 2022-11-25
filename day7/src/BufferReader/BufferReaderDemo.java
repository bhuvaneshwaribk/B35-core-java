package BufferReader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferReaderDemo {

	public static void main(String[] args)throws Exception {
    BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
    String name=b.readLine();
    System.out.println(name);
	}

}
