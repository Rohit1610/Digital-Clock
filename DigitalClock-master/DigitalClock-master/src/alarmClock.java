import jaco.mp3.player.MP3Player;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class alarmClock extends javax.swing.JFrame {

    private ArrayList<Time> alarms;
    private String day1, hours1, minutes1, seconds1;
    private ArrayList<AlarmSongs> aSongs;
    private daySong dSong;
    private Time curAlarm;
    private dismissAlarm disA;
    public alarmClock() {
        initComponents();
        alarms = new ArrayList<Time>();
        aSongs = new ArrayList<AlarmSongs>(1000);
        dSong = new daySong(aSongs);
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        readInput();
    }
    class timeVerifier extends InputVerifier {
         public boolean verify(JComponent in) {
             JTextField tField = (JTextField) in;
             return ( Integer.parseInt(tField.getText()) <= 60 && Integer.parseInt(tField.getText()) >= 0);
         }
     }

    ArrayList<Time> getAlarmList()
    {
       return alarms;    
    }
    void checkAlarm(Time Time1, String day)
    {
        int i, j;
        String song1 = "";
        for(i = 0; i < alarms.size(); ++i)
        {
            if( alarms.get(i).getHours() == (Time1.getHours()) && alarms.get(i).getMinutes() == Time1.getMinutes() && 
                    alarms.get(i).getSeconds() == Time1.getSeconds() && alarms.get(i).getFlag() == 0
                    && alarms.get(i).getDay().compareTo(Time1.getDay()) == 0)
            {
                alarms.get(i).setFlag(1);
                curAlarm = alarms.get(i);
                for(j = 0; j < 7; ++j)
                {
                    if( alarms.get(i).getDay().compareTo(aSongs.get(j).getDay()) == 0)
                    {
                        song1 = aSongs.get(j).getSong();
                    }
                }
                MP3Player mp3player = new MP3Player(new File(song1));
                mp3player.play();
                mp3player.setRepeat(true);
                disA = new dismissAlarm(alarms, mp3player, i);
                disA.setVisible(true);
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        hour1 = new javax.swing.JTextField();
        minute1 = new javax.swing.JTextField();
        second1 = new javax.swing.JTextField();
        addAlarmButton = new javax.swing.JButton();
        editAlarmButton = new javax.swing.JButton();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        settingsButton = new javax.swing.JButton();
        daySelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Century Schoolbook L", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 255, 255));
        label1.setText("ALARM MANAGER");

        hour1.setBackground(new java.awt.Color(0, 0, 0));
        hour1.setFont(new java.awt.Font("Century Schoolbook L", 1, 36)); // NOI18N
        hour1.setForeground(new java.awt.Color(0, 255, 255));
        hour1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hour1.setText("00");
        hour1.setToolTipText("");
        hour1.setInputVerifier(new timeVerifier());
        hour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hour1ActionPerformed(evt);
            }
        });

        minute1.setBackground(new java.awt.Color(0, 0, 0));
        minute1.setFont(new java.awt.Font("Century Schoolbook L", 1, 36)); // NOI18N
        minute1.setForeground(new java.awt.Color(0, 255, 255));
        minute1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minute1.setText("00");
        minute1.setInputVerifier(new timeVerifier());

        second1.setBackground(new java.awt.Color(0, 0, 0));
        second1.setFont(new java.awt.Font("Century Schoolbook L", 1, 36)); // NOI18N
        second1.setForeground(new java.awt.Color(0, 255, 255));
        second1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        second1.setText("00");
        second1.setInputVerifier(new timeVerifier());
        second1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                second1ActionPerformed(evt);
            }
        });

        addAlarmButton.setForeground(new java.awt.Color(0, 255, 255));
        addAlarmButton.setText("Add Alarm");
        addAlarmButton.setOpaque(false);
        addAlarmButton.setContentAreaFilled(false);
        addAlarmButton.setBorderPainted(false);
        addAlarmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAlarmButtonActionPerformed(evt);
            }
        });

        editAlarmButton.setForeground(new java.awt.Color(0, 255, 255));
        editAlarmButton.setText("Edit Alarms");
        editAlarmButton.setOpaque(false);
        editAlarmButton.setContentAreaFilled(false);
        editAlarmButton.setBorderPainted(false);
        editAlarmButton.setToolTipText("");
        editAlarmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAlarmButtonActionPerformed(evt);
            }
        });

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(new java.awt.Color(0, 0, 0));
        label2.setFont(new java.awt.Font("FreeSerif", 1, 48)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 255, 255));
        label2.setText(":");

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(new java.awt.Color(0, 0, 0));
        label3.setFont(new java.awt.Font("FreeSerif", 1, 48)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 255, 255));
        label3.setText(":");

        settingsButton.setBackground(new java.awt.Color(0, 0, 0));
        settingsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/settingsicon.png")));
        settingsButton.setToolTipText("");
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        daySelect.setForeground(new java.awt.Color(0, 255, 255));
        daySelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", " " }));
        daySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daySelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(daySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addAlarmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(editAlarmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hour1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minute1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(second1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(settingsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(second1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(hour1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(minute1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAlarmButton)
                    .addComponent(daySelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(editAlarmButton)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        label1.getAccessibleContext().setAccessibleName("clockName");
        label1.getAccessibleContext().setAccessibleDescription("");
        hour1.getAccessibleContext().setAccessibleName("hoursField");
        minute1.getAccessibleContext().setAccessibleName("minutesField");
        second1.getAccessibleContext().setAccessibleName("secondsField");
        addAlarmButton.getAccessibleContext().setAccessibleName("");
        editAlarmButton.getAccessibleContext().setAccessibleName("");
        daySelect.getAccessibleContext().setAccessibleName("weekDay");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void second1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_second1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_second1ActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
         dSong.setVisible(true);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void addAlarmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAlarmButtonActionPerformed
        String Str1 = "Do you want to set Alarm at "+hour1.getText()+":"+minute1.getText()+":"+second1.getText()+ " on "+
                daySelect.getSelectedItem().toString()+" ? ";
        int confirm = JOptionPane.showConfirmDialog(null,Str1,"Confirm adding alarm",JOptionPane.YES_NO_OPTION);
        if( confirm == 0)
        alarms.add(new Time(hour1.getText(),minute1.getText(),second1.getText(),daySelect.getSelectedItem().toString()));
         //alarms.add(new Time(hour1.getText(),minute1.getText(),second1.getText(),daySelect.getSelectedItem().toString()));
         writeInput();
    }//GEN-LAST:event_addAlarmButtonActionPerformed

    private void editAlarmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAlarmButtonActionPerformed
        EditAlarmDialog editAlarmDialog = new EditAlarmDialog(this, rootPaneCheckingEnabled, alarms);
        editAlarmDialog.setVisible(true);
    }//GEN-LAST:event_editAlarmButtonActionPerformed

    private void daySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daySelectActionPerformed
        day1 = daySelect.getSelectedItem().toString();
    }//GEN-LAST:event_daySelectActionPerformed

    private void hour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hour1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hour1ActionPerformed

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
            java.util.logging.Logger.getLogger(alarmClock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alarmClock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alarmClock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alarmClock.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alarmClock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAlarmButton;
    private javax.swing.JComboBox<String> daySelect;
    private javax.swing.JButton editAlarmButton;
    private javax.swing.JTextField hour1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private javax.swing.JTextField minute1;
    private javax.swing.JTextField second1;
    private javax.swing.JButton settingsButton;
    // End of variables declaration//GEN-END:variables

    private void writeInput(){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("DigitalClock-master/input.txt");
        } catch (IOException ex) {
            Logger.getLogger(EditAlarmDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(String.valueOf(alarms.size()));
        //printWriter.print(String.valueOf(alarms.size())+"<br/>");
        for(Time time : alarms) {
            printWriter.println(time.toString()+ " " + time.getDay());
            //printWriter.print(time.toString()+ " " + time.getDay()+"<br/>");
        }
        printWriter.close();
    }

    private void readInput() {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("DigitalClock-master/input.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(alarmClock.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("not found file");
        }
        int nAlarms = sc.nextInt();
        alarms.clear();
        for (int i = 0; i < nAlarms; i++) {
            String timeStr = sc.next();
            String day = sc.next();
            Time time = new Time(timeStr,day);
            alarms.add(time);
        }
    }

}
