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
public class ExistentBedTypeNameException extends Exception {
    
    /**
     *
     */
    public ExistentBedTypeNameException() {
        super();
    }
    
    /**
     *
     * @param message
     */
    public ExistentBedTypeNameException(String message) {
        super(message);
    }
    
}
