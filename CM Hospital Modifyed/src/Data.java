

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Data {
	public static List<patient> setData() throws ParseException, FileNotFoundException, IOException, org.json.simple.parser.ParseException{
		List<patient> allPatient = new ArrayList<patient>();

		JSONParser p= new JSONParser();
        Object obj=p.parse(new FileReader("src/data.json"));
        JSONObject Jobj =  (JSONObject)obj;
        JSONArray array=(JSONArray)Jobj.get("patient");
        for (int i = 0; i < array.size(); i++) {
        	JSONObject post_id = (JSONObject) array.get(i);
        	String name=(String) post_id.get("name");
        	String DocName=(String) post_id.get("Doc");
        	String location=(String) post_id.get("place");
        	String date1=(String) post_id.get("Date");

        	
        	Date d=new SimpleDateFormat("dd/MM/yyyy").parse(date1);
   	    	
   	    allPatient.add(new patient(name,location,d,DocName));
        	
        }
        
        		
        
	
	    return allPatient;
	}
}
