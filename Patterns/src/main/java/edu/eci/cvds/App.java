package edu.eci.cvds;

/**
 * Hello world!
 * Clase App
 * @Author Brayan Macias
 * @Author Carolina Morales
 * @Version 1.0
 */
public class App 
{
	/**
	* Metodo principal
	* @param args arreglo de cadena
	*/
    public static void main( String[] args )
    {
		if(args.length > 1){
			System.out.println( "Hello " + args[0] + " " +args[1] + "!");
		}
		else if(args.length > 0){
			System.out.println( "Hello " + args[0] + "!");
		}
		
		else{
			System.out.println( "Hello World!" );
		}
    }
}
