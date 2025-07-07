
public class GeneradorEmail {
    
    public static void main(String[] args) {
        System.out.println("Generador de Emails");
        var nombre = "Ubaldo Acosta Soto";
        System.out.println("nombre = " + nombre);
        
        var nombrenormalizado = nombre.strip();
        nombrenormalizado = nombrenormalizado.replace(" ", ".").toLowerCase();
        System.out.println("nombrenormalizado = " + nombrenormalizado);
               
        
        var empresa = " Global Mentoring";
        var empresanormalizado = empresa.strip();
       
        empresanormalizado = empresanormalizado.replace(" ", ".").toLowerCase();
        System.out.println("empresanormalizado = " + empresanormalizado);
              
        
        var dominio = ".com.mx";
        var dominionormalizado = "@"+empresanormalizado;
        var email = nombrenormalizado +dominionormalizado + dominio;
        System.out.println("email = " + email);
        
        
    }
    
}
