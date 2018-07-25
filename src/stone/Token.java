package stone;

/**
 * @author movis
 * @date 2018-07-24
 */
public abstract class Token {

    public static final Token EOF = new Token(-1) {
    }; // end of file
    public static final String EOL = "\\n"; // end of line
    private int lineNumber; // number of line

    protected Token(int line) {
        lineNumber = line;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public boolean isIdentifier() {
        return false;
    }

    public boolean isNumber() {
        return false;
    }

    public boolean isString() {
        return false;
    }

    public int getNumber() {
        throw new StoneException("not number token");
    }

    public String getText() {
        return "";
    }
}
