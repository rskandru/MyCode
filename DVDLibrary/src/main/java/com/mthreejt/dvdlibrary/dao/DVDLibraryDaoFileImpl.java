
package com.mthreejt.dvdlibrary.dao;

import com.mthreejt.dvdlibrary.dto.DVD;
import java.io.*;
import java.util.*;

/**
 *
 * @author rskandru
 */
public class DVDLibraryDaoFileImpl implements DVDLibraryDao{
    
    public static final String LIBRARY_FILE= "dvds.txt";
    public static final String DELIMITER = "::";

    private final Map<String, DVD> dvds = new HashMap<>();

    private DVD unmarshalDVD(String dvdAsText){
        String[] dvdTokens = dvdAsText.split(DELIMITER);
        return new DVD(dvdTokens[0], dvdTokens[1], dvdTokens[2], dvdTokens[3], dvdTokens[4], dvdTokens[5]);
    }

    private void loadLibraryFile() throws DVDLibraryDaoException{
        Scanner sc;
        try {
            sc = new Scanner(new BufferedReader(new FileReader(LIBRARY_FILE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryDaoException( "Could not load DVD library data into memory.", e);
        }

        String currentLine;
        DVD currentDVD;

        while(sc.hasNextLine()){
            currentLine = sc.nextLine();
            currentDVD = unmarshalDVD(currentLine);
            dvds.put(currentDVD.getTitle(), currentDVD);
        }
        sc.close();
    }

    private String marshallDVD(DVD dvd){
        String dvdAsText = dvd.getTitle() + DELIMITER;
        dvdAsText += dvd.getReleaseDate() + DELIMITER;
        dvdAsText += dvd.getMpaaRating() +  DELIMITER;
        dvdAsText += dvd.getDirectorName() + DELIMITER;
        dvdAsText += dvd.getStudioName() + DELIMITER;
        dvdAsText += dvd.getUserNote();
        return dvdAsText;
    }

    private void writeLibraryFile() throws DVDLibraryDaoException{
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(LIBRARY_FILE));
        } catch (IOException e){
            throw new DVDLibraryDaoException ("DVD library data could not be saved", e);
        }
        List<DVD> dvdList = new ArrayList(dvds.values());
        for (DVD currentDVD: dvdList){
            out.println(marshallDVD(currentDVD));
            out.flush();
        }
        out.close();
    }


    @Override
    public DVD addDVD(String title, DVD dvd) throws DVDLibraryDaoException {
        loadLibraryFile();
        DVD newDVD = dvds.put(title, dvd);
        writeLibraryFile();
        return newDVD;
    }

    @Override
    public DVD removeDVD(String title) throws DVDLibraryDaoException {
        loadLibraryFile();
        DVD removedDVD = dvds.remove(title);
        writeLibraryFile();
        return removedDVD;
    }

    @Override
    public DVD editDVD(String title, DVD newInfo) throws DVDLibraryDaoException {
        loadLibraryFile();
        DVD editedDVD = dvds.replace(title, newInfo);
        writeLibraryFile();
        return editedDVD;

    }

    @Override
    public List<DVD> listAllDVDs() throws DVDLibraryDaoException {
        loadLibraryFile();
        return new ArrayList<>(dvds.values());
    }

    @Override
    public DVD findDVD(String title) throws DVDLibraryDaoException {
        loadLibraryFile();
        return dvds.get(title);
    }    
    
}
