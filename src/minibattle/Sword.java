/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Sword implements Weapon{

    private int powerUp=0;
    private String swordName=null;

    @Override
    public void equipWeapon() {
        System.out.println("\nEquipment Sword dipasang");
    }

    @Override
    public void noWeapon() {
        System.out.println("\nEquipment Sword dilepas");
    }

    public int elucidator() {
        this.powerUp += 250;
        return this.powerUp;
    }

    public int darkRepulser() {
        this.powerUp += 300;
        return this.powerUp;
    }

    public void setSwordName(String name) {
        name = this.swordName;
    }
    
}
