import entities.Person;
import entitiesprod.Productos;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Saul "+p);
        p.setSex("M");
        System.out.println("Sexo ="+ p.getSex());
        p.laugh();

        Person p2 = new Person("Gloria", "F");
        System.out.println("Sexo = "+ p2.getSex() );
        p2.laugh();

        Productos pd = new Productos();
        pd.setName("Cereal "+pd);
        pd.setPrice("125");
        System.out.println("Precio = "+ pd.getPrice());
        pd.hipe();

        Productos pd2 = new Productos("Leche", "120");
        System.out.println("precio = "+ pd2.getPrice() );
        pd2.hipe();
    }
}