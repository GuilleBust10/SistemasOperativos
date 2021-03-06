/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemasoperativos;

import java.awt.Color;
import static java.lang.Math.random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrador
 */
public class Principal extends javax.swing.JFrame {

    DateTimeFormatter formateador = DateTimeFormatter.ofPattern("HH:mm:ss"); // El formato es HH:mm:ss
    String horaActual = formateador.format(LocalDateTime.now());
    Thread tiempo, tiempo2;
    int Dat, quantum = 10;
    DefaultTableModel modelo;
    Object [] fila=new Object[5];
    Random generadorAleatorios = new Random();
    
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        Hora();
        modelo=(DefaultTableModel) tblDatos.getModel();
        
    }
    
    public void Barra()
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {            
                for(int i=0; i<=100; i++)
                {
                    jProgressBar1.setValue(i);
                    //jProgressBar1.setForeground(Color.red);
                    Thread.sleep(15);
                    jLabel1.setText("P1");
                    if(i == 100 && Dat >= 2)
                    {
                        jLabel2.setText("P2");
                        Barra2();                        
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            }
        };
        tiempo = new Thread(runnable);
        tiempo.start();
        String text = etiquetaReloj.getText(), text1 = jLabel1.getText(), Prev = jTextArea1.getText();
        jTextArea1.setText(Prev+"Proceso iniciado: P1"+text1+"   Hora: "+text+" Estado: Listo"+"\n");
        int numero = 5+generadorAleatorios.nextInt((15+1)-5);
        fila[0]="P1"; fila[1]=(""+quantum); fila[2]=(""+numero); fila[3]=0; fila[4]="Listo";
        modelo.addRow(fila);
        tblDatos.setModel(modelo); 
    }
    public void Barra2()
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {            
                for(int i=0; i<=100; i++)
                {
                    jProgressBar2.setValue(i);
                    Thread.sleep(15);
                    if(i == 100 && Dat >= 3)
                    {
                        jLabel4.setText("P3");
                        Barra3();
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            }
        };
        tiempo2 = new Thread(runnable);
        tiempo2.start();
        String text = etiquetaReloj.getText(), text1 = jLabel2.getText(), Prev = jTextArea1.getText();
        jTextArea1.setText(Prev+"Proceso iniciado: "+text1+"   Hora: "+text+" Estado: Listo"+"\n");
        int numero = 5+generadorAleatorios.nextInt((15+1)-5);
        fila[0]=text1; fila[1]=(""+quantum); fila[2]=(""+numero); fila[3]=0; fila[4]="Listo";
        modelo.addRow(fila);
        tblDatos.setModel(modelo); 
    }
    public void Barra3()
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {            
                for(int i=0; i<=100; i++)
                {
                    jProgressBar3.setValue(i);
                    Thread.sleep(15);
                    if(i == 100 && Dat >= 4)
                    {
                        jLabel3.setText("P4");
                        Barra4();
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            }
        };
        tiempo2 = new Thread(runnable);
        tiempo2.start();
        String text = etiquetaReloj.getText(), text1 = jLabel4.getText(), Prev = jTextArea1.getText();
        jTextArea1.setText(Prev+"Proceso iniciado: "+text1+"   Hora: "+text+" Estado: Listo"+"\n");
        int numero = 5+generadorAleatorios.nextInt((15+1)-5);
        fila[0]=text1; fila[1]=(""+quantum); fila[2]=(""+numero); fila[3]=0; fila[4]="Listo";
        modelo.addRow(fila);
        tblDatos.setModel(modelo); 
    }
    public void Barra4()
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {            
                for(int i=0; i<=100; i++)
                {
                    jProgressBar4.setValue(i);
                    Thread.sleep(15);
                    if(i == 100 && Dat >= 5)
                    {
                        jLabel7.setText("P5");
                        Barra5();
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            }
        };
        tiempo2 = new Thread(runnable);
        tiempo2.start();
        String text = etiquetaReloj.getText(), text1 = jLabel3.getText(), Prev = jTextArea1.getText();
        jTextArea1.setText(Prev+"Proceso iniciado: "+text1+"   Hora: "+text+" Estado: Listo"+"\n");
        int numero = 5+generadorAleatorios.nextInt((15+1)-5);
        fila[0]=text1; fila[1]=(""+quantum); fila[2]=(""+numero); fila[3]=0; fila[4]="Listo";
        modelo.addRow(fila);
        tblDatos.setModel(modelo); 
    }
    public void Barra5()
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {            
                for(int i=0; i<=100; i++)
                {
                    jProgressBar5.setValue(i);
                    Thread.sleep(15);
                    if(i == 100 && Dat >= 6)
                    {
                        jLabel5.setText("P6");
                        Barra6();
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            }
        };
        tiempo2 = new Thread(runnable);
        tiempo2.start();
        String text = etiquetaReloj.getText(), text1 = jLabel7.getText(), Prev = jTextArea1.getText();
        jTextArea1.setText(Prev+"Proceso iniciado: "+text1+"   Hora: "+text+" Estado: Listo"+"\n");
        int numero = 5+generadorAleatorios.nextInt((15+1)-5);
        fila[0]=text1; fila[1]=(""+quantum); fila[2]=(""+numero); fila[3]=0; fila[4]="Listo";
        modelo.addRow(fila);
        tblDatos.setModel(modelo); 
    }
    public void Barra6()
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {            
                for(int i=0; i<=100; i++)
                {
                    jProgressBar6.setValue(i);
                    Thread.sleep(15);
                    if(i == 100 && Dat >= 7)
                    {
                        jLabel8.setText("P7");
                        Barra7();
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            }
        };
        tiempo2 = new Thread(runnable);
        tiempo2.start();
        String text = etiquetaReloj.getText(), text1 = jLabel5.getText(), Prev = jTextArea1.getText();
        jTextArea1.setText(Prev+"Proceso iniciado: "+text1+"   Hora: "+text+" Estado: Listo"+"\n");
        int numero = 5+generadorAleatorios.nextInt((15+1)-5);
        fila[0]=text1; fila[1]=(""+quantum); fila[2]=(""+numero); fila[3]=0; fila[4]="Listo";
        modelo.addRow(fila);
        tblDatos.setModel(modelo); 
    }
    public void Barra7()
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {            
                for(int i=0; i<=100; i++)
                {
                    jProgressBar7.setValue(i);
                    Thread.sleep(15);
                    if(i == 100 && Dat >= 8)
                    {
                        jLabel6.setText("P8");
                        Barra8();
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            }
        };
        tiempo2 = new Thread(runnable);
        tiempo2.start();
        String text = etiquetaReloj.getText(), text1 = jLabel8.getText(), Prev = jTextArea1.getText();
        jTextArea1.setText(Prev+"Proceso iniciado: "+text1+"   Hora: "+text+" Estado: Listo"+"\n");
        int numero = 5+generadorAleatorios.nextInt((15+1)-5);
        fila[0]=text1; fila[1]=(""+quantum); fila[2]=(""+numero); fila[3]=0; fila[4]="Listo";
        modelo.addRow(fila);
        tblDatos.setModel(modelo); 
    }
    public void Barra8()
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {            
                for(int i=0; i<=100; i++)
                {
                    jProgressBar8.setValue(i);
                    Thread.sleep(15);
                    if(i == 100 && Dat >= 9)
                    {
                        jLabel9.setText("P9");
                        Barra9();
                    }
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            }
        };
        tiempo2 = new Thread(runnable);
        tiempo2.start();
        String text = etiquetaReloj.getText(), text1 = jLabel6.getText(), Prev = jTextArea1.getText();
        jTextArea1.setText(Prev+"Proceso iniciado: "+text1+"   Hora: "+text+" Estado: Listo"+"\n");
        int numero = 5+generadorAleatorios.nextInt((15+1)-5);
        fila[0]=text1; fila[1]=(""+quantum); fila[2]=(""+numero); fila[3]=0; fila[4]="Listo";
        modelo.addRow(fila);
        tblDatos.setModel(modelo); 
    }
    public void Barra9()
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {            
                for(int i=0; i<=100; i++)
                {
                    jProgressBar9.setValue(i);
                    Thread.sleep(15);
                }
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            }
        };
        tiempo2 = new Thread(runnable);
        tiempo2.start();
        String text = etiquetaReloj.getText(), text1 = jLabel9.getText(), Prev = jTextArea1.getText();
        jTextArea1.setText(Prev+"Proceso iniciado: "+text1+"   Hora: "+text+" Estado: Listo"+"\n");
        int numero = 5+generadorAleatorios.nextInt((15+1)-5);
        fila[0]=text1; fila[1]=(""+quantum); fila[2]=(""+numero); fila[3]=0; fila[4]="Listo";
        modelo.addRow(fila);
        tblDatos.setModel(modelo); 
    }
    public void Limpiar()
    {
        jLabel1.setText("");jLabel2.setText("");jLabel3.setText("");jLabel4.setText("");
        jLabel5.setText("");jLabel6.setText("");jLabel7.setText("");jLabel8.setText("");jLabel9.setText("");
        jProgressBar1.setValue(0);jProgressBar2.setValue(0);jProgressBar3.setValue(0);jProgressBar4.setValue(0);
        jProgressBar5.setValue(0);jProgressBar6.setValue(0);jProgressBar7.setValue(0);jProgressBar8.setValue(0);
    }
    
    public void Hora()
    {
        Runnable runnable = new Runnable() {
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                    etiquetaReloj.setText(formateador.format(LocalDateTime.now()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    Thread hilo = new Thread(runnable);
    hilo.start();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaReloj = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar3 = new javax.swing.JProgressBar();
        jProgressBar4 = new javax.swing.JProgressBar();
        jProgressBar5 = new javax.swing.JProgressBar();
        jProgressBar6 = new javax.swing.JProgressBar();
        jProgressBar7 = new javax.swing.JProgressBar();
        jProgressBar8 = new javax.swing.JProgressBar();
        jProgressBar9 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaReloj.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Sistema Operativo");

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Activador");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jProgressBar1.setForeground(new java.awt.Color(0, 255, 51));

        jProgressBar3.setForeground(new java.awt.Color(0, 255, 0));

        jProgressBar4.setForeground(new java.awt.Color(0, 255, 0));

        jProgressBar5.setForeground(new java.awt.Color(0, 255, 51));

        jProgressBar6.setForeground(new java.awt.Color(0, 255, 51));

        jProgressBar7.setForeground(new java.awt.Color(0, 255, 0));

        jProgressBar8.setForeground(new java.awt.Color(0, 255, 0));

        jProgressBar9.setForeground(new java.awt.Color(0, 255, 0));

        jProgressBar2.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2)
            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jProgressBar9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButton1.setText("Iniciar Proceso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Proceso", "Quantum", "Tiempo", "Restante", "Estado"
            }
        ));
        jScrollPane2.setViewportView(tblDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(etiquetaReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Limpiar();
        Dat = Integer.parseInt(jTextField3.getText());
        Barra();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiquetaReloj;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JProgressBar jProgressBar4;
    private javax.swing.JProgressBar jProgressBar5;
    private javax.swing.JProgressBar jProgressBar6;
    private javax.swing.JProgressBar jProgressBar7;
    private javax.swing.JProgressBar jProgressBar8;
    private javax.swing.JProgressBar jProgressBar9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tblDatos;
    // End of variables declaration//GEN-END:variables
}
