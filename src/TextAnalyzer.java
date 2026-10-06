public class TextAnalyzer {

    private int lineCount = 0;
    private int characterCount = 0;
    private int wordCount = 0;
    private String longestWord = "";

    public void addLine(String line) {
        lineCount++;
        characterCount += line.length();

        String[] words = line.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount++;

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }
    }

    public int getLineCount() {
        return lineCount;
    }

    public int getCharacterCount() {
        return characterCount;
    }

    public int getWordCount() {
        return wordCount;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public boolean isStop(String line) {
        return line.equals("stop");
    }
}