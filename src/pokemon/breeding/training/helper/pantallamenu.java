
package pokemon.breeding.training.helper;
import java.io.*;

public class pantallamenu extends javax.swing.JFrame {
int hpevs = 0, attackevs = 0, defenseevs = 0, spattackevs = 0, spdefenseevs = 0, speedevs = 0;
int supert1count = 0, supert2count = 0, supert3count = 0;
int smallbagcount = 0, mediumbagcount = 0, largebagcount = 0;

    public pantallamenu() 
    {
        initComponents();
        buttonGroup1.add(hpchoice);
        buttonGroup1.add(attackchoice);
        buttonGroup1.add(defensechoice);
        buttonGroup1.add(spattackchoice);
        buttonGroup1.add(spdefensechoice);
        buttonGroup1.add(speedchoice);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        evcounter = new javax.swing.JLabel();
        hpevslabel = new javax.swing.JLabel();
        lvl1super = new javax.swing.JButton();
        lvl2super = new javax.swing.JButton();
        lvl3super = new javax.swing.JButton();
        supertraining = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        reset = new javax.swing.JButton();
        lvl1supertimes = new javax.swing.JTextField();
        lvl2supertimes = new javax.swing.JTextField();
        lvl3supertimes = new javax.swing.JTextField();
        reps1 = new javax.swing.JLabel();
        hpevscounter = new javax.swing.JTextField();
        attackevslabel = new javax.swing.JLabel();
        defenseevslabel = new javax.swing.JLabel();
        spattackevslabel = new javax.swing.JLabel();
        spdefenseevslabel = new javax.swing.JLabel();
        speedevslabel = new javax.swing.JLabel();
        attackevscounter = new javax.swing.JTextField();
        defenseevscounter = new javax.swing.JTextField();
        spattackevscounter = new javax.swing.JTextField();
        spdefenseevscounter = new javax.swing.JTextField();
        speedevscounter = new javax.swing.JTextField();
        punchingbags = new javax.swing.JLabel();
        reps2 = new javax.swing.JLabel();
        smallbag = new javax.swing.JButton();
        mediumbag = new javax.swing.JButton();
        largebag = new javax.swing.JButton();
        smallbagtimes = new javax.swing.JTextField();
        mediumbagtimes = new javax.swing.JTextField();
        largebagtimes = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        trainingchoice = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        hpchoice = new javax.swing.JRadioButton();
        attackchoice = new javax.swing.JRadioButton();
        defensechoice = new javax.swing.JRadioButton();
        spattackchoice = new javax.swing.JRadioButton();
        spdefensechoice = new javax.swing.JRadioButton();
        speedchoice = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        title.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        title.setText("Pokemon Breeding / Training Helper");

        evcounter.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        evcounter.setText("EV Counter");

        hpevslabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        hpevslabel.setText("~ HP EVs:");

        lvl1super.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lvl1super.setText("Lvl 1 = + 4 EVs");
        lvl1super.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvl1superActionPerformed(evt);
            }
        });

        lvl2super.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lvl2super.setText("Lvl 2 = + 8 EVs");
        lvl2super.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvl2superActionPerformed(evt);
            }
        });

        lvl3super.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lvl3super.setText("Lvl 3 = + 12 EVs");
        lvl3super.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lvl3superActionPerformed(evt);
            }
        });

        supertraining.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        supertraining.setText("Super Training");

        reset.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        lvl1supertimes.setEditable(false);
        lvl1supertimes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lvl1supertimes.setText("0");

        lvl2supertimes.setEditable(false);
        lvl2supertimes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lvl2supertimes.setText("0");

        lvl3supertimes.setEditable(false);
        lvl3supertimes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lvl3supertimes.setText("0");

        reps1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        reps1.setText("Reps");

        hpevscounter.setEditable(false);
        hpevscounter.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        hpevscounter.setText("0");

        attackevslabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        attackevslabel.setText("~ Attack EVs:");

        defenseevslabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        defenseevslabel.setText("~ Defense EVs:");

        spattackevslabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        spattackevslabel.setText("~ Sp. Attack EVs:");

        spdefenseevslabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        spdefenseevslabel.setText("~ Sp. Defense EVs:");

        speedevslabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        speedevslabel.setText("~ Speed EVs:");

        attackevscounter.setEditable(false);
        attackevscounter.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        attackevscounter.setText("0");

        defenseevscounter.setEditable(false);
        defenseevscounter.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        defenseevscounter.setText("0");

        spattackevscounter.setEditable(false);
        spattackevscounter.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        spattackevscounter.setText("0");

        spdefenseevscounter.setEditable(false);
        spdefenseevscounter.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        spdefenseevscounter.setText("0");

        speedevscounter.setEditable(false);
        speedevscounter.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        speedevscounter.setText("0");

        punchingbags.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        punchingbags.setText("Punching Bags");

        reps2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        reps2.setText("Reps");

        smallbag.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        smallbag.setText("Small Bag = + 1 EVs");
        smallbag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smallbagActionPerformed(evt);
            }
        });

        mediumbag.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        mediumbag.setText("Medium Bag = + 4 EVs");
        mediumbag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediumbagActionPerformed(evt);
            }
        });

        largebag.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        largebag.setText("Large Bag = + 12 EVs");
        largebag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                largebagActionPerformed(evt);
            }
        });

        smallbagtimes.setEditable(false);
        smallbagtimes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        smallbagtimes.setText("0");

        mediumbagtimes.setEditable(false);
        mediumbagtimes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        mediumbagtimes.setText("0");

        largebagtimes.setEditable(false);
        largebagtimes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        largebagtimes.setText("0");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        trainingchoice.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        trainingchoice.setText("What are you training?");
        trainingchoice.setToolTipText("");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        hpchoice.setText("HP");

        attackchoice.setText("Attack");

        defensechoice.setText("Defense");

        spattackchoice.setText("Sp. Attack");

        spdefensechoice.setText("Sp. Defense");

        speedchoice.setText("Speed");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(71, 71, 71))
                    .addComponent(evcounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(attackevslabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lvl3super, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lvl2super, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lvl1super, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(supertraining, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lvl1supertimes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvl2supertimes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lvl3supertimes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reps1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(smallbag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(mediumbag, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(largebag, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(smallbagtimes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mediumbagtimes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(largebagtimes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addComponent(punchingbags)
                                        .addGap(65, 65, 65)
                                        .addComponent(reps2)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(trainingchoice)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(defensechoice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(attackchoice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hpchoice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spattackchoice)
                                    .addComponent(spdefensechoice)
                                    .addComponent(speedchoice)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spdefenseevslabel)
                            .addComponent(speedevslabel)
                            .addComponent(spattackevslabel)
                            .addComponent(defenseevslabel)
                            .addComponent(hpevslabel))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hpevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(defenseevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spattackevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spdefenseevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speedevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(attackevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(reset)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(evcounter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hpevslabel)
                    .addComponent(hpevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(attackevslabel)
                    .addComponent(attackevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defenseevslabel)
                    .addComponent(defenseevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spattackevslabel)
                    .addComponent(spattackevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spdefenseevslabel)
                    .addComponent(spdefenseevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(speedevslabel)
                        .addComponent(speedevscounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(supertraining)
                                    .addComponent(reps1)
                                    .addComponent(punchingbags)
                                    .addComponent(reps2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lvl1super)
                                                .addComponent(lvl1supertimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lvl2super)
                                                .addComponent(lvl2supertimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lvl3super)
                                                .addComponent(lvl3supertimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(smallbag)
                                            .addComponent(smallbagtimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(mediumbag)
                                            .addComponent(mediumbagtimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(largebag)
                                            .addComponent(largebagtimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(trainingchoice)
                                .addGap(5, 5, 5)
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(hpchoice)
                                    .addComponent(spattackchoice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(attackchoice)
                                    .addComponent(spdefensechoice))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(defensechoice)
                                    .addComponent(speedchoice)))))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lvl1superActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvl1superActionPerformed
        if (hpchoice.isSelected())
        {
            hpevs = hpevs + 4;
            hpevscounter.setText(""+hpevs);
            supert1count = supert1count +1;
            lvl1supertimes.setText(""+supert1count);
        }    
        else         
            if (attackchoice.isSelected())
            {
                attackevs = attackevs + 4;
                attackevscounter.setText(""+attackevs);
                supert1count = supert1count +1;
                lvl1supertimes.setText(""+supert1count);
            }
            else
                if (defensechoice.isSelected())
                {
                    defenseevs = defenseevs + 4;
                    defenseevscounter.setText(""+defenseevs);
                    supert1count = supert1count +1;
                    lvl1supertimes.setText(""+supert1count);
                }
                else
                    if (spattackchoice.isSelected())
                    {
                        spattackevs = spattackevs + 4;
                        spattackevscounter.setText(""+spattackevs);
                        supert1count = supert1count +1;
                        lvl1supertimes.setText(""+supert1count);
                    }    
                    else
                        if (spdefensechoice.isSelected())
                        {
                            spdefenseevs = spdefenseevs + 4;
                            spdefenseevscounter.setText(""+spdefenseevs);
                            supert1count = supert1count +1;
                            lvl1supertimes.setText(""+supert1count);
                        }
                        else
                            if (speedchoice.isSelected())
                            {
                                speedevs = speedevs + 4;
                                speedevscounter.setText(""+speedevs);
                                supert1count = supert1count +1;
                                lvl1supertimes.setText(""+supert1count);
                            }
    }//GEN-LAST:event_lvl1superActionPerformed

    private void lvl2superActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvl2superActionPerformed
        if (hpchoice.isSelected())
        {
            hpevs = hpevs + 8;
            hpevscounter.setText(""+hpevs);
            supert2count = supert2count +1;
            lvl2supertimes.setText(""+supert2count);
        }    
        else         
            if (attackchoice.isSelected())
            {
                attackevs = attackevs + 8;
                attackevscounter.setText(""+attackevs);
                supert2count = supert2count +1;
                lvl2supertimes.setText(""+supert2count);
            }
            else
                if (defensechoice.isSelected())
                {
                    defenseevs = defenseevs + 8;
                    defenseevscounter.setText(""+defenseevs);
                    supert2count = supert2count +1;
                    lvl2supertimes.setText(""+supert2count);
                }
                else
                    if (spattackchoice.isSelected())
                    {
                        spattackevs = spattackevs + 8;
                        spattackevscounter.setText(""+spattackevs);
                        supert2count = supert2count +1;
                        lvl2supertimes.setText(""+supert2count);
                    }    
                    else
                        if (spdefensechoice.isSelected())
                        {
                            spdefenseevs = spdefenseevs + 8;
                            spdefenseevscounter.setText(""+spdefenseevs);
                            supert2count = supert2count +1;
                            lvl2supertimes.setText(""+supert2count);
                        }
                        else
                            if (speedchoice.isSelected())
                            {
                                speedevs = speedevs + 8;
                                speedevscounter.setText(""+speedevs);
                                supert2count = supert2count +1;
                                lvl2supertimes.setText(""+supert2count);
                            }
    }//GEN-LAST:event_lvl2superActionPerformed

    private void lvl3superActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lvl3superActionPerformed
        if (hpchoice.isSelected())
        {
            hpevs = hpevs + 12;
            hpevscounter.setText(""+hpevs);
            supert3count = supert3count +1;
            lvl3supertimes.setText(""+supert3count);
        }    
        else         
            if (attackchoice.isSelected())
            {
                attackevs = attackevs + 12;
                attackevscounter.setText(""+attackevs);
                supert3count = supert3count +1;
                lvl3supertimes.setText(""+supert3count);
            }
            else
                if (defensechoice.isSelected())
                {
                    defenseevs = defenseevs + 12;
                    defenseevscounter.setText(""+defenseevs);
                    supert3count = supert3count +1;
                    lvl3supertimes.setText(""+supert3count);
                }
                else
                    if (spattackchoice.isSelected())
                    {
                        spattackevs = spattackevs + 12;
                        spattackevscounter.setText(""+spattackevs);
                        supert3count = supert3count +1;
                        lvl3supertimes.setText(""+supert3count);
                    }    
                    else
                        if (spdefensechoice.isSelected())
                        {
                            spdefenseevs = spdefenseevs + 12;
                            spdefenseevscounter.setText(""+spdefenseevs);
                            supert3count = supert3count +1;
                            lvl3supertimes.setText(""+supert3count);
                        }
                        else
                            if (speedchoice.isSelected())
                            {
                                speedevs = speedevs + 12;
                                speedevscounter.setText(""+speedevs);
                                supert3count = supert3count +1;
                                lvl3supertimes.setText(""+supert3count);
                            }
    }//GEN-LAST:event_lvl3superActionPerformed

    private void smallbagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smallbagActionPerformed
        if (hpchoice.isSelected())
        {
            hpevs = hpevs + 1;
            hpevscounter.setText(""+hpevs);
            smallbagcount = smallbagcount +1;
            smallbagtimes.setText(""+smallbagcount);
        }    
        else         
            if (attackchoice.isSelected())
            {
                attackevs = attackevs + 1;
                attackevscounter.setText(""+attackevs);
                smallbagcount = smallbagcount +1;
                smallbagtimes.setText(""+smallbagcount);
            }
            else
                if (defensechoice.isSelected())
                {
                    defenseevs = defenseevs + 1;
                    defenseevscounter.setText(""+defenseevs);
                    smallbagcount = smallbagcount +1;
                    smallbagtimes.setText(""+smallbagcount);
                }
                else
                    if (spattackchoice.isSelected())
                    {
                        spattackevs = spattackevs + 1;
                        spattackevscounter.setText(""+spattackevs);
                        smallbagcount = smallbagcount +1;
                        smallbagtimes.setText(""+smallbagcount);
                    }    
                    else
                        if (spdefensechoice.isSelected())
                        {
                            spdefenseevs = spdefenseevs + 1;
                            spdefenseevscounter.setText(""+spdefenseevs);
                            smallbagcount = smallbagcount +1;
                            smallbagtimes.setText(""+smallbagcount);
                        }
                        else
                            if (speedchoice.isSelected())
                            {
                                speedevs = speedevs + 1;
                                speedevscounter.setText(""+speedevs);
                                smallbagcount = smallbagcount +1;
                                smallbagtimes.setText(""+smallbagcount);
                            }
    }//GEN-LAST:event_smallbagActionPerformed

    private void mediumbagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediumbagActionPerformed
        if (hpchoice.isSelected())
        {
            hpevs = hpevs + 4;
            hpevscounter.setText(""+hpevs);
            mediumbagcount = mediumbagcount +1;
            mediumbagtimes.setText(""+mediumbagcount);
        }    
        else         
            if (attackchoice.isSelected())
            {
                attackevs = attackevs + 4;
                attackevscounter.setText(""+attackevs);
                mediumbagcount = mediumbagcount +1;
                mediumbagtimes.setText(""+mediumbagcount);
            }
            else
                if (defensechoice.isSelected())
                {
                    defenseevs = defenseevs + 4;
                    defenseevscounter.setText(""+defenseevs);
                    mediumbagcount = mediumbagcount +1;
                    mediumbagtimes.setText(""+mediumbagcount);
                }
                else
                    if (spattackchoice.isSelected())
                    {
                        spattackevs = spattackevs + 4;
                        spattackevscounter.setText(""+spattackevs);
                        mediumbagcount = mediumbagcount +1;
                        mediumbagtimes.setText(""+mediumbagcount);
                    }    
                    else
                        if (spdefensechoice.isSelected())
                        {
                            spdefenseevs = spdefenseevs + 4;
                            spdefenseevscounter.setText(""+spdefenseevs);
                            mediumbagcount = mediumbagcount +1;
                            mediumbagtimes.setText(""+mediumbagcount);
                        }
                        else
                            if (speedchoice.isSelected())
                            {
                                speedevs = speedevs + 4;
                                speedevscounter.setText(""+speedevs);
                                mediumbagcount = mediumbagcount +1;
                                mediumbagtimes.setText(""+mediumbagcount);
                            }
    }//GEN-LAST:event_mediumbagActionPerformed

    private void largebagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_largebagActionPerformed
        if (hpchoice.isSelected())
        {
            hpevs = hpevs + 12;
            hpevscounter.setText(""+hpevs);
            largebagcount = largebagcount +1;
            largebagtimes.setText(""+largebagcount);
        }    
        else         
            if (attackchoice.isSelected())
            {
                attackevs = attackevs + 12;
                attackevscounter.setText(""+attackevs);
                largebagcount = largebagcount +1;
                largebagtimes.setText(""+largebagcount);
            }
            else
                if (defensechoice.isSelected())
                {
                    defenseevs = defenseevs + 12;
                    defenseevscounter.setText(""+defenseevs);
                    largebagcount = largebagcount +1;
                    largebagtimes.setText(""+largebagcount);
                }
                else
                    if (spattackchoice.isSelected())
                    {
                        spattackevs = spattackevs + 12;
                        spattackevscounter.setText(""+spattackevs);
                        largebagcount = largebagcount +1;
                        largebagtimes.setText(""+largebagcount);
                    }    
                    else
                        if (spdefensechoice.isSelected())
                        {
                            spdefenseevs = spdefenseevs + 12;
                            spdefenseevscounter.setText(""+spdefenseevs);
                            largebagcount = largebagcount +1;
                            largebagtimes.setText(""+largebagcount);
                        }
                        else
                            if (speedchoice.isSelected())
                            {
                                speedevs = speedevs + 12;
                                speedevscounter.setText(""+speedevs);
                                largebagcount = largebagcount +1;
                                largebagtimes.setText(""+largebagcount);
                            }
    }//GEN-LAST:event_largebagActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        hpevs = 0; hpevscounter.setText(""+0);
        attackevs = 0; attackevscounter.setText(""+0);
        defenseevs = 0; defenseevscounter.setText(""+0);
        spattackevs = 0; spattackevscounter.setText(""+0);
        spdefenseevs = 0; spdefenseevscounter.setText(""+0);
        speedevs = 0; speedevscounter.setText(""+0);
        supert1count = 0; lvl1supertimes.setText(""+0);
        supert2count = 0; lvl2supertimes.setText(""+0);
        supert3count = 0; lvl3supertimes.setText(""+0);
        smallbagcount = 0; smallbagtimes.setText(""+0);
        mediumbagcount = 0; mediumbagtimes.setText(""+0);
        largebagcount = 0; largebagtimes.setText(""+0);
    }//GEN-LAST:event_resetActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pantallamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantallamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantallamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantallamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantallamenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton attackchoice;
    private javax.swing.JTextField attackevscounter;
    private javax.swing.JLabel attackevslabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton defensechoice;
    private javax.swing.JTextField defenseevscounter;
    private javax.swing.JLabel defenseevslabel;
    private javax.swing.JLabel evcounter;
    private javax.swing.JRadioButton hpchoice;
    private javax.swing.JTextField hpevscounter;
    private javax.swing.JLabel hpevslabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton largebag;
    private javax.swing.JTextField largebagtimes;
    private javax.swing.JButton lvl1super;
    private javax.swing.JTextField lvl1supertimes;
    private javax.swing.JButton lvl2super;
    private javax.swing.JTextField lvl2supertimes;
    private javax.swing.JButton lvl3super;
    private javax.swing.JTextField lvl3supertimes;
    private javax.swing.JButton mediumbag;
    private javax.swing.JTextField mediumbagtimes;
    private javax.swing.JLabel punchingbags;
    private javax.swing.JLabel reps1;
    private javax.swing.JLabel reps2;
    private javax.swing.JButton reset;
    private javax.swing.JButton smallbag;
    private javax.swing.JTextField smallbagtimes;
    private javax.swing.JRadioButton spattackchoice;
    private javax.swing.JTextField spattackevscounter;
    private javax.swing.JLabel spattackevslabel;
    private javax.swing.JRadioButton spdefensechoice;
    private javax.swing.JTextField spdefenseevscounter;
    private javax.swing.JLabel spdefenseevslabel;
    private javax.swing.JRadioButton speedchoice;
    private javax.swing.JTextField speedevscounter;
    private javax.swing.JLabel speedevslabel;
    private javax.swing.JLabel supertraining;
    private javax.swing.JLabel title;
    private javax.swing.JLabel trainingchoice;
    // End of variables declaration//GEN-END:variables
}
