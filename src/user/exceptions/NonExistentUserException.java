/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.exceptions;

/**
 *
 * @author Gustavo Vieira
 */
public class NonExistentUserException extends Exception {

    /**
     *
     */
    public NonExistentUserException() {
        super();
    }
    
    /**
     *
     * @param message
     */
    public NonExistentUserException(String message) {
        super(message);
    }
    
}
