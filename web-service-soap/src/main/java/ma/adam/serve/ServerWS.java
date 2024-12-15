package ma.adam.serve;

import jakarta.xml.ws.Endpoint;
import ma.adam.ws.BanqueController;

public class ServerWS {
    public static void main(String[] args) {
        String url = "http://localhost:7777/";
        Endpoint.publish(url,new BanqueController());
        System.out.println("server was runing seccessfully in :" + url);
    }
}
