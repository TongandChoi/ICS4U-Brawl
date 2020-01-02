import java.util.*;
import java.io.*;

class FighterList {
  private Fighter rohit;
  private Fighter jason;
  private Fighter sadiq;
  private Fighter chung;
  private Fighter arman;
  private Fighter kai;
  private Fighter kai_xiang;
  private Fighter mahyar;
  private Fighter ethan;
  private Fighter frank;
  private Fighter tobe;
  private Fighter sean;
  private Fighter wilson;
  private Fighter chu;
  
  FighterList() {
    
    rohit = new Fighter ("Rohit", "Speed");
    rohit.set_attack(160);
    rohit.set_defense(100);
    rohit.set_speed(185);
    rohit.set_health(120);
    
    jason = new Fighter ("Jason", "Speed");
    jason.set_attack(170);
    jason.set_defense(95);
    jason.set_speed(190);
    jason.set_health(140);
    
    sadiq = new Fighter ("Sadiq", "Speed");
    sadiq.set_attack(150);
    sadiq.set_defense(110);
    sadiq.set_speed(185);
    sadiq.set_health(150);
    
    chung = new Fighter ("Nathan", "Speed");
    chung.set_attack(175);
    chung.set_defense(120);
    chung.set_speed(190);
    chung.set_health(130);
    
    arman = new Fighter ("Arman", "Speed");
    arman.set_attack(175);
    arman.set_defense(85);
    arman.set_speed(195);
    arman.set_health(100);
    
    
    kai = new Fighter ("Kai", "Brain");
    kai.set_attack(190);
    kai.set_defense(110);
    kai.set_speed(120);
    kai.set_health(145);
    
    kai_xiang = new Fighter ("Kai Xiang", "Brain");
    kai_xiang.set_attack(160);
    kai_xiang.set_defense(100);
    kai_xiang.set_speed(185);
    kai_xiang.set_health(120);
    
    mahyar = new Fighter ("Mahyar", "Brain");
    mahyar.set_attack(185);
    mahyar.set_defense(120);
    mahyar.set_speed(130);
    mahyar.set_health(145);
    
    ethan = new Fighter ("Ethan", "Brain");
    ethan.set_attack(185);
    ethan.set_defense(175);
    ethan.set_speed(100);
    ethan.set_health(130);
    
    frank = new Fighter ("Frank", "Brain");
    frank.set_attack(195);
    frank.set_defense(115);
    frank.set_speed(150);
    frank.set_health(110);
    
    
    tobe = new Fighter ("Tobe", "Strength");
    tobe.set_attack(175);
    tobe.set_defense(195);
    tobe.set_speed(85);
    tobe.set_health(180);
    
    sean = new Fighter ("Sean", "Strength");
    sean.set_attack(180);
    sean.set_defense(185);
    sean.set_speed(95);
    sean.set_health(180);
    
    wilson = new Fighter ("Wilson", "Strength");
    wilson.set_attack(170);
    wilson.set_defense(190);
    wilson.set_speed(120);
    wilson.set_health(120);
    
    
    chu = new Fighter  ("Mr. Chu", "Speed & Strength & Brain");
    chu.set_attack(250);
    chu.set_defense(120);
    chu.set_speed(250);
    chu.set_health(200);
  }
  
  public Fighter get_rohit(){
    return rohit;
  }
  public Fighter get_jason(){
    return jason;
  }
  public Fighter get_sadiq(){
    return sadiq;
  }
  public Fighter get_chung(){
    return chung;
  }
  public Fighter get_arman(){
    return arman;
  }
  public Fighter get_kai(){
    return kai;
  }
  public Fighter get_kai_xiang(){
    return kai_xiang;
  }
  public Fighter get_mahyar(){
    return mahyar;
  }
  public Fighter get_ethan(){
    return ethan;
  }
  public Fighter get_frank(){
    return frank;
  }
  public Fighter get_tobe(){
    return tobe;
  }
  public Fighter get_sean(){
    return sean;
  }
  public Fighter get_wilson(){
    return wilson;
  }
  public Fighter get_chu(){
    return chu;
  }
  
}