/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ACER
 */
public class Sms implements InterfaceNotifikasi {
    @Override
    public void sendMessage(String receiver, String content){
         System.out.println("Mengirim sms ke " + receiver + " dengan isi: " + content);
     }
    
}
