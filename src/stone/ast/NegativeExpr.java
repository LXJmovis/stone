package stone.ast;

import java.util.List;

/**
 * @author movis
 * @date 2018-07-25
 */
public class NegativeExpr extends ASTList {

    public NegativeExpr(List<ASTree> c) {
        super(c);
    }

    public ASTree operand() {
        return child(0);
    }

    public String toString() {
        return "-" + operand();
    }
}
