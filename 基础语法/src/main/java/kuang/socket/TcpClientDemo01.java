package kuang.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class TcpClientDemo01 {
    public static void main(String[] args) {
        OutputStream os=null;
        Socket socket=null;
        try {
            //1.得知道服务端的地址,端口号
          InetAddress serverIP=InetAddress.getByName("127.0.0.1");
            int port=9999;
            //2.创建一个socket
            socket = new Socket(serverIP,port);

            //3.发送消息,IO流
            os=socket.getOutputStream();
            os.write("您好，这是初步测试socket由客户端发送的消息".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(os!=null){
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
