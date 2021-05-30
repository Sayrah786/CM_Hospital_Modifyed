

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class patient {
	String name,location,DocName;
    Date date1;
    
    public patient(String name,String location,Date date1,String DocName){
    	this.name=name;
    	this.location=location;
    	this.DocName=DocName;
    	this.date1=date1;
    
    }
    public String getDocName() {
        return DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getlocation() {
        return location;
    }

    public void setlocation(String location) {
        this.location = location;
    }
    public Date getdate1() {
        return date1;
    }

    public void setdate1(Date date1) {
        this.date1 = date1;
    }
    
   public static List<patient> getCurrentPatient(Date D1,Date D2,List<patient> allPatient) {
	   List<patient> allP =allPatient.stream()  
		        .filter(p -> p.getdate1().after(D1)&& p.getdate1().before(D2)) .collect(Collectors.toList());  
	   return allP;
   }
	

}
