/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minibattle;

/**
 *
 * @author user
 */
public class Hero {
    public String name;
    protected int hp,atk,matk,def,mdef;

    Hero(String name) {
        this.name = name;
        this.hp = 800;
        this.atk = 210;
        this.matk = 110;
        this.def = 75;
        this.mdef = 65;
    }

    public int getHp() {
        return hp;
    }

    public void attack(Monster enemy){
        int damage = this.atk-enemy.getDef();
        if (damage<=0){
            damage=0;
        }
        enemy.setHp(damage);
        infoAtk(enemy, damage);
        if (enemy.getHp()<=0) {
            System.out.println("Monster " + enemy.name + " telah dikalahkan");
        }
     }
    
      public void defend(Monster enemy, String attack){
        int damage; 
        if (attack=="basic") {
            damage=enemy.getAtk() - this.def;          
            if (damage<=0) {
                damage=0;
                infoDef(enemy, damage);
            }else{
                this.hp -= damage;             
                if (this.hp<=0) {
                        this.hp=0;
                        System.out.println(this.name + " telah dikalahkan\n");
                        infoDef(enemy, damage);
                        
                    }else{
                       infoDef(enemy, damage); 
                    }
                }
            }else if (attack=="skill") {
            damage=enemy.getMatk()- this.mdef;
                if (damage<=0) {
                    damage=0;
                    infoDef(enemy, damage);
                }else{
                    this.hp -= damage;
                    if (this.hp<=0) {
                        this.hp=0;
                        System.out.println(this.name + " telah dikalahkan\n");
                        infoDef(enemy, damage);
                        
                    }else{
                       infoDef(enemy, damage); 
                    }
                }
            }
       
        
    }

   public void infoDef(Monster enemy,int damage){
        
        System.out.println("\nMonster "+ enemy.name  + (" Menyerang " + this.name ));
        System.out.println("Damage yang diberikan " + enemy.name +" sebesar");
        System.out.println("==> " + enemy.getAtk());
        System.out.println("Damage yang diterima " + this.name + " sebesar");
        System.out.println("==> " + damage);
        System.out.println("Sisa HP " + this.name + " sebesar");
        System.out.println("==> " + this.hp +"\n");
        
    }
    
    public void infoAtk(Monster enemy, int damage){
        System.out.println("\n"+this.name + " Menyerang monster "+ enemy.name);
        System.out.println("Damage yang diberikan " + this.name +" sebesar" );
        System.out.println("==> " + this.atk);
        System.out.println("Damage yang diterima monster "+ enemy.name + " sebesar");
        System.out.println("==> " + damage);
        System.out.println("Sisa HP monster " + enemy.name +" sebesar" );
        System.out.println("==> "+ enemy.getHp() + "\n");
    }
    
    public void showAttribut(){
        System.out.println("Attribut Hero " + this.name);
        System.out.println("HP\t\t: " + this.hp);
        System.out.println("ATK\t\t: " + this.atk);
        System.out.println("MATK\t\t: " + this.matk);
        System.out.println("DEF\t\t: "+ this.def);
        System.out.println("MDEF\t\t: "+ this.mdef);
    }

  
    
    
    
        
}
