/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ShaneEichner
 */
public class Player implements CharacterInterface{
private String name;
private double currentHP;
private int maxHP;
private double AttkPwr;
private String playerRole;

//Constructor
public Player(String name, int maxHP,double currentHP, String Class){
    this.name = name;
    this.maxHP = maxHP;
    this.currentHP = currentHP;
    this.playerRole = Class;
}

//Default Constructor
public Player(){
    name = "DefaultName";
    maxHP = 345;
    currentHP = maxHP;
    AttkPwr = 5;
    playerRole = "Adventurer";
}

@Override
public String getName() {
    return name;
}
   
@Override
public int getMaxHP(){
    return maxHP;
}
public void setMaxHP(int newMax){
    this.maxHP = newMax;
    this.currentHP = newMax;
}
@Override
public double getAttkPwr() {
    return AttkPwr;
}

public void setName(String newName) {
    this.name = newName;
}

public void loseHP(double Stam) {
    this.currentHP = (currentHP - Stam);
}

public void restHP() {
    this.currentHP = maxHP;
}

public void levelHP(int levelHP){
      this.maxHP = maxHP + levelHP;
      this.currentHP = currentHP + levelHP;
    }

public void setAttkPwr(int Atk) {
    this.AttkPwr = Atk;
}

@Override
public String getRole() {
    return playerRole;
}

public void setPlayerRole(String newPlayerRole){
    this.playerRole = newPlayerRole;
}

public String toString(){
    return ("Name: " + name + "\n"+"Hitpoints: "+ currentHP + "/" + maxHP + "\n" +"Your attack power is: " + AttkPwr + "\n" + "Your class is: " + playerRole);
    }

    @Override
    public double currentHP() {
       return this.currentHP = currentHP;
    }
    
}
