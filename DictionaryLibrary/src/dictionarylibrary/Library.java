/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionarylibrary;

import com.darkprograms.speech.synthesiser.SynthesiserV2;
import com.darkprograms.speech.translator.GoogleTranslate;
import jaco.mp3.player.MP3Player;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;
/**
 *
 * @author Admin
 */
public final class Library extends javax.swing.JFrame {

    DictionaryCommandLine data = new DictionaryCommandLine();
    DefaultListModel<String> test = new DefaultListModel();
    ArrayList s = new ArrayList();
    SynthesiserV2 speak;

    private int color = 1;

    /**
     * Creates new form Library
     */
    public Library() {
        this.speak = new SynthesiserV2("AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw");
        initComponents();
        NhapTest();
        List.setModel(test);
    }

    public void NhapTest() {
        test.clear();
        s.clear();
        for (int i = 0; i < data.Size(); i++) {
            s.add(data.LookUp1(i));
        }
        Collections.sort((s));
        for (int i = 0; i < data.Size(); i++) {
            test.addElement((String) s.get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        engText = new javax.swing.JTextField();
        vnLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        addButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        aboutusButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        KinhLup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Mp3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        On = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Off = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(632, 410));
        setPreferredSize(new java.awt.Dimension(630, 410));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(632, 370));
        jPanel1.setLayout(null);

        engText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        engText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                engTextActionPerformed(evt);
            }
        });
        engText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                engTextKeyReleased(evt);
            }
        });
        jPanel1.add(engText);
        engText.setBounds(83, 80, 170, 28);

        vnLabel.setBackground(new java.awt.Color(255, 255, 255));
        vnLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vnLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        vnLabel.setOpaque(true);
        jPanel1.add(vnLabel);
        vnLabel.setBounds(302, 80, 223, 28);

        List.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
        List.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        List.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        List.setSelectionBackground(new java.awt.Color(255, 102, 102));
        List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(List);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(83, 127, 170, 220);

        addButton.setBackground(new java.awt.Color(255, 153, 153));
        addButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturephoto/44416428_316681132395339_1174803568411017216_n.png"))); // NOI18N
        addButton.setText("  Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton);
        addButton.setBounds(302, 136, 97, 37);

        editButton.setBackground(new java.awt.Color(255, 153, 153));
        editButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturephoto/received_1846317038750321.gif"))); // NOI18N
        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        jPanel1.add(editButton);
        editButton.setBounds(302, 220, 89, 39);

        deleteButton.setBackground(new java.awt.Color(255, 153, 153));
        deleteButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturephoto/44458142_174930830099946_9196116457862201344_n.png"))); // NOI18N
        deleteButton.setText("  Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        jPanel1.add(deleteButton);
        deleteButton.setBounds(302, 300, 111, 37);

        aboutusButton.setBackground(new java.awt.Color(255, 153, 153));
        aboutusButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aboutusButton.setForeground(new java.awt.Color(255, 255, 255));
        aboutusButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturephoto/44563762_1952303748181620_3006777110665625600_n.png"))); // NOI18N
        aboutusButton.setText("About");
        aboutusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutusButtonActionPerformed(evt);
            }
        });
        jPanel1.add(aboutusButton);
        aboutusButton.setBounds(444, 136, 103, 39);

        exitButton.setBackground(new java.awt.Color(255, 153, 153));
        exitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturephoto/received_315589752576823.gif"))); // NOI18N
        exitButton.setText(" Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton);
        exitButton.setBounds(444, 221, 93, 39);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(535, 80, 63, 28);

        KinhLup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturephoto/1287514.png"))); // NOI18N
        KinhLup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KinhLupActionPerformed(evt);
            }
        });
        jPanel1.add(KinhLup);
        KinhLup.setBounds(53, 80, 30, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("          English - Vietnamese Simple Dictionary");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 14, 570, 40);

        Mp3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturephoto/44442121_2153205701664443_2227764854574284800_n.png"))); // NOI18N
        Mp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mp3ActionPerformed(evt);
            }
        });
        jPanel1.add(Mp3);
        Mp3.setBounds(260, 80, 30, 30);

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        On.setText("      On");
        On.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(On, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(On, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(450, 300, 50, 30);

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        Off.setText("      Off");
        Off.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OffMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Off, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Off, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(500, 300, 50, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picturephoto/5558590975d5009.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 60, 630, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String eng = JOptionPane.showInputDialog(rootPane, "Hãy nhập từ Tiếng Anh mới: ");
        if (eng.length() != 0) {
            int key = data.DictionarySearcher(eng);
            if (key > 0) {
                JOptionPane.showMessageDialog(rootPane, "Đã xuất hiện từ này trong dữ liệu có sẵn!");
            } else {
                String vn = JOptionPane.showInputDialog(rootPane, "Hãy nhập nghĩa Tiếng Việt của từ :");
                if (vn.length() > 0) {
                    data.Add(eng, vn);
                    NhapTest();
                    List.setModel(test);
                }
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void aboutusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutusButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "Made and designed by :" + "\n" + "- NguyManhChung" + "\n" + "- TranQuocTien");
    }//GEN-LAST:event_aboutusButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        String eng = JOptionPane.showInputDialog(rootPane, "Hãy nhập từ Tiếng Anh cần sửa: ");
        if (eng.length() != 0) {
            int key = data.DictionarySearcher(eng);
            if (key > 0) {
                String vn = JOptionPane.showInputDialog(rootPane, "Hãy nhập nghĩa Tiếng Việt mới:");
                data.EditFrom(eng, vn);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Không có từ cần sửa trong dữ liệu!");

            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        String eng = JOptionPane.showInputDialog(rootPane, "Hãy nhập từ Tiếng Anh cần xóa: ");
        if (eng.length() != 0) {
            int key = data.DictionarySearcher(eng);
            if (key > 0) {
                JOptionPane.showMessageDialog(rootPane, "Đã xóa từ theo yêu cầu!");
                data.Del(eng);
                NhapTest();
                List.setModel(test);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Không có từ cần xóa trong dữ liệu!");

            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void engTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_engTextActionPerformed
        // TODO add your handling code here:
        if (color == 1) {
            String eng = engText.getText();
            int key = data.DictionarySearcher(eng);
            if (key != -1) {
                vnLabel.setText(data.LookUp(eng));
            } else {
                JOptionPane.showMessageDialog(rootPane, "Không tìm thấy từ cần tìm kiếm. Hãy thêm từ ở mục add");
            }
        }


    }//GEN-LAST:event_engTextActionPerformed
    public String GoogleTranslate(String a, String b) {
        //xem tai lieu tren mang
        String s1 = "";
        try {
            s1 = GoogleTranslate.translate(a, b);
        } catch (IOException ex) {
            Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
        }

        return s1;
    }
    private void engTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_engTextKeyReleased
        // TODO add your handling code here:
        if (color == 1) {
            String a = engText.getText();
            TimKiem(a);
        } else {
            String b = engText.getText();
            String a = GoogleTranslate("vi", b);
            vnLabel.setText(a);
        }
    }//GEN-LAST:event_engTextKeyReleased

    private void ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMouseClicked
        // TODO add your handling code here:
        int i = List.getSelectedIndex();
        String a = (String) s.get(i);
        vnLabel.setText(data.LookUp(a));
    }//GEN-LAST:event_ListMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        engText.setText("");
        vnLabel.setText("");
        NhapTest();
        List.setModel(test);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void KinhLupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KinhLupActionPerformed
        // TODO add your handling code here:
        String eng = engText.getText();
        int key = data.DictionarySearcher(eng);
        if (key != -1) {
            vnLabel.setText(data.LookUp(eng));
        } else {
            JOptionPane.showMessageDialog(rootPane, "Không tìm thấy từ cần tìm kiếm. Hãy thêm từ ở mục add");
        }
    }//GEN-LAST:event_KinhLupActionPerformed

    private void Mp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mp3ActionPerformed
        // TODO add your handling code here:
        //xem tai lieu tren mang
        if (color == 1) {
            String eng = engText.getText();
            new MP3Player(new File("C:\\BaiTapTuanJava\\DICTIONARY11\\DictionaryLibrary\\src\\Mp3\\" + eng + ".mp3")).play();
        } else {
            String eng = engText.getText();
            Thread thread = new Thread(() -> {
                try {
                    speak.setSpeed(0.9);
                    AdvancedPlayer start = null;
                    try {
                        start = new AdvancedPlayer(speak.getMP3Data(eng));
                    } catch (JavaLayerException ex) {
                        Logger.getLogger(Library.class.getName()).log(Level.SEVERE, null, ex);
                        //JOptionPane.showMessageDialog(rootPane, "Không có Internet!!!");
                    }
                    start.play();
                } catch (IOException | JavaLayerException e) {
                    System.out.println("Không có Internet!!!");        
                    JOptionPane.showMessageDialog(rootPane, "Không có Internet!!!");
                }
            });
            thread.setDaemon(false);
            thread.start();
        }
    }//GEN-LAST:event_Mp3ActionPerformed

    private void OnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnMouseClicked
        // TODO add your handling code here:
        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        color = 0;
    }//GEN-LAST:event_OnMouseClicked

    private void OffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OffMouseClicked
        // TODO add your handling code here:
        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setBackground(new java.awt.Color(0, 102, 204));
        color = 1;
    }//GEN-LAST:event_OffMouseClicked
    public void TimKiem(String a) {
        test.clear();
        s.clear();
        for (int i = 0; i < data.Size(); i++) {
            String b = data.English().get(i);
            if (b.indexOf(a) == 0) {
                s.add(data.English().get(i));
            }
        }
        for (int i = 0; i < data.Size(); i++) {
            String b = data.English().get(i);
            if (b.indexOf(a) > 0) {
                s.add(data.English().get(i));
            }
        }
        
        for (int i = 0; i < s.size(); i++) {
            test.addElement((String) s.get(i));
        }
        List.setModel(test);
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Library.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Library().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KinhLup;
    private javax.swing.JList<String> List;
    private javax.swing.JButton Mp3;
    private javax.swing.JLabel Off;
    private javax.swing.JLabel On;
    private javax.swing.JButton aboutusButton;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField engText;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel vnLabel;
    // End of variables declaration//GEN-END:variables
}
