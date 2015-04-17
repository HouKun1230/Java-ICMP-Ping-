package pingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ping {

	public static String ipAdd="www.lakeheadu.ca";
	
	public static void main(String[] args)
	{
		try {
			Process p = Runtime.getRuntime().exec("ping " + ipAdd);
			BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
 
			String s = "";
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
			}
 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
