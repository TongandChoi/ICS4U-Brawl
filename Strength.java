class Strength extends Fighter{
  private String type;
   
  Strength(String name){
    super(name);
    type="Strength";
  }
  
  public String get_type(){
    return type;
  }
  
  public void set_name(String name) {
    this.name = name;
  }
  
  public void frenzy(Fighter fighter, boolean check){
    if(fighter.get_health()<fighter.get_defaultHealth()*0.4){
      fighter.set_attack(fighter.get_attack()*2);
      for(int i=0 ; i<fighter.get_moveSet().size(); i++){
        fighter.get_moveSet().get(i).set_accuracy(fighter.get_moveSet().get(i).get_accuracy()-0.05);
      }
      System.out.println("Ability activated: Frenzy");
      System.out.println("Attack increase by 2*");
      System.out.println(fighter.get_name() + "'s attack is now " + fighter.get_attack());
      System.out.println("Accuracy for all moves are decreased by 5%");
      }
    }
  }
                         