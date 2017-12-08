/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShaneEichner
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class HostileNPC implements CharacterInterface {
    private String monsterName;
    private int monsterMaxHP;
    private double monsterCurrent;
    private double monsterAttk;
    private String monsterRole;
    private String monsterFirst;
    private String monsterLast;
    private int randNum;
    private final int minHP = 250;
    private final int maxHP = 500;
    private final int minAttk = 40;
    private final int maxAttk = 65;
    
    //list for first name
    String[] firstName = {"Tal", "Tor", "Mal", "Vor", "Lock", "Tyrs", "Mok"};
    //list for last name
    String[] lastName = {"'Morock", "'Nathor", "'Recull","'Troma","'Oxigal"};
    
    ArrayList<String> arrayFirst = new ArrayList<>(Arrays.asList(firstName));
    ArrayList<String> arrayLast = new ArrayList<>(Arrays.asList(lastName));
    
    //Random number Generator for first name
    Random randFName = new Random();
    //Random number Generator for last name
    Random randLName = new Random();
    //Random Health number
    Random randMaxHP = new Random();
    //Random Attack Power number
    Random randAttk = new Random();
    
    public HostileNPC(){
        this.monsterName = "Jeff";
        this.monsterMaxHP = 200;
        
        this.monsterAttk = 35;
        this.monsterRole = "Minion";
    }

    
    public void setMonsterRole(String newMonsterRole){
        this.monsterRole = newMonsterRole;
    }
    
    @Override
    public String getName() {
        return monsterName;
    }

    @Override
    public int getMaxHP() {
        return monsterMaxHP;
    }
    
    public void healthGenerator(){    
        //Generates a random Max health for the enemy npc
        this.monsterMaxHP = randMaxHP.nextInt(maxHP - minHP + 1) + minHP;
        this.monsterCurrent = monsterMaxHP;
    }
    
    public void damageHP(double damageHP){
        this.monsterCurrent = monsterCurrent - damageHP;
    }
    
    @Override
    public double getAttkPwr() {
        return monsterAttk;
    }
    
    public void attkGenerator(){
        //Generates a random attack power for enemy NPC
        this.monsterAttk = randAttk.nextInt(maxAttk - minAttk + 1) + minAttk;
    }
    @Override
    public String getRole() {
        return monsterRole;
    }
    
    public void nameGenerator(){
        //Generates a random name for enemy NPC
        this.monsterName = arrayFirst.get(randFName.nextInt(arrayFirst.size())) + arrayLast.get(randLName.nextInt(arrayLast.size()));
        
    }
    @Override
   public String toString(){
        return ("Name: "+ monsterName + "\n" + "Enemies health is: "+ monsterCurrent + "/" + monsterMaxHP + "\n" + "Enemies attack power is: " + monsterAttk);
   }

    @Override
    public double currentHP() {
        return this.monsterCurrent = monsterCurrent;
    }
}
