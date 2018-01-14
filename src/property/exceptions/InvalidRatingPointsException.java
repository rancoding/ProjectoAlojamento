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
public class InvalidRatingPointsException extends Exception {
    
    /**
     *
     */
    public InvalidRatingPointsException() {
        super();
    }
    
    /**
     *
     * @param message
     */
    public InvalidRatingPointsException(String message) {
        super(message);
    }
    
}
