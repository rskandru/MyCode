/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AddressBook;

import AddressDao.AddressDao;
import AddressDao.AddressDaoFileImpl;
import AddressUI.AddressConsoleImpl;
import AddressUI.AddressIO;
import AddressUI.AddressView;
import AdressBookContoller.AddressBookController;

/**
 *
 * @author admin
 */
public class AddressBookApp {
    
     public static void main(String[] args) {
         AddressIO myIo = new AddressConsoleImpl();
         AddressView myView = new AddressView(myIo);
         AddressDao myDao =  new AddressDaoFileImpl();
         AddressBookController controller =   new AddressBookController(myView, myDao);
         controller.run();
        
    }
    
    
}
