//package sample;
//
//import java.io.IOException;
//import java.net.Socket;
//
//public class Client {
//    public static void main(String[] args) {
//
//        try {
//            String serverAddress = "127.0.0.1";
//            int serverPort = 6666;
//            NetworkUtil nc = new NetworkUtil(serverAddress, serverPort);
//            String name = "C";
//            nc.write(name);
//            System.out.println(nc.read());
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
