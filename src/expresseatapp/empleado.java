package expresseatapp;

public class empleado {
    private int empID;
    private int usuID;
    private String nom;
    private String ape;
    
    public empleado (int empID, int usuID, String nom, String ape){
        this.empID = empID;
        this.usuID = usuID;
        this.nom = nom;
        this.ape = ape;
    }
    
    public int getID () {
        return empID;
    }
    
    public void setID (int id) {
        this.empID = id;
    }
    
    public int getUsu () {
        return usuID;
    }
    
    public void setUsu (int usu){
        this.usuID = usu;
    } 
    
    public String getNom () {
        return nom;
    }
    
    public void setNom (String nom) {
        this.nom = nom;
    }
    
    public String getApe () {
        return ape;
    }
    
    public void setApe (String ape) {
        this.ape = ape;
    }    
}
