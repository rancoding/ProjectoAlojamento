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
public class ExistentDiscountDescriptionException extends Exception {
    
    public ExistentDiscountDescriptionException() {
        super();
    }
    
    public ExistentDiscountDescriptionException(String message) {
        super(message);
    }
    
}
