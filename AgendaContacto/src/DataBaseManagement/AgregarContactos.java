/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBaseManagement;

public class AgregarContactos {
      
    public void agregarContactos(String nombre, String apellido, String telefono, String telefono2, String empresa, String correo){
     MyDatabase db  = new MyDatabase();
     db.connect();
     db.query();
     
    db.insertarDatos(nombre, apellido, telefono, telefono2, empresa, correo);
    db.disconnect();
    
    }
       
}
