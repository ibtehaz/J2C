package lexer;

public class LessThanToken {

    public boolean equals(final Object other) {
        return other instanceof LessThanToken;
    }
    public int hashCode() {
        return 13;
    }
    
    public String toString() {
        return "<";
    }
    
}
