package buildyourteam;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import static java.util.Collections.list;
import java.util.Locale;
import java.util.Vector;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 * version 1.2.
 * @author Ono
 */
public class BuildYourTeam extends javax.swing.JFrame {

    /**
     * Creates new form Build
     */
    public BuildYourTeam() {
        Locale dil = new Locale("tr" , "TR");
        Locale.setDefault(dil);
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jList7 = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jList8 = new javax.swing.JList<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jList9 = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jList10 = new javax.swing.JList<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        jList11 = new javax.swing.JList<>();
        jScrollPane12 = new javax.swing.JScrollPane();
        jList12 = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Build Your Team");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(153, 255, 0));
        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NO");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(24, 24));

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NAME");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setOpaque(true);

        jList1.setBackground(new java.awt.Color(153, 255, 0));
        jList1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        jList2.setBackground(new java.awt.Color(255, 255, 102));
        jList2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jList2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jList2);

        jList3.setBackground(new java.awt.Color(255, 255, 102));
        jList3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jList3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(jList3);

        jList4.setBackground(new java.awt.Color(255, 255, 102));
        jList4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jList4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(jList4);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jButton1.setText("<html><center>Add / Remove" + "<br/>to/from the" + "<br/>First Team</center></html>");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jButton2.setText("<html><center>Add / Remove" + "<br/>to/from the" + "<br/>Substitutes</center></html>");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jButton2.setPreferredSize(new java.awt.Dimension(75, 19));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jList5.setBackground(new java.awt.Color(153, 255, 0));
        jList5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jList5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(jList5);

        jList6.setBackground(new java.awt.Color(153, 255, 0));
        jList6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jList6.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane6.setViewportView(jList6);

        jLabel3.setBackground(new java.awt.Color(153, 255, 0));
        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NO");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(24, 24));

