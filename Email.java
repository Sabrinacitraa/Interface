/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ACER
 */
public class Email implements InterfaceNotifikasi{
     public void sendMessage(String receiver, String content){
         System.out.println("Mengirim email ke " + receiver + " dengan isi: " + content);
     }
    
}
