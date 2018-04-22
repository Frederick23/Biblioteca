
/**
 * Lista de libro de una biblioteca
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaLibros
{
   
    Libro primero;

    /**
     * Constructor for objects of class ListaNodos
     */
    public ListaLibros()
    {
       
        primero = null;
    }

   
    // Completar los metodos
    
    // Incluye un nuevo libro en la lista
    public void pon( Libro valor){
    	//Comprobamos si la lista esta vacia
    	if (estaVacia()){
    		primero = valor;
    	}
    	// En caso de que no lo esté, insertamos al principio
    	else{
    		valor.siguiente = primero;
    		primero = valor;

    	}
        
    }
    
    public boolean estaVacia(){
       return ( primero == null );    
        
    }
    
    // Devuelve un libro que es eliminado de la lista o null si no exite
    public Libro quitar ( int id ) {
    	if (estaVacia()) return null;
        
    	Libro aux1 = primero;
    	Libro aux2 = primero.siguiente;

    	if (primero.id == id){
    		primero = aux2;
    		return aux1;
    	}

        while ( aux2 != null){
        	if ( aux2.id == id){
        		aux1.siguiente = aux2.siguiente;
        		return aux2;
        	}
        	aux1 = aux2;
        	aux2 = aux2.siguiente;

        }
        return null;
    }
   
    // Devuelve el id del libro o -1 si no esta
    public int buscarId ( String titulo ){
	    if (estaVacia()) return -1;

	    Libro aux1 = primero;

	    while (aux1 != null){
	    	if (aux1.titulo.equals(titulo) ==true){
	    		return aux1.id;
	    	}
	    	aux1 = aux1.siguiente;
	    }

	    return -1;
   }
    // Muestra los libros almacenados
    public void verCatalogo (){
    	Libro aux = primero;

    	while (aux != null){
    		System.out.println("|"+aux.toString()+"|");
    		aux = aux.siguiente;
    	}
    }
}
