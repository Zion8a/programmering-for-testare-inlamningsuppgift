import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextAnalyzerTest {

    @Test
    public void newAnalyzerShouldHaveZeroLines() {

        TextAnalyzer analyzer = new TextAnalyzer();

        int actual = analyzer.getLineCount();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void addingOneLineShouldIncreaseLineCount() {

        TextAnalyzer analyzer = new TextAnalyzer();

        String text = "Hej";

        analyzer.addLine(text);
        int actual = analyzer.getLineCount();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test
    public void addingLineShouldCountCharacters() {

        TextAnalyzer analyzer = new TextAnalyzer();

        String text = "Hej";

        analyzer.addLine(text);
        int actual = analyzer.getCharacterCount();
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void stopShouldReturnTrue() {

        TextAnalyzer analyzer = new TextAnalyzer();

        String text = "stop";

        boolean actual = analyzer.isStop(text);
        boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void addingLineShouldCountWords() {

        TextAnalyzer analyzer = new TextAnalyzer();

        String text = "Hej Java";

        analyzer.addLine(text);
        int actual = analyzer.getWordCount();
        int expected = 2;

        assertEquals(expected, actual);
    }

    @Test
    public void addingLineShouldFindLongestWord() {

        TextAnalyzer analyzer = new TextAnalyzer();

        String text = "Hej programmering Java";

        analyzer.addLine(text);
        String actual = analyzer.getLongestWord();
        String expected = "programmering";

        assertEquals(expected, actual);
    }
}