package zalik3;

public class Mainn {
    public static void main(String[] args) {
        Transport t1 = TransportFactory.createTransport("car");
        Transport t2 = TransportFactory.createTransport("bike");

        t1.move();
        t2.move();
    }
}
