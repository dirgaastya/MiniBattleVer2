/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class MagicWand implements Weapon {
    private int powerUp=0;
    private String swordName=null;


    @Override
    public void equipWeapon() {
        System.out.println("\nEquipment Magic Wand dipasang");
    }

    @Override
    public void noWeapon() {
        System.out.println("\nEquipment Magic Wand dilepas");
    }
    
    public int iceQueenWand() {
        this.powerUp += 250;
        return this.powerUp;
    }

    public int lightningStaff() {
        this.powerUp += 300;
        return this.powerUp;
    }

    public void setSwordName(String name) {
        name = this.swordName;
    }
}
