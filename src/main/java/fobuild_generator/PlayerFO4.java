/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fobuild_generator;

import java.util.Random;

/**
 *
 * @author hazama
 */
class PlayerFO4 extends Character{
    private String StrengthPerk[] = {"Iron Fist","Big Leagues","Armorer","Blacksmith","Heavy Gunner","Strong Back","Steady Aim","Basher","Rooted","Pain Train"};
    private String PerceptionPerk[] = {"Pickpocket","Rifleman","Awareness","Locksmith","Demolition Expert","Night Person","Refractor","Sniper","Penetrator","Concentrated Fire"};
    private String EndurancePerk[] = {"Toughness","Lead Belly","Lifegiver","Chem Resistant","Aquaboy","Rad Resistant","Adamantium Skeleton","Cannibal","Ghoulish","Solar Powered"};
    private String CharismaPerk[] = {"Cap Collector","Black Widow & Lady Killer","Lone Wanderer","Attack Dog","Animal Friend","Local Leader","Party Boy","Inspirational","Wasteland Whisperer","Intimidation"};
    private String IntelligencePerk[] = {"VANS","Medic","Gun Nut","Hacker","Scrapper","Science","Chemist","Robotics Expert","Nuclear Physicist","Nerd Rage"};
    private String AgilityPerk[] = {"Gunslinger","Commando","Sneak","Mister Sandman","Action Boy","Moving Target","Ninja","Quick Hands","Blitz","Gun Fu"};
    private String LuckPerk[] = {"Fortune Finder","Scrounger","Bloody Mess","Mysterious Stranger","Idiot Savant","Better Criticals","Critical Banker","Grim Reaper's Sprint","Four Leaf Clover","Ricochet"};
    private String attributes[]={"Strength","Perception","Endurance","Charisma","Intelligence","Agility","Luck"};
    private boolean gotBook;
    private String Sex;
    private int[] special = new int[7];
    public PlayerFO4(){
        super();
        gotBook = false;
        Sex = "";
    }
    public PlayerFO4(String name, String sx,int lvl,int[]atributes, boolean book){
        super(name,lvl);
        for (int i = 0; i < 7; i++){
            special[i] = atributes[i];
        }
        Sex = sx;
        gotBook = book;
    }
    void generateSex(){
        String[] sex = {"Male" , "Female"};
        Random rand;
        rand = new Random();
        int randSex = rand.nextInt(2);
        this.Sex = sex[randSex];
        
        
    }
    void setSex(String sx){
        Sex = sx;
    }
    String getSex(){
        return Sex;
    }
    void generateName(){
        String firstName="";
        String lName="";
        Random rand = new Random();
        //Pool of last names
        String[] lastName = {"Smith" ,"Johnson" ,"Williams" ,"Brown" ,"Jones" ,"Garcia","Miller", "Davis" ,"Rodriguez" ,"Martinez" ,"Hernandez" ,"Lopez" ,"Gonzalez" ,"Wilson" ,"Anderson" ,"Thomas" ,"Salazar","Taytlor" ,"Moore" ,"Jackson" ,"Martin" ,"Lee" ,"Perez" ,"Thomson" ,"White" ,"Harris" ,"Sanchez" ,"Clark" ,"Ramirez" ,"Lewis" ,"Robinson" ,"Walker", "Young" ,"Allen" ,"King" ,"Wright" ,"Scott" ,"Torres" ,"Nguyen","Hill","Flores","Green","Adams","Nelson","Baker","Hall","Rivera","Campbell","Mitchell","Carter","Roberts"};
        //Pool of female names
        String[] nameF ={"Olivia","Emma","Ava","Sophia","Isabella","Charlotte","Amelia","Mia","Harper","Evelyn","Abigail","Emily","Ella","Elizabeth","Camila","Luna","Sofia","Avery","Mila","Leslie","Aria","Scarlett","Penelope","Layla","Chloe","Victoria","Madison","Eleanor","Grace","Nora","Riley","Zoey","Hannah","Hazel","Lily","Ellie","Violet","Lillian","Zoe","Stella","Aurora","Natalie","Emilia","Everly","Leah","Aubrey","Willow","Addison","Lucy","Audrey","Bella"};
        //Pool of male names
        String[] nameM={"Liam","Noah","William","James","Oliver","Benjamin","Gerardo","Elijah","Lucas","Mason","Logan","Alexander","Ethan","Jacob","Michael","Daniel","Henry","Jackson","Sebastian","Aiden","Matthew","Samuel","David","Joseph","Carter","Owen","Wyatt","John","Jack","Luke","Jayden","Dylan","Grayson","Levi","Isaac","Gabriel","Julian","Mateo","Anthony","Jaxon","Lincoln","Joshua","Christopher","Andrew","Theodore","Caleb","Ryan","Asher","Nathan","Thomas","Leo"};
        String sex = this.getSex();
        //Generate sex
        if( sex == "Male"){//Male
                int randName = rand.nextInt(51);
                int randLname = rand.nextInt(51);
                firstName = nameM[randName];
                lName = lastName[randLname];
                this.setName(firstName + " " + lName);
            
        }
        else if (sex == "Female"){//Female
            int randName = rand.nextInt(51);
            int randLname = rand.nextInt(51);
            firstName = nameF[randName];
            lName = lastName[randLname];
            this.setName(firstName + " " + lName);
        }else{
            generateSex();
            generateName();
        }
        
        
            
    }
    void generateAttributes(){
        int total = 0;
        Random rand = new Random();
        
        for (int i = 0; i < this.special.length;i++){
            special[i] = rand.nextInt(10) + 1;
        }
        for (int n : special){
            total += n;
        }
        if (total != 28)
            generateAttributes();

    }
    void incrementSpecial(int index){
        special[index] += 1;
    }
    void setSPECIAL(String[] object){
        int k = 0;
        for (int i = 3; i < object.length-1;i++){
            special[k] = Integer.parseInt(object[i]);
            k++;
            }
    }
    int [] getSPECIAL(){
        return special;
    }
    String[] getAttributes(){
        return attributes;
    }
    void loadGotbook(boolean book){
        gotBook = book;
    }
    void setGotbook(){

        gotBook = true;
        Random rand;
        rand = new Random();
        int randAttribute = rand.nextInt(7);
        if (this.getSPECIAL()[randAttribute] > 10){
            setGotbook();
        }
        else
            System.out.println("Add a point to " + attributes[randAttribute] + ".");
            this.incrementSpecial(randAttribute);
            
    }
    boolean getGotbook(){
        return gotBook;
    }
    void levelUp(){
        int level = this.getLevel();
        this.setLvl( level + 1);
    }
    String[] getStrengthPerk(){
        return StrengthPerk;
    }
    String[] getPerceptionPerk(){
        return PerceptionPerk;
    }
    String[] getEndurancePerk(){
        return EndurancePerk;
    }
    String[] getCharismaPerk(){
        return CharismaPerk;
    }
    String[] getIntelligencePerk(){
        return IntelligencePerk;
    }
    String[] getAgilityPerk(){
        return AgilityPerk;
    }
    String[] getLuckPerk(){
        return LuckPerk;
    }
}