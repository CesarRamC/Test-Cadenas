
public class MasConatenacionCadenas {
    public static void main(String[] args) {
      //Mas formas de concatenar cadenas en Java
      var cadena1 = "Hola";
      var cadena2 = "Mundo";
      var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + = " + cadena3);
        
      // Metodo concat
      cadena3 = cadena1.concat( " ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);
        
        //StringBuilder
        var constuctorCadenas =  new StringBuilder();
        //constuctorCadenas.append(cadena1);
        //constuctorCadenas.append(" ");
        //constuctorCadenas.append(cadena2);
        constuctorCadenas.append(cadena1).append(" ").append(cadena2).toString();
        var resultado =constuctorCadenas.toString();
        System.out.println("resultado con String Builder = " + resultado);
        
        //Clase String Buffer
        
        var StringBuffer = new StringBuffer();
        StringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = StringBuffer.toString();
        System.out.println("resultado String Buffer = " + resultado);
        
        //join
        resultado = String.join(" ",cadena1, cadena2, "de *** !");
        System.out.println("resultado join= " + resultado);
        
        
        
        
      
      
        
    }
    
}
