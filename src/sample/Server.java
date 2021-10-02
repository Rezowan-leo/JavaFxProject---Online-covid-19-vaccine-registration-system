package sample;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private ServerSocket servSock;

    Server(){
        try {
            servSock = new ServerSocket(6666);
            //int count = 1;

            while(true){
                Socket clientSock = servSock.accept();

                NetworkUtil nc = new NetworkUtil(clientSock);

                //nc.write("Hello ");
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Server starts: "+e);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String args[]) {
        Server objServer = new Server();
    }
}

