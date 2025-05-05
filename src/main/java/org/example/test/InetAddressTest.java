package org.example.test;

import java.net.InetAddress;

public class InetAddressTest {

    public void InetTest() {

        try {

            String address = "www.portal.azure.com";
            InetAddress ip = InetAddress.getByName(address);

            System.out.println("*********************************");
            System.out.println(ip.getHostAddress()); // gives IP
            System.out.println(ip.getHostName()); // gives domain
            System.out.println("*********************************");

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args){
        new InetAddressTest().InetTest();
    }
}

