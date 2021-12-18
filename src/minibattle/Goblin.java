/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Goblin extends Monster {

    public Goblin() {
        super.name = "Goblin";
        super.hp += 600;
        super.atk += 300;
        super.matk += 150;
        super.def += 45;
        super.mdef += 35;
    }

    @Override
    void passiveMonster() {
        super.def += 90;
        super.atk += 100;
        System.out.println("Passive Monster Goblin telah aktif! Goblin Physical ATK ++ & Physical Def ++");
    }

    public void showAttribut() {
        System.out.println("\nAttribut Monster " + super.name);
        System.out.println("HP\t\t: " + super.hp);
        System.out.println("ATK\t\t: " + super.atk);
        System.out.println("MATK\t\t: " + super.matk);
        System.out.println("DEF\t\t: " + super.def);
        System.out.println("MDEF\t\t: " + super.mdef + "\n");
        System.out.println("Passive\t\t: HP Goblin dibawah 700 Physical ATK naik 100 dan Physical Def naik 300");
    }

}
