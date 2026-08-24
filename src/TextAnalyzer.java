public class TextAnalyzer {

    private int lineCount = 0;
    private int characterCount = 0;

    public void addLine(String line) {
        lineCount++;
        characterCount += line.length();
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }
}