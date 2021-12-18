/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
abstract class Monster {
    public  String name;
    protected int hp,atk,matk,def,mdef;
    abstract void passiveMonster();

    public Monster() {
        this.name = null;
        this.hp = 800;
        this.atk = 150;
        this.matk = 150;
        this.def = 65;
        this.mdef = 65;

    }

    public int getHp() {
        
        return hp;
    }

    public void setHp(int damage) {
        this.hp = hp - damage;
        if (hp<=0) {
            hp=0;
        }
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getMatk() {
        return matk;
    }

    public void setMatk(int matk) {
        this.matk = matk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getMdef() {
        return mdef;
    }

    public void setMdef(int mdef) {
        this.mdef = mdef;
    }
    
    public void showAttribut(){
        System.out.println("\nAttribut Monster " + this.name);
        System.out.println("HP\t\t: " + this.hp);
        System.out.println("ATK\t\t: " + this.atk);
        System.out.println("MATK\t\t: " + this.matk);
        System.out.println("DEF\t\t: "+ this.def);
        System.out.println("MDEF\t\t: "+ this.mdef+"\n");
    }
        
    
}
