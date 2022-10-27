
package com.mthreejt.dvdlibrary.controller;

import com.mthreejt.dvdlibrary.dao.DVDLibraryDao;
import com.mthreejt.dvdlibrary.dao.DVDLibraryDaoException;
import com.mthreejt.dvdlibrary.dto.DVD;
import com.mthreejt.dvdlibrary.ui.DVDLibraryView;
import java.util.List;

/**
 *
 * @author rskandru
 */
public class DVDLibraryController {
    
    private final DVDLibraryDao dao;
    private final DVDLibraryView view;

    public DVDLibraryController(DVDLibraryDao dao, DVDLibraryView view) {
        this.dao = dao;
        this.view = view;
    }

    public void run(){
        boolean keepGoing = true;
        int menuSelection;
        try {
            while(keepGoing){
                menuSelection = getMenuSelection();

                switch(menuSelection){
                    case 1:
                        addDVD();
                        break;
                    case 2:
                        removeDVD();
                        break;
                    case 3:
                        editDVD();
                        break;
                    case 4:
                        listDVDs();
                        break;
                    case 5:
                        searchDVD();
                        break;
                    case 6:
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
            exitMessage();
        } catch (DVDLibraryDaoException e){
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void addDVD() throws DVDLibraryDaoException{
        view.displayAddBanner();
        DVD newDVD = view.getNewDVDInfo();
        dao.addDVD(newDVD.getTitle(), newDVD);
        view.displayAddSuccessBanner();
    }

    private void removeDVD() throws DVDLibraryDaoException{
        view.displayRemoveBanner();
        String title = view.getDVDChoice();
        if (view.confirmDeletion()) {
            DVD removedDVD = dao.removeDVD(title);
            view.displayRemoveResult(removedDVD);
        }
    }

    private void editDVD() throws DVDLibraryDaoException{
        view.displayEditDVDBanner();
        String title = view.getDVDChoice();
        DVD newInfo = view.editDVDInfo(title);
        dao.editDVD(title, newInfo);
        view.displayEditSuccessBanner();
    }

    private void listDVDs() throws DVDLibraryDaoException{
        view.displayDisplayAllDVDsBanner();
        List<DVD> dvdList = dao.listAllDVDs();
        view.displayAllDVDs(dvdList);
    }

    private void searchDVD() throws DVDLibraryDaoException{
        view.displayDisplayFindDVDBanner();
        String title = view.getDVDChoice();
        DVD dvd = dao.findDVD(title);
        view.displayDVDInfo(dvd);
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    
}
