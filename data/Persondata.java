package data;

import java.util.ArrayList;
import java.util.List;

import entities.Person;

public class Persondata {
    List<Person> lis = new ArrayList<Person>();
    Person p =new Person();
    
    public void create(Person p) {
        //
        System.out.println("Create");
    }
    public List<Person> list(String filter){
        List<Person> lis=new ArrayList<Person>();
        return lis;
    }
    public Person get(int id){
        Person d = new Person();
        //
        return d;
    }
    public void Update(int Person) {
        return;
    }
    public void delete(int id) {
        
    }
}
