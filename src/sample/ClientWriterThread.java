package sample;

import java.util.Scanner;

public class ClientWriterThread implements Runnable {

    private Thread thr;
    private NetworkUtil nc;
    String name;

    public ClientWriterThread(NetworkUtil nc, String name) {
        this.nc = nc;
        this.name = name;
        this.thr = new Thread(this);
        thr.start();
    }

    public void run() {
        try {
            Scanner input = new Scanner(System.in);
            while (true) {
                String s = input.nextLine();
                nc.write(s);
                if (s.equals("$EXIT$"))
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        nc.closeConnection();
    }
}



