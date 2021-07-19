package org.tg.ppad.chat;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception
    {
        // create ClientSocket
        Socket s=new Socket("localhost",999);
        // send data to Server
        DataOutputStream dos=new
                DataOutputStream(s.getOutputStream( ));
        // to receive data from Server
        BufferedReader br=new BufferedReader(new
                InputStreamReader(s.getInputStream( )));
        // to read data from keyboard
        BufferedReader kb=new BufferedReader(new
                InputStreamReader(System.in));
        // communication with client
        String str,str1;
        while(!(str=kb.readLine( )).equals("exit"))
        {
            dos.writeBytes(str+"\n");
            str1=br.readLine( );
            System.out.println(str1);
        }
        //disconnect the Server
        s.close( );
        dos.close( );
        br.close( );
        kb.close( );
    }

}
