package others;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Adventofcode2018day1 {

	public static void main(String arg[]) throws IOException {
		String currentDir = System.getProperty("user.dir");
		File file = new File(currentDir+"//src//others//FrequencyList");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String st;
		int currentFrequecy = 0;
		int changeOfFrequency = 0;
		int resultFrequency = 0;
		while ((st = reader.readLine()) != null) {
			changeOfFrequency = Integer.parseInt(st.trim().toString());
			resultFrequency = currentFrequecy + changeOfFrequency;
			System.out.format("Current frequency %d, ChangeOfFrequency %d, resultFrequency %d \n",currentFrequecy,changeOfFrequency,resultFrequency);
			currentFrequecy = resultFrequency;
		}
		System.out.println("Final Frequency "+resultFrequency);
		reader.close(); 
	}
}