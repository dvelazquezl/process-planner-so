package processplanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author daniel
 */
public class processesView extends javax.swing.JFrame implements ActionListener {

    PlanificadorCPU cpu;

    WorkQueue workQueue;

    Timer temp;
    int fps = 1;
    boolean pause = true;

    /**
     * Creates new form processesView
     */
    public processesView() {
        initComponents();

        int delay = (fps > 0) ? (1000 / fps) : 100;
        temp = new Timer(delay, this);
        temp.setCoalesce(false);
        temp.setInitialDelay(0);

        workQueue = new WorkQueue();
        workQueue.loadProcess("/home/junior/Documentos/process.txt");

        cpu = new PlanificadorCPU(workQueue.getProcesses());
        cpu.setFps(delay);

        this.run.addActionListener(this);
        this.comboBoxAlgorithms.addActionListener(this);

        updateUiStatus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        processName = new javax.swing.JTextField();
        burstAmount = new javax.swing.JTextField();
        addProcess = new javax.swing.JButton();
        run = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxAlgorithms = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cpuTime = new javax.swing.JLabel();
        stop = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Process Manager");
        setPreferredSize(new java.awt.Dimension(804, 489));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        processName.setToolTipText("Nombre de proceso");
        getContentPane().add(processName, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 99, 124, -1));

        burstAmount.setToolTipText("Cantidad de rafagas");
        getContentPane().add(burstAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 99, 140, -1));

        addProcess.setText("Agregar proceso");
        getContentPane().add(addProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 98, -1, -1));

        run.setText("RUN");
        run.setToolTipText("");
        getContentPane().add(run, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 70, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nombre de proceso");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 76, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setText("Cantidad de ráfagas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 76, -1, -1));

        comboBoxAlgorithms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "RR", "Colas multinivel" }));
        getContentPane().add(comboBoxAlgorithms, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 34, 140, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setText("Algoritmo a utilizar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("no se si fue una lagrima, quien mas va sacarte a bailar lentos, en el living de su de esos las 10");
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 395, 230));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Ráfagas", "T. Llegada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 380, 230));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("Tiempo de CPU:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        cpuTime.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cpuTime.setText("0");
        getContentPane().add(cpuTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, -1, -1));

        stop.setText("STOP");
        stop.setToolTipText("");
        getContentPane().add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 100, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(processesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(processesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(processesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(processesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new processesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProcess;
    private javax.swing.JTextField burstAmount;
    private javax.swing.JComboBox<String> comboBoxAlgorithms;
    private javax.swing.JLabel cpuTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField processName;
    private javax.swing.JButton run;
    private javax.swing.JButton stop;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == run) {
            if (pause == false) {
                System.out.println("run pressed");
                pause = true;
                stopSimulation();
                cpu.setPaused(true);
            } else {
                cpu.setPaused(false);
                pause = false;
                starSimulation();
            }
        } else if (ae.getSource() == temp) {
            if (cpu.nextCycle()) {
                updateUiStatus();
            } else {
                stopSimulation();
            }
            repaint();
        } 
        // Algoritmos a escojer
        else if (ae.getSource() == comboBoxAlgorithms) {
            if("FCFS".equals(comboBoxAlgorithms.getSelectedItem().toString())){
                System.out.println("FCFS");
            }
            if("SJF".equals(comboBoxAlgorithms.getSelectedItem().toString())){
                System.out.println("SJF");
            }
            if("RR".equals(comboBoxAlgorithms.getSelectedItem().toString())){
                System.out.println("RR");
            }
        }

    }

    public synchronized void starSimulation() {
        if (pause) {

        } else {
            if (!temp.isRunning()) {
                temp.start();
            }
        }
    }

    public synchronized void stopSimulation() {
        if (temp.isRunning()) {
            temp.stop();
        }
    }

    public void updateUiStatus() { //reloj
        cpuTime.setText(Integer.toString((int) cpu.getCurrentTime()));
    }

}
