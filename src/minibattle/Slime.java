/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Slime extends Monster{
     public Slime(){
        super.name="Slime";
        super.hp+=300;
        super.atk+=200;
        super.matk+=100;
        super.def+=40;
        super.mdef+=30; 
     }

    @Override
    void passiveMonster() {
        super.hp+=500;
        System.out.println("Passive Monster Slime telah aktif! Slime HP++");
    }

    public void showAttribut() {
        System.out.println("\nAttribut Monster " + super.name);
        System.out.println("HP\t\t: " + super.hp);
        System.out.println("ATK\t\t: " + super.atk);
        System.out.println("MATK\t\t: " + super.matk);
        System.out.println("DEF\t\t: " + super.def);
        System.out.println("MDEF\t\t: " + super.mdef + "\n");
        System.out.println("Passive\t\t: HP Slime dibawah 500 ,Hp Slime naik 500");
    }
        
}

