package web.servise;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImp implements CarService {

     private static List<Car> cars;

     {
          cars = new ArrayList<>();
          cars.add(new Car("Volvo", "red", 1234));
          cars.add(new Car("Lada", "blu", 1564));
          cars.add(new Car("Toyota", "red", 1456));
          cars.add(new Car("Audi", "black", 5678));
          cars.add(new Car("Subaru", "white", 5678));
     }


     @Override
     public List<Car> listCars() {
          return cars;
     }

     @Override
     public List<Car> countCar(int count) {
          if (count > 0 && count < 5) {
               return cars.stream().limit(count).toList();
          } else {
               return cars;
          }
     }
}

