package arbolbinarioactividad1;

public class Tree {
    Nodo raiz = null;
    
    public boolean tieneraiz(){
        if(raiz == null){
            return false;
        }else
            return true;
    }
    
    public Tree alta(int mat, String name, String Lname){
        if(!tieneraiz()){
            Nodo nuevo = new Nodo(mat,name,Lname);
            raiz = nuevo;
        } else{
            boolean izq;
            Nodo actual = raiz;
            while (true){
                if(actual.matricula < mat){
                    izq = false;
                }else{
                    izq = true;
                }
                if(!izq){
                    if(actual.der==null){
                        Nodo nuevo = new Nodo(mat,name,Lname);
                        actual.der = nuevo; 
                        break;
                    }else{
                        actual = actual.der;
                    }
                    
                }else{
                    if(actual.izq == null){
                        Nodo nuevo = new Nodo (mat,name,Lname);
                        actual.izq = nuevo;
                        break;
                    }else{
                        actual = actual.izq;
                    }
                }
                
            }
            
        }return this;
    }
    
    
    public int obtenerMenor (Nodo y){
        if (y.izq  != null){
            obtenerMenor (y.izq);
        }
        return y.matricula;
    }
    
    public Nodo borrar (Nodo nodoAux, int matricula,String nombre,String apellido){
        //METODO DE BUSQUEDA
        
        if( !(matricula == nodoAux.matricula)){
            System.out.println("**ENTRA A BUSQUEDA**");
            if ( matricula < nodoAux.matricula){
                nodoAux.izq = borrar ( nodoAux.izq, matricula,nombre,apellido);
            }else if ( matricula > nodoAux.matricula){
                nodoAux.der = borrar(nodoAux.der, matricula,nombre,apellido);
            }
        }
        
        if ( matricula == nodoAux.matricula){
            //SE ENTRA A LOS CASOS
            //CASO 1 HOJA
            if( nodoAux.der == null && nodoAux == null){
                System.out.println("**CASO HOJA**");
                nodoAux = null;
                return nodoAux;
            }
            
            //SE ENTRA AL CASO PADRE DE UNA RAMA
            if ( nodoAux.der != null && nodoAux == null){
                System.out.println("**PADRE RAMA DERECHA**");
                nodoAux = nodoAux.der;
                return nodoAux;
            }

            
            if ( nodoAux.der != null && nodoAux == null){
                System.out.println("**PADRE RAMA IZQUIERDA**");
                nodoAux = nodoAux.izq;
                return nodoAux;
            }  
            
            //CASO 3 PADRE DE DOS
            if( nodoAux.der != null && nodoAux != null){
                System.out.println("**PADRE DE DOS HIJOS**");
                int datoMenor = obtenerMenor(nodoAux.der);
                borrar(nodoAux, datoMenor,nombre,apellido );
                nodoAux.matricula = datoMenor;
                return nodoAux;
            }
            
        }
        return nodoAux;
    }
    
    public void imprimirpreorden(){
        ayudantePreorden(raiz);
    }
    
    public void ayudantePreorden (Nodo mat){
        if(mat == null)
            return;
        System.out.println("\nMatricula : " + mat.matricula + "\nNombre : " + mat.nombre + "\nApellido : " + mat.apellido);
        ayudantePreorden(mat.der);
        ayudantePreorden(mat.izq);
    }
    
    public void imI(){
        imprimir_inorden(raiz);
    }
    public void imprimir_inorden(Nodo mat){
        if (mat!= null){
            imprimir_inorden(mat.izq);
            System.out.println("\nMatricula : " + mat.matricula + "\nNombre : " + mat.nombre + "\nApellido : " + mat.apellido);
            imprimir_inorden(mat.der);
        }
    }  
    
    public void imIB(){
        imprimir_baja(raiz);
    }
    
    public void imprimir_baja(Nodo mat){
        if (mat != null) {
            imprimir_baja(mat.izq);
            System.out.println("\nMatricula: " + mat.matricula + ", Nombre : " + mat.nombre + ", Apellido : " + mat.apellido);
            imprimir_baja(mat.der);
        }
    }   
}
