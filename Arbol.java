public class Arbol {
    Nodo raiz; 
    // Método para agregar un nuevo valor al árbol 
    void agregar(int valor) { 
        raiz = agregarRecursivo(raiz, valor); 
    }
     // Método recursivo para agregar un valor en la posición correcta 
    Nodo agregarRecursivo(Nodo nodo, int valor) { 
        if (nodo == null) { 
            return new Nodo(valor); 
        } 
        if (valor < nodo.valor) { 
            nodo.izquierdo = agregarRecursivo(nodo.izquierdo, valor); 
        } else if (valor > nodo.valor) { 
            nodo.derecho = agregarRecursivo(nodo.derecho, valor); 
        } return nodo; } 
        
        // Método para recorrido inorden 
        void recorridoInorden(Nodo nodo) {
             if (nodo != null) { 
                recorridoInorden(nodo.izquierdo); 
                System.out.print(nodo.valor + " "); 
                recorridoInorden(nodo.derecho); 
            } 
        } 
        
        // Método para recorrido preorden 
        void recorridoPreorden(Nodo nodo) {
             if (nodo != null) { 
                System.out.print(nodo.valor + " "); 
                recorridoPreorden(nodo.izquierdo); 
                recorridoPreorden(nodo.derecho); 
            } 
        } 
        
        // Método para recorrido postorden 
        void recorridoPostorden(Nodo nodo) {
             if (nodo != null) {
                 recorridoPostorden(nodo.izquierdo); 
                 recorridoPostorden(nodo.derecho); 
                 System.out.print(nodo.valor + " "); 
            } 
        } 
        
        // Métodos para iniciar los recorridos desde la raíz 
        void recorridoInorden() { 
            recorridoInorden(raiz); 
            System.out.println(); 
        } 
        
        void recorridoPreorden() { 
            recorridoPreorden(raiz); 
            System.out.println(); 
        } 
        
        void recorridoPostorden() { 
            recorridoPostorden(raiz); 
            System.out.println(); 
        }
}
