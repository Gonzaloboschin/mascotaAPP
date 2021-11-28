package Mascota_Entidades;

import Mascota_Enumeraciones.SexoHumano;
import java.util.Date;

public class Usuario {
    
    public String nombre;
    public String apellido;
    public int dni;
    
    /* ponemos fecha de nacimiento, porque poner edad seria 
    bastante inutil, ya que habria que ir actualizandolo 
    constantemente. En cambio asi, solo podemos calcular la edad
    */
    public Date nacimiento;
    public String pais;
    public SexoHumano sexo;
    
    // creamos el constructor 
    // ALT + INSERT autogenera codigo
    
    public Usuario (){
        
    }

    public Usuario(String nombre, String apellido, int dni, Date nacimiento, String pais, SexoHumano sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public SexoHumano getSexo() {
        return sexo;
    }

    public void setSexo(SexoHumano sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nacimiento=" + nacimiento + ", pais=" + pais + ", sexo=" + sexo + '}';
    }
    
    
    
    

}
