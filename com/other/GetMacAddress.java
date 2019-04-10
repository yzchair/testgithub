package com.other;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

// 获得本机的Mac地址
public class GetMacAddress {
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getLocalHost();
            String ipName = ip.getHostAddress(); // 获得本机的IP地址
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress(); // 获得本机的Mac地址
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < mac.length; i++) {
                sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
            }
            System.out.println("本机Mac地址为 : " + sb.toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
