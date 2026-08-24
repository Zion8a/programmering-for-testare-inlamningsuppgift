public class TextAnalyzer {

    private int lineCount = 0;

    public void addLine(String line) {
        lineCount++;
    }

    public int getLineCount() {
        return lineCount;
    }
}