/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ActionMenu {
    Scanner newObj = new Scanner(System.in);

    public String getHero() {
        String input;
        System.out.println("\n===========Pilih Job Class===========");
        System.out.println("1. Basic Hero   (Rekomendasi Lawan: Slime,Goblin)");
        System.out.println("2. Mage         (Rekomendasi Lawan: Slime, Goblin & Indosiar Black Dragon)");
        System.out.println("3. Warrior      (Rekomendasi Lawan: Slime, Goblin & Indosiar Black Dragon)");
        System.out.println("=====================================");
        System.out.print("Pilih Class Hero\t: ");
        input = newObj.nextLine();
        return input;
    }

    public String getMonster() {
        String input;
        System.out.println("\n===========Pilih Lawan===========");
        System.out.println("1. Slime");
        System.out.println("2. Goblin");
        System.out.println("3. Dragon");
        System.out.println("=================================");
        System.out.print("Pilih Monster\t: ");
        input = newObj.nextLine();
        return input;
    }

    public String getFightMenu() {
        String input;
        System.out.println("\n===========Battle===========");
        System.out.println("1. Serang");
        System.out.println("2. Skill");
        System.out.println("============================");
        System.out.print("Pilih\t\t: ");
        input = newObj.nextLine();
        return input;
    }

    public void miniBattleInfo() {
        Monster newSlimeMonster = new Slime();
        Monster newGoblinMonster = new Goblin();
        Monster newIbdMonster = new IbdMonster();
        Mage mage = new Mage("");
        Hero hero = new Hero("");
        Warrior warrior = new Warrior("");
        boolean status = false;
        
        
        while(status != true){
            System.out.println("\n===========MiniBattle Info===========");
            System.out.println("1. Info Status Hero");
            System.out.println("2. Info Status Monster");
            System.out.println("3. Info Status Senjata");
            System.out.println("4. Info Menjalankan Program MiniBattle");
            System.out.println("5. Kembali Ke Menu Utama");
            System.out.print("Pilih\t\t: ");
            String input = newObj.nextLine();
            
            switch(input){
                case "1":
                    System.out.println("\n===========Info Stat Hero============");
                    hero.showAttribut();
                    mage.showAttribut();
                    warrior.showAttribut();
                    backToMenu();
                    break;
                case "2":
                    System.out.println("\n===========Info Stat Monster=========");
                    newSlimeMonster.showAttribut();
                    newGoblinMonster.showAttribut();
                    newIbdMonster.showAttribut();
                    backToMenu();
                    break;
                case "3":
                    System.out.println("\n===========Info Stat Senjata=========");
                    backToMenu();
                    break;
                case "4":
                    System.out.println("\n=========Info Menjalankan Program========");
                    System.out.println("->  Pertama tentukan nama hero anda");
                    System.out.println("->  Tentukan job class");
                    System.out.println("->  Tentukan senjata");
                    System.out.println("->  Tentukan lawan anda");
                    System.out.println("->  Terakhir Mulai Pertaturan");
                    System.out.println("=========================================");
                    System.out.println("*   Setiap hero menyerang, Monster akan menyerang balik dengan tipe serangan yang sama.");
                    backToMenu();
                    break;
                case "5":
                    status=true;
                    break;
            }
        }
    }

    public String getWeapon (){
        String input;
        System.out.println("\n===========Pilih Equipment===========");
        System.out.println("1. Sword              (Rekomendasi Job Class: Basic, Warrior)");
        System.out.println("2. Magic Wand         (Rekomendasi Job Class: Mage)");
        System.out.println("3. Axe                (Rekomendasi Job Class: Warrior)");
        System.out.println("=====================================");
        System.out.print("Pilih Equipment\t: ");
        input = newObj.nextLine();
        return input;
    }

    public String selectSword() {
        String input;
        System.out.println("\n===========Pilih Sword===========");
        System.out.println("1. Elucidator            ");
        System.out.println("2. Dark Repulser         ");
        System.out.println("=====================================");
        System.out.print("Pilih Equipment\t: ");
        input = newObj.nextLine();
        return input;
    }
    
    public String weaponOption(){
        String input;
        System.out.println("\n===========Select Option===========");
        System.out.println("1. Use / Pakai");
        System.out.println("2. Take Off / Lepas)");
        System.out.println("=====================================");
        System.out.print("Pilih\t: ");
        input = newObj.nextLine();
        return input;
    }
    
    public void backToMenu() {
    System.out.println("");
    System.out.print("Tekan [Enter] untuk kembali..");
    newObj.nextLine();
    }
}
