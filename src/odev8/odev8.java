package odev8;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class odev8 extends JFrame {
    private JTable table1;
    private JTable table2;
    private JTable table3;
    private JPanel panel;
    private JSpinner spinner1;
    private JSpinner spinner2;
    private JButton button1;
    private JProgressBar progressBar1;

    DefaultTableModel model1 = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();
    DefaultTableModel model3 = new DefaultTableModel();

    int r,c;

    odev8() {

        add(panel);
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        spinner1.setValue(3);
        spinner2.setValue(3);
        tablosıfırla();

        spinner1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                tablosıfırla();
                r=(int) spinner1.getValue();
                c=(int) spinner2.getValue();
                model1.setRowCount(r);
                model1.setColumnCount(c);
                table1.setModel(model1);

                model2.setRowCount(r);
                model2.setColumnCount(c);
                table2.setModel(model2);

                model3.setRowCount(r);
                model3.setColumnCount(c);
                table3.setModel(model3);

                int[][] m1= Matris.uret(r,c);
                int[][] m2= Matris.uret(r,c);
                int[][] mtoplam= new int[r][c];


                int i,j;
                for(i=0;i<r;i++)
                {
                    for (j=0;j<c;j++)
                    {
                        table1.setValueAt(m1[i][j],i,j);
                        table2.setValueAt(m2[i][j],i,j);
                        mtoplam[i][j]=m1[i][j]+m2[i][j];
                        table3.setValueAt(mtoplam[i][j],i,j);


                    }

                }


            }
        });



        spinner2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                tablosıfırla();
                r=(int) spinner1.getValue();
                c=(int) spinner2.getValue();
                model1.setRowCount(r);
                model1.setColumnCount(c);
                table1.setModel(model1);

                model2.setRowCount(r);
                model2.setColumnCount(c);
                table2.setModel(model2);

                model3.setRowCount(r);
                model3.setColumnCount(c);
                table3.setModel(model3);

                int[][] m1= Matris.uret(r,c);
                int[][] m2= Matris.uret(r,c);
                int[][] mtoplam= new int[r][c];


                int i,j;
                for(i=0;i<r;i++)
                {
                    for (j=0;j<c;j++)
                    {
                        table1.setValueAt(m1[i][j],i,j);
                        table2.setValueAt(m2[i][j],i,j);
                        mtoplam[i][j]=m1[i][j]+m2[i][j];
                        table3.setValueAt(mtoplam[i][j],i,j);


                    }

                }

            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablosıfırla();
            }
        });
    }

     void tablosıfırla() {
        model1.setRowCount(0);
        model1.setColumnCount(0);
        table1.setModel(model1);
        table1.setTableHeader(null);

        model2.setRowCount(0);
        model2.setColumnCount(0);
        table2.setModel(model2);
        table2.setTableHeader(null);

        model3.setRowCount(0);
        model3.setColumnCount(0);
        table3.setModel(model3);
        table3.setTableHeader(null);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                odev8 odevim = new odev8();
                odevim.setVisible(true);
            }
        });
    }
}
