
public class BusquedaDeSubcadenas {
    public static void main(String[] args) {
        //Buscar Subcadenas
        //index of- devuelve el indice de la primera aparicion de la subcadena
        
        var cadena1 = "Hola Mundo";
        //Subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        //lastindexof - devuelve el indice de la ulrima aparicion de la subcadena
        // subcadena de Mundo
        var indice2 =  cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        //subcadena no encontrada, devuelve -1
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
    
}
