package com.company;

import sample.NetworkUtil;

import java.io.BufferedReader;
import java.io.FileReader;

public class ClientReaderThread implements Runnable {
    private Thread thr;
    private NetworkUtil nc;

    public ClientReaderThread(NetworkUtil nc) {
        this.nc = nc;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            FileReader fr =new FileReader("server_event2.txt");
            BufferedReader br = new BufferedReader(fr);
            String wholeLine;
            while((wholeLine = br.readLine()) != null){
                System.out.println(wholeLine);
            }
            while(true) {
                String s=(String)nc.read();
                System.out.println(s);
            }
        } catch(Exception e) {
            System.out.println (e);
        }
        nc.closeConnection();
    }
}



