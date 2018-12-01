package others;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Adventofcode2018day1part2 {

	public static void main(String arg[]) throws IOException {
		String currentDir = System.getProperty("user.dir");
		File file = new File(currentDir+"//src//others//FrequencyListPart2");
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String st;
		int currentFrequecy = 0;
		int changeOfFrequency = 0;
		int resultFrequency = 0;
		Set<Integer> uniqueFreq = new HashSet<Integer>();
		uniqueFreq.add(resultFrequency);
		int readFileCount = 0;
		boolean found = false;
		while(!found) {
			reader = new BufferedReader(new FileReader(file));
			readFileCount++;
			while ((st = reader.readLine()) != null) {
				changeOfFrequency = Integer.parseInt(st.trim().toString());
				resultFrequency = currentFrequecy + changeOfFrequency;
				System.out.format("Current frequency %d, ChangeOfFrequency %d, resultFrequency %d \n",currentFrequecy,changeOfFrequency,resultFrequency);
				currentFrequecy = resultFrequency;
				if(!uniqueFreq.contains(resultFrequency)) {
					uniqueFreq.add(resultFrequency);
				}else {
					found = true;
					break;
				}
			}
		}
		System.out.println("First reaches "+resultFrequency+" twice");
		System.out.println("File read times "+readFileCount);
		reader.close(); 
	}
}