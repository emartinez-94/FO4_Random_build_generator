
package fobuild_generator;

import java.io.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hazama
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    static void bobblehead(PlayerFO4 player){
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Which SPECIAL Bobblehead did you get?\n1. Strength\n2. Perception\n3. Endurance\n4. Charisma\n5. Intelligence\n6. Agility\n7. Luck");
            int bobblehead = keyboard.nextInt();
            switch(bobblehead){
                case 1 -> {
                    player.getSPECIAL()[bobblehead-1] += 1;
                    charDisplay(player);
                }
                case 2 -> {
                    player.getSPECIAL()[bobblehead-1] += 1;
                    charDisplay(player);
                }
                case 3 -> {
                    player.getSPECIAL()[bobblehead-1] += 1;
                    charDisplay(player);
                }
                case 4 -> {
                    player.getSPECIAL()[bobblehead-1] += 1;
                    charDisplay(player);
                }
                case 5 -> {
                    player.getSPECIAL()[bobblehead-1] += 1;
                    charDisplay(player);
                }
                case 6 -> {
                    player.getSPECIAL()[bobblehead-1] += 1;
                    charDisplay(player);
                }
                case 7 -> {
                    player.getSPECIAL()[bobblehead-1] += 1;
                    charDisplay(player);
                }
                default ->{
                    System.out.println("Invalid input try againg.");
                    bobblehead(player);
                }
            }
        }
        
    }
    static void getPerk(PlayerFO4 player){
        Random rand = new Random();
        int randAttribute = rand.nextInt(7);
        int randPerk = rand.nextInt(10);
        if (randPerk == 0){
            if (player.getSPECIAL()[randAttribute] < 10){
                player.getSPECIAL()[randAttribute] += 1;
                System.out.println("Put 1 point into " + player.getAttributes()[randAttribute]);
                charDisplay(player);
                
            }
            else{
                getPerk(player);
            }
        }else if (player.getSPECIAL()[randAttribute] > randPerk){
            
            switch(randAttribute){
                case 0 -> strPerks(randPerk,player);
                case 1 -> perPerks(randPerk,player);
                case 2 -> endPerks(randPerk,player);
                case 3 -> charPerks(randPerk,player);
                case 4 -> intPerks(randPerk,player);
                case 5 -> agPerks(randPerk,player);
                case 6 -> luckPerks(randPerk,player);
            }
        }
        else
            getPerk(player);
    }
    static void strPerks(int perk,PlayerFO4 player){
        String maxLevel;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Is " + player.getStrengthPerk()[perk] + " availabe to add a perk?" + "?\n1.Yes\n2.No");
  
                maxLevel = keyboard.nextLine();
        }
        try{
                int choise = Integer.parseInt(maxLevel);
                switch(choise){
                    case 1 -> {
                        System.out.println("Put 1 point into " +player.getStrengthPerk()[perk]+".");
                        charDisplay(player);
                    }
                    case 2 -> {
                        System.out.println("Getting a different perk...");
                        getPerk(player);
                        
                    }default ->{
                        System.out.println("Invalid input.");
                        strPerks(perk,player);
                        break;
                    }
                    
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR!! " + e);
                strPerks(perk,player);
            }

    }
    static void perPerks(int perk,PlayerFO4 player){
        String maxLevel;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Is " + player.getPerceptionPerk()[perk] + " availabe to add a perk?" + "?\n1.Yes\n2.No");

                maxLevel = keyboard.nextLine();
        }
        try{
                int choise = Integer.parseInt(maxLevel);
                switch(choise){
                    case 1 -> {
                        System.out.println("Put 1 point into " +player.getPerceptionPerk()[perk]);
                        charDisplay(player);
                    }
                    case 2 -> {
                        System.out.println("Getting a different perk...");
                        getPerk(player);
                        
                        
                    }default ->{
                        System.out.println("Invalid input.");
                        perPerks(perk,player);
                        break;
                    }
                    
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR!! " + e);
                perPerks(perk,player);
            }
 
    }
    static void endPerks(int perk,PlayerFO4 player){
        String maxLevel;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Is " + player.getEndurancePerk()[perk] + " availabe to add a perk?" + "?\n1.Yes\n2.No");
 
                maxLevel = keyboard.nextLine();
        }
        try{
                int choise = Integer.parseInt(maxLevel);
                switch(choise){
                    case 1 -> {
                        
                        System.out.println("Put 1 point into " +player.getEndurancePerk()[perk]);
                        charDisplay(player);
                    }
                    case 2 -> {
                        System.out.println("Getting a different perk...");
                        getPerk(player);
                        
                    }default ->{
                        System.out.println("Invalid input.");
                        endPerks(perk,player);
                        break;
                    }
                    
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR!! " + e);
                endPerks(perk,player);
            }

    }
    static void charPerks(int perk,PlayerFO4 player){
        String maxLevel;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Is " + player.getCharismaPerk()[perk] + " availabe to add a perk?" + "?\n1.Yes\n2.No");

                maxLevel = keyboard.nextLine();
        }
        try{
                int choise = Integer.parseInt(maxLevel);
                switch(choise){
                    case 1 -> {
                        System.out.println("Put 1 point into " +player.getCharismaPerk()[perk]);
                        charDisplay(player);
                    }
                    case 2 -> {
                        System.out.println("Getting a different perk...");
                        getPerk(player);
                        
                        
                    }default ->{
                        System.out.println("Invalid input.");
                        charPerks(perk,player);
                        break;
                    }
                    
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR!! " + e);
                charPerks(perk,player);
            }
        
    }
    static void intPerks(int perk,PlayerFO4 player){
        String maxLevel;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Is " + player.getIntelligencePerk()[perk] + " availabe to add a perk?" + "?\n1.Yes\n2.No");
 
                maxLevel = keyboard.nextLine();
        }
        try{
                int choise = Integer.parseInt(maxLevel);
                switch(choise){
                    case 1 -> {
                        System.out.println("Put 1 point into " +player.getIntelligencePerk()[perk]);
                        charDisplay(player);
                        
                    }
                    case 2 -> {
                        System.out.println("Getting a different perk...");
                        getPerk(player);
                        
                        
                    }default ->{
                        System.out.println("Invalid input.");
                        intPerks(perk,player);
                        break;
                    }
                    
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR!! " + e);
                intPerks(perk,player);
            }
        
    }
    static void agPerks(int perk,PlayerFO4 player){
        String maxLevel;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Is " + player.getAgilityPerk()[perk] + " availabe to add a perk?" + "?\n1.Yes\n2.No");
    
                maxLevel = keyboard.nextLine();
        }
        try{
                int choise = Integer.parseInt(maxLevel);
                switch(choise){
                    case 1 -> {
                        
                        System.out.println("Put 1 point into " +player.getAgilityPerk()[perk]);
                        charDisplay(player);
                        
                    }
                    case 2 -> {
                        System.out.println("Getting a different perk...");
                        getPerk(player);
                        
                    }default ->{
                        System.out.println("Invalid input.");
                        agPerks(perk,player);
                        break;
                    }
                    
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR!! " + e);
                agPerks(perk,player);
            }
      
    }
    static void luckPerks(int perk,PlayerFO4 player){
        String maxLevel;
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Is " + player.getLuckPerk()[perk] + " availabe to add a perk?" + "?\n1.Yes\n2.No");
  
                maxLevel = keyboard.nextLine();
        }
        try{
                int choise = Integer.parseInt(maxLevel);
                switch(choise){
                    case 1 -> {
                        System.out.println("Put 1 point into " +player.getLuckPerk()[perk]);
                        charDisplay(player);

                    }
                    case 2 -> {
                        System.out.println("Getting a different perk...");
                        getPerk(player);

                    }default ->{
                        System.out.println("Invalid input.");
                        luckPerks(perk,player);
                        break;
                    }
                    
                }
            }catch(NumberFormatException e){
                System.out.println("ERROR!! " + e);
                luckPerks(perk,player);
            }
   
    }
    static void Input(int choice){
        if (choice == 1){
            PlayerFO4 player = new PlayerFO4();
            player.generateName();
            player.generateAttributes();
            player.setLvl(1);
            charDisplay(player);
        }else if (choice == 2){
            try (Scanner keyboard = new Scanner(System.in)) {
                System.out.println("What is the name of the file?");
                String name = keyboard.nextLine()+".txt";
                load(name);
            }
            
        }else if (choice == 3){
            System.exit(0);
        }else{
            System.out.println("Invalid input!");
            startMenu();
        }
    }
    static void checkUserInput(PlayerFO4 player,int choise){
        switch (choise) {
            case 1 -> {
                player.levelUp();
                getPerk(player);
            }
            case 2 -> {
                if (player.getGotbook() != true){
                    player.setGotbook();
                    charDisplay(player);
                }else{
                    System.out.println("You already have the You're Special Book");
                    charDisplay(player);
                }
            }
            case 3 -> {
                try (Scanner keyboard = new Scanner(System.in)) {
                    System.out.println("Under what name would you like to save the file?");
                    String name = keyboard.nextLine() + ".txt";
                    save(player, name);
                }
                 }
            case 4 -> bobblehead(player);
            case 5 -> startMenu();
            case 6 -> System.exit(0);
            default -> System.out.println("Invalid number Please try again");
        }
            charDisplay(player);
    }
    static void charDisplay(PlayerFO4 player){
        try (Scanner keyboard = new Scanner(System.in)) {
            String choice;
            System.out.println("\n\nName: " + player.getName() + "\tLevel: " + player.getLevel() );
            System.out.println("Sex: " + player.getSex());
            for (int i = 0; i < player.getAttributes().length; i++){
                System.out.println(player.getAttributes()[i] + " " + player.getSPECIAL()[i]);
            }
            System.out.println("You're SPECIAL book: " + player.getGotbook());
            System.out.println("\nCharacter Menu:\n1. Level UP\n2. Got You're SpecialBook\n3. Save Current Build\n4. Special Bobblehead\n5. Return to Main Menu\n6. Exit");
            
            choice = keyboard.nextLine();
            try{
                int test = Integer.parseInt(choice);
                checkUserInput(player,test);
                    
                }catch(NumberFormatException e){
                    System.out.println("ERROR!! " + e);
                    System.exit(0);
                }
        }
    }
    static void startMenu(){
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.println("Welcome to the Fallout 4 GOTY random build generator");
            System.out.println("Menu\n\n1. Generate New Random Build\n2. Load Build\n3. Exit");
            String choice = keyboard.nextLine();
            try{
                int inp = Integer.parseInt(choice);
                Input(inp);
                    
            }catch(NumberFormatException e){
                System.out.println("ERROR!! " + e);
                startMenu();
            }
        }
        
        
        
    }
    static void save(PlayerFO4 player , String fileName){
        File outFile = new File(fileName);
        FileWriter output;
        PrintWriter printOutput;
        String outputTxt = player.getName()+","+player.getSex()+","+player.getLevel()+","+Arrays.toString(player.getSPECIAL()).replace("[", "").replace("]", "").replace(" ", "")+","+player.getGotbook();
        try {
            output = new FileWriter(outFile);
            printOutput = new PrintWriter(output);
            printOutput.println(outputTxt);
            printOutput.close();
        } catch (IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    static void load(String fileName){
        PlayerFO4 player = new PlayerFO4();
        String lineFile="";
        File inFile = new File(fileName);
        try {
            
            try (Scanner fromFile = new Scanner(inFile)) {
                while (fromFile.hasNextLine()){
                    lineFile = fromFile.nextLine();
                }
            }
            
            String[] object = lineFile.split("\\,");
            player.setName(object[0]);
            player.setSex(object[1]);
            player.setLvl(Integer.parseInt(object[2]));
            player.setSPECIAL(object);
            player.loadGotbook(Boolean.parseBoolean(object[10]));
            System.out.println("Build has been saved");
            charDisplay(player);
        } catch (FileNotFoundException ex) {
            System.out.println("File does not exist!");
            startMenu();
        }
    }
    public static void main(String[] args) {
        startMenu();
    }

}
