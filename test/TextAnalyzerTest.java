import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextAnalyzerTest {

    @Test
    void newAnalyzerShouldHaveZeroLines() {
        TextAnalyzer analyzer = new TextAnalyzer();

        assertEquals(0, analyzer.getLineCount());
    }

    @Test
    void addingOneLineShouldIncreaseLineCount() {
        TextAnalyzer analyzer = new TextAnalyzer();

        analyzer.addLine("Hej");

        assertEquals(1, analyzer.getLineCount());
    }
}
