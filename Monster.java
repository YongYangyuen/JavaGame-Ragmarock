public class Monster {
    protected int level;
    protected String name;
    protected int maxHp;
    protected int hp;
    protected int maxMp;
    protected int mp;
    protected int attack;
    protected int exp;
    protected boolean alive;
    protected float dropRate;

    public Monster(String name) {
        level = 0;
        this.name = name;
        maxHp = hp = 0;
        maxMp = mp = 0;
        attack = 0;
        exp = 0;
        alive = true;
        dropRate = 0;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
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

    public void getDamage(int damage) {
        hp -= damage;
        if(hp < 0) hp = 0;
    }

    public int getAttack() {
        return attack;
    }

    public int getExp() {
        return exp;
    }
    
    public float getDropRate() {
        return dropRate;
    }

    public boolean isAlive() {
        if(hp == 0) alive = false;
        return alive;
    }
}