package arbolbinarioactividad1;
import java.util.Scanner;

public class ArbolBinarioActividad1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Scanner mat = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        Scanner lname = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);
        
        
        Tree x = new Tree();
        int z,opc,matricula;
        String nombre,apellido;
        
        //Datos pre-Cargados de prueba
        x.alta(213355,"Manuel","Lopez Perez");
        x.alta(213301,"Oscar","Medina Perez");
        x.alta(213350,"Juan","Marquez Hidalgo");
        x.alta(213365,"Omar Alexis","Cueta Aguilar");
        
        
        
        
//        System.out.println("Ingrese el numero de datos a capturar: ");
//        z = leer.nextInt();
//        for (int i=1; i <=z; i++){
//            System.out.println("Ingrese matricula " + i + " : ");
//            matricula = mat.nextInt();
//            System.out.println("Ingrese nombre " + matricula + " : ");
//            nombre = name.nextLine();
//            System.out.println("Ingrese apellido " + matricula + " " + nombre + " : ");
//            apellido = lname.nextLine();
//            
//            x.alta(matricula, nombre, apellido);
//        }
        
        do{
        System.out.println("\nMenu\n"
                + "1) Imprimir Datos\n"
                + "2) Borrar datos\n"
                + "3) Agregar datos\n");
        opc = opcion.nextInt();
        switch(opc){
            case 1: 
                System.out.println("Imprimiendo datos...");
                x.imI();
                break;
            case 2:
                System.out.println("Ingrese matricula : ");
                matricula = mat.nextInt();
                System.out.println("Ingrese nombre : ");
                nombre = name.nextLine();
                System.out.println("Ingrese apellido : ");
                apellido = lname.nextLine();
                
                x.borrar(x.raiz, matricula,nombre,apellido);
                break;
            case 3: 
                System.out.println("\nIngrese matricula nueva : ");
                matricula = mat.nextInt();
                System.out.println("Ingrese nombre ");
                nombre = name.nextLine();
                System.out.println("Ingrese apellido ");
                apellido = lname.nextLine();
                
                x.alta(matricula, nombre, apellido);
                break;
        }
        }while(opc<4 && opc>0);
    }
    
}
