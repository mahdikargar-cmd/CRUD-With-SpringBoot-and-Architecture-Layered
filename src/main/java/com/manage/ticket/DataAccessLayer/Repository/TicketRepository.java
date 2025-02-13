package com.manage.ticket.DataAccessLayer.Repository;

import com.manage.ticket.DataAccessLayer.Model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
