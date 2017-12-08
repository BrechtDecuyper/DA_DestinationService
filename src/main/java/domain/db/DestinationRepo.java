package domain.db;

import java.util.List;

import domain.model.Destination;

public interface DestinationRepo {

	Destination getDestinationByCode(String postalCode);
	
	Destination getDestinationByName(String name);
	
	List<Destination> getDestinationsFromProvince(String province);

	List<Destination> getAllDestinations();
	
	void addDestination(Destination d);
}
