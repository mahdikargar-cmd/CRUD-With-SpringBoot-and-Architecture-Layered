package com.manage.ticket.DataAccessLayer.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "tickets")
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private double price;
    private String date;
    private String departureTime;
    private String origin;
    private String destination;
    private String busCompany;
    private int seatNumber;
    private boolean selected;

    // Getters and Setters
    public Long getId() { return id; }

  //  public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public String getDepartureTime() { return departureTime; }

    public void setDepartureTime(String departureTime) { this.departureTime = departureTime; }

    public String getOrigin() { return origin; }

    public void setOrigin(String origin) { this.origin = origin; }

    public String getDestination() { return destination; }

    public void setDestination(String destination) { this.destination = destination; }

    public String getBusCompany() { return busCompany; }

    public void setBusCompany(String busCompany) { this.busCompany = busCompany; }

    public int getSeatNumber() { return seatNumber; }

    public void setSeatNumber(int seatNumber) { this.seatNumber = seatNumber; }

    public boolean isSelected() { return selected; }

    public void setSelected(boolean selected) { this.selected = selected; }
}
