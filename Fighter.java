import java.io.*;
import java.util.*;

class Fighter{
  protected String name;
  protected double attack;
  protected double defense;
  protected double speed;
  protected double health;
  protected double defaultHealth;
  protected String type;
  ArrayList<Move> moveSet = new ArrayList<Move>();

  Fighter(String name){
    this.name=name;
  }
  
  public void set_attack(double attack){
    this.attack=attack;
  }
  
  public void set_type(String type){
    this.type=type;
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
  
  
}
