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


public class main {
	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<String> temp = readCSV("report.csv");
		data user[] = new data[temp.size()/2];
		
		//init array
		for(int i = 0; i < temp.size()/2 ; i++){
		   	user[i] = new data();
		}
			
		//fill array
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < 2; j++) {
				user[i].setData(temp.get(0), temp.get(1));
			}
			temp.remove(0);
			temp.remove(0);
		}
		
		//print array
		for(int i = 0; i < user.length; i++) {
		System.out.println(i +" "+ user[i].toString());
		}
	
	}
	
	public static ArrayList<String> readCSV(String name) throws FileNotFoundException {
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
