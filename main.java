/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ACER
 */
public class main {
    public static void main(String[] args) {
      String emailPenerima = "sabrina@gmail.com" ;
      String nomer         = "+621111111111111";
      String mobileId      = "Oppo a71";
      
      Email e = new Email();
      Sms s   = new Sms();
      Push p  = new Push();
      
      String message = "PPPPPP";
      
      e.sendMessage(emailPenerima, message);
      s.sendMessage(nomer, message);
      p.sendMessage(mobileId, message);
      
      
              
              
    }
    
}
