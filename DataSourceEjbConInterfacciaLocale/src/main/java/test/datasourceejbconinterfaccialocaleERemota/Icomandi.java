/**
 *
 * @author Daniele Damiano 
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test.datasourceejbconinterfaccialocaleERemota;

import javax.ejb.Local;

@Local
public interface Icomandi {
   
    void createBook(Book b);
   
}
