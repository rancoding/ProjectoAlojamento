/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

import java.io.Serializable;

/**
 * The photo class which contains its variables
 * @author Rafael
 * @author Gustavo
 */
public class Photo implements Serializable {
    private String name;
    private String directory;
    private String format;

    /**
     * The Photo constructor
     * @param name What is the photo file name
     * @param directory In which directory is that file situated
     * @param format What is the file format
     */
    public Photo(String name, String directory, String format) {
        this.name = name;
        this.directory = directory;
        this.format = format;
    }

    /**
     * The Photo constructor, requiring nothing and initializing variables with "empty" values
     */
    public Photo() {
        this.name = "";
        this.directory = "";
        this.format = "";
    }
    
    /**
     * Returns the current photo name
     * @return The file name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a new file name (which is sent as an argument)
     * @param name The new file name to be set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the current photo directory
     * @return The file directory
     */
    public String getDirectory() {
        return directory;
    }

    /**
     * Sets a new file directory (which is sent as an argument)
     * @param directory The new file directory to be set
     */
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     * Returns the current photo format
     * @return The file format
     */
    public String getFormat() {
        return format;
    }

    /**
     * Sets a new file format (which is sent as an argument)
     * @param format The new file format to be set
     */
    public void setFormat(String format) {
        this.format = format;
    }
}
