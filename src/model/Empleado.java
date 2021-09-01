/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Wilson Rueda
 */
public class Empleado {
    private int id;
    private static int idSgte = 1; 
    private String nombre;
    private String apellido;
    private static ArrayList<Auto> autos= new ArrayList<>();
    private int salario;
    

    public Empleado(){
//        this.salario = salario;
//        this.apellido = apellido;
//        this.nombre = nombre;
        id = idSgte;
        idSgte++;
//        
    }

    public static double calcularMiNomina(Empleado empleado){

        
        for (int x = 0; x<autos.size(); x++){
            if (Empleado.autos.get(x).getTipo() == 1 || Empleado.autos.get(x).getTipo() == 1 ){
                empleado.salario += 750000;
            }else if(Empleado.autos.get(x).getTipo() == 2){
                empleado.salario += 500000;
            }else if(Empleado.autos.get(x).getTipo() == 3){
                empleado.salario += 350000;
            }
        }
        double sueldoBruto = empleado.salario;
        double descuentos = (sueldoBruto * 8) / 100;
        double sueldoNeto = sueldoBruto - descuentos;
        return sueldoNeto;
    }

    


	public String convertirNombre(){
        String firstLtr = nombre.substring(0, 1);
        String restLtrs = nombre.substring(1, nombre.length());
      
        firstLtr = firstLtr.toUpperCase();
        nombre = firstLtr + restLtrs;
        return nombre;
    }
    public String convertirApellido(){
        String firstLtr = apellido.substring(0, 1);
        String restLtrs = apellido.substring(1, apellido.length());
      
        firstLtr = firstLtr.toUpperCase();
        apellido = firstLtr + restLtrs;
        return apellido;

    }
    

    @Override
    public String toString(){
        return 
        "-----------------------------"+"\n"+
        "Id: \t\t"+ "| " + id + "\n" + 
        "Nombre: \t" + "| " + convertirNombre() + "\n" + 
        "Apellido: \t" + "| " + convertirApellido() + "\n" + 
        "Salario: \t" + "| " + salario + "\n";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public static ArrayList<Auto> getAutos() {
        
        return autos;
    }

    public int getSalario() {
        return salario;
    }

	public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public static void setAutos(ArrayList<Auto> autos) {
        Empleado.autos = autos;
    } 

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
}
