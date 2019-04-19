public class TextView extends FileView{

    private String text;
    @Override
    public void display() {
        throw new UnsupportedOperationException();
    }

    public TextView(String text) {
        this.text = text;
    }
}

