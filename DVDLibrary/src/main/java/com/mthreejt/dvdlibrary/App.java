
package com.mthreejt.dvdlibrary;

import com.mthreejt.dvdlibrary.controller.DVDLibraryController;
import com.mthreejt.dvdlibrary.dao.DVDLibraryDao;
import com.mthreejt.dvdlibrary.dao.DVDLibraryDaoFileImpl;
import com.mthreejt.dvdlibrary.ui.DVDLibraryView;
import com.mthreejt.dvdlibrary.ui.UserIO;
import com.mthreejt.dvdlibrary.ui.UserIOConsoleImpl;

/**
 *
 * @author rskandru
 */
public class App {
    
    public static void main(String[] args) {
        UserIO myIO = new UserIOConsoleImpl();
        DVDLibraryView myView = new DVDLibraryView(myIO);
        DVDLibraryDao myDao = new DVDLibraryDaoFileImpl();
        DVDLibraryController controller = new DVDLibraryController(myDao, myView);
        controller.run();
    }
    
}
