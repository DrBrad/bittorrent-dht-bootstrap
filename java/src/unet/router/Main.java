package unet.router;

import unet.kad4.Kademlia;

import java.net.SocketException;

public class Main {

    public static void main(String[] args)throws SocketException {
        Kademlia dht = new Kademlia();
        dht.getRoutingTable().setSecureOnly(false);
        dht.bind(6881);
    }
}
