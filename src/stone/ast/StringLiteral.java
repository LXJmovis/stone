package stone.ast;

import stone.Token;

/**
 * @author movis
 * @date 2018-07-25
 */
public class StringLiteral extends ASTLeaf {

    public StringLiteral(Token t) {
        super(t);
    }

    public String value() {
        return token().getText();
    }
}
