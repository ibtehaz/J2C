package lexer;

public class AdditionToken {
    public boolean equals(final Object other) {
        return other instanceof AdditionToken;
    }
    public int hashCode() {
        return 8;
    }
    public String toString() {
        return "+";
    }
    
}
