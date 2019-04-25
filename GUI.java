import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import static java.lang.Thread.sleep;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    Monster monster;
    Novice novice;

    public GUI() {
        super("Ragmarock");
        novice = new Novice();
        monster = new Poring();
        Container g = getContentPane();
        g.setLayout(new GridLayout(2, 2));

        JPanel p1 = new JPanel();

        JPanel killDrop = new JPanel();
        killDrop.setLayout(new BoxLayout(killDrop, BoxLayout.Y_AXIS));
        JLabel killAmount = new JLabel("Kill x" + novice.getKill());
        JLabel dropItem1 = new JLabel("You get HP Potion x1");
        JLabel dropItem2 = new JLabel("You get MP Potion x1");
        ImageIcon noviceC = new ImageIcon("NoviceC.gif");
        ImageIcon swordmanC = new ImageIcon("SwordmanC.gif");
        ImageIcon mageC = new ImageIcon("MageC.gif");
        JLabel picCharacter = new JLabel(noviceC);
        killDrop.add(killAmount);
        killDrop.add(dropItem1);
        killDrop.add(dropItem2);
        dropItem1.setVisible(false);
        dropItem2.setVisible(false);
        p1.add(killDrop);
        p1.add(picCharacter);
        g.add(p1);

        JPanel p2 = new JPanel();
        ImageIcon monsterC = new ImageIcon("MonsterC.gif");
        ImageIcon monster1C = new ImageIcon("Monster1C.gif");
        JLabel pickMonster = new JLabel(monsterC);
        p2.add(pickMonster);
        g.add(p2);
        p2.setVisible(false);

        JPanel p3 = new JPanel();
        JPanel status = new JPanel();
        status.setLayout(new BoxLayout(status, BoxLayout.Y_AXIS));
        JLabel frame1 = new JLabel("=====================================================");
        JLabel name = new JLabel("[" + novice.getJob() + "] Level: " + novice.getLevel());
        JLabel frame2 = new JLabel("=====================================================");
        JLabel hp = new JLabel("HP: " + novice.getHp() + "/" + novice.getMaxHp());
        JLabel mp = new JLabel("MP: " + novice.getMp() + "/" + novice.getMaxMp());
        JLabel exp = new JLabel("EXP: " + novice.getExp() + "/" + novice.getMaxExp());
        JLabel frame3 = new JLabel("=====================================================");
        JLabel inputChangeClass = new JLabel("\"CHANGE CLASS !!!\" => Press: \"Change class\"");
        JLabel inputQuit1 = new JLabel("\"QUIT GAME\" => Press: \"Quit\"");
        JLabel inputAttack = new JLabel("\"ATTACK\" => Press: \"Attack\"");
        JLabel inputInventory = new JLabel("\"INVENTORY\" => Press: \"Inventory\"");
        JLabel inputQuit2 = new JLabel("\"QUIT GAME\" => Press: \"Quit\"");
        JLabel frame4 = new JLabel("=====================================================");
        JLabel input = new JLabel("Input: ");
        JButton bInputChangeClass = new JButton("Change Class");
        JButton bInputQuit1 = new JButton("Quit");
        JButton bInputAttack = new JButton("Attack");
        JButton bInputInventory = new JButton("Inventory");
        JButton bInputInventory1 = new JButton("Inventory");
        JButton bInputQuit2 = new JButton("Quit");
        JButton bInputAttackMonster = new JButton("Attack !");
        JButton bInputSelectMonster1 = new JButton("Poring Lv.1");
        JButton bInputSelectMonster2 = new JButton("Lunatic Lv.5");
        JButton bInputBack = new JButton("Back");
        JButton bInputBack1 = new JButton("Back");
        JButton bInputBack2 = new JButton("Back");
        JButton bInputSelectClass1 = new JButton("1. Swordman (HP up to 500 and MP up to 200)");
        JButton bInputSelectClass2 = new JButton("2. Mage (HP up to 400 and MP up to 500)");
        JButton bInputSelectItem1 = new JButton("- HP Potion (+100hp) x" + novice.bag.getHpInitAmount());
        JButton bInputSelectItem2 = new JButton("- MP Potion (+50mp) x" + novice.bag.getMpInitAmount());

        status.add(frame1);
        status.add(name);
        status.add(frame2);
        status.add(hp);
        status.add(mp);
        status.add(exp);
        status.add(frame3);

        status.add(inputChangeClass);
        status.add(inputQuit1);
        inputChangeClass.setVisible(false);
        inputQuit1.setVisible(false);

        status.add(inputAttack);
        status.add(inputInventory);
        status.add(inputQuit2);

        status.add(frame4);
        status.add(input);

        status.add(bInputSelectClass1);
        status.add(bInputSelectClass2);
        status.add(bInputChangeClass);
        status.add(bInputQuit1);
        bInputChangeClass.setVisible(false);
        bInputQuit1.setVisible(false);
        bInputSelectClass1.setVisible(false);
        bInputSelectClass2.setVisible(false);

        status.add(bInputAttack);
        status.add(bInputAttackMonster);
        status.add(bInputSelectMonster1);
        status.add(bInputSelectMonster2);
        status.add(bInputSelectItem1);
        status.add(bInputSelectItem2);
        status.add(bInputInventory);
        status.add(bInputInventory1);
        status.add(bInputBack);
        status.add(bInputBack1);
        status.add(bInputBack2);
        status.add(bInputQuit2);

        bInputAttackMonster.setVisible(false);
        bInputSelectMonster1.setVisible(false);
        bInputSelectMonster2.setVisible(false);
        bInputInventory1.setVisible(false);
        bInputSelectItem1.setVisible(false);
        bInputSelectItem2.setVisible(false);
        bInputBack.setVisible(false);
        bInputBack1.setVisible(false);
        bInputBack2.setVisible(false);
        
        p3.add(status);
        g.add(p3);

        JPanel p4 = new JPanel();
        JPanel statusMonster = new JPanel();
        statusMonster.setLayout(new BoxLayout(statusMonster, BoxLayout.Y_AXIS));
        JLabel frame1Monster = new JLabel("=====================================================");
        JLabel nameMonster = new JLabel("[" + monster.getName() + "] Level: " + monster.getLevel());
        JLabel frame2Monster = new JLabel("=====================================================");
        JLabel hpMonster = new JLabel("HP: " + monster.getHp() + "/" + monster.getMaxHp());
        JLabel mpMonster = new JLabel("MP: " + monster.getMp() + "/" + monster.getMaxMp());
        JLabel frame3Monster = new JLabel("=====================================================");

        statusMonster.add(frame1Monster);
        statusMonster.add(nameMonster);
        statusMonster.add(frame2Monster);
        statusMonster.add(hpMonster);
        statusMonster.add(mpMonster);
        statusMonster.add(new JLabel(" "));
        statusMonster.add(frame3Monster);

        p4.add(statusMonster);
        g.add(p4);
        p4.setVisible(false);

        bInputChangeClass.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                bInputChangeClass.setVisible(false);
                bInputQuit1.setVisible(false);
                bInputSelectClass1.setVisible(true);
                bInputSelectClass2.setVisible(true);
            }
        });
        bInputSelectClass1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                novice = new Swordman(novice);
                picCharacter.setIcon(swordmanC);
                name.setText("[" + novice.getJob() + "] Level: " + novice.getLevel());
                hp.setText("HP: " + novice.getHp() + "/" + novice.getMaxHp());
                mp.setText("MP: " + novice.getMp() + "/" + novice.getMaxMp());
                exp.setText("EXP: " + novice.getExp() + "/" + novice.getMaxExp());
                inputChangeClass.setVisible(false);
                inputQuit1.setVisible(false);
                bInputSelectClass1.setVisible(false);
                bInputSelectClass2.setVisible(false);
                inputAttack.setVisible(true);
                inputInventory.setVisible(true);
                inputQuit2.setVisible(true);
                bInputAttack.setVisible(true);
                bInputInventory.setVisible(true);
                bInputQuit2.setVisible(true);
            }
        });
        bInputSelectClass2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                novice = new Mage(novice);
                picCharacter.setIcon(mageC);
                name.setText("[" + novice.getJob() + "] Level: " + novice.getLevel());
                hp.setText("HP: " + novice.getHp() + "/" + novice.getMaxHp());
                mp.setText("MP: " + novice.getMp() + "/" + novice.getMaxMp());
                exp.setText("EXP: " + novice.getExp() + "/" + novice.getMaxExp());
                inputChangeClass.setVisible(false);
                inputQuit1.setVisible(false);
                bInputSelectClass1.setVisible(false);
                bInputSelectClass2.setVisible(false);
                inputAttack.setVisible(true);
                inputInventory.setVisible(true);
                inputQuit2.setVisible(true);
                bInputAttack.setVisible(true);
                bInputInventory.setVisible(true);
                bInputQuit2.setVisible(true);
            }
        });
        bInputQuit1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        bInputAttack.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                bInputAttack.setVisible(false);
                bInputInventory.setVisible(false);
                bInputQuit2.setVisible(false);
                bInputSelectMonster1.setVisible(true);
                bInputSelectMonster2.setVisible(true);
                bInputBack.setVisible(true);
            }
        });
        bInputSelectMonster1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                monster = new Poring();
                nameMonster.setText("[" + monster.getName() + "] Level: " + monster.getLevel());
                hpMonster.setText("HP: " + monster.getHp() + "/" + monster.getMaxHp());
                mpMonster.setText("MP: " + monster.getMp() + "/" + monster.getMaxMp());
                pickMonster.setIcon(monsterC);
                p2.setVisible(true);
                p4.setVisible(true);
                dropItem1.setVisible(false);
                dropItem2.setVisible(false);
                bInputSelectMonster1.setVisible(false);
                bInputSelectMonster2.setVisible(false);
                bInputAttackMonster.setVisible(true);
                bInputInventory1.setVisible(true);
                bInputBack.setVisible(false);
                bInputBack1.setVisible(true);
                bInputQuit2.setVisible(false);

            }
        });
        bInputSelectMonster2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                monster = new Lunatic();
                nameMonster.setText("[" + monster.getName() + "] Level: " + monster.getLevel());
                hpMonster.setText("HP: " + monster.getHp() + "/" + monster.getMaxHp());
                mpMonster.setText("MP: " + monster.getMp() + "/" + monster.getMaxMp());
                pickMonster.setIcon(monster1C);
                p2.setVisible(true);
                p4.setVisible(true);
                dropItem1.setVisible(false);
                dropItem2.setVisible(false);
                bInputSelectMonster1.setVisible(false);
                bInputSelectMonster2.setVisible(false);
                bInputAttackMonster.setVisible(true);
                bInputInventory1.setVisible(true);
                bInputBack.setVisible(false);
                bInputBack1.setVisible(true);
                bInputQuit2.setVisible(false);
            }
        });
        bInputAttackMonster.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                monster.getDamage(novice.getAttack());
                hpMonster.setText("HP: " + monster.getHp() + "/" + monster.getMaxHp());
                if(!monster.isAlive()) {
                    novice.killMonster();
                    killAmount.setText("Kill x" + novice.getKill());
                    novice.gainExp(monster.getExp());
                    int gain = novice.gainItem(monster.getDropRate());
                    if(gain == 1 || gain == 2){
                        if(gain == 1) dropItem1.setVisible(true);
                        if(gain == 2) dropItem2.setVisible(true);
                    }
                    if(gain == 0) {
                        dropItem1.setVisible(false);
                        dropItem2.setVisible(false);
                    }
                    name.setText("[" + novice.getJob() + "] Level: " + novice.getLevel());
                    hp.setText("HP: " + novice.getHp() + "/" + novice.getMaxHp());
                    mp.setText("MP: " + novice.getMp() + "/" + novice.getMaxMp());
                    exp.setText("EXP: " + novice.getExp() + "/" + novice.getMaxExp());
                    bInputSelectItem1.setText("- HP Potion (+100hp) x" + novice.bag.getHpInitAmount());
                    bInputSelectItem2.setText("- MP Potion (+50mp) x" + novice.bag.getMpInitAmount());
                    p2.setVisible(false);
                    p4.setVisible(false);
                    bInputSelectMonster1.setVisible(true);
                    bInputSelectMonster2.setVisible(true);
                    bInputAttackMonster.setVisible(false);
                    bInputInventory1.setVisible(false);
                    bInputBack.setVisible(true);
                    bInputBack1.setVisible(false);

                    if(novice.getLevel() == 10 && novice.getJob() == "Novice") {
                        bInputSelectMonster1.setVisible(false);
                        bInputSelectMonster2.setVisible(false);
                        bInputBack.setVisible(false);
                        inputAttack.setVisible(false);
                        inputInventory.setVisible(false);
                        inputQuit2.setVisible(false);
                        inputChangeClass.setVisible(true);
                        inputQuit1.setVisible(true);

                        bInputChangeClass.setVisible(true);
                        bInputQuit1.setVisible(true);
                    }
                }

                novice.getDamage(monster.getAttack());
                hp.setText("HP: " + novice.getHp() + "/" + novice.getMaxHp());
                if(novice.getHp() == 0) {
                    JOptionPane.showMessageDialog(g, "\"GAME OVER !!! \" You died\n You will be respawn with 50% of MAX HP");
                    novice.respawn();
                    p2.setVisible(false);
                    p4.setVisible(false);
                    bInputSelectMonster1.setVisible(false);
                    bInputSelectMonster2.setVisible(false);
                    bInputBack.setVisible(false);
                    bInputBack1.setVisible(false);
                    bInputAttackMonster.setVisible(false);
                    bInputInventory1.setVisible(false);
                    bInputAttack.setVisible(true);
                    bInputInventory.setVisible(true);
                    bInputQuit2.setVisible(true);
                    dropItem1.setVisible(false);
                    dropItem2.setVisible(false);
                }
                hp.setText("HP: " + novice.getHp() + "/" + novice.getMaxHp());
            }
        });
        bInputBack.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                p2.setVisible(false);
                p4.setVisible(false);
                dropItem1.setVisible(false);
                dropItem2.setVisible(false);
                bInputSelectMonster1.setVisible(false);
                bInputSelectMonster2.setVisible(false);
                bInputSelectItem1.setVisible(false);
                bInputSelectItem2.setVisible(false);
                bInputBack.setVisible(false);
                bInputAttackMonster.setVisible(false);
                bInputAttack.setVisible(true);
                bInputInventory.setVisible(true);
                bInputQuit2.setVisible(true);
            }
        });
        bInputBack1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                p2.setVisible(false);
                p4.setVisible(false);
                bInputBack.setVisible(true);
                bInputAttackMonster.setVisible(false);
                bInputInventory1.setVisible(false);
                bInputBack1.setVisible(false);
                bInputSelectMonster1.setVisible(true);
                bInputSelectMonster2.setVisible(true); 
            }
        });
        bInputBack2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                bInputSelectItem1.setVisible(false);
                bInputSelectItem2.setVisible(false);
                bInputBack2.setVisible(false);
                bInputAttackMonster.setVisible(true);
                bInputInventory1.setVisible(true);
                bInputBack1.setVisible(true);
            }
        });
        bInputInventory.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                bInputAttackMonster.setVisible(false);
                bInputAttack.setVisible(false);
                bInputInventory.setVisible(false);
                bInputQuit2.setVisible(false);
                bInputSelectItem1.setVisible(true);
                bInputSelectItem2.setVisible(true);
                bInputBack1.setVisible(false);
                bInputBack.setVisible(true);
            }
        });
        bInputInventory1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                bInputAttackMonster.setVisible(false);
                bInputAttack.setVisible(false);
                bInputInventory1.setVisible(false);
                bInputQuit2.setVisible(false);
                bInputSelectItem1.setVisible(true);
                bInputSelectItem2.setVisible(true);
                bInputBack.setVisible(false);
                bInputBack1.setVisible(false);
                bInputBack2.setVisible(true);
            }
        });
        bInputSelectItem1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                novice.usePotion(novice.bag.hpPotion.getPotionValue());
                bInputSelectItem1.setText("- HP Potion (+100hp) x" + novice.bag.getHpInitAmount());
                hp.setText("HP: " + novice.getHp() + "/" + novice.getMaxHp());
            }
        });
        bInputSelectItem2.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                novice.usePotion(novice.bag.mpPotion.getPotionValue());
                bInputSelectItem2.setText("- MP Potion (+50mp) x" + novice.bag.getMpInitAmount());
                mp.setText("MP: " + novice.getMp() + "/" + novice.getMaxMp());
            }
        });
        bInputQuit2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
    }
}
