/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package property;

/**
 *
 * @author Rafael
 * @author Gustavo
 */
public class Photo {
    private String name;
    private String directory;
    private String format;

    /**
     *
     * @param name
     * @param directory
     * @param format
     */
    public Photo(String name, String directory, String format) {
        this.name = name;
        this.directory = directory;
        this.format = format;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getDirectory() {
        return directory;
    }

    /**
     *
     * @param directory
     */
    public void setDirectory(String directory) {
        this.directory = directory;
    }

    /**
     *
     * @return
     */
    public String getFormat() {
        return format;
    }

    /**
     *
     * @param format
     */
    public void setFormat(String format) {
        this.format = format;
    }
}
