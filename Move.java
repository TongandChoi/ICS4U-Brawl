class Move{
  private String name;
  private double basePower;
  private boolean modifiers;
  private int powerPoints;
  private String modifyType;
  private double modifyDegree;
  private double modifyDegreeTwo;
  private double accuracy;
  private String regen;
  private boolean asleep;
  
  Move(String name, double basePower, boolean modifiers, int powerPoints){
    this.name=name;
    this.basePower=basePower;
    this.modifiers=modifiers;
    this.powerPoints=powerPoints;
  }
  
  public void set_powerPoints(int powerPoints){
    this.powerPoints=powerPoints;
  }
  
  public void set_modifyType(String modifyType){
    this.modifyType=modifyType;
  }
  
  public void set_modifyDegree(double modifyDegree){
    this.modifyDegree=modifyDegree;
  }
  
  public void set_modifyDegreeTwo(double modifyDegreeTwo){
    this.modifyDegreeTwo=modifyDegreeTwo;
  }
  
  public void set_accuracy(double accuracy){
    this.accuracy=accuracy;
  }
  
  public void set_regen(String regen){
    this.regen=regen;
  }
  
  public void set_asleep(boolean asleep){
    this.asleep=asleep;
  }
  
  public String get_name(){
    return name;
  }
  
  public double get_basePower(){
    return basePower; 
  }
  
  public boolean get_modifiers(){
    return modifiers;
  }
  
  public int get_powerPoints(){
    return powerPoints;
  }
  
  public String get_modifyType(){
    return modifyType;
  }
  
  public double get_modifyDegree(){
    return modifyDegree;
  }
  
  public double get_modifyDegreeTwo(){
    return modifyDegreeTwo;
  }
  
  public double get_accuracy(){
    return accuracy;
  }
  
  public String get_regen(){
    return regen;
  }
  
  public boolean get_asleep(){
    return asleep;
  }
  
  public void regenHealth(String regen, Fighter fighter){
    if(regen.equalsIgnoreCase("yes")){
      fighter.set_health(fighter.get_defaultHealth());
    } 
    else if(regen.equalsIgnoreCase("no")){
      fighter.set_health(fighter.get_health()/2);
    }
    else if(regen.equalsIgnoreCase("death")){
      fighter.set_health(0);
    }
  }
  
  public void modify(Fighter fighter){
    if(modifiers==true){
      if(modifyType.contains("attack")==true){
        fighter.set_attack(fighter.get_attack()*modifyDegree);
        modifyType=modifyType.substring(1);
      } 
      else if(modifyType.contains("defense")==true){
        fighter.set_defense(fighter.get_defense()*modifyDegree);
        modifyType=modifyType.substring(1);
      }
      else if(modifyType.contains("speed")==true){
        fighter.set_speed(fighter.get_speed()*modifyDegree);
        modifyType=modifyType.substring(1);
      }
      
      if(modifyType.contains("attack")==true){
        fighter.set_attack(fighter.get_attack()*modifyDegreeTwo);
      } 
      else if(modifyType.contains("defense")==true){
        fighter.set_defense(fighter.get_defense()*modifyDegreeTwo);
      }
      else if(modifyType.contains("speed")==true){
        fighter.set_speed(fighter.get_speed()*modifyDegreeTwo);
      }
    }
  }
  public String toString(){
    String tempModType=modifyType;
    String returnString="Move Name: " + name;
    returnString+="\nBase Power: " + basePower;
    returnString+="\nPower Points: " + powerPoints;
    if(modifiers==true){
      returnString+="\nModifies ";
      if(tempModType.contains("attack")){
        returnString+="attack by a factor of " + modifyDegree;
        tempModType=tempModType.substring(1);
      }
      else if(tempModType.contains("defense")){
        returnString+="defense by a factor of " + modifyDegree;
        tempModType=tempModType.substring(1);
      }
      else if(tempModType.contains("speed")){
        returnString+="speed by a factor of " + modifyDegree;
        tempModType=tempModType.substring(1);
      }
      if(tempModType.contains("attack")){
        returnString+="\nModifiesattack by a factor of " + modifyDegreeTwo;
      }
      else if(tempModType.contains("defense")){
        returnString+="\nModifies defense by a factor of " + modifyDegreeTwo;
      }
      else if(tempModType.contains("speed")){
        returnString+="\nModifies speed by a factor of " + modifyDegreeTwo;
      }
    }
    
    if(regen.equalsIgnoreCase("yes")){
      returnString+="\nFully Restores health";
    } 
    else if(regen.equalsIgnoreCase("no")){
      returnString+="\nCuts health in half";
    }
    else if(regen.equalsIgnoreCase("death")){
      returnString+="\nSets health to zero";
    }
    
    if(asleep==true){
      returnString+="\nFalls asleep for two rounds";
    }
    
    return returnString;
  }
}



