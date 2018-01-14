/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.exceptions;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class ExistentCitizenIdException extends Exception {
    
    /**
     *
     */
    public ExistentCitizenIdException() {
        super();
    }

    /**
     *
     * @param message
     */
    public ExistentCitizenIdException(String message) {
        super(message);
    }
    
}
