package ioc;

public class Encoder {
    private IEncoder iEncoder;

    public Encoder() {
        this.iEncoder = new Base64Encoder();
    }

    public String encode(String message) {
        return iEncoder.encode(message);
    }
}
