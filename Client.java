import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Client {
    public static void main(String[] args) {
        try {
            System.out.println("Hey");
            DatagramSocket ds = new DatagramSocket(3000);
            byte[] buf = new byte[1024];

            DatagramPacket dp = new DatagramPacket(buf, 1024);
            ds.receive(dp);
            String reply = new String(dp.getData(), 0, dp.getLength());
            System.out.println(reply);
            ds.close(); 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
