import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream {
    public MyObjectOutputStream(FileOutputStream x) throws IOException {
        super(x);
    }
    public void writeStreamHeader(){}

}
