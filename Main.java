import java.util.Arrays;
import com.opencsv.CSVReader;
import java.io.FileReader;


class Main {
  public static void main(String[] args) {
    try{
      CSVReader reader = new CSVReader(new FileReader("users.csv"));
      String[]nextline;
      while((nextline = reader.readNext()) != null)
      {
        if(nextline != null){
          System.out.println(Arrays.toString(nextline));
        }
      }
    } catch(Exception e)
      {System.out.println(e);}
      System.out.println("done");
     
  }
}