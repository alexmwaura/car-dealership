import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class VehicleTest {
   ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
   Vehicle suv = new Vehicle(2002, "Ford", "Explorer",100000, 7000);
    @Test
   public void getVehicle_shouldGetVehicleModel_String(){
       vehicles.add(suv);
       for (Vehicle vehicle: vehicles){
            assertEquals(vehicle.getModel(),"Explorer");
       }

   }
}