
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

class Songfilter extends javax.swing.filechooser.FileFilter {
    @Override
    public boolean accept(File file) {
        // Allow only directories, or files with ".txt" extension
        return file.isDirectory() || file.getAbsolutePath().endsWith(".mp3");
    }
    @Override
    public String getDescription() {
        // This description will be displayed in the dialog,
        // hard-coded = ugly, should be done via I18N
        return "Text documents (*.mp3)";
    }
}
public class daySong extends javax.swing.JFrame {

    /**
     * Creates new form daySong
     */
    ArrayList<AlarmSongs> aSong2;
    public daySong( ArrayList<AlarmSongs> aSong) {
        getContentPane().setBackground(Color.black);
        initComponents();
        aSong2 = aSong;
        addTolist(aSong);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ChooseSong = new javax.swing.JFileChooser(new File("."));
        Day = new javax.swing.JLabel();
        SelectedSong = new javax.swing.JLabel();
        Choose = new javax.swing.JLabel();
        Monday = new javax.swing.JLabel();
        Tuesday = new javax.swing.JLabel();
        Wednesday = new javax.swing.JLabel();
        Thursday = new javax.swing.JLabel();
        Friday = new javax.swing.JLabel();
        Saturday = new javax.swing.JLabel();
        Sunday = new javax.swing.JLabel();
        Open1 = new javax.swing.JButton();
        Open2 = new javax.swing.JButton();
        Open3 = new javax.swing.JButton();
        Open4 = new javax.swing.JButton();
        Open5 = new javax.swing.JButton();
        Open6 = new javax.swing.JButton();
        Open7 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();

        ChooseSong.setFileFilter(new Songfilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(13, 7, 0));

        Day.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 15)); // NOI18N
        Day.setForeground(new java.awt.Color(0, 255, 255));
        Day.setText("Day");

        SelectedSong.setFont(new java.awt.Font("DejaVu Serif Condensed", 1, 18)); // NOI18N
        SelectedSong.setForeground(new java.awt.Color(0, 255, 255));
        SelectedSong.setText("Selected Song");

        Choose.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        Choose.setForeground(new java.awt.Color(0, 255, 255));
        Choose.setText("Choose");

        Monday.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Monday.setForeground(new java.awt.Color(0, 255, 255));
        Monday.setText("Monday");

        Tuesday.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Tuesday.setForeground(new java.awt.Color(0, 255, 255));
        Tuesday.setText("Tuesday");

        Wednesday.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Wednesday.setForeground(new java.awt.Color(0, 255, 255));
        Wednesday.setText("Wednesday");

        Thursday.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Thursday.setForeground(new java.awt.Color(0, 255, 255));
        Thursday.setText("Thursday");

        Friday.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Friday.setForeground(new java.awt.Color(0, 255, 255));
        Friday.setText("Friday");

        Saturday.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Saturday.setForeground(new java.awt.Color(0, 255, 255));
        Saturday.setText("Saturday");

        Sunday.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Sunday.setForeground(new java.awt.Color(0, 255, 255));
        Sunday.setText("Sunday");

        Open1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Open1.setForeground(new java.awt.Color(0, 255, 255));
        Open1.setText("Open");
        Open1.setOpaque(false);
        Open1.setContentAreaFilled(false);
        Open1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open1ActionPerformed(evt);
            }
        });

        Open2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Open2.setForeground(new java.awt.Color(0, 255, 255));
        Open2.setText("Open");
        Open2.setOpaque(false);
        Open2.setContentAreaFilled(false);
        Open2.setBorderPainted(false);
        Open2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open2ActionPerformed(evt);
            }
        });

        Open3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Open3.setForeground(new java.awt.Color(0, 255, 255));
        Open3.setText("Open");
        Open3.setOpaque(false);
        Open3.setContentAreaFilled(false);
        Open3.setBorderPainted(false);
        Open3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open3ActionPerformed(evt);
            }
        });

        Open4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Open4.setForeground(new java.awt.Color(0, 255, 255));
        Open4.setText("Open");
        Open4.setOpaque(false);
        Open4.setContentAreaFilled(false);
        Open4.setBorderPainted(false);
        Open4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open4ActionPerformed(evt);
            }
        });

        Open5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Open5.setForeground(new java.awt.Color(0, 255, 255));
        Open5.setText("Open");
        Open5.setOpaque(false);
        Open5.setContentAreaFilled(false);
        Open5.setBorderPainted(false);
        Open5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open5ActionPerformed(evt);
            }
        });

        Open6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Open6.setForeground(new java.awt.Color(0, 255, 255));
        Open6.setText("Open");
        Open6.setOpaque(false);
        Open6.setContentAreaFilled(false);
        Open6.setBorderPainted(false);
        Open6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open6ActionPerformed(evt);
            }
        });

        Open7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        Open7.setForeground(new java.awt.Color(0, 255, 255));
        Open7.setText("Open ");
        Open7.setOpaque(false);
        Open7.setContentAreaFilled(false);
        Open7.setBorderPainted(false);
        Open7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Open7ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(1, 1, 1));
        jTextField1.setForeground(new java.awt.Color(244, 248, 248));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(1, 1, 1));
        jTextField2.setForeground(new java.awt.Color(254, 254, 254));
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));

        jTextField3.setBackground(new java.awt.Color(1, 1, 1));
        jTextField3.setForeground(new java.awt.Color(247, 249, 249));
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));

        jTextField4.setBackground(new java.awt.Color(1, 1, 1));
        jTextField4.setForeground(new java.awt.Color(254, 254, 254));
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(1, 1, 1));
        jTextField5.setForeground(new java.awt.Color(254, 254, 254));
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));

        jTextField6.setBackground(new java.awt.Color(13, 9, 5));
        jTextField6.setForeground(new java.awt.Color(0, 255, 255));
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setBackground(new java.awt.Color(1, 1, 1));
        jTextField7.setForeground(new java.awt.Color(0, 255, 255));
        jTextField7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));

        updateButton.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        updateButton.setForeground(new java.awt.Color(0, 255, 255));
        updateButton.setText("Update");
        updateButton.setOpaque(false);
        updateButton.setContentAreaFilled(false);
        updateButton.setBorderPainted(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(Saturday)
                                                        .addComponent(Sunday)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(Tuesday)
                                                                        .addComponent(Wednesday)
                                                                        .addComponent(Thursday)
                                                                        .addComponent(Friday)
                                                                        .addComponent(Monday))
                                                                .addGap(27, 27, 27)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTextField1)
                                                                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                                                                        .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jTextField2)
                                                                        .addComponent(jTextField7))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(Day)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                                                .addComponent(SelectedSong)
                                                .addGap(216, 216, 216)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Open5)
                                        .addComponent(Open4)
                                        .addComponent(Open3)
                                        .addComponent(Open2)
                                        .addComponent(Choose)
                                        .addComponent(Open1)
                                        .addComponent(Open6)
                                        .addComponent(Open7))
                                .addGap(36, 36, 36))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(updateButton)
                                .addGap(358, 358, 358))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Day)
                                        .addComponent(SelectedSong)
                                        .addComponent(Choose))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Monday)
                                        .addComponent(Open1)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Tuesday)
                                        .addComponent(Open2)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Wednesday)
                                        .addComponent(Open3)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(Thursday)
                                                        .addComponent(Open4)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(Friday))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jTextField5)
                                                        .addComponent(Open5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Saturday)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Open6)))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(Open7)
                                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(Sunday))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(updateButton)
                                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Open5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open5ActionPerformed
        int returnVal = ChooseSong.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = ChooseSong.getSelectedFile();
            jTextField5.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_Open5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void Open1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open1ActionPerformed
        int returnVal = ChooseSong.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = ChooseSong.getSelectedFile();
            jTextField1.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_Open1ActionPerformed

    private void Open2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open2ActionPerformed
        int returnVal = ChooseSong.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = ChooseSong.getSelectedFile();
            jTextField2.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_Open2ActionPerformed

    private void Open3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open3ActionPerformed
        int returnVal = ChooseSong.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = ChooseSong.getSelectedFile();
            jTextField3.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_Open3ActionPerformed

    private void Open4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open4ActionPerformed
        int returnVal = ChooseSong.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = ChooseSong.getSelectedFile();
            jTextField4.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_Open4ActionPerformed

    private void Open6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open6ActionPerformed
        int returnVal = ChooseSong.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = ChooseSong.getSelectedFile();
            jTextField6.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_Open6ActionPerformed

    private void Open7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Open7ActionPerformed
        int returnVal = ChooseSong.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = ChooseSong.getSelectedFile();
            jTextField7.setText(file.getAbsolutePath());
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_Open7ActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        addTolist(aSong2);
        dispose();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void addTolist(ArrayList<AlarmSongs> aSong){
        aSong.clear();
        AlarmSongs temp = new AlarmSongs();AlarmSongs temp2 = new AlarmSongs();
        AlarmSongs temp3 = new AlarmSongs();AlarmSongs temp4 = new AlarmSongs();
        AlarmSongs temp5 = new AlarmSongs();AlarmSongs temp6 = new AlarmSongs();
        AlarmSongs temp7 = new AlarmSongs();
        temp.setDay("Monday");temp.setSong(jTextField1.getText());
        aSong.add(temp);
        temp2.setDay("Tuesday");temp2.setSong(jTextField2.getText());
        aSong.add(temp2);
        temp3.setDay("Wednesday");temp3.setSong(jTextField3.getText());
        aSong.add(temp3);
        temp4.setDay("Thursday");temp4.setSong(jTextField4.getText());
        aSong.add(temp4);
        temp5.setDay("Friday");temp5.setSong(jTextField5.getText());
        aSong.add(temp5);
        temp6.setDay("Saturday");temp6.setSong(jTextField6.getText());
        aSong.add(temp6);
        temp7.setDay("Sunday");temp7.setSong(jTextField7.getText());
        aSong.add(temp7);
    }
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
            java.util.logging.Logger.getLogger(daySong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daySong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daySong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daySong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new daySong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Choose;
    private javax.swing.JFileChooser ChooseSong;
    private javax.swing.JLabel Day;
    private javax.swing.JLabel Friday;
    private javax.swing.JLabel Monday;
    private javax.swing.JButton Open1;
    private javax.swing.JButton Open2;
    private javax.swing.JButton Open3;
    private javax.swing.JButton Open4;
    private javax.swing.JButton Open5;
    private javax.swing.JButton Open6;
    private javax.swing.JButton Open7;
    private javax.swing.JLabel Saturday;
    private javax.swing.JLabel SelectedSong;
    private javax.swing.JLabel Sunday;
    private javax.swing.JLabel Thursday;
    private javax.swing.JLabel Tuesday;
    private javax.swing.JLabel Wednesday;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
