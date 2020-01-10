class Speed extends Fighter{
  private String type;
  
  Speed(String name){
    super(name);
    type="Speed";
  }
  
  public String get_type(){
    return type;
  }
  
  public void lightShield(Fighter fighter, boolean check){
    if(fighter.get_health()>fighter.get_defaultHealth()*0.4 && check==true){
       fighter.set_defense(fighter.get_defense()*2);
      System.out.println("Ability activated: Light Shield");
      System.out.println("Defense increases by 2*");
      System.out.println(fighter.get_name() + "'s defense is now " + fighter.get_defense());
      check=false;
    }
  }
}