import java.io.File;
import java.io.IOException;
import java.net.*;
import java.util.*;

public class MyProxy implements Runnable{

    ServerSocket serverSocket;
    boolean isRunning;
    HashMap<String, File> cachedPages;
    ArrayList<Thread> listOfRunningThreads;

    public MyProxy(int i) {
        cachedPages=new HashMap<>();
        listOfRunningThreads=new ArrayList<>();
        new Thread(this).start();
        try {
            serverSocket=new ServerSocket(i);
            System.out.println("Server Socket is running!");
            System.out.println("Waiting on port: "+serverSocket.getLocalPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void listen() {
    }
    public void run(){
        //Just for commands
        Scanner scanner=new Scanner(System.in);
        String command;
        while(true){
            System.out.println("Give me command");
            command=scanner.next();
            switch (command){
                case "XD":
                    System.out.println("Tak XD");
                    break;
                default:
                    System.out.println("Nie XD");
                    break;
            }
        }
    }
}
