
package com.mthreejt.dvdlibrary.ui;

import com.mthreejt.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author rskandru
 */
public class DVDLibraryView {
    
    private final UserIO io;

    public DVDLibraryView(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection() {
        io.print("==== DVD LIBRARY MENU ===");
        io.print("1. Add DVD");
        io.print("2. Remove DVD");
        io.print("3. Edit DVD");
        io.print("4. List All DVDs");
        io.print("5. Search DVD by title");
        io.print("6. Quit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }

    public DVD getNewDVDInfo(){
        String title = io.readString("Please Enter Title:");
        String releaseDate = io.readString("Please Enter Release Date(DD/MM/YYYY):");
        String mpaaRating = io.readString("Please Enter MPAAA Rating(G/PG/PG-13/R/NC-17):");
        String directorName = io.readString("Please Enter Director Name:");
        String studioName = io.readString("Please Enter Studio Name:");
        String userNotes = io.readString("Please Enter Additional Information:");
        return new DVD(title, releaseDate,mpaaRating,directorName,studioName,userNotes);
    }

    public void displayAddBanner(){
        io.print("=== ADD DVD MENU ===");
    }
    public void displayAddSuccessBanner(){
        io.readString("Item added! Press enter to go back to Main Menu.");
    }
    public String getDVDChoice(){
        return io.readString(" Please Enter Title:");
    }
    public void displayRemoveBanner(){
        io.print("=== REMOVE DVD MENU ===");
    }
    public boolean confirmDeletion(){
        String ans = io.readString("Are you sure you want to delete? y/n");
        return ans.equals("y");
    }

    public void displayRemoveResult(DVD dvd) {
        if(dvd != null){
            io.print("DVD successfully removed.");
        }else{
            io.print("No such DVD.");
        }
        io.readString("Press enter to go back to Main Menu.");
    }

    public void displayDVDInfo(DVD dvd){
        if (dvd != null) {
            io.print("Title: " + dvd.getTitle());
            io.print("Director: " + dvd.getDirectorName());
            io.print("Studio: " + dvd.getStudioName());
            io.print("Release Date: " + dvd.getReleaseDate());
            io.print("MPAA Rating: " + dvd.getMpaaRating());
            io.print("Notes: " + dvd.getUserNote());
            io.print("");
        } else {
            io.print("No such DVD.");
        }
        io.readString("Press enter to go back to Main Menu.");
    }
    public void displayDisplayFindDVDBanner(){
        io.print("=== FIND DVD ===");
    }

    public void displayAllDVDs(List<DVD> dvdList){
        for (DVD currentDVD : dvdList){
            io.print("Title: " + currentDVD.getTitle());
            io.print("Director: " + currentDVD.getDirectorName());
            io.print("Studio: " + currentDVD.getStudioName());
            io.print("Release Date: " + currentDVD.getReleaseDate());
            io.print("MPAA Rating: " + currentDVD.getMpaaRating());
            io.print("Notes: " + currentDVD.getUserNote());
            io.print("");
        }
        io.readString("Press enter to go back to Main Menu.");
    }

    public void displayDisplayAllDVDsBanner(){
        io.print("=== ALL DVDS ===");
    }

    public void displayEditDVDBanner(){
        io.print("=== EDIT DVD INFO ===");
    }

    public DVD editDVDInfo(String title){
        String releaseDate = io.readString("Please Enter Release Date(DD/MM/YYYY):");
        String mpaaRating = io.readString("Please Enter MPAAA Rating(G/PG/PG-13/R/NC-17):");
        String directorName = io.readString("Please Enter Director Name:");
        String studioName = io.readString("Please Enter Studio Name:");
        String userNotes = io.readString("Please Enter Additional Information:");
        return new DVD(title, releaseDate,mpaaRating,directorName,studioName,userNotes);
    }

    public void displayEditSuccessBanner(){
        io.readString("Item edited! Press enter to go back to Main Menu.");
    }

    public void displayExitBanner() {
        io.print("Good Bye!!!");
    }

    public void displayUnknownCommandBanner() {
        io.print("Unknown Command!!!");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    
}
