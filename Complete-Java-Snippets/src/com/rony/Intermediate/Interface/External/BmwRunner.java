package com.rony.Intermediate.Interface.External;

import com.rony.Intermediate.Interface.Internal.BMW;
import com.rony.Intermediate.Interface.Internal.Bike;
import com.rony.Intermediate.Interface.Internal.Boat;
import com.rony.Intermediate.Interface.Internal.Car;

public class BmwRunner {
    public static void main(String[] args) {
        Car car = new BMW();
        car.show();
        car.config();

        Bike bike = new BMW();
        bike.run();

        Boat boat = new BMW();
        boat.flow();

        System.out.println("Model: "+Car.model);
        System.out.println("Weight: "+Car.weight);
    }
}
