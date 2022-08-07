


package DataBaseManagement;

import com.mysql.cj.Query;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyDatabase {
   
    //DATOS PARA LA CONECCION A LA DB Encapsulados 
    private String url = "jdbc:mysql://localhost/itla";
    private String user = "root";
    private String password = "";
    private Connection con;

    private String query;

    //Stment se usa para ejecutar el query 
    private Statement stmn = null;
    //Es mas rapido internamente para validar los valores que el stament normal
    private PreparedStatement pstmn = null;
    //PARA REALLIZAR CONSULTAS
    private ResultSet rs = null;

    public static void main(String[] args) {

        //creando instancia 
        MyDatabase db = new MyDatabase();
        db.connect();
        db.query();
        
        db.disconnect();
    }

    public void connect() {

        try {

            con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void disconnect() {

        try {

            con.close();
            System.out.println("Disconnected");
        } catch (SQLException ex) {

            ex.printStackTrace();
        }

    }

    public void query() {

        try {
            con = DriverManager.getConnection(url, user, password);
            stmn = con.createStatement();
            //para ejecutar insert, Statement usar este metodo 
            // stmn.executeUpdate(query);

            //CREANDO QUERY PARA INSERTAR DATOS 
            query = "INSERT INTO contactos (nombre,apellido,telefono,telfono2,empresa,correo) "
                    + " VALUES(? ,?, ?, ?, ?, ?)";

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    public void insertarDatos(String nombre, String apellido, String telefono, String telefono2, String empresa, String correo) {
        
        

        try {
            //Posicion y luego valores 
            pstmn = con.prepareStatement(query);
            //Insert, pero con prepareStatement 
            pstmn.setString(1, nombre);
            pstmn.setString(2, apellido);
            pstmn.setString(3, telefono);
            pstmn.setString(4, telefono2);
            pstmn.setString(5, empresa);
            pstmn.setString(6, correo);
            //ExecuteUpdate porque estamos insertando valores 
            pstmn.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

   
       
}
