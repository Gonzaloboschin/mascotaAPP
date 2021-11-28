package Mascota_Entidades;

import Mascota_Enumeraciones.Raza;
import Mascota_Enumeraciones.SexoAnimal;

public class Mascota {
    
    /* AÑADIMOS LOS ATRIBUTOS PARA LA CLASE */
    private String nombre;
    private String apodo;
    // Conejo, Gato, Perro, Loro, Carpincho
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private Raza raza;
    private SexoAnimal sexo;
    
    private int energia;
    /*
    CONSTRUCTOR VACIO
    */
    public Mascota (){
        this.energia = 1000;
    }
    /*
    COMO JAVA NO ADMITE DOS CONSTRUCTORES IGUALES, le modificamos los argumentos
    dentro de los constructores podemos poner logica
    */
    public Mascota (String nombre, String apodo, String tipo){
    /*
    tomamos lo que llega como parametro y le asignamos a la variable
    con this hago referencia a la clase donde estamos parados */
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro")|| tipo.equals("Conejo") || tipo.equals("Carpincho")) {
        }
        this.energia = 1000;
    }
//    con ALT + INSERT genero el constructor y agrego
//    los atributos que quiero.
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, Raza raza, SexoAnimal sexo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.sexo = sexo;
    }
    
    
    
   // REALIZAMOS UN SET, para poder modificar los atributos privados
    // los setters pueden tener logica de encapsulamiento
    
    public void setNombre(String nombre){
        if (nombre.length() > 0) {
            this.nombre = nombre; 
        }
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public void setSexo(SexoAnimal sexo) {
        this.sexo = sexo;
    }
    
    
    /* Un getter es una funcion que nos permite entrar a la clase,
    obtener el atributo necesitado e irnos */
    
    public String getNombre(){
        // no pongo this, porque no es redundante
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public Raza getRaza() {
        return raza;
    }

    public SexoAnimal getSexo() {
        return sexo;
    }
    
    /**
     * 
     * @param energiaRestar
     * @return energia 
     */
    
    
    public int pasear (int energiaRestar){
        
        energia -= energiaRestar;
        return energia;
    }
    
    

    /* nos devuelve el TOSTRING, un mensaje formateado segun cada mascota
        haciendo referencia a los atributos
    */

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", sexo=" + sexo + ", energia=" + energia + '}';
    }


    
    
    
}
