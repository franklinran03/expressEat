package expresseatapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;


public class ExpressEatApp {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //obtener conexion
        Connection conn = BDConnection.getConnection(); 
        
        /*/login
        BDlogin iniciar = new BDlogin(conn);

        System.out.println("usuario");
        String usuario = tec.next();
        System.out.println("contraseña");
        String contra = tec.next();

        Usuario ini = iniciar.login(usuario, contra);

        if(ini != null){
            System.out.println("ingreso");
        } else {
            System.out.println("contra o usuario erroneos");
        }*/
        
        /*
        BDordenes Omanager = new BDordenes(conn);
        int id = 0, idEmp = 3;
        LocalDateTime fecha = LocalDateTime.now();
        float total = 15.00f;
        ordenes OM = new ordenes(id, idEmp, fecha, total);
        
        boolean creado = Omanager.crearOrden(OM);
        if(creado){
            System.out.println("orden creado con exito");
        } else {
            System.out.println("error orden");
        }
        
        
        id = 0;
        int idOrd = 3, idprod = 2, ctd = 2; 
        
        detalles det = new detalles(id, idOrd, idprod, ctd);
        
        boolean creadoDet = Omanager.crearDet(det);
        if(creadoDet){
            System.out.println("detalle creado con exito");
        } else {
            System.out.println("error detalle");
        }*/
        
        
        /*
        id = 0;
        System.out.println("nombre");
        name = tec.next();
        System.out.println("precio");
        price = tec.nextInt();
        System.out.println("descripcion");
        desc = tec.next();
        System.out.println("gramos");
        weight = tec.nextInt();
        //se crea el objeto en la clase y en la bd
        
        delipostresApp.admin.Dessert newDessert = new delipostresApp.admin.Dessert(id, name,desc, price, weight);
        boolean created = menu.createDessert(newDessert);
        if(created){
            System.out.println("creado con exito");
        } else {
            System.out.println("error");
        }
        
        
        
        //imprime empleado segun id usuario
        System.out.println("digite el id de usuario");
        int idEmp = tec.nextInt();
        
        BDordenes impNom = new BDordenes(conn);
        
        empleado nom = impNom.getEmpNom(idEmp);
        if (nom != null) {
            System.out.println("nombre: " + nom.getNom());
        }
        
        
        
        //imprime todos las ordenes
        BDordenes impr = new BDordenes(conn);
        
        List<ordenes> ORDENES = impr.getOrdenes();
        System.out.println("ordenes");
        for (ordenes Ordenes : ORDENES) {
            System.out.println("ID: " + Ordenes.getOrden() + ", fecha: " + Ordenes.getFecha() + ", total: " + Ordenes.getTotal());
        }
        
        //imprime todos los productos del menu
        BDmenu imprMenu = new BDmenu(conn);
        
        List<menu> MENUS = imprMenu.getMenus();
        System.out.println("Menu");
        for (menu Menus : MENUS) {
            System.out.println("ID: " + Menus.getMenuID()+ ", producto: " + Menus.getProducto() + ", descripcion: " + Menus.getDesc() + ", precio: " + Menus.getPrecio());
        }*/

    }
}
