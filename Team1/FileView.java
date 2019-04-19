import java.util.ArrayList;

public abstract class FileView {
    protected ArrayList<Element> elements = new ArrayList<>();
    public abstract void display();

    public void addElement(String element_name) {
        if (element_name.equals("scrollBar"))
            this.elements.add(new ScrollBar());
        else if (element_name.equals("thickBlackBorder"))
            this.elements.add(new ThickBlackBorder());
    }
}

