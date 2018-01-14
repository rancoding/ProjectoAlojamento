/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property.exceptions;

/**
 *
 * @author Gustavo Vieira
 */
public class ExistentBookingTypeNameException extends Exception {
    
    /**
     *
     */
    public ExistentBookingTypeNameException() {
        super();
    }
    
    /**
     *
     * @param message
     */
    public ExistentBookingTypeNameException(String message) {
        super(message);
    }
    
}
