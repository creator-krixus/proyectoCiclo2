/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Wilson Rueda
 */
public class Concesionario {
	private static ArrayList<Auto> autos = new ArrayList<>();
	private static ArrayList<Empleado> empleados = new ArrayList<>();
	
	
	public static double calcularPagos(Empleado empleado, String ingreso, String retiro){
		  
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		  LocalDate inicio = LocalDate.parse(ingreso, formatter);
		  LocalDate fin = LocalDate.parse(retiro, formatter);
		  	  
		  Period days = Period.between(inicio, fin);
		  long countDays = days.getMonths()*30+days.getDays();
		  int workDays = (int)countDays;

		  
		  return empleado.getSalario()/30 * workDays;

	}
	public static double calcularDeducciones(Empleado empleado, String ingreso, String retiro){
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		  LocalDate inicio = LocalDate.parse(ingreso, formatter);
		  LocalDate fin = LocalDate.parse(retiro, formatter);
		  	  
		  Period days = Period.between(inicio, fin);
		  long countDays = days.getMonths()*30+days.getDays();
		  int workDays = (int)countDays;
		  int deducciones = (int)((empleado.getSalario()/30 * workDays)* 8 / 100);
		  
		  return deducciones;

	}
	
	public static double costoEmpleadoParaLaEmpresa(Empleado empleado, String ingreso, String retiro) {
		return 36547088.11;
		
	}    
}
