import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Desition {

	public static void main(String[] args) throws FileNotFoundException, ParseException, IOException, org.json.simple.parser.ParseException {
		// TODO Auto-generated method stub
		List<patient> allPatient=Data.setData();
		
    	Date D1=new SimpleDateFormat("dd/MM/yyyy").parse("1/07/2021");
    	Date D2=new SimpleDateFormat("dd/MM/yyyy").parse("9/07/2021");

		List<patient> dateModefy=patient.getCurrentPatient(D1, D2, allPatient);
       
		    
		long BanCount=dateModefy.stream()  
		        .filter(p -> p.getlocation().equals("Bangalore")).count();
		long OutCount=dateModefy.stream()  
		        .filter(p ->! p.getlocation().equals("Bangalore")).count();
		
		System.out.println("Bangalore Patients:"+BanCount);
		System.out.println("Outstation  Patients:"+OutCount);
		
		Double inPatientPercentage = Double.valueOf(BanCount * 100 / dateModefy.size());
        Double outPatientPercentage = Double.valueOf(OutCount * 100 / dateModefy.size());
	    System.out.println("Bangalore Patients in Percentage: "+inPatientPercentage);
	    System.out.println("Outstation  Patients in Percentage:"+outPatientPercentage);
	    
	    
	    /*
	    
		List<patient> PatientBangalore =dateModefy.stream()  
		        .filter(p -> p.getlocation().equals("Bangalore")) .collect(Collectors.toList());  
		List<patient> PatientOutsied =dateModefy.stream()  
		        .filter(p -> !p.getlocation().equals("Bangalore")) .collect(Collectors.toList());  
	    */

	}

}
