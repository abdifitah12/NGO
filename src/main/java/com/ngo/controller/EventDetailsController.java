package com.ngo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ngo.controller.model.EventDetails;
import com.ngo.service.EventDetailsService;

@RestController
public class EventDetailsController {

	@Autowired
	private EventDetailsService eventDetailsService;

	@GetMapping("/events")
	public List<EventDetails> getEventDetailss() {
		return eventDetailsService.getEventDetails();
	}

	@GetMapping("/event/{id}")
	public EventDetails getEventDetails(@PathVariable int id) {
		return eventDetailsService.getEventDetails(id);
	}

	@PostMapping("/event")
	public EventDetails insert(@RequestBody EventDetails EventDetails) {
		return eventDetailsService.insert(EventDetails);
	}

	@PutMapping("/event/{id}")
	public EventDetails update(@RequestBody EventDetails EventDetails, @PathVariable int id) {
		return eventDetailsService.update(EventDetails, id);
	}

	@DeleteMapping("/event/{id}")
	public void delete(@PathVariable int id) {
		eventDetailsService.delete(id);
	}
	
	@PutMapping("/uploadeventimage/{id}")
	public void uploadprofilepicture(@RequestParam("file") MultipartFile file,@PathVariable int id)

	{
		eventDetailsService.uploadProfilePicture(file, id);
	}

	

}
