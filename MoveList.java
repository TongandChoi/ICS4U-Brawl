class MoveList{
  private Move buzzcut;
  private Move vaping;
  private Move rockClimb;
  private Move pianoFlex;
  private Move slacking;
  private Move hatToss;
  private Move tower;
  private Move block;
  private Move curryToss;
  private Move kaiAttack;
  private Move hearthStone;
  private Move brainBoost;
  private Move chopSticks;
  private Move bowlCut;
  private Move hacking;
  private Move haxball;
  private Move procrasinate;
  private Move brawl;
  private Move cancelHops;
  private Move roast;
  private Move snipe;
  private Move hairFlick;
  private Move armWrestle;
  private Move pokerResearch;
  private Move confiscated;
  private Move skipLegs;
  private Move maxOut;
  private Move preWorkout;
  private Move ranOver;
  private Move cheesed;
  private Move doneNo;
  private Move drive;
  private Move sockeyKick;
  private Move hug;
  private Move guitarSmash;
  private Move outSmart;
  private Move grab;
  private Move explosion;
  private Move serenade;
  private Move posterize;
  private Move doughnut;
  
  MoveList(){
    brawl= new Move("Brawl", 85, false, 10);
    brawl.set_modifyType("");
    brawl.set_modifyDegree(1);
    brawl.set_modifyDegreeTwo(1);
    brawl.set_regen("Hi");
    brawl.set_asleep(false);
    brawl.set_accuracy(1);
    
    
    buzzcut = new Move("Buzzcut", 0, true, 10);
    buzzcut.set_modifyType("attackspeed");
    buzzcut.set_modifyDegree(2);
    buzzcut.set_modifyDegreeTwo(3);
    buzzcut.set_regen("no");
    buzzcut.set_asleep(false);
    buzzcut.set_accuracy(1);
    
    rockClimb = new Move("Rock Climbing", 80, true, 10);
    rockClimb.set_modifyType("attackspeed");
    rockClimb.set_modifyDegree(1.5);
    rockClimb.set_modifyDegreeTwo(3);
    rockClimb.set_regen("Hi");
    rockClimb.set_asleep(false);
    rockClimb.set_accuracy(0.9);
    
    pianoFlex = new Move("Piano Flex", 60, true, 10);
    pianoFlex.set_modifyType("attack");
    pianoFlex.set_modifyDegree(2);
    pianoFlex.set_modifyDegreeTwo(1);
    pianoFlex.set_regen("Hi");
    pianoFlex.set_asleep(false);
    pianoFlex.set_accuracy(1);
    
    slacking = new Move("Slacking", 0, false, 10);
    slacking.set_modifyType("Hi");
    slacking.set_modifyDegree(1);
    slacking.set_modifyDegreeTwo(1);
    slacking.set_regen("yes");
    slacking.set_asleep(true);
    slacking.set_accuracy(1);
    
    doughnut = new Move("Doughnut", 100, false, 10);
    doughnut.set_modifyType("attack");
    doughnut.set_modifyDegree(1.5);
    doughnut.set_modifyDegreeTwo(1);
    doughnut.set_regen("Hi");
    doughnut.set_asleep(false);
    doughnut.set_accuracy(1);
    
    hatToss = new Move("Hat Toss", 75, false, 10);
    hatToss.set_modifyType("Hi");
    hatToss.set_modifyDegree(1);
    hatToss.set_modifyDegreeTwo(1);
    hatToss.set_regen("Hi");
    hatToss.set_asleep(false);
    hatToss.set_accuracy(1);
    
    vaping = new Move("Vaping", 0, true, 10);
    vaping.set_modifyType("attackdefense");
    vaping.set_modifyDegree(0.75);
    vaping.set_modifyDegreeTwo(2);
    vaping.set_regen("Hi");
    vaping.set_asleep(false);
    vaping.set_accuracy(1);
    
    tower = new Move("Tower", 0, true, 10);
    tower.set_modifyType("attackdefense");
    tower.set_modifyDegree(2);
    tower.set_modifyDegreeTwo(2);
    tower.set_regen("Hi");
    tower.set_asleep(false);
    tower.set_accuracy(0.75);
    
    explosion = new Move("Explosion", 250, false, 100);
    explosion.set_modifyType("Hi");
    explosion.set_modifyDegree(1);
    explosion.set_modifyDegreeTwo(1);
    explosion.set_regen("death");
    explosion.set_asleep(false);
    explosion.set_accuracy(1);
    
    block = new Move("Block", 80, true, 10);
    block.set_modifyType("attack");
    block.set_modifyDegree(1.25);
    block.set_modifyDegreeTwo(1);
    block.set_regen("Hi");
    block.set_asleep(false);
    block.set_accuracy(0.9);
    
    kaiAttack = new Move("Kai-Attack", 100, false, 10);
    kaiAttack.set_modifyType("Hi");
    kaiAttack.set_modifyDegree(1);
    kaiAttack.set_modifyDegreeTwo(1);
    kaiAttack.set_regen("Hi");
    kaiAttack.set_asleep(false);
    kaiAttack.set_accuracy(0.9);
    
    hearthStone = new Move("Hearthstone", 0, true, 10);
    hearthStone.set_modifyType("attack");
    hearthStone.set_modifyDegree(3);
    hearthStone.set_modifyDegreeTwo(1);
    hearthStone.set_regen("Hi");
    hearthStone.set_asleep(true);
    hearthStone.set_accuracy(1);
    
    brainBoost= new Move("Brain Boost", 0, true, 10);
    brainBoost.set_modifyType("attackdefense");
    brainBoost.set_modifyDegree(2);
    brainBoost.set_modifyDegreeTwo(0.75);
    brainBoost.set_regen("Hi");
    brainBoost.set_asleep(false);
    brainBoost.set_accuracy(1);
    
    hacking = new Move("Hacking", 100, false, 10);
    hacking.set_modifyType("Hi");
    hacking.set_modifyDegree(1);
    hacking.set_modifyDegreeTwo(1);
    hacking.set_regen("Hi");
    hacking.set_asleep(false);
    hacking.set_accuracy(0.9);
    
    chopSticks = new Move("Chopsticks", 85, true, 14);
    chopSticks.set_modifyType("attack");
    chopSticks.set_modifyDegree(3);
    chopSticks.set_modifyDegreeTwo(1);
    chopSticks.set_regen("Hi");
    chopSticks.set_asleep(false);
    chopSticks.set_accuracy(1);
    
    bowlCut = new Move("Bowlcut", 0, true, 10);
    bowlCut.set_modifyType("defense");
    bowlCut.set_modifyDegree(2);
    bowlCut.set_modifyDegreeTwo(1);
    bowlCut.set_regen("Hi");
    bowlCut.set_asleep(false);
    bowlCut.set_accuracy(1);
    
    haxball = new Move("HaxBall", 95, false, 10);
    haxball.set_modifyType("Hi");
    haxball.set_modifyDegree(1);
    haxball.set_modifyDegreeTwo(1);
    haxball.set_regen("Hi");
    haxball.set_asleep(false);
    haxball.set_accuracy(1);
    
    procrasinate= new Move("Procrasinate", 0, true, 10);
    procrasinate.set_modifyType("attackspeed");
    procrasinate.set_modifyDegree(0.75);
    procrasinate.set_modifyDegreeTwo(1.5);
    procrasinate.set_regen("Hi");
    procrasinate.set_asleep(false);
    procrasinate.set_accuracy(1);
    
    cancelHops = new Move("Cancel Hops", 0, true, 10);
    cancelHops.set_modifyType("attackspeed");
    cancelHops.set_modifyDegree(4);
    cancelHops.set_modifyDegreeTwo(0.6);
    cancelHops.set_regen("Hi");
    cancelHops.set_asleep(false);
    cancelHops.set_accuracy(1);
    
    roast = new Move("Roast", 75, true, 5);
    roast.set_modifyType("attack");
    roast.set_modifyDegree(3);
    roast.set_modifyDegreeTwo(1);
    roast.set_regen("Hi");
    roast.set_asleep(false);
    roast.set_accuracy(0.75);
    
    snipe = new Move("Snipe", 130, false, 3);
    snipe.set_modifyType("Hi");
    snipe.set_modifyDegree(1);
    snipe.set_modifyDegreeTwo(1);
    snipe.set_regen("Hi");
    snipe.set_asleep(false);
    snipe.set_accuracy(1);
    
    hairFlick = new Move("Hair Flick", 85, true, 10);
    hairFlick.set_modifyType("defense");
    hairFlick.set_modifyDegree(2);
    hairFlick.set_modifyDegreeTwo(1);
    hairFlick.set_regen("Hi");
    hairFlick.set_asleep(false);
    hairFlick.set_accuracy(0.85);
    
    armWrestle = new Move("Arm Wrestle", 100, false, 8);
    armWrestle.set_modifyType("Hi");
    armWrestle.set_modifyDegree(1);
    armWrestle.set_modifyDegreeTwo(1);
    armWrestle.set_regen("Hi");
    armWrestle.set_asleep(false);
    armWrestle.set_accuracy(0.9);
    
    pokerResearch = new Move("Poker Research", 0, true, 10);
    pokerResearch.set_modifyType("attackdefense");
    pokerResearch.set_modifyDegree(2);
    pokerResearch.set_modifyDegreeTwo(0.5);
    pokerResearch.set_regen("Hi");
    pokerResearch.set_asleep(false);
    pokerResearch.set_accuracy(1);
    
    confiscated= new Move("Confiscated", 0, true, 10);
    confiscated.set_modifyType("attackdefense");
    confiscated.set_modifyDegree(2);
    confiscated.set_modifyDegreeTwo(0.4);
    confiscated.set_regen("Hi");
    confiscated.set_asleep(false);
    confiscated.set_accuracy(1);
     
    skipLegs= new Move("Skip Legs", 0, true, 10);
    skipLegs.set_modifyType("attackdefense");
    skipLegs.set_modifyDegree(3);
    skipLegs.set_modifyDegreeTwo(0.75);
    skipLegs.set_regen("Hi");
    skipLegs.set_asleep(false);
    skipLegs.set_accuracy(1);
    
    maxOut = new Move("MaxOut", 160, false, 5);
    maxOut.set_modifyType("attack");
    maxOut.set_modifyDegree(0.75);
    maxOut.set_modifyDegreeTwo(1);
    maxOut.set_regen("Hi");
    maxOut.set_asleep(false);
    maxOut.set_accuracy(0.75);
    
    preWorkout= new Move("PreWorkout", 0, true, 2);
    preWorkout.set_modifyType("attackdefense");
    preWorkout.set_modifyDegree(3);
    preWorkout.set_modifyDegreeTwo(3);
    preWorkout.set_regen("Hi");
    preWorkout.set_asleep(false);
    preWorkout.set_accuracy(1);
    
    cheesed = new Move("Cheesed", 0, true, 10);
    cheesed.set_modifyType("attackdefense");
    cheesed.set_modifyDegree(2);
    cheesed.set_modifyDegreeTwo(0.5);
    cheesed.set_regen("Hi");
    cheesed.set_asleep(false);
    cheesed.set_accuracy(1);
    
    drive = new Move("Drive", 0, true, 4);
    drive.set_modifyType("attackspeed");
    drive.set_modifyDegree(2);
    drive.set_modifyDegreeTwo(2);
    drive.set_regen("Hi");
    drive.set_asleep(false);
    drive.set_accuracy(1);
    
    doneNo= new Move("Done No", 95, false, 10);
    doneNo.set_modifyType("Hi");
    doneNo.set_modifyDegree(1);
    doneNo.set_modifyDegreeTwo(1);
    doneNo.set_regen("Hi");
    doneNo.set_asleep(false);
    doneNo.set_accuracy(1);
    
    sockeyKick= new Move("Sockey Kick", 90, false, 10);
    sockeyKick.set_modifyType("Hi");
    sockeyKick.set_modifyDegree(1);
    sockeyKick.set_modifyDegreeTwo(1);
    sockeyKick.set_regen("Hi");
    sockeyKick.set_asleep(false);
    sockeyKick.set_accuracy(0.95);
    
    hug= new Move("Hug", 100, true, 10);
    hug.set_modifyType("attack");
    hug.set_modifyDegree(1.5);
    hug.set_modifyDegreeTwo(1);
    hug.set_regen("Hi");
    hug.set_asleep(false);
    hug.set_accuracy(0.9);
   
    guitarSmash = new Move("Guitar Smash", 95, false, 10);
    guitarSmash.set_modifyType("Hi");
    guitarSmash.set_modifyDegree(1);
    guitarSmash.set_modifyDegreeTwo(1);
    guitarSmash.set_regen("Hi");
    guitarSmash.set_asleep(false);
    guitarSmash.set_accuracy(1);
    
    serenade = new Move("Serenade", 00, true, 10);
    serenade.set_modifyType("attack");
    serenade.set_modifyDegree(2);
    serenade.set_modifyDegreeTwo(1);
    serenade.set_regen("Hi");
    serenade.set_asleep(false);
    serenade.set_accuracy(1);
    
    outSmart= new Move("Outsmart", 100, true, 6);
    outSmart.set_modifyType("attackspeed");
    outSmart.set_modifyDegree(2);
    outSmart.set_modifyDegreeTwo(2);
    outSmart.set_regen("Hi");
    outSmart.set_asleep(false);
    outSmart.set_accuracy(0.75);
    
    grab = new Move("Grab", 80, false, 10);
    grab.set_modifyType("Hi");
    grab.set_modifyDegree(1);
    grab.set_modifyDegreeTwo(1);
    grab.set_regen("Hi");
    grab.set_asleep(false);
    grab.set_accuracy(0.9);
    
    procrasinate = new Move("Procrasinate", 0, true, 6);
    procrasinate.set_modifyType("attackspeed");
    procrasinate.set_modifyDegree(0.5);
    procrasinate.set_modifyDegreeTwo(2);
    procrasinate.set_regen("Hi");
    procrasinate.set_asleep(false);
    procrasinate.set_accuracy(0.9);
    
    posterize = new Move("Posterize", 120, true, 15);
    posterize.set_modifyType("attack");
    posterize.set_modifyDegree(2);
    posterize.set_modifyDegreeTwo(1);
    posterize.set_regen("Hi");
    posterize.set_asleep(true);
    posterize.set_accuracy(0.85);
    
    ranOver = new Move("Ran Over", 0, true, 10);
    ranOver.set_modifyType("attackdefense");
    ranOver.set_modifyDegree(2);
    ranOver.set_modifyDegreeTwo(2);
    ranOver.set_regen("no");
    ranOver.set_asleep(true);
    ranOver.set_accuracy(1);
    
    
  }
  
  public Move get_buzzcut(){
    return buzzcut;
  }
  
  public Move get_brainBoost(){
    return brainBoost;
  }
  
  public Move get_outSmart(){
    return outSmart;
  }
  
  public Move get_slacking(){
    return slacking;
  }
  
  public Move get_vaping(){
    return vaping;
  }
  
  public Move get_pianoFlex(){
    return pianoFlex;
  }
  
  public Move get_hatToss(){
    return hatToss;
  }
  
  public Move get_rockClimb(){
    return rockClimb;
  }
  
  public Move get_procrasinate(){
    return procrasinate;
  }
  
  public Move get_grab(){
    return grab;
  }

  public Move get_guitarSmash(){
    return guitarSmash;
  }
  
  public Move get_explosion(){
    return explosion;
  }
  
  public Move get_brawl(){
    return brawl;
  }
  
  public Move get_haxball(){
    return haxball;
  }
  
  public Move get_tower(){
    return tower;
  }
  
  public Move get_block(){
    return block;
  }
  
  public Move get_curryToss(){
    return curryToss;
  }
  
  public Move get_kaiAttack(){
    return kaiAttack;
  }
  
  public Move get_chopSticks(){
    return chopSticks;
  }
  
  public Move get_hearthStone(){
    return hearthStone;
  }
  
  public Move get_hacking(){
    return hacking;
  }
  
  public Move get_drive(){
    return drive;
  }
  
  public Move get_confiscated(){
    return confiscated;
  }
  
  public Move get_ranOver(){
    return ranOver;
  }
  
  public Move get_sockeyKick(){
    return sockeyKick;
  }
  
  public Move get_maxOut(){
    return maxOut;
  }
  
  public Move get_hug(){
    return hug;
  }
  
  public Move get_hairFlick(){
    return hairFlick;
  }
  
  public Move get_cancelHops(){
    return cancelHops;
  }
  
  public Move get_armWrestle(){
    return armWrestle;
  }
  
  public Move get_pokerResearch(){
    return pokerResearch;
  }
  
  public Move get_skipLegs(){
    return skipLegs;
  }
  
  public Move get_preWorkout(){
    return preWorkout;
  }
  
  public Move get_cheesed(){
    return cheesed;
  }
  
  public Move get_snipe(){
    return snipe;
  }
  
  public Move get_roast(){
    return roast;
  }
  
  public Move get_bowlCut(){
    return bowlCut;
  }

  public Move get_doneNo(){
    return doneNo;
  }
  
  public Move get_serenade(){
    return serenade;
  }
  
  public Move get_posterize(){
    return posterize;
  }
  
  public Move get_doughnut(){
    return doughnut;
  }
}