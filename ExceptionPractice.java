import java.util.*;

public class ExceptionPractice {

    public static void main(String[] args) {

        Farmer farmer = new Farmer();

        try {
            farmer.startWaterPump();
        } catch (PumpException e) {
            System.out.println(e.getMessage());
        }
    }
}

// Farmer Class
class Farmer {

    WaterPump pump = new WaterPump();

    void startWaterPump() throws PumpException {

        pump.start();

        System.out.println("Water is flowing...");
        System.out.println("Crop is getting water...");
    }
}

// WaterPump Class
class WaterPump {

    void start() throws PumpException {

        if (Math.random() < 0.5) {
            throw new PumpException("Pump is not starting.");
        }

        System.out.println("Pump Started Successfully.");
    }
}

// Custom Exception
class PumpException extends Exception {

    PumpException(String message) {
        super(message);
    }
}