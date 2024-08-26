package expresseatapp;


public class menu {
    
    private int menuID;
    private String producto;
    private String desc;
    private float precio;
    
    public menu (int menuID, String producto, String desc, float precio){
        this.menuID = menuID;
        this.producto = producto;
        this.desc = desc;
        this.precio = precio;
    }
    
    public int getMenuID(){
        return menuID;
    }
    
    public void setMenuID(int menuID){
        this.menuID = menuID;
    }
    
    public String getProducto() {
        return producto;
    }
    
    public void setProducto(String producto){
        this.producto = producto;
    }
    
    public String getDesc() {
        return desc;
    }
    
    public void setDesc(String desc){
        this.desc = desc;
    }
    
    public float getPrecio(){
        return precio;
    }
    
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
