package domain.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import domain.model.Destination;

public class DestinationRepoInMemory implements DestinationRepo {

	private Map<String, Destination> destinations;
	private Map<String, String> nameCodeLinker;
	
	public DestinationRepoInMemory() {
		destinations = new HashMap<>();
		nameCodeLinker = new HashMap<>();
	}
	
	@Override
	public Destination getDestinationByCode(String postalCode) {
		return this.destinations.get(postalCode);
	}

	@Override
	public Destination getDestinationByName(String name) {
		name = name.toLowerCase();
		return this.destinations.get(this.nameCodeLinker.get(name));
	}

	@Override
	public List<Destination> getDestinationsFromProvince(String province) {
		province = province.toLowerCase();
		List<Destination> destins = new ArrayList<>();
		for (Destination destination : this.destinations.values()) {
			if (destination.getProvince().toLowerCase() == province)
				destins.add(destination);
		}
		return destins;
	}

	@Override
	public List<Destination> getAllDestinations() {
		List<Destination> destins = new ArrayList<>();
		for (Destination destination : this.destinations.values()) {
			destins.add(destination);
		}
		return destins;
	}

	@Override
	public void addDestination(Destination d) {
		this.destinations.put(d.getPostalcode(), d);
		this.nameCodeLinker.put(d.getName().toLowerCase(), d.getPostalcode());
	}
}
