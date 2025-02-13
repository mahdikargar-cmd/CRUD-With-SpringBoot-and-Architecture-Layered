package com.manage.ticket.BusinessLogicLayer.Service;

import com.manage.ticket.DataAccessLayer.Model.Ticket;
import com.manage.ticket.DataAccessLayer.Repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketService {
    @Autowired
    private TicketRepository ticketRepository;

    public Ticket addTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket getTicket(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket updateTicket(Long id, Ticket ticketDetails) {
        Ticket ticket = getTicket(id);
        if (ticket == null) {
            return null;
        }

        ticket.setTitle(ticketDetails.getTitle());
        ticket.setDescription(ticketDetails.getDescription());
        ticket.setPrice(ticketDetails.getPrice());
        ticket.setDate(ticketDetails.getDate());
        ticket.setDepartureTime(ticketDetails.getDepartureTime());
        ticket.setOrigin(ticketDetails.getOrigin());
        ticket.setDestination(ticketDetails.getDestination());
        ticket.setBusCompany(ticketDetails.getBusCompany());
        ticket.setSeatNumber(ticketDetails.getSeatNumber());
        ticket.setSelected(ticketDetails.isSelected());

        return ticketRepository.save(ticket);
    }

    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }
}
