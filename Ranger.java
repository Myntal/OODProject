
/**
 * The Ranger class in the text based rpg project for OOD
 * 
 * @author Duane Hawkins
 * @version 11/26/17
 */
    public class Ranger extends Player
{

    private String story;
    private int agility;
    private String weapon;
    private double AttkMod;
    private double rangerAttk;
    private final String Class = "Ranger";
    /**
     * THe main constructor for the Ranger Class variables
     */
    public Ranger(String name, String role,double currentHP, int maxHP, double rangerAttk, String story, int agility, String weapon)
    {

        super(name, maxHP,currentHP, role);
        this.story = story;
        this.agility = agility;
        this.weapon = weapon;
    }

    //Default Constructor
    public Ranger(){

        super();
        agility = 75;
        AttkMod = 1.5;
        rangerAttk = super.getAttkPwr() + (agility * AttkMod);
        weapon = "Bow";
        story = "The Story";
        super.setPlayerRole(Class);
    }

    /**
     * The Mod Attack Power method
     * 
     * @param modAttkPwr  this lets us modify the attack power based off modifiers the game provides either from leveling up or weapons/armor
     * 
     */
    public void modAttkPwr(double agility){
        this.rangerAttk = super.getAttkPwr() + (AttkMod * agility);
    }

    /**
     * The Set Weapon method
     * 
     * @param weapon Sets the desired weapon for the subclass ranger
     * 
     */
    public void setWeapon(String newWeapon){
        this.weapon = newWeapon;
    }
    
    /**
     * The Set Agility Method
     * 
     * @param agility  This sets the default amount of agility
     */
    public void setAgility(int newAgility){
        this.agility = newAgility;
    }
    
    /**
     * The Ranger Attack Method
     * 
     * @param rangerAttk this is the attack the Ranger class performs
     * @return  gives  us the attack of the Ranger
     */
     public double getRangerAttk(){
        return rangerAttk;
    }
    
    /**
     *The Story Return Method
     * 
     * @param  story   The text we use for the story parrt of our Ranger class
     * @return     gives the player the text portion of the story
     */
    public String getStory()
    {
        // Returns the story text for the Ranger character
        return story;
    }

    /**
     *The Agility Return Method
     * 
     * @param  agility   What we use to modify our Attack Power
     * @return     returns the amount of agility we have
     */
    public int getAgility()
    {
        // Returns the agility amount for the character
        return agility;
    }

    /**
     *The Weapon Return Method
     * 
     * @param  weapon   What we use for the weapon the character is currently equipped with
     * @return     returns the weapon
     */
    public String getWeapon()
    {
        // Returns the weapon for the character
        return weapon;
    }
    
    public void levelAgility(int levelAgility){
        this.agility = agility + levelAgility;
    }
//    public void setStrength(int newAgility){
//        this.agility = agility;
//    }
    

    public String toString(){
        return ("Name: "+super.getName() + "\n"+"Hitpoints: "+ super.currentHP() + "/" + super.getMaxHP() + "\n" +"Your attack power is: " + rangerAttk +" \n"+"Your agility is: "+ agility +"\n"+"Your weapon is: " + weapon);
    }

}
