import java.io.*;
import java.util.*;

class Fighter{
  private String name;
  private String type;
  private double attack;
  private double defense;
  private double speed;
  private double health;
  private double defaultHealth;
  ArrayList<Move> moveSet = new ArrayList<Move>();

  Fighter(String name, String type){
    this.name=name;
    this.type=type;
  }
  
  public void set_attack(double attack){
    this.attack=attack;
  }
  
  public void set_defense(double defense){
    this.defense=defense;
  }
  
  public void set_speed(double speed){
    this.speed=speed;
  }
  
  public void set_health(double health){
    this.health=health;
  }
  
  public void set_defaultHealth(double defaultHealth){
    this.defaultHealth=defaultHealth;
  }
  
  public String get_name(){
    return name;
  }
  
  public double get_attack(){
    return attack;
  }
  
  public double get_defense(){
    return defense;
  }
  
  public double get_speed(){
    return speed;
  }
  
  public double get_health(){
    return health;
  }
  
  public double get_defaultHealth(){
    return defaultHealth;
  }
  
  
  public String get_type(){
    return type;
  }
  
  public void addMove(Move move){
    moveSet.add(move);
  }
  
  public ArrayList<Move> get_moveSet(){
    return moveSet;
  } 
  
  public String toString(){
    String returnString=" ";
    returnString="Name: " + name;
//    returnString+="\nType: " + type;
//    returnString+="\nHealth: " + health;
//    returnString+="\nAttack: " + attack;
//    returnString+="\nDefense: " + defense;
//    returnString+="\nSpeed: " + speed;
//    returnString+="\n" + moveSet.get(0);
//    returnString+="\n" + moveSet.get(1);
//    returnString+="\n" + moveSet.get(2);
//    returnString+="\n" + moveSet.get(3);
    return returnString;
  }
}
