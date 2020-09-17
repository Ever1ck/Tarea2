import entities.Person;
import entitiesprod.Productos;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Saul "+p);
        p.setSex("M");
        System.out.println("Sexo = "+ p.getSex());
        p.laugh();

        Person p2 = new Person("Gloria", "F");
        System.out.println("Sexo = "+ p2.getSex() );
        p2.laugh();
    }

    public static void productos(String[] args) {
        Productos p = new Productos();
        p.setName("Saul "+p);
        p.setPrice("M");
        System.out.println("Precio = "+ p.getPrice());
        p.laugh();

        Productos p2 = new Productos("Gloria", "F");
        System.out.println("Sexo = "+ p2.getPrice() );
        p2.laugh();
    }
}