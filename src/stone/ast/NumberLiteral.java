package stone.ast;

import stone.Token;

/**
 * @author movis
 * @date 2018-07-24
 */
public class NumberLiteral extends ASTLeaf {

    public NumberLiteral(Token t) {
        super(t);
    }

    public int value() {
        return token().getNumber();
    }
}
