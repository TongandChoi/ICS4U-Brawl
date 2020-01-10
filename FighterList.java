import java.util.*;
import java.io.*;

class FighterList {
  MoveList moveList = new MoveList();
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
  private Fighter brian;
  
  FighterList() {
    brian = new Brain ("Brian Widjaja");
    brian.set_attack(200);
    brian.set_defense(100);
    brian.set_speed(100);
    brian.set_health(145*3);
    brian.set_defaultHealth(145*3);
    brian.addMove(moveList.get_explosion());
    brian.addMove(moveList.get_sockeyKick());
    brian.addMove(moveList.get_brainBoost());
    brian.addMove(moveList.get_hacking());
    
    rohit = new Speed ("Rohit Unni");
    rohit.set_attack(160);
    rohit.set_defense(100);
    rohit.set_speed(185);
    rohit.set_health(120*3);
    rohit.addMove(moveList.get_rockClimb());
    rohit.addMove(moveList.get_buzzcut());
    rohit.addMove(moveList.get_slacking());
    rohit.addMove(moveList.get_pianoFlex());
    
    jason = new Speed ("Jason Deng");
    jason.set_attack(170);
    jason.set_defense(95);
    jason.set_speed(190);
    jason.set_health(140*3);
    jason.set_defaultHealth(140*3);
    jason.addMove(moveList.get_rockClimb());
    jason.addMove(moveList.get_vaping());
    jason.addMove(moveList.get_slacking());
    jason.addMove(moveList.get_hatToss());
    
    sadiq = new Speed ("Sadiq Hussain");
    sadiq.set_attack(150);
    sadiq.set_defense(110);
    sadiq.set_speed(185);
    sadiq.set_health(150*3);
    sadiq.set_defaultHealth(150*3);
    sadiq.addMove(moveList.get_tower());
    sadiq.addMove(moveList.get_block());
    sadiq.addMove(moveList.get_curryToss());
    sadiq.addMove(moveList.get_drive());
    
    chung = new Speed ("Nathan Chung");
    chung.set_attack(175);
    chung.set_defense(120);
    chung.set_speed(190);
    chung.set_health(130*3);
    chung.set_defaultHealth(130*3);
    chung.addMove(moveList.get_drive());
    chung.addMove(moveList.get_doneNo());
    chung.addMove(moveList.get_cheesed());
    chung.addMove(moveList.get_ranOver());
    
    arman = new Speed ("Arman Shariff");
    arman.set_attack(175);
    arman.set_defense(85);
    arman.set_speed(200);
    arman.set_health(140*3);
    arman.set_defaultHealth(140*3);
    arman.addMove(moveList.get_hug());
    arman.addMove(moveList.get_sockeyKick());
    arman.addMove(moveList.get_haxball());
    arman.addMove(moveList.get_brainBoost());
    
    
    kai = new Brain ("Kai Xu");
    kai.set_attack(190);
    kai.set_defense(110);
    kai.set_speed(120);
    kai.set_health(145*3);
    kai.set_defaultHealth(145*3);
    kai.addMove(moveList.get_kaiAttack());
    kai.addMove(moveList.get_drive());
    kai.addMove(moveList.get_hacking());
    kai.addMove(moveList.get_brainBoost());
    
    kai_xiang = new Brain ("Kai Xiang Xu");
    kai_xiang.set_attack(160);
    kai_xiang.set_defense(100);
    kai_xiang.set_speed(185);
    kai_xiang.set_health(145*3);
    kai_xiang.set_defaultHealth(145*3);
    kai_xiang.addMove(moveList.get_kaiAttack());
    kai_xiang.addMove(moveList.get_chopSticks());
    kai_xiang.addMove(moveList.get_hacking());
    kai_xiang.addMove(moveList.get_brainBoost());
    
    mahyar = new Brain ("Mahyar Tajeri");
    mahyar.set_attack(185);
    mahyar.set_defense(120);
    mahyar.set_speed(130);
    mahyar.set_health(145*3);
    mahyar.set_defaultHealth(145*3);
    mahyar.addMove(moveList.get_brainBoost());
    mahyar.addMove(moveList.get_snipe());
    mahyar.addMove(moveList.get_roast());
    mahyar.addMove(moveList.get_cancelHops());
    
    ethan = new Brain ("Ethan Ham");
    ethan.set_attack(185);
    ethan.set_defense(175);
    ethan.set_speed(100);
    ethan.set_health(150*3);
    ethan.set_defaultHealth(150*3);
    ethan.addMove(moveList.get_brainBoost());
    ethan.addMove(moveList.get_serenade());
    ethan.addMove(moveList.get_guitarSmash());
    ethan.addMove(moveList.get_sockeyKick());
    
    frank = new Brain ("Frank Kong");
    frank.set_attack(195);
    frank.set_defense(115);
    frank.set_speed(150);
    frank.set_health(110*3);
    frank.set_defaultHealth(110*3);
    frank.addMove(moveList.get_outSmart());
    frank.addMove(moveList.get_brainBoost());
    frank.addMove(moveList.get_grab());
    frank.addMove(moveList.get_haxball());
    
    tobe = new Strength ("Tobe");
    tobe.set_attack(175);
    tobe.set_defense(195);
    tobe.set_speed(85);
    tobe.set_health(180*3);
    tobe.set_defaultHealth(180*3);
    tobe.addMove(moveList.get_hairFlick());
    tobe.addMove(moveList.get_armWrestle());
    tobe.addMove(moveList.get_pokerResearch());
    tobe.addMove(moveList.get_confiscated());
    
    sean = new Strength ("Sean Hua");
    sean.set_attack(180);
    sean.set_defense(185);
    sean.set_speed(95);
    sean.set_health(180*3);
    sean.set_defaultHealth(180*3);
    sean.addMove(moveList.get_maxOut());
    sean.addMove(moveList.get_preWorkout());
    sean.addMove(moveList.get_drive());
    sean.addMove(moveList.get_skipLegs());
    
    wilson = new Strength ("Wilson Tan");
    wilson.set_attack(170);
    wilson.set_defense(190);
    wilson.set_speed(120);
    wilson.set_health(120*3);
    wilson.set_defaultHealth(120*3);
    wilson.addMove(moveList.get_brawl());
    wilson.addMove(moveList.get_procrasinate());
    wilson.addMove(moveList.get_grab());
    wilson.addMove(moveList.get_chopSticks());
    
    
    chu = new Brain ("Mr. Chu");
    chu.set_attack(250);
    chu.set_defense(120);
    chu.set_speed(250);
    chu.set_health(200*3);
    chu.set_defaultHealth(140*3);
    chu.addMove(moveList.get_roast());
    chu.addMove(moveList.get_hacking());
    chu.addMove(moveList.get_outSmart());
    chu.addMove(moveList.get_posterize());
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
  
  public Fighter get_brian(){
    return brian;
  }
  
}
