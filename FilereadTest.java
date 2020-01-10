import java.util.*;
import java.io.*;

public class FilereadTest {
  public static void main(String[] args) throws Exception {
    
    String csvFile = "Fighters.csv";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
    ArrayList<Fighter> fighterList = new ArrayList<Fighter>();
    Speed fighter1  = new Speed("temp");
    Strength fighter2 = new Strength("temp");
    Brain fighter3= new Brain("temp");
    
    try {
      br = new BufferedReader(new FileReader(csvFile));
      while ((line = br.readLine()) != null){
        String[] csvRow = line.split(cvsSplitBy);
        
        if (csvRow[2].equalsIgnoreCase("Speed")) {
          fighter1.set_name(csvRow[0]);
          fighter1.set_attack(Double.parseDouble(csvRow[2]));
          fighter1.set_defense(Double.parseDouble(csvRow[3]));
          fighter1.set_speed(Double.parseDouble(csvRow[4]));
          fighter1.set_defaultHealth(Double.parseDouble(csvRow[5]));
          fighter1.set_health(Double.parseDouble(csvRow[6]));
          Move moveOne = new Move("temp", 0, true, 0);
          moveOne.set_basePower(Double.parse);
        }
        
        else if (csvRow[2].equalsIgnoreCase("Strength")) {
          fighter2.set_name(csvRow[0]);
          fighter2.set_attack(Double.parseDouble(csvRow[2]));
          fighter2.set_defense(Double.parseDouble(csvRow[3]));
          fighter2.set_speed(Double.parseDouble(csvRow[4]));
          fighter2.set_defaultHealth(Double.parseDouble(csvRow[5]));
          fighter2.set_health(Double.parseDouble(csvRow[6]));
        }
        
        else if (csvRow[2].equalsIgnoreCase("Brain")) {
          fighter3.set_name(csvRow[0]);
          fighter3.set_attack(Double.parseDouble(csvRow[2]));
          fighter3.set_defense(Double.parseDouble(csvRow[3]));
          fighter3.set_speed(Double.parseDouble(csvRow[4]));
          fighter3.set_defaultHealth(Double.parseDouble(csvRow[5]));
          fighter3.set_health(Double.parseDouble(csvRow[6]));
        }
        
        
        System.out.println(fighter1);
        System.out.println(fighter2);
        System.out.println(fighter3);
        System.out.println(Arrays.toString(csvRow));
        
      }
      
    } 
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
  }
  
}
