/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property.booking;

import java.time.LocalDate;

import user.Client;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Booking {
    private final int referenceID;
    private int nClients;
    private double finalPrice;
    private boolean confirmed;
    private boolean closed;
    private boolean paid;
    private LocalDate startingDate;
    private LocalDate endingDate;
    private BookingType bookingType;
    private PaymentType paymentType;
    private Client client;
    private static int count;

    /**
     *
     * @param nClients
     * @param finalPrice
     * @param dataInicio
     * @param dataFim
     * @param bookingType
     * @param paymentType
     * @param client
     */
    public Booking(int nClients, double finalPrice, LocalDate dataInicio, LocalDate dataFim, BookingType bookingType, PaymentType paymentType, Client client) {
        this.referenceID = count;
        this.nClients = nClients;
        this.finalPrice = finalPrice;
        this.confirmed = false;
        this.closed = false;
        this.paid = false;
        this.startingDate = dataInicio;
        this.endingDate = dataFim;
        this.bookingType = bookingType;
        this.paymentType = paymentType;
        this.client = client;
        count++;
    }
    
    /**
     * 
     */
    public Booking() {
        this.referenceID = -1;
        this.nClients = -1;
        this.finalPrice = -1;
        this.confirmed = false;
        this.closed = false;
        this.paid = false;
        this.startingDate = LocalDate.now();
        this.endingDate = LocalDate.now();
        this.bookingType = new BookingType();
        this.paymentType = new PaymentType();
        this.client = new Client();
    }
    
    /**
     *
     * @return
     */
    public int getReferenceID() {
        return referenceID;
    }
    
    /**
     *
     * @return
     */
    public int getnClients() {
        return nClients;
    }

    /**
     *
     * @param nClients
     */
    public void setnClients(int nClients) {
        this.nClients = nClients;
    }

    /**
     *
     * @return
     */
    public double getFinalPrice() {
        return finalPrice;
    }

    /**
     *
     * @param finalPrice
     */
    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    /**
     *
     * @return
     */
    public boolean isConfirmed() {
        return confirmed;
    }

    /**
     *
     * @param confirmed
     */
    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    /**
     *
     * @return
     */
    public boolean isClosed() {
        return closed;
    }

    /**
     *
     * @param closed
     */
    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    /**
     *
     * @return
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     *
     * @param paid
     */
    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    /**
     *
     * @return
     */
    public LocalDate getStartingDate() {
        return startingDate;
    }

    /**
     *
     * @param startingDate
     */
    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    /**
     *
     * @return
     */
    public LocalDate getEndingDate() {
        return endingDate;
    }

    /**
     *
     * @param endingDate
     */
    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    /**
     *
     * @return
     */
    public BookingType getBookingType() {
        return bookingType;
    }

    /**
     *
     * @param bookingType
     */
    public void setBookingType(BookingType bookingType) {
        this.bookingType = bookingType;
    }

    /**
     *
     * @return
     */
    public PaymentType getPaymentType() {
        return paymentType;
    }

    /**
     *
     * @param paymentType
     */
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    /**
     *
     * @return
     */
    public Client getClient() {
        return client;
    }

    /**
     *
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }
    
}
