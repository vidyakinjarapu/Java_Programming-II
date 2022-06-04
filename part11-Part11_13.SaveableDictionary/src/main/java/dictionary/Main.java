package dictionary;

public class Main {
    public static void main(String[] args) {
        SaveableDictionary s = new SaveableDictionary("test-5484.txt");
        s.add("tietokone", "computer");
        s.save();
    }
}
