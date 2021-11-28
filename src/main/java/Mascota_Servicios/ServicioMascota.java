package Mascota_Servicios;

import Mascota_Entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
creamos una CLASE SERVICIO
*/

public class ServicioMascota{
    
    private Scanner leer = new Scanner (System.in).useDelimiter("\n");
    private List<Mascota> mascotas;
    public ServicioMascota() {
        this.leer = new Scanner (System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }    
    
    public Mascota crearMascota (){
        
        System.out.println("Introducir nombre: ");
        String nombre = leer.next();
        
        System.out.println("Intr: \");\n" +
"        String apodo = leer.next();oducir apodo: ");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo: ");
        String tipo = leer.next();
        
        return new Mascota(nombre, apodo, tipo);
        

        
//devuelvo el nacimiento de una mascota con tales caracteristicas
        //return new Mascota(nombre, apodo, tipo);
        
        
        
    }
    
    public void agregarMascota(Mascota m){
        mascotas.add(m);
    }
    
    public void mostrarMascota (){
        
        System.out.println("las mascotas actuales de la lista mascotas son: ");
        for (Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = " + mascotas.size());
    }
    /**
     * crea chiquitos
     * @param cantidad 
     */
    
    public void fabricaChiquitos (int cantidad){
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
            
        }
        
    }
    /**
     * crea mascotsa pidiendo por teclado
     */
    
    public void fabricaMascota(int cantidad){
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            agregarMascota(mascotaCreada);
            System.out.println(mascotaCreada.toString());
        }
        
    }
    // TODO añadir TRY and CATCH
    public void actualizarMascota (int index){
        if (index <= (mascotas.size()-1)) {      
            System.out.println("");
            System.out.println("--------- ACTUALIZAR ---------");
            Mascota m = crearMascota();
            mascotas.set(index, m);
        }else{
            System.out.println("EL indice es erroneo");
                    
         }
        
        

    }

    public void eliminarMascota (int index){
        if (index <= mascotas.size()-1) {
            mascotas.remove(index);
            
        } else {
            System.out.println("EL indice es erroneo");
        }
        
    }
          
    public void actualizarMascotaPorNombre(String nombreViejo, String nombreNuevo){
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);
            if (m.getNombre().equals(nombreViejo)) {
                m.setNombre(nombreNuevo);
            }
            
        }
    }
            


}
