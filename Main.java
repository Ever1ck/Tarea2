import java.util.Scanner;

import data.Persondata;
import entities.Person;
import entitiesprod.Productos;

public class Main {
    public static void main(String[] args) {
        //Scanner input =new Scanner(System.in);
        //String name = input.nextLine();
        //System.out.println("Escribiste: "+name);
        
        Persondata data = new Persondata();
        data.create(new Person());
        data.list("filter");
        
        Scanner input = new Scanner(System.in);
        int opt = 0;
        do{
            System.out.println("***** CRUD PERSON *****");
            System.out.println("1 List ");
            System.out.println("2 New ");
            System.out.println("3 Delete ");
            System.out.println("0 Exit ");
            System.out.println("Choice option: ");
            opt = input.nextInt();
            System.out.println("You chosed: " + opt);
            input.nextLine(); // Limpiar el buffer
            switch (opt) {
                case 1: System.out.println("Opcion 1 elegida");
                break;
                case 2: System.out.println("Opcion 2 elegida");
                break;
                case 3: System.out.println("Opcion 3 elegida");
                break;
            }
        }while (opt !=0);
        
    }
}




