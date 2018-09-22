package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class reader{
	
		public reader(String x) {
		super();
		// TODO Auto-generated constructor stub
	}

		public ArrayList<String> readCSV(String name) throws FileNotFoundException {
			File file = new File(name);
			
	        String line = "";
	        String cvsSplitBy = ",";

	        ArrayList<String> temp = new ArrayList<String>();
	        
	        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	        	
	            while ((line = br.readLine()) != null) {

	                // use comma as separator
	                String[] array = line.split(cvsSplitBy);
	    	        for(String i:array) {
	    	        	temp.add(i);
	    	        }
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	        return temp;
	}

}



