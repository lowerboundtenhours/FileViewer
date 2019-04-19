import java.util.ArrayList;

public abstract class FileView {
    protected ArrayList<Element> elements;
    public abstract void display();
    public void addElement(String element_name) {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}

