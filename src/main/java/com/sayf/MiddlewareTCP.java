package com.sayf;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MiddlewareTCP {
    public void envoyerObjet(String ip, int port, Object obj) throws IOException {
        try (Socket socket = new Socket(ip, port);
             ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream())) {
            out.writeObject(obj);
        }
    }

    public Object recevoirObjet(ServerSocket serveur) throws IOException, ClassNotFoundException {
        try (Socket socket = serveur.accept();
             ObjectInputStream in = new ObjectInputStream(socket.getInputStream())) {
            return in.readObject();
        }
    }
}