        jLabel4.setBackground(new java.awt.Color(255, 255, 102));
        jLabel4.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LINEUP");
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);
        jLabel4.setPreferredSize(new java.awt.Dimension(52, 24));

        jLabel5.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel6.setBackground(new java.awt.Color(0, 255, 204));
        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ORIGIN POSITION");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setOpaque(true);

        jList7.setBackground(new java.awt.Color(0, 255, 204));
        jList7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jList7.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane7.setViewportView(jList7);

        jLabel7.setBackground(new java.awt.Color(255, 153, 0));
        jLabel7.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("AGE");
        jLabel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 255), null, null));
        jLabel7.setOpaque(true);

        jList8.setBackground(new java.awt.Color(255, 153, 0));
        jList8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jList8.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane8.setViewportView(jList8);

        jLabel8.setBackground(new java.awt.Color(0, 255, 204));
        jLabel8.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("POSITION");
        jLabel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setOpaque(true);
        jLabel8.setPreferredSize(new java.awt.Dimension(67, 24));

        jList9.setBackground(new java.awt.Color(0, 255, 204));
        jList9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jList9.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane9.setViewportView(jList9);

        jList10.setBackground(new java.awt.Color(0, 255, 204));
        jList10.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jList10.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane10.setViewportView(jList10);

        jLabel9.setBackground(new java.awt.Color(255, 153, 0));
        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("AGE");
        jLabel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setOpaque(true);
        jLabel9.setPreferredSize(new java.awt.Dimension(32, 24));

        jList11.setBackground(new java.awt.Color(255, 153, 0));
        jList11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jList11.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane11.setViewportView(jList11);

        jList12.setBackground(new java.awt.Color(255, 153, 0));
        jList12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jList12.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane12.setViewportView(jList12);

        jLabel10.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Players (11): ");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jButton3.setBackground(new java.awt.Color(255, 0, 102));
        jButton3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jButton3.setText("Clear ALL");
        jButton3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Bell MT", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 204));
        jLabel11.setText("Kadrodaki Oyuncu Sayısı: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane7)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane11)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                .addComponent(jScrollPane12)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        jList1.setEnabled(false);
        jList7.setEnabled(false);
        jList8.setEnabled(false);
        jList5.setEnabled(false);
        jList9.setEnabled(false);
        jList11.setEnabled(false);
        jList6.setEnabled(false);
        jList10.setEnabled(false);
        jList12.setEnabled(false);
        
        TotalPlayers totalPlayers = new TotalPlayers();
        
        String yol = "C:\\Users\\onurk\\Documents\\NetBeansProjects\\BuildYourTeam\\files\\fenerbahce.txt";
        String satir = "";
        int elemanlar = totalPlayers.totalPlayers(yol);        
        jLabel11.setText("Players in the team: " + elemanlar);
        // System.out.println(elemanlar);
        numaralar = new Vector<>(elemanlar);
        oyuncular = new Vector<>(elemanlar);
        mevki = new Vector<>(elemanlar);
        yas = new Vector<>(elemanlar);
        takim1 = new Vector<>(11);
        takim1no = new Vector<>(11);
        takim1mevki = new Vector<>(11);
        takim1yas = new Vector<>(11);
        takim2 = new Vector<>(11);
        takim2no = new Vector<>(11);
        reset = new Vector<>(1);
        jList1.setListData(numaralar);
        jList2.setListData(oyuncular);
        jList7.setListData(mevki);
        jList8.setListData(yas);
        //int i = 0;
                
        try {
            FileInputStream akis = new FileInputStream(yol);
            InputStreamReader okuyucu = new InputStreamReader(akis);
            BufferedReader buffer = new BufferedReader(okuyucu);
            
            while(true) {
                String[] dizi = new String[4];
                satir = buffer.readLine();
                if (satir == null)
                    break;
                dizi = satir.split("\t");
                
                //JOptionPane.showMessageDialog(null, dizi[0] + "\n" + dizi[1] + "\n" + dizi[2] + "\n" + dizi[3]);
                
                numaralar.add(dizi[0]);
                oyuncular.add(dizi[1]);
                mevki.add(dizi[2]);
                yas.add(dizi[3]);
                //i++;
            }
            //numaralar.add("d");s
            jList1.setListData(numaralar);
            jList2.setListData(oyuncular);
            jList7.setListData(mevki);
            jList8.setListData(yas);
            akis.close();
        }
        
        catch(IOException | NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("Hata Alındı: " + e.getMessage());
        }
        
        DefaultListCellRenderer renderer1 =  (DefaultListCellRenderer)jList1.getCellRenderer();  
        renderer1.setHorizontalAlignment(jLabel1.CENTER);
        DefaultListCellRenderer renderer2 =  (DefaultListCellRenderer)jList5.getCellRenderer();  
        renderer2.setHorizontalAlignment(jLabel1.CENTER);
        DefaultListCellRenderer renderer3 =  (DefaultListCellRenderer)jList6.getCellRenderer();  
        renderer3.setHorizontalAlignment(jLabel1.CENTER);
        DefaultListCellRenderer renderer4 =  (DefaultListCellRenderer)jList8.getCellRenderer();  
        renderer4.setHorizontalAlignment(jLabel1.CENTER);
        DefaultListCellRenderer renderer5 =  (DefaultListCellRenderer)jList11.getCellRenderer();  
        renderer5.setHorizontalAlignment(jLabel1.CENTER);
        DefaultListCellRenderer renderer6 =  (DefaultListCellRenderer)jList12.getCellRenderer();  
        renderer6.setHorizontalAlignment(jLabel1.CENTER);
        
    }//GEN-LAST:event_formWindowOpened

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Integer sayim = jList3.getLastVisibleIndex()+1;
        
        //jLabel5.setText("No changes, because of nothing has chosen...");
        
        // ana takimdan ilk 11 e aktarmak
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        int sira ;
        
        if(sayim <= 10) {
            
            if(jList2.getSelectedValue() != null) {
                str2 = jList2.getSelectedValue();
                sira = jList2.getSelectedIndex();
                jList1.setSelectedIndex(sira);
                jList7.setSelectedIndex(sira);
                jList8.setSelectedIndex(sira);
                str1 = jList1.getSelectedValue();
                str3 = jList7.getSelectedValue();
                str4 = jList8.getSelectedValue();
                takim1no.add(str1);
                takim1.add(str2);
                takim1mevki.add(str3);
                takim1yas.add(str4);
                jLabel5.setText("Player has been added succesfully");
                //JOptionPane.showMessageDialog(null, "jList2 seçilen değer boş değil: " + str2);
                players += 1;
            }

            if(takim1.contains(str2)) {
                numaralar.removeElement(str1);
                oyuncular.removeElement(str2);
                mevki.removeElement(str3);
                yas.removeElement(str4);
            }
        }//if sonu
        
        if (sayim > 10) {
            JOptionPane.showMessageDialog(null, "Since the Lineups has been completed,\nyou cannot add more players...");
            jLabel5.setText("11 players added to the first team.. You can add players to sub.. ");
        }
        
        // ilk 11 den ilk listeye geri dönüş
        if(jList3.getSelectedValue() != null) {
            
            if(jList3.getSelectedValue() != null) {
                str2 = jList3.getSelectedValue();
                sira = jList3.getSelectedIndex();
                jList5.setSelectedIndex(sira);
                jList9.setSelectedIndex(sira);
                jList11.setSelectedIndex(sira);
                str1 = jList5.getSelectedValue();
                str3 = jList9.getSelectedValue();
                str4 = jList11.getSelectedValue();
                numaralar.add(str1);
                oyuncular.add(str2);
                mevki.add(str3);
                yas.add(str4);
                jLabel5.setText("Player has been added succesfully");
                players -= 1;
            }


            if(oyuncular.contains(str2)) {
                takim1no.removeElement(str1);
                takim1.removeElement(str2);
                takim1mevki.removeElement(str3);
                takim1yas.removeElement(str4);
            }
        
        }
        jList1.setListData(numaralar);
        jList2.setListData(oyuncular);
        jList7.setListData(mevki);
        jList8.setListData(yas);
        jList3.setListData(takim1);
        jList5.setListData(takim1no);
        jList9.setListData(takim1mevki);
        jList11.setListData(takim1yas);
                
        //String tx = sayim.toString();
        String setjLabel10Text = "<html>" + players +" players<br/>has been added</html>";
        jLabel10.setForeground(Color.blue);        
        jLabel10.setText(setjLabel10Text);
        
        
        System.out.println(sayim);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        ImageIcon icon = new ImageIcon("src/images/pluger.png");
        int confirm = JOptionPane.showConfirmDialog(null, "All data will be lost!", "Select an Option..", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, icon);
        
        if (confirm == 0) {
            Object ono = null ;
            formWindowOpened((WindowEvent) ono);

            jList3.setListData(reset);
            jList5.setListData(reset);
            jList9.setListData(reset);
            jList11.setListData(reset);
            jLabel10.setForeground(Color.red);
            jLabel10.setText("<html>The first team " + "<br/>is wiped out</html>");
            jLabel5.setText("");
        }
        else {
            jLabel10.setText("<html>No change has " + "<br/>been made</html>");
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(BuildYourTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuildYourTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuildYourTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuildYourTeam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuildYourTeam().setVisible(true);
            }
        });
        
    }

    Vector<String> numaralar;
    Vector<String> oyuncular;
    Vector<String> mevki;
    Vector<String> yas;
    Vector<String> takim1;
    Vector<String> takim1no;
    Vector<String> takim1mevki;
    Vector<String> takim1yas;
    Vector<String> takim2;
    Vector<String> takim2no;
    Vector<String> reset;
    int players = 0;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList10;
    private javax.swing.JList<String> jList11;
    private javax.swing.JList<String> jList12;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JList<String> jList4;
    private javax.swing.JList<String> jList5;
    private javax.swing.JList<String> jList6;
    private javax.swing.JList<String> jList7;
    private javax.swing.JList<String> jList8;
    private javax.swing.JList<String> jList9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
