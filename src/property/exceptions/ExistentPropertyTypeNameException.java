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
public class ExistentPropertyTypeNameException extends Exception {
    
    /**
     *
     */
    public ExistentPropertyTypeNameException() {
        super();
    }
    
    /**
     *
     * @param message
     */
    public ExistentPropertyTypeNameException(String message) {
        super(message);
    }
    
}
