package expresseatapp;


public class detalles {
    private int detalleID;
    private int orden_id;
    private int id_prod;
    private int cant;
    
    public detalles (int detalleID, int orden_id, int id_prod, int cant){
        this.detalleID = detalleID;
        this.orden_id = orden_id;
        this.id_prod = id_prod;
        this.cant = cant;
    }
    
    
    public int getID (){
        return detalleID;
    }
    
    public void setID (int id){
        this.detalleID = id;
    }
    
    public int getOrden () {
        return orden_id;
    }
    
    public void setOrden (int orden_id){
        this.orden_id = orden_id;
    }
    
    
    public int getProd (){
        return id_prod;
    }
    
    public void setProd (int prod){
        this.id_prod = prod;
    }
    
    public int getCtd () {
        return cant;
    }
    
    public void setCtd (int ctd){
        this.cant = ctd;
    }
    
    
    
}
