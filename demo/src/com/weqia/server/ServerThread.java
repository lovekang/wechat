package com.weqia.server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread{
	/**
	 *     应用多线程实现服务器与多客户端之间的通信

			① 服务器端创建ServerSocket，循环调用accept()等待客户端连接
			
			② 客户端创建一个socket并请求和服务器端连接
			
			③ 服务器端接受客户端请求，创建socket与该客户建立专线连接
			
			④ 建立连接的两个socket在一个单独的线程上对话
			
			⑤ 服务器端继续等待新的连接       
	 */
	//服务器线程处理 
	//和本线程相关的socket 
	Socket socket =null; 
	// 
	public ServerThread(Socket socket) {
		this.socket = socket; 
	} 
	
	public void run(){ 
	//服务器处理代码 
		System.out.println("----");
	} 
	
	public static void main(String[] args) throws Exception{
			//============================================ 
			//服务器代码 
			ServerSocket serverSocket =new ServerSocket(10086); 
			Socket socket =null; 
			int count =0;//记录客户端的数量 
			while(true){ 
			socket = serverSocket.accept(); 
			ServerThread serverThread =new ServerThread(socket); 
			serverThread.run();
			 count++; 
			System.out.println("客户端连接的数量："+count); 
		} 
	}
	
}
