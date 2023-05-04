/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ACER
 */
public class Push implements InterfaceNotifikasi{
    public void sendMessage(String receiver, String content){
         System.out.println("Mengirim Push Notif ke " + receiver + " dengan isi: " + content);
     }
    
}
