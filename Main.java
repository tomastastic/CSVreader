import java.util.Arrays;
import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.List;


class Main {
  public static void main(String[] args) {
    try{
      CSVReader reader = new CSVReader(new FileReader("users.csv"));
      /*
      String[]nextTransaction;
      while((nextTransaction = reader.readNext()) != null)
      {
        if(nextTransaction != null){
          System.out.println(Arrays.toString(nextTransaction));
        }
      } */
      
     // List<String[]> nextTransaction = reader.readAll();
      String[]nextTransaction;
      while ((nextTransaction = reader.readNext()) != null){
        System.out.println("Date : " + nextTransaction[0]);
        System.out.println("Type : " + nextTransaction[1]);
        System.out.println("Merchant : " + nextTransaction[2]);
        System.out.println("Debit : " + nextTransaction[3]);
        System.out.println("Balance : " + nextTransaction[4]);
        System.out.println("---------------------------");
        //Date,Type,Merchant/Description,Debit/Credit,Balance
      }

    } catch(Exception e)
      {System.out.println(e);}
      System.out.println("done");
     
  }
}