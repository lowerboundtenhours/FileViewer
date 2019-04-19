import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static Map<String, FileView> fileViews = new HashMap<>();

    public static List<String> read_file(String filename) {
        List<String> allLines = new ArrayList<String>();
        try {
            allLines = Files.readAllLines(Paths.get(filename));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return allLines;
    }

    private static void process_line(String line) {
        String[] words = line.split(" ");
        String textViewName = words[0];
        String command = words[1];
        FileView fileView = fileViews.get(textViewName);

        if (command.equals("add")) {
            for (int i = 2; i < words.length; i += 1)
                fileView.addElement(words[i]);
        }
        else if (command.equals("display")) {
            fileView.display();
        }
        else {
            if (fileView != null) {
                throw new UnsupportedOperationException("fileView already exists.");
            }
            String text = command;
            fileViews.put(textViewName, new TextView(text));
        }
    }

    public static void main(String[] args) {
        String filename = args[0];
        for (String line : read_file(filename)) {
            process_line(line);
        }
    }
}
