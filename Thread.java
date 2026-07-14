import java.util.*;
public class Thread {
    public static void main(String[] args) {

        //3
        Bike bike1= new Bike("TVS");
        Bike bike2= new Bike("shine");
        Bike bike3= new Bike("passion");

        Bike bike4= new Bike("royal enfield");

        bike1.start();
        bike2.start();
        bike3.start();
        bike4.start();
        bike5.start();

    }
}
class Bike extends Thread
{
    String model;
    Bike(String m)
    {
        model=m;
    }
    public void run()
    {
        for(int i=1;i<=50;i++)
            {
            
                System.out.println(model+" running..."+i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
        
