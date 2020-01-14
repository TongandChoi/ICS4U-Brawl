import java.io.*;
import java.util.*;


class ICS4UBrawl{
  public static void main(String[] args) throws Exception{
    File file = new File("Fighters.csv");
    FilereadTest newReader = new FilereadTest();
    Team playerOne = new Team(true);
    Team playerTwo = new Team(true);
    boolean turn = true;
    Team computer = new Team(false);
    ArrayList<Fighter> draftBoard =newReader.fileReading(file);
    Scanner input = new Scanner(System.in);
    Fighter currFighterPlay = new Fighter("Temp");
    Fighter currFighterPlay2 = new Fighter("Temp");
    Fighter currFighterAI = new Fighter("Temp");
    Random random = new Random();
    Scanner readerTwo = new Scanner(System.in);
    int answer;
    
    System.out.println("PVP or PVC");
    String mode = input.nextLine();
    
    if(mode.equalsIgnoreCase("PVC")){
      while(playerOne.get_team().size()<3 || computer.get_team().size()<3){
        for(int i=0; i<draftBoard.size(); i++){
          System.out.println("Fighter " + i + ": ");
          System.out.println(draftBoard.get(i).get_name());
        }
        System.out.println();
        if(playerOne.get_team().size()>0){
          System.out.println("Player's Team");
          for(int i=0; i<playerOne.get_team().size(); i++){
            System.out.println("Fighter " + i + ": " + playerOne.get_team().get(i).get_name());
          }
          System.out.println();
          System.out.println("Computer's Team");
          for(int i=0; i<computer.get_team().size(); i++){
            System.out.println("Fighter " + i + ": " + computer.get_team().get(i).get_name());
          }
          System.out.println();
        }
        boolean check=false;
        while(check==false){
          try{
            System.out.println("Which fighter do you want on your team?");
            answer = input.nextInt();
            if(answer==4206969){
              for(int i=0; i<draftBoard.size(); i++){
                System.out.println("Fighter " + i + ": ");
                System.out.println(draftBoard.get(i).get_name());
              }
              System.out.println("Which fighter do you want on your team?");
              answer = input.nextInt();
            }
            currFighterPlay=draftBoard.get(answer);
            playerOne.addFighter(currFighterPlay);
            draftBoard.remove(currFighterPlay);
            draftBoard.trimToSize();
            check=true;
          }
          catch (Exception e){
            System.out.println("Invalid input. Please enter a valid input");
            System.out.println("Type 4206969 for the draftboard");
            input.nextLine();
            answer=4206969;
          }
        }
        int slot = random.nextInt(draftBoard.size()); 
        computer.addFighter(draftBoard.get(slot));
        draftBoard.remove(slot);
        draftBoard.trimToSize();
      }
      
      System.out.println("Player's Team");
      for(int i=0; i<playerOne.get_team().size(); i++){
        System.out.println("Fighter " + i + ": " + playerOne.get_team().get(i).get_name());
      }
      System.out.println();
      System.out.println("Computer's Team");
      for(int i=0; i<computer.get_team().size(); i++){
        System.out.println("Fighter " + i + ": " + computer.get_team().get(i).get_name());
      }
      System.out.println();
      
      while(playerOne.get_team().size()>0 && computer.get_team().size()>0){
        boolean check=false;
        int fighterNum;
        while(check==false){
          try{
            System.out.println("Which fighter do you want to use?");
            fighterNum=readerTwo.nextInt();
            if(fighterNum==4206969){
              System.out.println("Player's Team");
              for(int i=0; i<playerOne.get_team().size(); i++){
                System.out.println("Fighter " + i + ": " + playerOne.get_team().get(i).get_name());
              }
              System.out.println();
              System.out.println("Computer's Team");
              for(int i=0; i<computer.get_team().size(); i++){
                System.out.println("Fighter " + i + ": " + computer.get_team().get(i).get_name());
              }
              System.out.println("Which fighter do you want to use?");
              fighterNum=readerTwo.nextInt();
            }
            currFighterPlay=playerOne.get_team().get(fighterNum);
            check=true;
          }
          catch (Exception e){
            System.out.println("Invalid input. Please enter the number of the fighter desired");
            System.out.println("Type 4206969 for the teams");
            readerTwo.nextLine();
            fighterNum=-600;
          }
        }
        Random dice = new Random();
        int compNum= dice.nextInt(3);
        currFighterAI=computer.get_team().get(compNum); 
        System.out.println(turn);
        System.out.println(currFighterPlay.get_name() + " vs " + currFighterAI.get_name());
        while(currFighterAI.get_health()>0 && currFighterPlay.get_health()>0){
          Move tempMovePlay = new Move("temp", 0, true, 0);
          Move tempMoveAI = new Move("temp", 0, true, 0);
          answer = -5;
          boolean check2=false;
          System.out.println();
          System.out.println(currFighterPlay.get_name() + "'s Moveset: "); 
          System.out.println("Move 0: " +currFighterPlay.get_moveSet().get(0).get_name());
          System.out.println("Move 1: " +currFighterPlay.get_moveSet().get(1).get_name());
          System.out.println("Move 2: " +currFighterPlay.get_moveSet().get(2).get_name());
          System.out.println("Move 3: " +currFighterPlay.get_moveSet().get(3).get_name());
          System.out.println();
          while(check2==false){
            try{
              System.out.println("Which move do you want to use. Type -1 for complete discription of move");
              answer = readerTwo.nextInt();
              if(answer==-1){
                System.out.println("Move 0");
                System.out.println(currFighterPlay.get_moveSet().get(0));
                System.out.println();
                System.out.println("Move 1");
                System.out.println(currFighterPlay.get_moveSet().get(1));
                System.out.println();
                System.out.println("Move 2");
                System.out.println(currFighterPlay.get_moveSet().get(2));
                System.out.println();
                System.out.println("Move 3");
                System.out.println(currFighterPlay.get_moveSet().get(3));
                System.out.println();
                System.out.println("Which move do you want to use. Type -1 for complete discription of move");
                answer = readerTwo.nextInt();
              }
              check2=true;
            }
            catch (Exception e){
              System.out.println("Invalid input. Please enter a valid input");
              readerTwo.nextLine();
              answer=-90;
            }
          }
          tempMovePlay = currFighterPlay.get_moveSet().get(answer);
          int moveSlot= random.nextInt(4);
          tempMoveAI = currFighterAI.get_moveSet().get(moveSlot);
          turn=true;
          
          if(currFighterPlay.get_speed()>currFighterAI.get_speed()){
            attacking(currFighterPlay, currFighterAI, tempMovePlay);
            turn=false;
            if(currFighterAI.get_health()<=0){
              break;
            }
          }
          else if(currFighterAI.get_speed()>currFighterPlay.get_speed()){
            attacking(currFighterAI, currFighterPlay, tempMoveAI);
            turn=true;
            if(currFighterPlay.get_health()<=0){
              break;
            }
          }
          
          if(turn==true){
            attacking(currFighterPlay, currFighterAI, tempMovePlay);
          }
          else if(turn==false){
            attacking(currFighterAI, currFighterPlay, tempMoveAI);
          }
          turn=true;
        }
        if(currFighterPlay.get_health()<=0){
          playerOne.get_team().remove(currFighterPlay);
          playerOne.get_team().trimToSize();
        } 
        if(currFighterAI.get_health()<=0){
          computer.get_team().remove(currFighterAI);
          computer.get_team().trimToSize();
        }
        System.out.println();
        System.out.println("Player's Team:");
        for(int i=0; i<playerOne.get_team().size(); i++){
          System.out.print("Fighter " + i + ": ");
          System.out.println(playerOne.get_team().get(i).get_name());
        }
        System.out.println();
        System.out.println("AI's Team:");
        for(int i=0; i<computer.get_team().size(); i++){
          System.out.println(computer.get_team().get(i).get_name());
        }
        System.out.println();
      }
      if(playerOne.get_team().size()==0){
        System.out.println("You lost. Thank you for playing");
      }
      else{
        System.out.println("Congratulations. You win.");
      }
    }
    else if(mode.equalsIgnoreCase("pvp")){
      while(playerOne.get_team().size()<3 || playerTwo.get_team().size()<3){
        for(int i=0; i<draftBoard.size(); i++){
          System.out.println("Fighter " + (i+1) + ": ");
          System.out.println(draftBoard.get(i).get_name());
        }
        System.out.println();
        if(playerOne.get_team().size()>0){
          System.out.println("Player One's Team");
          for(int i=0; i<playerOne.get_team().size(); i++){
            System.out.println("Fighter " + (i+1) + ": " + playerOne.get_team().get(i).get_name());
          }
          System.out.println();
          System.out.println("Player Two's Team");
          for(int i=0; i<playerTwo.get_team().size(); i++){
            System.out.println("Fighter " + (i+1) + ": " + playerTwo.get_team().get(i).get_name());
          }
          System.out.println();
        }
        boolean check=false;
        while(check==false){
          try{
            System.out.println("Which fighter do you want on your team?");
            answer = input.nextInt();
            if(answer==4206969){
              for(int i=0; i<draftBoard.size(); i++){
                System.out.println("Fighter " + i + ": ");
                System.out.println(draftBoard.get(i).get_name());
              }
              System.out.println("Which fighter do you want on your team?");
              answer = input.nextInt();
            }
            currFighterPlay=draftBoard.get(answer);
            playerOne.addFighter(currFighterPlay);
            draftBoard.remove(currFighterPlay);
            draftBoard.trimToSize();
            //check=true;
          }
          catch (Exception e){
            System.out.println("Invalid input. Please enter a valid input");
            System.out.println("Type 4206969 for the draftboard");
            input.nextLine();
            answer=4206969;
          }
          check = true;
        }
        //check=false;
        while(check==true){
          try{
            System.out.println("Which fighter do you want on your team?");
            answer = input.nextInt();
            if(answer==4206969){
              for(int i=0; i<draftBoard.size(); i++){
                System.out.println("Fighter " + i + ": ");
                System.out.println(draftBoard.get(i).get_name());
              }
            }
            currFighterPlay2=draftBoard.get(answer);
            playerTwo.addFighter(currFighterPlay2);
            draftBoard.remove(currFighterPlay2);
            draftBoard.trimToSize();
            //check=false;
          }
          catch (Exception e){
            System.out.println("Invalid input. Please enter a valid input");
            System.out.println("Type 4206969 for the draftboard");
            input.nextLine();
            answer=4206969;
          }
          check = false;
        }
      }
      while(playerOne.get_team().size()>0 && playerTwo.get_team().size()>0){
        boolean check=false;
        int fighterNum;
        while(check==false){
          try{
            System.out.println("Player One");
            System.out.println("Which fighter do you want to use?");
            fighterNum=readerTwo.nextInt();
            if(fighterNum==4206969){
              System.out.println("Player's Team");
              for(int i=0; i<playerOne.get_team().size(); i++){
                System.out.println("Fighter " + i + ": " + playerOne.get_team().get(i).get_name());
              }
              System.out.println();
              System.out.println("Computer's Team");
              for(int i=0; i<computer.get_team().size(); i++){
                System.out.println("Fighter " + i + ": " + playerTwo.get_team().get(i).get_name());
              }
              System.out.println("Which fighter do you want to use?");
              fighterNum=readerTwo.nextInt();
            }
            currFighterPlay=playerOne.get_team().get(fighterNum);
            check=true;
          }
          catch (Exception e){
            System.out.println("Invalid input. Please enter the number of the fighter desired");
            System.out.println("Type 4206969 for the teams");
            readerTwo.nextLine();
            fighterNum=-600;
          }
        }
        while(check==false){
          try{
            System.out.println("Player Two");
            System.out.println("Which fighter do you want to use?");
            fighterNum=readerTwo.nextInt();
            if(fighterNum==4206969){
              System.out.println("Player One's Team");
              for(int i=0; i<playerOne.get_team().size(); i++){
                System.out.println("Fighter " + i + ": " + playerOne.get_team().get(i).get_name());
              }
              System.out.println();
              System.out.println("Player Two's Team");
              for(int i=0; i<computer.get_team().size(); i++){
                System.out.println("Fighter " + i + ": " + computer.get_team().get(i).get_name());
              }
              System.out.println("Which fighter do you want to use?");
              fighterNum=readerTwo.nextInt();
            }
            currFighterPlay2=playerTwo.get_team().get(fighterNum);
            check=true;
          }
          catch (Exception e){
            System.out.println("Invalid input. Please enter the number of the fighter desired");
            System.out.println("Type 4206969 for the teams");
            readerTwo.nextLine();
            fighterNum=-600;
          }
        }
        System.out.println(currFighterPlay.get_name() + " vs " + currFighterAI.get_name());
        while(currFighterAI.get_health()>0 && currFighterAI.get_health()>0){
          Move tempMovePlay = new Move("temp", 0, true, 0);
          Move tempMoveAI = new Move("temp", 0, true, 0);
          answer = -5;
          boolean check2=false;
          System.out.println();
          System.out.println(currFighterPlay.get_name() + "'s Moveset: "); 
          System.out.println("Move 0: " +currFighterPlay.get_moveSet().get(0).get_name());
          System.out.println("Move 1: " +currFighterPlay.get_moveSet().get(1).get_name());
          System.out.println("Move 2: " +currFighterPlay.get_moveSet().get(2).get_name());
          System.out.println("Move 3: " +currFighterPlay.get_moveSet().get(3).get_name());
          System.out.println();
          while(check2==false){
            try{
              System.out.println("Which move do you want to use. Type -1 for complete discription of move");
              answer = readerTwo.nextInt();
              if(answer==-1){
                System.out.println("Move 0");
                System.out.println(currFighterPlay.get_moveSet().get(0));
                System.out.println();
                System.out.println("Move 1");
                System.out.println(currFighterPlay.get_moveSet().get(1));
                System.out.println();
                System.out.println("Move 2");
                System.out.println(currFighterPlay.get_moveSet().get(2));
                System.out.println();
                System.out.println("Move 3");
                System.out.println(currFighterPlay.get_moveSet().get(3));
                System.out.println();
                System.out.println("Which move do you want to use. Type -1 for complete discription of move");
                answer = readerTwo.nextInt();
              }
              check2=true;
            }
            catch (Exception e){
              System.out.println("Invalid input. Please enter a valid input");
              readerTwo.nextLine();
              answer=-90;
            }
          }
          int answer2 = -5;
          check2=false;
          System.out.println();
          System.out.println(currFighterAI.get_name() + "'s Moveset: "); 
          System.out.println("Move 0: " +currFighterAI.get_moveSet().get(0).get_name());
          System.out.println("Move 1: " +currFighterAI.get_moveSet().get(1).get_name());
          System.out.println("Move 2: " +currFighterAI.get_moveSet().get(2).get_name());
          System.out.println("Move 3: " +currFighterAI.get_moveSet().get(3).get_name());
          System.out.println();
          while(check2==false){
            try{
              System.out.println("Player Two");
              System.out.println("Which move do you want to use. Type -1 for complete discription of move");
              answer = readerTwo.nextInt();
              if(answer==-1){
                System.out.println("Move 0");
                System.out.println(currFighterAI.get_moveSet().get(0));
                System.out.println();
                System.out.println("Move 1");
                System.out.println(currFighterAI.get_moveSet().get(1));
                System.out.println();
                System.out.println("Move 2");
                System.out.println(currFighterAI.get_moveSet().get(2));
                System.out.println();
                System.out.println("Move 3");
                System.out.println(currFighterAI.get_moveSet().get(3));
                System.out.println();
                System.out.println("Which move do you want to use. Type -1 for complete discription of move");
                answer2 = readerTwo.nextInt();
              }
              check2=true;
            }
            catch (Exception e){
              System.out.println("Invalid input. Please enter a valid input");
              readerTwo.nextLine();
              answer2=-90;
            }
          }
          tempMovePlay = currFighterPlay.get_moveSet().get(answer);
          tempMoveAI = currFighterAI.get_moveSet().get(answer2);
          turn=true;
          
          if(currFighterPlay.get_speed()>currFighterAI.get_speed()){
            attacking(currFighterPlay, currFighterAI, tempMovePlay);
            turn=false;
            if(currFighterAI.get_health()<=0){
              break;
            }
          }
          else if(currFighterAI.get_speed()>currFighterPlay.get_speed()){
            attacking(currFighterAI, currFighterPlay, tempMoveAI);
            turn=true;
            if(currFighterPlay.get_health()<=0){
              break;
            }
          }
          
          if(turn==true){
            attacking(currFighterPlay, currFighterAI, tempMovePlay);
          }
          else if(turn==false){
            attacking(currFighterAI, currFighterPlay, tempMoveAI);
          }
          turn=true;
        }
        if(currFighterPlay.get_health()<=0){
          playerOne.get_team().remove(currFighterPlay);
          playerOne.get_team().trimToSize();
        } 
        if(currFighterAI.get_health()<=0){
          computer.get_team().remove(currFighterAI);
          computer.get_team().trimToSize();
        }
        System.out.println();
        System.out.println("Player One's Team:");
        for(int i=0; i<playerOne.get_team().size(); i++){
          System.out.print("Fighter " + i + ": ");
          System.out.println(playerOne.get_team().get(i).get_name());
        }
        System.out.println();
        System.out.println("Player Two's Team:");
        for(int i=0; i<computer.get_team().size(); i++){
          System.out.println(computer.get_team().get(i).get_name());
        }
        System.out.println();
      }
      
    }
  }
  
  
  public static void attacking(Fighter offense, Fighter defense, Move move){
    double damage=0;
    Random random =  new Random();
    boolean hit = true;
    double hitChance = move.get_accuracy()*100;
    int hitChanceInt = (int) hitChance;
    int hitOrNot = random.nextInt(100);
    if(hitOrNot<hitChanceInt){
      hit=true;
    }
    else {
      hit=false;
    }
    if(hit==true){
      if(move.get_basePower()>0){
        damage=(2*85 + 10/250 * offense.get_attack()/defense.get_defense()*move.get_basePower()+2);
      }
      move.set_powerPoints(move.get_powerPoints()-1);
      
      if(offense.get_type().equalsIgnoreCase("Brain") && defense.get_type().equalsIgnoreCase("Strength")){
        damage=damage*1.5;
      }
      else if(offense.get_type().equalsIgnoreCase("Strength") && defense.get_type().equalsIgnoreCase("speed")){
        damage=damage*1.5;
      }
      else if(offense.get_type().equalsIgnoreCase("speed") && defense.get_type().equalsIgnoreCase("brain")){
        damage=damage*1.5;
      }
      else if(offense.get_type().equalsIgnoreCase("Strength") && defense.get_type().equalsIgnoreCase("brain")){
        damage=damage*0.75;
      }
      else if(offense.get_type().equalsIgnoreCase("brain") && defense.get_type().equalsIgnoreCase("speed")){
        damage=damage*0.75;
      }
      else if(offense.get_type().equalsIgnoreCase("speed") && defense.get_type().equalsIgnoreCase("strength")){
        damage=damage*0.75;
      }
      defense.set_health(defense.get_health()-damage);
      move.modify(offense);
      System.out.println(offense.get_name() + " used " + move.get_name());
      System.out.println("This move has " + move.get_powerPoints() + "pp left");
      if(move.get_powerPoints()==0){
        offense.get_moveSet().remove(move);
        System.out.println(offense.get_name() + " has ran out of powerpoints for " + move.get_name());
        System.out.println(move.get_name() + "can no longer be used");
      }
      String tempModType=move.get_modifyType();
      if(move.get_modifiers()==true){
        if(tempModType.contains("attack")){
          System.out.println(offense.get_name() + "'s attack is now " + offense.get_attack());
          tempModType=tempModType.substring(5);
        }
        
        if(tempModType.contains("defense")){
          System.out.println(offense.get_name() + "'s defense is now " + offense.get_defense());
          tempModType=tempModType.substring(6);
        }
        
        if(tempModType.contains("speed")){
          System.out.println(offense.get_name() + "'s speed is now " + offense.get_speed());
          tempModType=tempModType.substring(4);
        }
      }
      if(move.get_basePower()>0){
        System.out.println(offense.get_name() + " dealt " + damage + "damage");
      }
      
      move.regenHealth(move.get_regen(), offense);
      
      if(defense.get_health()<0){
        defense.set_health(0);
      }
    }
    else{
      System.out.println(offense.get_name() + " unfortunately missed");
    }
    System.out.println(offense.get_name() + "'s health: " + offense.get_health());
    System.out.println(defense.get_name() + "'s health: " + defense.get_health());
  }  
}
