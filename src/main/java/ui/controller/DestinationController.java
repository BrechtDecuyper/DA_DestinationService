package ui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import domain.model.Destination;
import domain.service.DestinationService;

@RestController
public class DestinationController {

	private final DestinationService service;

	public DestinationController(@Autowired DestinationService destinationService) {
		this.service = destinationService;
	}

	public DestinationService getService() {
		return this.service;
	}
	
	@RequestMapping(value = "/destination/code/{postalCode}", produces = "application/json")
	public Destination getDestinationByCode(@PathVariable String postalCode) {
		return this.getService().getDestinationByCode(postalCode);
	}

	@RequestMapping(value = "/destination/city/{name}", produces = "application/json")
	public Destination getDestinationByName(@PathVariable String name) {
		return this.getService().getDestinationByName(name);
	}

	@RequestMapping(value = "/destinations/{province}", produces = "application/json")
	public List<Destination> getDestinationsFromProvince(@PathVariable String province) {
		return this.getService().getDestinationsFromProvince(province);
	}

	@RequestMapping(value = "/destinations", produces = "application/json")
	public List<Destination> getAllDestinations() {
		return this.getService().getAllDestinations();
	}

	@PostMapping(value = "/destination")
	public void addWeatherData(@RequestBody Destination destination) {
		this.getService().addDestination(destination);
	}
}
