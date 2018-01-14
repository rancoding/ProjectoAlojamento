/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.exceptions;

/**
 *
 * @author Rafael
 */
public class ExistentUsernameException extends Exception {

    /**
     *
     */
    public ExistentUsernameException() {
        super();
    }
    
    /**
     *
     * @param message
     */
    public ExistentUsernameException(String message) {
        super(message);
    }
}
