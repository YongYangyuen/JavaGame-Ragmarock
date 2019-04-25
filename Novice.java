import java.io.*;
import java.util.*;

public class Novice {
    private int hp;  // Declared attributes
    private int maxHp;
    private int mp;
    private int maxMp;
    private int exp;
    private int maxExp;
    private int level;
    private String job;
    private int attack;
    private int kill;

    Bag bag;

    public Novice() {
        maxHp = 100;   // Defined attributes
        hp = maxHp;
        maxMp = 100;
        mp = maxMp;
        exp = 0;
        maxExp = 10;
        level = 1;
        job = "Novice";
        attack = 5;
        kill = 0;

        bag = new Bag();
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public int getMp() {
        return mp;
    }

    public int getExp() {
        return exp;
    }

    public int getMaxExp() {
        return maxExp;
    }

    public int getLevel() {
        return level;
    }

    public String getJob() {
        return job;
    }

    public int getAttack() {
        return attack;
    }

    public void getDamage(int damage) {
        hp -= damage;
        if(hp < 0) hp = 0;
    }

    public int getKill() {
        return kill;
    }

    public void killMonster() {
        kill++;
    }

    public void gainExp(int exp) {
        this.exp += exp;
        if(this.exp >= maxExp) {
            this.exp = maxExp;
            levelUp();
        }
    }

    public int gainItem(float dropRate) {
        int gain = 0;
        int rate = (int)(Math.random() * 10) + 1;
        if(dropRate == 20 / 100) {
            if(rate == 1) {
                bag.addHpPotion();
                gain = 1;
                return gain;
            }
            if(rate == 2) {
                bag.addMpPotion();
                gain = 2;
                return gain;
            }
        }
        if(dropRate == 30 / 100) {
            if(rate == 3 || rate == 4) {
                bag.addHpPotion();
                gain = 1;
                return gain;
            }
            if(rate == 5) {
                bag.addMpPotion();
                gain = 2;
                return gain;
            }
        }
        return gain;
    }

    public void levelUp() {
        level++;
        maxHp += 0.15 * maxHp;
        hp = maxHp;
        exp = 0;
        maxExp += 10;
        attack += 2;
    }

    public void usePotion(int increaseValue) {
        if(bag.getHpInitAmount() != 0) {
            if(increaseValue == bag.hpPotion.getPotionValue()) { 
                hp += increaseValue;
                bag.lostHpPotion();
                if(hp > maxHp) {
                    hp = maxHp;
                }
            }
        }

        if(bag.getMpInitAmount() != 0) {
            if(increaseValue == bag.mpPotion.getPotionValue()) {
                mp += increaseValue;
                bag.lostMpPotion();
                if(mp > maxMp) {
                    mp = maxMp;
                }
            }
        }
    }

    public void respawn() {
        hp = maxHp / 2;
    }

    public void changeJobTo(String nameOfJob) {
        job = nameOfJob;
    }

    public void setStatusClass(int level, int maxExp, int hpOfClass, int mpOfClass, int attack, int kill, Bag bag) {
        this.level = level;

        this.maxExp = maxExp;

        maxHp = hpOfClass;
        hp = maxHp;
        
        maxMp = mpOfClass;
        mp = maxMp;

        this.attack = attack;
        this.kill = kill;
        this.bag = bag;
    }
} //end of class