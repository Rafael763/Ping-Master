
import java.net.InetAddress;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rafae
 */
public class background{
    private static void pingar(String host) {
  try {
    if (InetAddress.getByName(host).isReachable(5000))
      System.out.println("Ping OK: " + host);
    else
      System.out.println("Ping FALHOU: " + host);
  } catch (Exception e) {
    System.err.println("Ping FALHOU: " + host + " - " + e);
  }
}

    static void getTransparency() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
