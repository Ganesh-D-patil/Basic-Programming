import java.util.*;
public class ThreadOne {
    public static void main(String[] args) {
        

        lappy laptop1 = new lappy("macbook ");
        Laptop laptop2 = new Laptop("LOQ ");
        Laptop laptop3 = new Laptop("HP ");
        Laptop laptop4 = new Laptop("VICTUS ");


        laptop1.Start();
        laptop2.Start();
        laptop3.Start();
        laptop4.Start();


    }
    
}
