class Brain extends Fighter{
  private String type;
   
  Brain(String name){
    super(name);
    type="Brain";
  }
  
  public void highIQ(Fighter fighter, boolean check){
    if(fighter.get_health()<fighter.get_defaultHealth()*0.3 && check==true){
      fighter.set_attack(fighter.get_attack()*2);
      System.out.println("Ability activated: HighIQ");
      System.out.println("Attack increases by 2*");
      System.out.println(fighter.get_name() + "'s attack is now " + fighter.get_attack());
      check=false;
    }
  }
  
  public String get_type(){
    return type;
  }
  
  public String toString(){
    String returnString=" ";
    returnString="Name: " + name;
    returnString+="\nType: " + type;
    returnString+="\nHealth: " + health;
    returnString+="\nAttack: " + attack;
    returnString+="\nDefense: " + defense;
    returnString+="\nSpeed: " + speed;
    returnString+="\n" + moveSet.get(0);
    returnString+="\n" + moveSet.get(1);
    returnString+="\n" + moveSet.get(2);
    returnString+="\n" + moveSet.get(3);
    return returnString;
  }
}
                         