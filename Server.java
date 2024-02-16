import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            System.out.println("Hello");
            String str = "Hello You are connected with server.";

            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getLocalHost(), 3000);
            ds.send(dp);
            ds.close();
            System.out.println("Ends here...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
