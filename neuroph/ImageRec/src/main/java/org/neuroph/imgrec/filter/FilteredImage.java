package org.neuroph.imgrec.filter;

import java.awt.image.BufferedImage;

/**
 * Contains image and name of applied filter.
 *
 * @author Aleksandar
 */
public class FilteredImage {

    private BufferedImage image;
    private String filterName;

    public FilteredImage(BufferedImage image, String filterName) {
        this.image = image;
        this.filterName = filterName;
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public String getFilterName() {
        return filterName;
    }

    public void setFilterName(String filterName) {
        this.filterName = filterName;
    }

}
