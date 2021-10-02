package sample;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class NetworkUtil {
    private Socket socket;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public NetworkUtil(String s, int port) {
        try {
            this.socket = new Socket(s, port);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        } catch (Exception e) {
            System.out.println("In NetworkUtil : " + e.toString());
        }
    }

    public NetworkUtil(Socket s) {
        try {
            this.socket = s;

            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        } catch (Exception e) {
            System.out.println("In NetworkUtil : " + e.toString());
        }
    }

    public Object read() throws Exception, ClassNotFoundException {
        Object o = null;
        o = ois.readObject();
        return o;
    }

    public void write(Object o) throws IOException {
        oos.writeObject(o);
    }

    public void closeConnection() {
        try {
            ois.close();
            oos.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Closing Error in network : " + e.toString());
        }
    }
}

