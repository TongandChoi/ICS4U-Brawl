import java.io.*;
import java.util.*;

class Fighter{
  private String name;
  private String type;
  private double attack;
  private double defense;
  private double speed;
  private double health;
  ArrayList<Move> moveSet = new ArrayList<Move>();
  
  Fighter(String name, String type, double health, double attack, double defense, double speed){
    this.name=name;
    this.type=type;
    this.health = health;
    this.attack = attack;
    this.defense = defense;
    this.speed = speed;
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
    returnString+="\nType: " + type;
    returnString+="\nHealth: " + health;
    returnString+="\nAttack: " + attack;
    returnString+="\nDefense: " + defense;
    returnString+="\nSpeed: " + speed;
    return returnString;
  }
}
