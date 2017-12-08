package domain.service;

import java.util.List;

import domain.db.DestinationRepo;
import domain.db.DestinationRepoInMemory;
import domain.model.Destination;
import domain.xml.ReadXmlFile;

public class DestinationService {

	private final DestinationRepo destinationRepo;
	
	public DestinationService() {
		destinationRepo = new DestinationRepoInMemory();
		ReadXmlFile.readXml(destinationRepo);
	}
	
	public DestinationRepo getDestinationRepo() {
		return this.destinationRepo;
	}
	
	public Destination getDestinationByCode(String postalCode) {
		return this.getDestinationRepo().getDestinationByCode(postalCode);
	}
	
	public Destination getDestinationByName(String name) {
		return this.getDestinationRepo().getDestinationByName(name);
	}
	
	public List<Destination> getDestinationsFromProvince(String province) {
		return this.getDestinationRepo().getDestinationsFromProvince(province);
	}
	
	public List<Destination> getAllDestinations() {
		return this.getDestinationRepo().getAllDestinations();
	}
	
	public void addDestination(Destination d) {
		this.getDestinationRepo().addDestination(d);
	}
}
