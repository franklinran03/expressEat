package expresseatapp;

public class usuario {
    
    private int usuarioID;
    private String usuario;
    private String contra;
    private boolean admin;

    //constructor
    public usuario(int usuarioID, String usuario, String contra, boolean admin)  {
        this.usuarioID = usuarioID;
        this.usuario = usuario;
        this.contra = contra;
        this.admin = admin;
    }

    //metodos get y set
    public int getUsuarioID(){
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID){
        this.usuarioID = usuarioID;
    }

    public String getUsuario(){
        return usuario;
    }

    public void setUsuario(String usuario){
        this.usuario = usuario;
    } 
    
    public String getContra(){
        return contra;
    }

    public void setContra(String contra){
        this.contra = contra;
    } 

    public boolean getAdmin(){
        return admin;
    }

    public void setAdmin(boolean admin){
        this.admin = admin;
    }
}
