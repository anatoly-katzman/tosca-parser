package ak.research.yamlparser;

/**
 * Created by ak435s on 2/28/2017.
 */
public class Position {
    private String source;
    private int line;
    private int column;
    private int offset;

    public Position(String source, int line, int column, int offset) {
        this.source = source;
        this.line = line;
        this.column = column;
        this.offset = offset;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public String toString() {
        return "Position{" +
                "source='" + source + '\'' +
                ", line=" + line +
                ", column=" + column +
                ", offset=" + offset +
                '}';
    }
}
