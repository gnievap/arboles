public class Main {
    public static void main(String[] args) { 
        Arbol arbol = new Arbol(); 
        int[] valores = {50, 30, 70, 20, 40, 60, 80};
        for (int valor : valores) { 
            arbol.agregar(valor); 
        } 
        System.out.println("Recorrido inorden:"); 
        arbol.recorridoInorden(); 
        System.out.println("Recorrido preorden:"); 
        arbol.recorridoPreorden(); 
        System.out.println("Recorrido postorden:"); 
        arbol.recorridoPostorden();
    }
}
