/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Fabricio
 */
public interface Navegador {
    //Funciones que serán necesarias de implementar en las clases que quieran 
    //implementar esta interface 
    public void navegar();
    public void abrirLink();
    public String getNombre();
}
