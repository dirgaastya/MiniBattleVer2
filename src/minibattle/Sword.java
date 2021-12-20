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

    @Override
    public void equipWeapon(String name) {
        System.out.println("\nEquipment "+ name +  " dipasang");
    }

    @Override
    public void noWeapon(String name) {
        System.out.println("\nEquipment "+ name +" dilepas");
    }

    @Override
    public int weapon1() {
        this.powerUp += 250;
        return this.powerUp;
    }

    @Override
    public int weapon2() {
        this.powerUp += 300;
        return this.powerUp;
    }

    @Override
    public String weapName(String name){
        return name;
    }

    
    
}
