import java.util.*;
import java.io.*;

class Team{
  ArrayList<Fighter> team = new ArrayList<Fighter>();
  private boolean player;
  
  Team(boolean player){
    this.player=player;
  }
  
  public void addFighter(Fighter fighter){
    if(team.size()<3){
      team.add(fighter);
    }
    else if(team.size()>3){
      System.out.println("Your team is full");
    }
  }
  
  public ArrayList<Fighter> get_team() {
    return team;
  }
}
