package com.ngo.controller.model;

import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Lob;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class EventDetails {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    
	    private int id;


	    private String eventName;


	    private String category;


	    private String location;

	    @JsonFormat(pattern = "dd-MM-YYYY")
	    private Date startDate;
	    
	    @JsonFormat(pattern = "dd-MM-YYYY")
	    private Date endDate;
	    
	    private String eventDescription;
	    
	    private String eventCategory;
	    
	    private LocalTime eventStartTime;
	    
	    private LocalTime eventEndTime;
	    
	    private Double adulTicketPrice;
	    
	    private Double childTicketPrice;
	    
	    @Lob 
		private byte[] profilePicture;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getEventName() {
			return eventName;
		}

		public void setEventName(String eventName) {
			this.eventName = eventName;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		public String getEventDescription() {
			return eventDescription;
		}

		public void setEventDescription(String eventDescription) {
			this.eventDescription = eventDescription;
		}

		public String getEventCategory() {
			return eventCategory;
		}

		public void setEventCategory(String eventCategory) {
			this.eventCategory = eventCategory;
		}

		public LocalTime getEventStartTime() {
			return eventStartTime;
		}

		public void setEventStartTime(LocalTime eventStartTime) {
			this.eventStartTime = eventStartTime;
		}

		public LocalTime getEventEndTime() {
			return eventEndTime;
		}

		public void setEventEndTime(LocalTime eventEndTime) {
			this.eventEndTime = eventEndTime;
		}

		public Double getAdulTicketPrice() {
			return adulTicketPrice;
		}

		public void setAdulTicketPrice(Double adulTicketPrice) {
			this.adulTicketPrice = adulTicketPrice;
		}

		public Double getChildTicketPrice() {
			return childTicketPrice;
		}

		public void setChildTicketPrice(Double childTicketPrice) {
			this.childTicketPrice = childTicketPrice;
		}

		public byte[] getProfilePicture() {
			return profilePicture;
		}

		public void setProfilePicture(byte[] profilePicture) {
			this.profilePicture = profilePicture;
		}

}
