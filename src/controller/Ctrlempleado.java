package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Empleado;
import model.QueryEmpleados;
import view.FrmEmpleado;
import view.FrmTablaEmpleados;

/**
 *
 * @author Wilson Rueda
 */
public class Ctrlempleado implements ActionListener{
    
    private Empleado empl;
    private QueryEmpleados emplC;
    private FrmEmpleado frm;
   

    public Ctrlempleado(Empleado empl, QueryEmpleados emplC, FrmEmpleado frm) {
        this.empl = empl;
        this.emplC = emplC;
        this.frm = frm;
        this.frm.btnRegistrar.addActionListener(this);
    }
    
    public void iniciar(){
        frm.setVisible(true);
        frm.setLocationRelativeTo(null);
        frm.setTitle("Registro empleados");
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == frm.btnRegistrar){
            empl.setNombre(frm.txtNombre.getText());
            empl.setApellido(frm.txtApellido.getText());
            empl.setSalario((int) Float.parseFloat(frm.txtSalario.getText()));
         
            if (emplC.registrar(empl)){
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
            }else{
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }
        }
    }
    
    public void limpiar(){
        frm.txtNombre.setText(null);
        frm.txtApellido.setText(null);
        frm.txtSalario.setText(null);
    }
    
}
