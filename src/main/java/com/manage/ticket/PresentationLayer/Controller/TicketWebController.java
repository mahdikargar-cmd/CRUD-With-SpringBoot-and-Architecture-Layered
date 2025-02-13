package com.manage.ticket.PresentationLayer.Controller;
import com.manage.ticket.BusinessLogicLayer.Service.TicketService;
import com.manage.ticket.DataAccessLayer.Model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/tickets")
public class TicketWebController {
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public String listTickets(Model model) {
        model.addAttribute("tickets", ticketService.getAllTickets());
        return "tickets/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("ticket", new Ticket());
        return "tickets/add"; // فایل add.html
    }

    @PostMapping("/add")
    public String addTicket(@ModelAttribute Ticket ticket) {
        ticketService.addTicket(ticket);
        return "redirect:/tickets";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Ticket ticket = ticketService.getTicket(id);
        model.addAttribute("ticket", ticket);
        return "tickets/edit";
    }

    @PostMapping("/edit/{id}")
    public String updateTicket(@PathVariable Long id, @ModelAttribute Ticket ticket) {
        ticketService.updateTicket(id, ticket);
        return "redirect:/tickets";
    }

    @GetMapping("/delete/{id}")
    public String deleteTicket(@PathVariable Long id) {
        ticketService.deleteTicket(id);
        return "redirect:/tickets";
    }
}
