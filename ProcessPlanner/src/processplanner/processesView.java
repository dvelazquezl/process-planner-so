package processplanner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class processesView extends javax.swing.JFrame implements ActionListener {

    ProccessesPlanner cpu;
    Timer temp;
    boolean pause = true;

    /**
     * Creates new form processesView
     */
    @SuppressWarnings("LeakingThisInConstructor")
    public processesView() {
        loadTable();
        initComponents();

        // inicializar el temporizador
        temp = new Timer(1000, this);
        temp.setCoalesce(false);
        temp.setInitialDelay(0);

        cpu = new ProccessesPlanner("processes.txt");

        this.run.addActionListener(this);
        this.stop.addActionListener(this);
        this.comboBoxAlgorithms.addActionListener(this);
        this.restart.addActionListener(this);
        this.addProcess.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        processName = new javax.swing.JTextField();
        burstAmount = new javax.swing.JTextField();
        addProcess = new javax.swing.JButton();
        run = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboBoxAlgorithms = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        messages = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cpuTime = new javax.swing.JLabel();
        stop = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        restart = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        waitTime = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        finished = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        quantum = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        velocity = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Monitor UI");
        setPreferredSize(new java.awt.Dimension(920, 440));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        processName.setToolTipText("Nombre de proceso");
        getContentPane().add(processName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 124, -1));

        burstAmount.setToolTipText("Cantidad de rafagas");
        getContentPane().add(burstAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 140, -1));

        addProcess.setText("Agregar");
        getContentPane().add(addProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 100, -1));

        run.setText("Iniciar");
        run.setToolTipText("");
        getContentPane().add(run, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 70, -1));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Nombre de proceso");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel2.setText("Cantidad de ráfagas");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        comboBoxAlgorithms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FCFS", "SJF", "Colas multinivel" }));
        getContentPane().add(comboBoxAlgorithms, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 34, 140, -1));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setText("Algoritmo a utilizar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, -1));

        messages.setEditable(false);
        messages.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        messages.setRows(5);
        jScrollPane3.setViewportView(messages);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 330, 230));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        table.setModel(dataTable);
        jScrollPane4.setViewportView(table);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 350, 230));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("Tiempo de CPU:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        cpuTime.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        cpuTime.setText("0");
        getContentPane().add(cpuTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));

        stop.setText("Parar");
        stop.setToolTipText("");
        getContentPane().add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 70, -1));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Nuevo proceso");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 270, -1));

        restart.setText("Reiniciar");
        restart.setToolTipText("");
        getContentPane().add(restart, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 90, -1));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel7.setText("T. P. Espera:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, -1));

        waitTime.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        waitTime.setText("0");
        getContentPane().add(waitTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel8.setText("Cola de listos");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel9.setText("Atendidos por el procesador");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        finished.setEditable(false);
        finished.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(finished);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 180, 200, 230));

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel10.setText("Procesos terminados");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        quantum.setModel(new javax.swing.SpinnerNumberModel(4, 1, 50, 1));
        getContentPane().add(quantum, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 34, 60, -1));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel11.setText("Quantum");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 12, -1, -1));

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel12.setText("Velocidad");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 12, -1, -1));

        velocity.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        velocity.setValue(1);
        getContentPane().add(velocity, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 34, 60, -1));

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

    // <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProcess;
    private javax.swing.JTextField burstAmount;
    private javax.swing.JComboBox<String> comboBoxAlgorithms;
    private javax.swing.JLabel cpuTime;
    private javax.swing.JTextArea finished;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea messages;
    private javax.swing.JTextField processName;
    private javax.swing.JSpinner quantum;
    private javax.swing.JButton restart;
    private javax.swing.JButton run;
    private javax.swing.JButton stop;
    private javax.swing.JTable table;
    private javax.swing.JSpinner velocity;
    private javax.swing.JLabel waitTime;
    // End of variables declaration//GEN-END:variables
    private javax.swing.table.DefaultTableModel dataTable;
