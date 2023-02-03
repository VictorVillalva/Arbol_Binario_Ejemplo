package arbolbinarioactividad1;
public class Nodo {
    int matricula; //key o llave que utilizaremos para el ordenamiento con el arbol binario
    String nombre;
    String apellido;
    Nodo der;
    Nodo izq;
    Nodo(int mat, String name, String Lname ){
        this.matricula=mat;
        this.nombre=name;
        this.apellido=Lname;
        this.der=null;
        this.izq=null;
    }
}
