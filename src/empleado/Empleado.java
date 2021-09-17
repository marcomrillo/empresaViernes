/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Usuario
 */
public class Empleado {
    //atribitos = datos = variables
    int id;
    String nombre;
    String cargo;
    int salario;
    String telefono;
    String direccion;
    
    //metodo especial = fotocopiadora = inicia la clase
public Empleado() {
    }
    public Empleado(int id, String nombre, String cargo, int salario, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.telefono = telefono;
    }
    
    
    //metodos = acciones = funciones
public int calcularSalario(){

    return(0);
}
    
    
    
}