// </editor-fold>  

    @Override
    public void actionPerformed(ActionEvent ae) {
        //ejecutar
        if (ae.getSource() == run) {
            pause = false;
            startSimulation();
        } //parar la ejecucion
        else if (ae.getSource() == stop) {
            pause = true;
            stopSimulation();
        }//ciclos 
        else if (ae.getSource() == temp) {
            if (cpu.nextCycle()) {
                updateUiStatus();
                temp.setDelay(1000 / (int) velocity.getValue());
                cpu.setQuantum((int) quantum.getValue());
            } else {
                stopSimulation();
            }
            repaint();
        } // Algoritmos a escojer
        else if (ae.getSource() == comboBoxAlgorithms) {
            if ("FCFS".equals(comboBoxAlgorithms.getSelectedItem().toString())) {
                cpu.setAlgorithm(ProccessesPlanner.FCFS);
            }
            if ("SJF".equals(comboBoxAlgorithms.getSelectedItem().toString())) {
                cpu.setAlgorithm(ProccessesPlanner.SJF);
            }
            if ("Colas multinivel".equals(comboBoxAlgorithms.getSelectedItem().toString())) {
                cpu.setAlgorithm(ProccessesPlanner.MULTIQUEUE);
            }
        } //reiniciar procesos
        else if (ae.getSource() == restart) {
            cpu.restart();
            updateUiStatus();
            messages.setText("");
            finished.setText("");
            quantum.setValue((int) 4);
            velocity.setValue((int) 1);
            clearTable();
            repaint();
        }//Agregar proceso
        else if (ae.getSource() == addProcess) {
            cpu.addProcess(new PCB(processName.getText(),
                    Integer.parseInt(burstAmount.getText()), (int) cpu.getCurrentTime())
            );
        }
    }



    private void startSimulation() {
        if (pause) {
            //No hace nada
        } else {
            if (!temp.isRunning()) {
                temp.start();
            }
        }
    }

    private  void stopSimulation() {
        if (temp.isRunning()) {
            temp.stop();
        }
    }

    /**
     * Actualiza el estado de la tabla, los dos cuadros de mensajes 
     * y los tiempos
     */
    private void updateUiStatus() {
        cpuTime.setText(Integer.toString(((int) cpu.getCurrentTime())-1));
        waitTime.setText(String.format("%.2f", cpu.getAvgWait()));

        updateMessages();
        if (cpu.getActiveProcess() != null) {
            updateFinished();
        }
        updateTable();
    }

    /**
     * Actualiza el cuadro de mensajes de procesos en ejecucion
     */
    private void updateMessages() {
        if (cpu.getActiveProcess() == null) {
            messages.append("Tiempo: " + (cpu.getCurrentTime()-1) + " => ocioso\n");
        } else {
            messages.append("Tiempo: " + (cpu.getCurrentTime()-1) + " => "
                    + cpu.getActiveProcess().getpName() + " en ejecucion\n");
        }

    }

    /**
     * Actualiza los valores de la tabla
     */
    private void updateTable() {
        clearTable();
        loadDataTable();
    }

    /**
     * Carga los valores por defecto de la tabla
     */
    private void loadTable() {
        dataTable = new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Proceso", "Ráfagas", "T. Llegada"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }

    /**
     * Carga los valores de los procesos de la cola de listos a la tabla
     */
    private void loadDataTable() {
        cpu.getReadyQueue().forEach((PCB p) -> {
            if (!p.isActive()) {
                dataTable.addRow(new Object[]{p.getpName(), p.getBurstTime(), p.getArrivalTime()});
            }
        });
    }

    private void clearTable() {
        dataTable.getDataVector().removeAllElements();
        dataTable.fireTableDataChanged();
    }

    /**
     * Actualiza el cuadro de mensajes de los procesos que van terminando
     */
    private void updateFinished() {
        if (cpu.getActiveProcess().isFinished()) {
            finished.append(cpu.getActiveProcess().getpName() + "\n");
        }
    }
}
