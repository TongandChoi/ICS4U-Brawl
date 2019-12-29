class Move{
  private String name;
  private double basePower;
  private boolean modifiers;
  private int powerPoints;
  private String modifyType;
  private double modifyDegree;
  
  
  Move(String name, double basePower, boolean modifiers, int powerPoints){
    this.name=name;
    this.basePower=basePower;
    this.modifiers=modifiers;
    this.powerPoints=powerPoints;
  }
  
  public void set_modifyType(String modifyType){
    this.modifyType=modifyType;
  }
  
  public void set_modifyDegree(double modifyDegree){
    this.modifyDegree=modifyDegree;
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
  
  public void modify(Fighter fighter){
    if(modifiers==true){
      if(modifyType.equalsIgnoreCase("Attack")){
        fighter.set_attack(fighter.get_attack()*modifyDegree);
      } 
      else if(modifyType.equalsIgnoreCase("Defense")){
        fighter.set_defense(fighter.get_defense()*modifyDegree);
      }
      else if(modifyType.equalsIgnoreCase("Speed")){
        fighter.set_speed(fighter.get_speed()*modifyDegree);
      }
    }
  }
}
  
  
  