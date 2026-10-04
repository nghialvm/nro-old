package network.interfaces;

import network.Message;

public interface ISession {
    public ISession setSendCollect(IMessageSendCollect var1);

    public ISession setMessageHandler(IMessageHandler var1);

    public ISession setKeyHandler(IKeySessionHandler var1);

    public ISession startSend();

    public ISession startCollect();

    public ISession start();

    public String getIP();

    public boolean isConnected();

    public long getID();

    public void sendMessage(Message var1);

    public void doSendMessage(Message var1) throws Exception;

    public void disconnect();

    public void dispose();

    public int getNumMessages();

    public void sendKey() throws Exception;

    public byte[] getKey();

    public boolean sentKey();

    public void setSentKey(boolean var1);
}
