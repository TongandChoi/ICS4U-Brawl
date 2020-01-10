import java.util.*;
import java.io.*;

public class FilereadTest {
  public static void main(String[] args) throws Exception {
    
    String csvFile = "Fighters.csv";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
    ArrayList<Fighter> fighterList = new ArrayList<Fighter>();
    
    try {
      br = new BufferedReader(new FileReader(csvFile));
      while ((line = br.readLine()) != null){
        String[] csvRow = line.split(cvsSplitBy);
        
        Fighter fighter = new Fighter(csvRow[0], csvRow[1]);
        fighter.set_attack(Double.parseDouble(csvRow[2]));
        fighter.set_defense(Double.parseDouble(csvRow[3]));
        fighter.set_speed(Double.parseDouble(csvRow[4]));
        fighter.set_defense(Double.parseDouble(csvRow[5]));
        
        System.out.println(fighter);
        System.out.println(Arrays.toString(csvRow));
      }
      
    } 
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
  }
  
}