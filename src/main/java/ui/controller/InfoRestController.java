package ui.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoRestController {

	@RequestMapping(value = "/info")
	public String getInfo() {
		return "<p>Destination Service: geeft informatie over een reisbestemming</p>";
	}

	@RequestMapping(value = "/")
	public String index() {
		return "<p>Destination Service: geeft informatie over een reisbestemming</p>";
	}
}
