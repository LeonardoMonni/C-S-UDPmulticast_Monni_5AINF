/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clientserver_udpmulticast;

import java.io.*;
import java.net.*;

/**
 *
 * @author Monni Leonardo
 */
public class ClientMulticastUDP {
    //colore del Server
     public static final String ANSI_PURPLE = "\u001B[35m";
    //colore del client
    public static final String ANSI_CYAN = "\u001B[36m";
    //colore reset
    public static final String RESET = "\033[0m";
    //colore del 'gruppo'
    public static final String ANSI_BLUE = "\u001B[34m";

    public static void main(String[] args) {
        //numero porta server
        int porta = 2000;
        //numero porta gruppo
        int gruppoPorta = 1900;
        //socket UDP
        DatagramSocket dSocket = null;
        //socket mutlicast UDP
        MulticastSocket mSocket = null;
        //indirizzo server
        InetAddress serverAddress;
        //indirizzo gruppo multicast UDP
        InetAddress gruppo;
        //Datagramma UDP con richiesta e risposta 
        DatagramPacket outPacket, inPacket;

        //buffer du lettura
        byte[] inBuffer = new byte[256];
        byte[] inBufferG = new byte[1024];

        //messaggio di richiesta
        String messageOut = "Richiesta comunicazione";
        //messaggio di risposta
        String messaggeIn;

        /*try{
        
        
        
        
     } catch (UnknownHostException ex) {
           System.err.println(ex.getMessage());
           
       } catch (SocketException ex) {
           System.err.println(ex.getMessage());   
           
       } catch (IOException ex) {
           System.err.println(ex.getMessage());   
       }   
       finally{
            if (dSocket != null)
                dsocket.close();
            if (mSocket != null)
                msocket.close();

        
        }   */
    }
}
