/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fobuild_generator;

/**
 *
 * @author hazama
 */
class Character {
    private int level;
    private String name;
    public Character(){
        name = "";
        level = 0;

        
    }
    public Character(String nm, int lvl){
        name = nm;
        level = lvl;
    }
    void setName(String n){
        name = n;
    }
    String getName(){
        return name;
    }
    void setLvl(int lvl){
        level = lvl;
    }
    int getLevel(){
        return level;
    }
}
