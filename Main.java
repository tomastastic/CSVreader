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
      
      List<String[]> nextTransaction = reader.readAll();

      for(String[] record : nextTransaction){
        System.out.println("Date : " + record[0]);
        System.out.println("Type : " + record[1]);
        System.out.println("Merchant : " + record[2]);
        System.out.println("Debit : " + record[3]);
        System.out.println("Balance : " + record[4]);
        System.out.println("---------------------------");
        //Date,Type,Merchant/Description,Debit/Credit,Balance
      }

    } catch(Exception e)
      {System.out.println(e);}
      System.out.println("done");
     
  }
}