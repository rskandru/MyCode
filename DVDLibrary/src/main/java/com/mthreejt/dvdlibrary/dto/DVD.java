
package com.mthreejt.dvdlibrary.dto;

/**
 *
 * @author rskandru
 */
public class DVD {
    
    private String title;
    private String releaseDate;
    private String mpaaRating; 
    private String directorName; 
    private String studioName; 
    private String userNote;
    
    public DVD(String title, String releaseDate, String mpaaRating, 
            String directorName, String studioName, String userNote) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.mpaaRating = mpaaRating;
        this.directorName = directorName;
        this.studioName = studioName;
        this.userNote = userNote;
    }
    
        public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMpaaRating() {
        return mpaaRating;
    }

    public void setMpaaRating(String mpaaRating) {
        this.mpaaRating = mpaaRating;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    } 
    
}
