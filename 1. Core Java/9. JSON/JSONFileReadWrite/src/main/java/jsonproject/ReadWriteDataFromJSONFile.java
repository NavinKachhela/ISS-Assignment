package jsonproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadWriteDataFromJSONFile {
	
	public static void writeJson(String filename){
		
		// creating JSONObject
	    JSONObject sampleObject = new JSONObject();
	    sampleObject.put("name", "Navin");
	    sampleObject.put("age", 22);
	    
	    // for various games, first create JSONArray
	    JSONArray array = new JSONArray();
	    array.add("cricket");
	    array.add("chess");

	    sampleObject.put("games", array);
	    try {
			Files.write(Paths.get(filename), sampleObject.toJSONString().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	}
	public static void readJson(String filename){
		JSONParser jsonParser = new JSONParser();
		
		
		FileReader reader = null;
		try {
			reader = new FileReader(filename);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			
			// parsing file "employee.json"
			Object obj = jsonParser.parse(reader);
			
			JSONObject empjsonobj = (JSONObject)obj;
			
			 // getting firstName and lastName
			String fname = (String)empjsonobj.get("firstName");
			String lname = (String)empjsonobj.get("lastName");
			
			System.out.println("First name: " + fname);
			System.out.println("Last name: " + lname);
			
			// getting addresses
			JSONArray array = (JSONArray)empjsonobj.get("address");
			
			// iterating addresses
			for(int i=0; i<array.size(); i++) {
				JSONObject address = (JSONObject) array.get(i);
				
				String street = (String) address.get("street");
				String city = (String) address.get("city");
				String state = (String) address.get("state");
				
				System.out.println("Address of " + i +" is " + " " + street + " " + city + " " + state);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String args[]) {
		readJson(".\\jsonfiles\\employee.json");
		writeJson(".\\jsonfiles\\output.json");
	}
}
