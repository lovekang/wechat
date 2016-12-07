package SocketTest;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;

/**
 * 客户端
 * @author Administrator
 *
 */
public class Client {
	
	public static void main(String[] args)throws Exception {
		/**
		 * 对于客户端往Socket的输出流里面写数据传递给服务端要注意一点，如果写操作之后程序不是对应着输出流的关闭，
		 * 而是进行其他阻塞式的操作（比如从输入流里面读数据），记住要flush一下，只有这样服务端才能收到客户端发送的数据，否则可能会引起两边无限的互相等待。
		 */
		String host="127.0.0.1";//要连接的服务器IP地址
		int port=8899;//要连接的服务器对应的监听端口
		//与服务器建立连接
		Socket client=new Socket(host,port);
		Writer writer=new OutputStreamWriter(client.getOutputStream());
		writer.write("hello server...");
		writer.flush();//写完后要记得flush
		writer.close();
		client.close();
	}
}
