
package com.mthreejt.dvdlibrary.dao;

import com.mthreejt.dvdlibrary.dto.DVD;
import java.util.List;

/**
 *
 * @author rskandru
 */
public interface DVDLibraryDao {
    
    DVD addDVD(String title, DVD dvd) throws DVDLibraryDaoException;
    
    DVD removeDVD(String title) throws DVDLibraryDaoException;
    
    DVD editDVD(String title, DVD newInfo) throws DVDLibraryDaoException;
    
    List<DVD> listAllDVDs() throws DVDLibraryDaoException;
    
    DVD findDVD(String title) throws DVDLibraryDaoException;
    
}
