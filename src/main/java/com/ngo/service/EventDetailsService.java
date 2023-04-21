package com.ngo.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ngo.controller.model.EventDetails;
import com.ngo.repo.EventDetailsRepository;

@Service
public class EventDetailsService {
	
	@Autowired
    private EventDetailsRepository repo;

    public List<EventDetails> getEventDetails() {
        return repo.findAll();
    }

    public EventDetails getEventDetails(int id) {
        return repo.findById(id).orElse(null);
    }

    public EventDetails insert(EventDetails event) {
        return repo.save(event);
    }

    public EventDetails update(EventDetails event, int id) {
    	EventDetails existingEvent = repo.findById(id).orElse(null);
        if (existingEvent != null) {
        	event.setId(id);
        	event.setProfilePicture(existingEvent.getProfilePicture());
            return repo.save(event);
        }
        return null;
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

	public void uploadProfilePicture(MultipartFile file, int id) {
		try {
			repo.uploadProfilePicture(id, file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
	}


}
