public class TextView extends FileView{
    private String text;
    public TextView(String text) {
        this.text = text;
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.text);
        for (Element e: elements) {
            sb.append(" ").append(e.representation());
        }
        System.out.println(sb.toString());
    }
}
