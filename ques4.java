import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class residentialSociety{
    String societyName;
    String location;
    String SecretoryName;
}
class building extends residentialSociety{
    String buildingName;
    int totalNumberOfApartments;
}
class apartment extends building{
    int apartmentName;
    String ownerName;
    String Elecmeternum;
}
public class ques4{ 
public static void main(String[] args) {
    residentialSociety resObj=new residentialSociety();
    building A=new building();
    building B=new building();
    building C=new building();
    String l=null;
    try{
        BufferedReader buf=new BufferedReader(new FileReader("apartment.csv"));
        while((l=buf.readLine())!=null){
            String []apart=l.split(",");
            System.out.println(apart[0]+"\t"+apart[1]+"\t"+apart[2]+"\t"+apart[3]+"\t");
        }
    }
    catch(IOException e){
        e.printStackTrace();
    }
}
}