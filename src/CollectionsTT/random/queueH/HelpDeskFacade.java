package CollectionsTT.random.queueH;

public interface HelpDeskFacade {
    void addNewSupportTicket(SupportTicket supportTicket);
    SupportTicket getNextSupportTicket();
    int getNumberOfTickets();
}
