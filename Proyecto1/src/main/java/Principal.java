
public class Principal {

  
    public static void main(String[] args) {
     
        
        Ciudadano ciudadano = new Ciudadano();
        ciudadano.setedad(0);
        System.out.println("La Edad Es = " + ciudadano.getedad());
        ciudadano.setExperiencia(0);
        System.out.println("La Experiencia Es de = " + ciudadano.getExperiencia()+" Años");
        ciudadano.getNombre();
        System.out.println("Nombre = " + ciudadano.getNombre());
    }
    
}
