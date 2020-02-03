package domain;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order
{
    private int orderNr;
    private boolean isStudentOrder;

    private ArrayList<MovieTicket> tickets;

    public Order(int orderNr, boolean isStudentOrder)
    {
        this.orderNr = orderNr;
        this.isStudentOrder = isStudentOrder;

        tickets = new ArrayList<MovieTicket>();
    }

    public int getOrderNr()
    {
        return orderNr;
    }

    public void addSeatReservation(MovieTicket ticket)
    {
        tickets.add(ticket);
    }

    public double calculatePrice()
    {
        if(isStudentOrder == true){
            return studentPrice();
        }
        else{
            return nonStudentPrice();
        }
    }
    
    //we assume, everybody buys the same ticket
    public double studentPrice(){
        double amountOfTickets = tickets.size();
        double plusone =  amountOfTickets % 2;
        amountOfTickets = (amountOfTickets / 2) ;
        int x = (int) amountOfTickets;
        amountOfTickets = x + plusone;
        double price = tickets.get(0).getPrice();
        boolean premium = tickets.get(0).isPremiumTicket();
        if(premium == true){
            price = price + 2.0;
        }
        return amountOfTickets * price;
    }
    //we assume, everybody buys the same ticket
    public double nonStudentPrice(){
        LocalDate date = LocalDate.now();
        double amountOfTickets = tickets.size();
        double price = tickets.get(0).getPrice();
        boolean premium = tickets.get(0).isPremiumTicket();
        if(premium == true){
            price = price + 3.0;
        }
        if(date.getDayOfWeek().getValue() < 5){
            double plusone =  amountOfTickets % 2;
            amountOfTickets = (amountOfTickets / 2) ;
            int x = (int) amountOfTickets;
            amountOfTickets = x + plusone;
        }
        else{
            if(tickets.size() >= 6){
                price = price * 0.9;
            }
            else{
                //do nothing
            }
        }
        return price * amountOfTickets; 
    }

    public void export(TicketExportFormat exportFormat)
    {
        // Bases on the string respresentations of the tickets (toString), write
        // the ticket to a file with naming convention Order_<orderNr>.txt of
        // Order_<orderNr>.json
    }
}
