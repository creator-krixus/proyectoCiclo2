/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Wilson Rueda
 */
public class Auto {
    private String marca;
    private int tipo;

    public Auto(String marca, int tipo) {
        this.marca = marca;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public int getTipo() {
        return tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public String toString(){
        return "Marca: " + marca + "\n" +
                "Tipo: " + tipo;
    }    
}
