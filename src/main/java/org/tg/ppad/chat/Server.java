package org.tg.ppad.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server
{
    public static void main(String[] args) throws Exception
    {
        // create ServerSocket
        ServerSocket ss=new ServerSocket(999);
        // wait till a client connection accepted
        Socket s=ss.accept( );
        System.out.println("Connection established.....");
        // send data to client
        PrintStream ps=new PrintStream(s.getOutputStream( ));
        // to recive data from client
        BufferedReader br=new BufferedReader(new
                InputStreamReader(s.getInputStream( )));
        // to read from keyboard
        BufferedReader kb=new BufferedReader(new
                InputStreamReader(System.in));
        // communication with client
        while(true)
        {
            String str,str1;
            while((str=br.readLine( ))!=null)
            {
                System.out.println(str);
                str1=kb.readLine( );
                ps.println(str1);
            }
            //disconnect the Server
            ps.close( );
            br.close( );
            kb.close( );
            ss.close( );
            s.close( );
            System.exit(0);
        }
    }
}
