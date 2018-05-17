package com.xmu.middleware.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.socket.server.standard.SpringConfigurator;

import com.xmu.middleware.pojo.Content;
import com.xmu.middleware.service.ContentService;

@ServerEndpoint(value="/websocket",configurator=SpringConfigurator.class)
public class MyWebSocket {
	//用来记录当前在线链接数
	private static int onlineCount=0;
	public MyWebSocket() {
		
	}
	@Autowired
	private ContentService contentService;
	//concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
    // 若要实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key可以为用户标识
	private static CopyOnWriteArraySet<MyWebSocket>webSocketSet=new CopyOnWriteArraySet<MyWebSocket>();
	
	//与客户端的连接会话
	private Session session;
	/**
	 * 连接建立成功调用的方法
	 * @param session
	 */
	@OnOpen
	public void onOpen(Session session) {
		this.session=session;
		webSocketSet.add(this);
		System.out.println("有新连接加入！当前在线人数为："+getOnlineCount());
	}
	/**
	 * 连接关闭调用的方法
	 */
	@OnClose
	public void onClose() {
		webSocketSet.remove(this);//从set中删除
		subOnlineCount();
		System.out.println("有一连接关闭，当前在线人数为："+getOnlineCount());
	}
	/**
	 * 收到客户端消息后调用的方法
	 * @param message
	 * @param session
	 */
	@OnMessage
	public void onMessage(String message,Session session) {
		System.out.println("来自客户端的消息："+message);
		//群发消息
		for(MyWebSocket itemMyWebSocket:webSocketSet) {
			try {
				itemMyWebSocket.sendMessage(message);
				
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}
		}
	}
	/**
	 * 发生错误时调用
	 * @param session
	 * @param error
	 */
	@OnError
	public void onError(Session session,Throwable error) {
		System.out.println("发生错误");
		error.printStackTrace();
	}
	/**
	 * 发消息实现
	 * @param message
	 * @throws IOException
	 */
	public void sendMessage(String message) throws IOException {
		Content content=new Content();
		content.setContent(message);
		SimpleDateFormat sm=new SimpleDateFormat("yyyy-MM-dd HH:mm:dd");
		content.setCreatedate(sm.format(new Date()));
		contentService.insertSelective(content);
		this.session.getBasicRemote().sendText(message);
	}
	public static synchronized int getOnlineCount() {
        return onlineCount;
    }
    public static synchronized void addOnlineCount() {
        MyWebSocket.onlineCount++;
    }
    public static synchronized void subOnlineCount() {
        MyWebSocket.onlineCount--;
    }

	
	
	
	

}
