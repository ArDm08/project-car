package ua.com.foxminded.carservise;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.ImmutableDescriptor;

final class ServiceInform {
public static void main (String[]args) {
	
	PassengerCar toyota = new PassengerCar("Toyota Corola",2014,1100,"White","Gas",2.0,true);
	CargoCar man = new CargoCar("MAN",2016,6200,"Green","Diesel",6.5,true);
	Bus scania = new Bus("Scania",2015,9700,"Red","Fuel",5.2,true);
	man.addDistance(320000);
	man.isNeedToService();
	scania.addDistance(470000);
	scania.isNeedToService();
	toyota.addDistance(200000);
	toyota.destroyEngine();
//	toyota.repairEngine();
	toyota.isNeedToService();
	CarService service1 = new CarService(2022,8,17);
	CarService service2 = new CarService(2022,10,19);
	CarService service3 = new CarService(2022,12,22);
	Map<CarService,List<Object>> serviceOfCAr= new HashMap<CarService,List<Object>>();
	
	
	serviceOfCAr.put(service1, Arrays.asList(toyota));  
	serviceOfCAr.put(service2, Arrays.asList(scania));  
	serviceOfCAr.put(service3, Arrays.asList(man));  
	for (Map.Entry entry : serviceOfCAr.entrySet()) {
	    System.out.println( entry.getKey() + "  "
	        + entry.getValue());
}
	
}
}