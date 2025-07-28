package com.rony.Intermediate.Interface.External;

import com.rony.Intermediate.Interface.Internal.Vehicle;
import com.rony.Intermediate.Interface.Internal.VehicleImpl;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleImpl();
        vehicle.show();
        vehicle.config();

        System.out.println(Vehicle.model);
        System.out.println(Vehicle.color);
        System.out.println(Vehicle.size);
    }
}
