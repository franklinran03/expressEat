package expresseatapp;

import java.time.LocalDateTime;

public class ordenes {
    private int ordenID;
    private int IDempleado;
    private LocalDateTime fecha;
    private float total;
    
    public ordenes(int ordenID, int IDempleado, LocalDateTime fecha, float total){
        this.ordenID = ordenID;
        this.IDempleado = IDempleado;
        this.fecha = fecha;
        this.total = total;
    }
    
    public int getOrden(){
        return ordenID;
    }
    
    public void setOrder(int orden){
        this.ordenID = orden;
    }
    
    public int getIDempleado(){
        return IDempleado;
    }
    
    public void setIDempleado(int IDempleado){
        this.IDempleado = IDempleado;
    }
    
    public LocalDateTime getFecha(){
        return fecha;
    }
    
    public void setFecha(LocalDateTime fecha){
        this.fecha = fecha;
    }
    
    public float getTotal(){
        return total;
    }
    
    public void setTotal(float total){
        this.total = total;
    }
}
