/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package in.ezeon.springcontactapp.exception;


public class UserBlockedExeption  extends  Exception{
 // user object wthoout error desc.
    public UserBlockedExeption() {
        //with error dis
    }
     
    public UserBlockedExeption(String errDesc){
        super(errDesc);
    }
}
