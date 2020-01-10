import java.util.*;
import java.io.*;

public class FileReadTest {
  public ArrayList<Fighter> list = new ArrayList<Fighter>();
  public static void main(String[] args) throws Exception {
    
    String csvFile = "Fighters.csv";
    BufferedReader br = null;
    String line = "";
    String cvsSplitBy = ",";
    Speed fighter1  = new Speed("temp");
    Strength fighter2 = new Strength("temp");
    Brain fighter3= new Brain("temp");
    
    try {
      br = new BufferedReader(new FileReader(csvFile));
      while ((line = br.readLine()) != null){
        String[] csvRow = line.split(cvsSplitBy);
        if (csvRow[1].equalsIgnoreCase("Speed")) {
          fighter1.set_name(csvRow[0]);
          fighter1.set_attack(Double.parseDouble(csvRow[2]));
          fighter1.set_defense(Double.parseDouble(csvRow[3]));
          fighter1.set_speed(Double.parseDouble(csvRow[4]));
          fighter1.set_defaultHealth(Double.parseDouble(csvRow[5]));
          fighter1.set_health(Double.parseDouble(csvRow[6]));
          for(int i=0; i<4; i++){
            Move move = new Move("temp", 0, true, 0);
            int row = 8*i+7;
            for(int j=row; j<row+8; j++){
              if(j==row){
                move.set_name(csvRow[j]);
              }
              else if(j==row+1){
                move.set_basePower(Double.parseDouble(csvRow[j]));
              }
              else if(j==row+2){
                move.set_modifiers(Boolean.parseBoolean(csvRow[j]));
              }
              else if(j==row+3){
                move.set_modifyType(csvRow[j]);
              }
              else if(j==row+4){
                move.set_modifyDegree(Double.parseDouble(csvRow[j]));
              }
              else if(j==row+5){
                move.set_modifyDegreeTwo(Double.parseDouble(csvRow[j]));
              }
              else if(j==row+6){
                move.set_regen(csvRow[j]);
              }
              else if(j==row+7){
                move.set_asleep(Boolean.parseBoolean(csvRow[j]));
              }
              else if(j==row+8){
                move.set_accuracy(Double.parseDouble(csvRow[j]));
              }
            }
            fighter1.addMove(move);
          }
        }
        
        else if (csvRow[2].equalsIgnoreCase("Strength")) {
          fighter2.set_name(csvRow[0]);
          fighter2.set_attack(Double.parseDouble(csvRow[2]));
          fighter2.set_defense(Double.parseDouble(csvRow[3]));
          fighter2.set_speed(Double.parseDouble(csvRow[4]));
          fighter2.set_defaultHealth(Double.parseDouble(csvRow[5]));
          fighter2.set_health(Double.parseDouble(csvRow[6]));
          for(int i=0; i<4; i++){
            Move move = new Move("temp", 0, true, 0);
            int row = 8*i+7;
            for(int j=row; j<row+8; j++){
              if(j==row){
                move.set_name(csvRow[j]);
              }
              else if(j==row+1){
                move.set_basePower(Double.parseDouble(csvRow[j]));
              }
              else if(j==row+2){
                move.set_modifiers(Boolean.parseBoolean(csvRow[j]));
              }
              else if(j==row+3){
                move.set_modifyType(csvRow[j]);
              }
              else if(j==row+4){
                move.set_modifyDegree(Double.parseDouble(csvRow[j]));
              }
              else if(j==row+5){
                move.set_modifyDegreeTwo(Double.parseDouble(csvRow[j]));
              }
              else if(j==row+6){
                move.set_regen(csvRow[j]);
              }
              else if(j==row+7){
                move.set_asleep(Boolean.parseBoolean(csvRow[j]));
              }
              else if(j==row+8){
                move.set_accuracy(Double.parseDouble(csvRow[j]));
              }
            }
          }
        }
        
        else if (csvRow[2].equalsIgnoreCase("Brain")) {
          fighter3.set_name(csvRow[0]);
          fighter3.set_attack(Double.parseDouble(csvRow[2]));
          fighter3.set_defense(Double.parseDouble(csvRow[3]));
          fighter3.set_speed(Double.parseDouble(csvRow[4]));
          fighter3.set_defaultHealth(Double.parseDouble(csvRow[5]));
          fighter3.set_health(Double.parseDouble(csvRow[6]));
          for(int i=0; i<4; i++){
            Move move = new Move("temp", 0, true, 0);
            int row = 8*i+7;
            for(int j=row; j<row+8; j++){
              if(j==row){
                move.set_name(csvRow[j]);
              }
              else if(j==row+1){
                move.set_basePower(Double.parseDouble(csvRow[j]));
              }
              else if(j==row+2){
                move.set_modifiers(Boolean.parseBoolean(csvRow[j]));
              }
              else if(j==row+3){
                move.set_modifyType(csvRow[j]);
              }
              else if(j==row+4){
                move.set_modifyDegree(Double.parseDouble(csvRow[j]));
              }
              else if(j==row+5){
                move.set_modifyDegreeTwo(Double.parseDouble(csvRow[j]));
              }
              else if(j==row+6){
                move.set_regen(csvRow[j]);
              }
              else if(j==row+7){
                move.set_asleep(Boolean.parseBoolean(csvRow[j]));
              }
              else if(j==row+8){
                move.set_accuracy(Double.parseDouble(csvRow[j]));
              }
            }
            fighter3.addMove(move);
            
          }
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
