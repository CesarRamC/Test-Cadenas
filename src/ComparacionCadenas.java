
public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparacion  Cadenas (Pool de cadenas)
        var cadena1 ="Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");
        
        //Comparacion de Cadenas (==) El operador compara si apuntan la mismo objeto (referencia)
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1==cadena2);
        //Comparamos cadena1 con cadena3 (Refencia)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);
        
        //Comparar contenido (Metodo equals) 
        
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
        
        
        
        
        
    }
    
}
