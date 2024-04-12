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
public class ServerMulticastUDP {

    //colore del Server
    public static final String ANSI_PURPLE = "\u001B[35m";
    //colore del client
    public static final String ANSI_CYAN = "\u001B[36m";
    //colore reset
    public static final String RESET = "\033[0m";

    public static void main(String[] args) {
        //porta Server
        int port = 6789;
        //oggetto Socket UDP
        DatagramSocket dSocket = null;
        DatagramPacket inPacket, outPacket;
        byte[] inBuffer;

        //indirizzo del gruppo Multicast UDP
        InetAddress groupAddress;
        String messageIn, messageOut;

        try {
            System.out.println(ANSI_PURPLE + "Server UDP" + RESET);
            dSocket = new DatagramSocket(port);
            System.out.println(ANSI_PURPLE + "Apertura porta in corso.." + RESET);
        

       } catch (BindException ex) {
            System.err.println(ex.getMessage());
            System.err.println("Porta già in uso");

        //} catch (UnknownHostException ex) {
            System.err.println(ex.getMessage());

        } catch (SocketException ex) {
            System.err.println(ex.getMessage());

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
      }

    }

}
