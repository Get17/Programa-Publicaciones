package Publicaciones;

//Se mantuvo el arreglo, no se hizo el cambio a arraylist

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    public static void main(String[] args) throws IOException {
    	
        int ctrlpub = 0;
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
        Object publicaciones [] = new Object[10]; 
        int opc = 0;
        do {
	        System.out.println("Menu");
	        System.out.println("[1] Dar de alta una publicación");
	        System.out.println("[2] Consulta publicación");
	        System.out.println("[3] Salir");
	        System.out.print("Seleccionar opción: ");
	        opc = Integer.parseInt(leer.readLine());
	        
	        switch (opc) {
	        
	        	case 1:
	        		
		        	int sel = 0;
		        	
		        	System.out.println("Dar de alta");
		        	System.out.println("[1] Revista");
		        	System.out.println("[2] Periodico");
		        	System.out.println("[3] Libro");
		        	System.out.print("selecciona el tipo de publicacion: ");
		        	sel = Integer.parseInt(leer.readLine());
		        	
		        	if(sel == 1) {
		        		
		        		System.out.println("Revista");
		        		Revista revista = new Revista();
		        		System.out.println("Ingresar el ISSN: ");
		        		revista.setISSN(leer.readLine());
		        		System.out.println("Ingresar el titulo de la revista: ");
		        		revista.setTitulo(leer.readLine());
		        		System.out.println("Ingresar el precio de la revista: ");
		        		revista.setPrecio(Integer.parseInt(leer.readLine()));
		        		System.out.println("Ingresar el número de la revista: ");
		        		revista.setNumero(Integer.parseInt(leer.readLine()));
		        		System.out.println("Ingresar el año de la revista: ");
		        		revista.setAnio(Integer.parseInt(leer.readLine()));
		        		System.out.println("Ingresar el número de paginas de la revista: ");
		        		revista.setNumpag(Integer.parseInt(leer.readLine()));
		        		publicaciones[ctrlpub] = revista;
		                ctrlpub++;
		                
		        	}
		        	
		        	else if(sel == 2) {
		        		
		        		System.out.println("Periodico");
		        		Periodico periodico = new Periodico();
		        		System.out.println("Ingresar el titulo del periodico: ");
		        		periodico.setTitulo(leer.readLine());
		        		System.out.println("Ingresar el precio del periodico: ");
		        		periodico.setPrecio(Integer.parseInt(leer.readLine()));
		        		System.out.println("Ingresar el número de paginas del periodico: ");
		        		periodico.setNumpag(Integer.parseInt(leer.readLine()));
		        		System.out.println("Ingresar las secciones del periodico: ");
		        		periodico.setSecciones(leer.readLine());
		        		System.out.println("Ingresar el editor del periodico: ");
		        		periodico.setEditor(leer.readLine());
		        		publicaciones[ctrlpub] = periodico;
		        		ctrlpub++;
		        		
		        	}
		        	
		        	else if (sel == 3) {
		        		
		        		System.out.println("Libro");
		        		Libro libro = new Libro();
		        		System.out.println("Ingresa el titulo del libro: ");
		        		libro.setTitulo(leer.readLine());
		        		System.out.println("Ingresa el precio del libro: ");
		        		libro.setPrecio(Integer.parseInt(leer.readLine()));
		        		System.out.println("Ingresa el número de paginas del libro: ");
		        		libro.setNumpag(Integer.parseInt(leer.readLine()));
		        		System.out.println("Ingresa el ISBN del libro: ");
		        		libro.setISBN(leer.readLine());
		        		System.out.println("Ingresa la edicion del libro: ");
		        		libro.setEdicion(leer.readLine());
		        		System.out.println("Ingresa el autor del libro: ");
		        		libro.setAutor(leer.readLine());
		        		publicaciones[ctrlpub] = libro;
		        		ctrlpub++;
		        		
		        	}
		        	
		    	break;//case 1
	    	
	        case 2:
	        	
	        	for(int i = 0; i < ctrlpub; i ++ ){
	        		
	                if(publicaciones[i] instanceof Revista){
		                Revista rev = new Revista();
		                rev = (Revista)publicaciones[i];
		                System.out.println();
		                System.out.println("REVISTA");
		                System.out.println("Titulo: " + rev.getTitulo());
		                System.out.println("ISSN: " + rev.getISSN());
	                  
	                }
	                
	                else if (publicaciones [i] instanceof Libro ){
	                	
		                Libro lib = new Libro();
		                lib = (Libro)publicaciones[i];
		                System.out.println();
		                System.out.println("LIBRO");
		                System.out.println("Titulo: " + lib.getTitulo());
		                System.out.println("ISBN: " + lib.getISBN());
	                }
	                
	                else if(publicaciones[i] instanceof Periodico) {
	                	
	                	Periodico per = new Periodico();
	                	per = (Periodico)publicaciones[i];
	                	System.out.println("PERIODICO");
	                	System.out.println("Titulo: " + per.getTitulo());
		                System.out.println("Secciones: " + per.getSecciones());
	                }
	          }
        	break;//case 2
        	
	        case 3:
	        	
	        	System.out.println("Programa terminado...");
	        	
        	break;
        	
	        }
	        
        }while(opc != 3);
        
     }
   }