
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShaneEichner
 */
public class Warrior extends Player {
    private String story;
    private int Strength;
    private String weapon;
    private double AttkMod;
    private double warriorAttk;
    private final String Class = "Warrior";
    private int rage;
    private String intro;
    Random randRage = new Random();
    
    public Warrior(String name,double currentHP, int maxHP,String role, double warriorAttk, int Strength, String weapon)
    {
        super(name, maxHP,currentHP, role);
        this.Strength = Strength;
        this.warriorAttk = warriorAttk;
        this.weapon = weapon;
        this.rage = rage;
        
    }
    public Warrior(){
        super();
        Strength = 55;
        AttkMod = 1.25;
        warriorAttk = super.getAttkPwr() + (Strength * AttkMod);
        story = "Going on an adventure.";
        weapon = "Hammer";
        super.setPlayerRole(Class);
        rage = 0;
        
    }
    public void modAttkPwr(double Strength) {
        this.warriorAttk = super.getAttkPwr() + (AttkMod * Strength);
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    public String getIntro(){
        return "You have chosen the warrior class.\nA member of an ancient tribe of barbarians.\nYour thirst for battle knows now bounds \nand you leap headlong into any chance \nof proving your glory.";
    }
    
//    public void setIntro(){
//        this.intro = "You have chosen the warrior class.\nA member of an ancient tribe of barbarians.\nYour thirst for battle knows now bounds and you leap into any chance of proving your glory.";
//    }
    
    public void setWeapon(String newWeapon){
        this.weapon = newWeapon;
    }
    
    public double getWarriorAttk(){
        return warriorAttk;
    }
    
    public int getStrength(){
        return Strength;
    }
    
    //levels up strength after successfuly defeating an enemy
    public void levelStrength(int levelStrength){
        this.Strength = Strength + levelStrength;
    }
    
    public int getRage(){
        return rage; 
    }
    //Rage system for double attack mechanic
    public void gainRage(){
        this.rage = rage + randRage.nextInt(50-25+1) + 25;
        if (this.rage > 100){
            this.rage = 100;
        }
    }
    //resets rage after performing a double attack
    public void resetRage(){
        this.rage = 0;
    }
    
//    public void setStrength(int newStrength){
//        this.Strength = newStrength;
//    }
    
    @Override
     public String toString(){
        return ("Name: "+super.getName() + "\n"+"Hitpoints: "+ super.currentHP() + "/" + super.getMaxHP() + "\n" +"Your class is: " + super.getRole() + "\n" + "Warrior attack power is: " + warriorAttk + "\n" +"Your weapon is: " + weapon);
    }
}
