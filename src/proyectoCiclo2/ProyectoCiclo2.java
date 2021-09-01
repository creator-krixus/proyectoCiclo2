package proyectoCiclo2;

import controller.Ctrlempleado;
import model.Empleado;
import model.QueryEmpleados;
import view.FrmEmpleado;


/**
 *
 * @author Wilson Rueda
 */
public class ProyectoCiclo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empl = new Empleado();
        QueryEmpleados emplC = new QueryEmpleados();
        FrmEmpleado frm = new FrmEmpleado();
        
       
        
        Ctrlempleado ctrl = new Ctrlempleado(empl, emplC, frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
    
}
