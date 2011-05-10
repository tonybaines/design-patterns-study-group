public class Socket {
    private final String addressFamily;
    private final String localAddress;
    private static Socket instance;

    private Socket(String localAddress, String addressFamily) {
        this.localAddress = localAddress;
        this.addressFamily = addressFamily;
    }

    public synchronized static Socket getInstance() {
        if (instance == null) {
            instance = new Socket("localAddress", "addressFamily");
        }
        return instance;
    }
}
