
public class estudiante {

    public static void main(String[] args) {
   Ingeniero Ingeniero  = new Ingeniero();
        //DATOS PERSONALES 
        
    Ingeniero.setNombre("Jeffree");
    
    Ingeniero.setApellido("Quintero");
    
    Ingeniero.setTrabajo("CODIGO VERDE");
    
    Ingeniero.setEdad (20);
    
    Ingeniero.setSexo ("Masculino");
    
    
    //LO QUE SE MOSTRARA EN PANTALLA 
System.out.println("Nombre: " +Ingeniero.getNombre());

System.out.println("apellido: " +Ingeniero.getApellido());

System.out.println("trabajo: " +Ingeniero.getTrabajo());

System.out.println("Edad: " +Ingeniero.getEdad());

System.out.println("Sexo: " +Ingeniero.getSexo());
}
    
public static class Ingeniero{
    private String nombre;
    
    private String apellido;
    
    private String ocupacion_lavoral;
    
    private int edad;
    
    private String sexo;  
   
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getTrabajo(){
        return ocupacion_lavoral;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTrabajo(String trabajo){
        this.ocupacion_lavoral = trabajo;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
}
}
