/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Room {
    private int bedsQuantity;
    private List<BedType> bedType;

    /**
     *
     * @param bedsQuantity
     */
    public Room(int bedsQuantity) {
        this.bedsQuantity = bedsQuantity;
        this.bedType = new ArrayList<>();
    }

    /**
     * 
     */
    public Room() {
        this.bedsQuantity = -1;
        this.bedType = new ArrayList<>();
    }
    
    /**
     *
     * @return
     */
    public int getBedsQuantity() {
        return bedsQuantity;
    }

    /**
     *
     * @param bedsQuantity
     */
    public void setBedsQuantity(int bedsQuantity) {
        this.bedsQuantity = bedsQuantity;
    }

    /**
     *
     * @return
     */
    public List<BedType> getBedType() {
        return bedType;
    }

    /**
     *
     * @param bedType
     */
    public void setBedType(List<BedType> bedType) {
        this.bedType = bedType;
    }
}
