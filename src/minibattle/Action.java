/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Action extends ActionMenu {

    public void selectHero(String input) {
        if (input.equalsIgnoreCase("1")) {
            
            System.out.println("Anda Memilih Job Basic Hero");
        } else if (input.equalsIgnoreCase("2")) {
            
            System.out.println("Anda Memilih Job Mage Hero");
        } else if (input.equalsIgnoreCase("3")) {
            
            System.out.println("Anda Memilih Job Warior Hero");
        }
    }

    public String selectMonster(String input) {
        String monsterValue = null;
        if (input.equalsIgnoreCase("1")) {
            System.out.println("Anda Melawan Mosnter Slime");
            monsterValue = "slimeMonster";
        } else if (input.equalsIgnoreCase("2")) {
            System.out.println("Anda Melawan Monster Goblin");
        } else if (input.equalsIgnoreCase("3")) {
            System.out.println("Anda Melawan Monster Indosiar Black Dragon");
        }
        return monsterValue;
    }
    
    public void basicFight(Hero hero, String monsterValue) {
        
        Monster newSlimeMonster = new Slime();
        Monster newGoblinMonster = new Goblin();
        Monster newIbdMonster = new IbdMonster();
        boolean status = false;
        int passiveCount = 0;

        while (status != true) {
            // Monster Mati
            if (newSlimeMonster.getHp() <= 0) {
                System.out.println("Program Selesai");
                status = true;
                System.exit(0);
                break;
            }else if (newGoblinMonster.getHp() <= 0) {
                System.out.println("Program Selesai");
                status = true;
                System.exit(0);
                break;
            }else if (newIbdMonster.getHp() <=0){
                System.out.println("Program Selesai");
                status = true;
                System.exit(0);
                break;
            }
            // Hero Mati
            if (hero.getHp() <= 0) {
                status = true;
                System.exit(0);
                break;
            }           
            String input = getFightMenu();
            // Monster Slime
            if (monsterValue.equalsIgnoreCase("1")) {
                switch (input) {
                    case "1":
                        hero.attack(newSlimeMonster);
                        // Pasif Monster 1x aktif
                        if (newSlimeMonster.getHp() <= 500) {
                            if (passiveCount == 0) {
                                newSlimeMonster.passiveMonster();
                                passiveCount++;
                            }
                        }
                        hero.defend(newSlimeMonster, "basic");
                        break;
                    case "2":
                        System.out.println("Anda belum mempelajari skill apapun");
                }
            }
            // Monster Goblin
            else if (input.equalsIgnoreCase("2")) {
                switch (input) {
                    case "1":
                        hero.attack(newGoblinMonster);                       
                        // Pasif Goblin hp dibawah 700 physical def & atknaik
                        if (newGoblinMonster.getHp() <= 700) {
                            newGoblinMonster.passiveMonster();
                        }
                        hero.defend(newGoblinMonster, "basic");
                        break;
                    case "2":
                        System.out.println("Anda belum mempelajari skill apapun");
                }
            }
            // Monster IbdMonster
            else if (input.equalsIgnoreCase("3")) {
                switch (input) {
                    case "1":
                        hero.attack(newIbdMonster);
                        // Pasif HHp diatas 1500 Physical Def++++++ dan Magic Def ++
                        if (newIbdMonster.getHp() >= 1500) {
                            newIbdMonster.passiveMonster();
                        }
                        hero.defend(newIbdMonster, "basic");
                        break;
                    case "2":
                        System.out.println("Anda belum mempelajari skill apapun");
                }
            }
        }

    }

    public void mageFight(Mage mage, String monsterValue) {
        Monster newSlimeMonster = new Slime();
        Monster newGoblinMonster = new Goblin();
        Monster newIbdMonster = new IbdMonster();
        boolean status = false;
        int passiveCount = 0;

        while (status != true) {
            // Monster Mati
            if (newSlimeMonster.getHp() <= 0) {
                System.out.println("Program Selesai");
                status = true;
                System.exit(0);
                break;
            }else if (newGoblinMonster.getHp() <= 0) {
                System.out.println("Program Selesai");
                status = true;
                System.exit(0);
                break;
            }else if (newIbdMonster.getHp() <=0){
                System.out.println("Program Selesai");
                status = true;
                System.exit(0);
                break;
            }
            // Hero Mati
            if (mage.getHp() <= 0) {
                status = true;
                System.exit(0);
                break;
            }   
            String input = getFightMenu();
            if (monsterValue.equalsIgnoreCase("1")) {
                switch (input) {
                    case "1":
                        mage.attack(newSlimeMonster);
                        // Pasif Monster 1x aktif
                        if (newSlimeMonster.getHp() <= 300) {
                            if (passiveCount == 0) {
                                newSlimeMonster.passiveMonster();
                                passiveCount++;
                            }
                        }
                        mage.defend(newSlimeMonster, "basic");
                        break;
                    case "2":
                        mage.magicSkill(newSlimeMonster);
                        // Pasif Monster 1x aktif
                        if (newSlimeMonster.getHp() <= 300) {
                            if (passiveCount == 0) {
                                newSlimeMonster.passiveMonster();
                                passiveCount++;
                            }
                        }
                        mage.defend(newSlimeMonster, "skill");
                        break;
                }
            }
            // Goblin
            else if (monsterValue.equalsIgnoreCase("2")) {
                switch (input) {
                    case "1":
                        mage.attack(newGoblinMonster);
                        // Pasif Goblin hp dibawah 700 physical def & atknaik
                        if (newGoblinMonster.getHp() <= 700) {
                            newGoblinMonster.passiveMonster();
                        }
                        mage.defend(newGoblinMonster, "basic");
                        break;
                    case "2":
                        mage.magicSkill(newGoblinMonster);
                        // Pasif Goblin hp dibawah 700 physical def & atknaik
                        if (newGoblinMonster.getHp() <= 700) {
                            newGoblinMonster.passiveMonster();
                        }
                        mage.defend(newGoblinMonster, "skill");
                        break;
                }
            }
            // Ibd Monster
            else if (monsterValue.equalsIgnoreCase("3")) {
                switch (input) {
                    case "1":
                        mage.attack(newIbdMonster);
                        // Pasif HHp diatas 1500 Physical Def++++++ dan Magic Def ++
                        if (newIbdMonster.getHp() >= 1500) {
                            newIbdMonster.passiveMonster();
                        }
                        mage.defend(newIbdMonster, "basic");
                        break;
                    case "2":
                        mage.magicSkill(newIbdMonster);
                        // Pasif HHp diatas 1500 Physical Def++++++ dan Magic Def ++
                        if (newIbdMonster.getHp() >= 1500) {
                            newIbdMonster.passiveMonster();
                        }
                        mage.defend(newIbdMonster, "skill");
                        break;
                }
            }
        }
    }

    public void warriorFight(Warrior warrior, String monsterValue) {
        Monster newSlimeMonster = new Slime();
        Monster newGoblinMonster = new Goblin();
        Monster newIbdMonster = new IbdMonster();
        boolean status = false;
        int passiveCount = 0;

        while (status != true) {
            // Monster Mati
            if (newSlimeMonster.getHp() <= 0) {
                System.out.println("Program Selesai");
                status = true;
                System.exit(0);
                break;
            }else if (newGoblinMonster.getHp() <= 0) {
                System.out.println("Program Selesai");
                status = true;
                System.exit(0);
                break;
            }else if (newIbdMonster.getHp() <=0){
                System.out.println("Program Selesai");
                status = true;
                System.exit(0);
                break;
            }
            // Hero Mati
            if (warrior.getHp() <= 0) {
                status = true;
                System.exit(0);
                break;
            }   
            String input = getFightMenu();
            if (monsterValue.equalsIgnoreCase("1")) {
                switch (input) {
                    case "1":
                        warrior.attack(newSlimeMonster);
                        // Pasif Monster 1x aktif
                        if (newSlimeMonster.getHp() <= 300) {
                            if (passiveCount == 0) {
                                newSlimeMonster.passiveMonster();
                                passiveCount++;
                            }
                        }
                        warrior.defend(newSlimeMonster, "basic");
                        break;
                    case "2":
                        warrior.swordSkill(newSlimeMonster);
                        // Pasif Monster 1x aktif
                        if (newSlimeMonster.getHp() <= 300) {
                            if (passiveCount == 0) {
                                newSlimeMonster.passiveMonster();
                                passiveCount++;
                            }
                        }
                        warrior.defend(newSlimeMonster, "skill");
                        break;
                }
            }
            // Goblin
            else if (monsterValue.equalsIgnoreCase("2")) {
                switch (input) {
                    case "1":
                        warrior.attack(newGoblinMonster);
                        // Pasif Goblin hp dibawah 700 physical def & atknaik
                        if (newGoblinMonster.getHp() <= 700) {
                            newGoblinMonster.passiveMonster();
                        }
                        warrior.defend(newGoblinMonster, "basic");
                        break;
                    case "2":
                        warrior.swordSkill(newGoblinMonster);
                        // Pasif Goblin hp dibawah 700 physical def & atknaik
                        if (newGoblinMonster.getHp() <= 700) {
                            newGoblinMonster.passiveMonster();
                        }
                        warrior.defend(newGoblinMonster, "skill");
                        break;
                }
            }
            // Ibd Monster
            else if (monsterValue.equalsIgnoreCase("3")) {
                switch (input) {
                    case "1":
                        warrior.attack(newIbdMonster);
                        // Pasif HHp diatas 1500 Physical Def++++++ dan Magic Def ++
                        if (newIbdMonster.getHp() >= 1500) {
                            newIbdMonster.passiveMonster();
                        }
                        warrior.defend(newIbdMonster, "basic");
                        break;
                    case "2":
                        warrior.swordSkill(newIbdMonster);
                        // Pasif HHp diatas 1500 Physical Def++++++ dan Magic Def ++
                        if (newIbdMonster.getHp() >= 1500) {
                            newIbdMonster.passiveMonster();
                        }
                        warrior.defend(newIbdMonster, "skill");
                        break;
                }
            }
        }
    }
}
