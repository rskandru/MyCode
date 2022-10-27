/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdressBookContoller;

import AddressDao.AddressDao;
import AddressDao.AddressDaoException;
import AddressDto.Address;
import AddressUI.AddressView;
import java.util.List;

/**
 *
 * @author admin
 */
public class AddressBookController {
     
     private AddressView view;
     private AddressDao dao;

    public AddressBookController(AddressView view, AddressDao dao) {
        this.view = view;
        this.dao = dao;
    }

     
     

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
        while (keepGoing) {

            menuSelection = getMenuSelection();

            switch (menuSelection) {
                case 1:
                    createAddress();
                   
                    break;
                case 2:
                    removeAddress();
                    
                    break;
                case 3:
                    viewAddress();
                    break;
                case 4:
                    AddressCount();
                    break;
                    
                case 5:
                    listAddress();
                    break;
                  
                case 6:
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
            }

        }
        exitMessage();
        
    } catch (AddressDaoException e) {
        view.displayErrorMessage(e.getMessage());
    }
        
    }
    
    private int getMenuSelection() {
    return view.printMenuAndGetSelection();
    }

    private void createAddress() throws AddressDaoException {
    view.displayCreateAddressBanner();
    Address newAddress = view.getNewAddressInfo();
    dao.addAddress(newAddress.getAddress(), newAddress);
    view.displayCreateSuccessBanner();
    }

    private void listAddress() throws AddressDaoException{
    view.displayDisplayAllBanner();
    List<Address> addressList = dao.getAllAddress();
    view.displayAddressList(addressList);
    }

    private void viewAddress() throws AddressDaoException {
    view.displayDisplayAddressBanner();
    String lastName = view.getAddressIdChoice();
    Address address = dao.getAddress(lastName);
    view.displayAddress(address);
    }

    private void removeAddress() throws AddressDaoException {
    view.displayRemoveAddresstBanner();
    String lastName = view.getAddressIdChoice();
    Address removedAddress = dao.removeAddress(lastName);
    view.displayRemoveResult(removedAddress);
    }

    private void unknownCommand() {
    view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
    view.displayExitBanner();
    }


    private void AddressCount() throws AddressDaoException {
    view.displaysCount();
    }

   
    
    
}
