package lexer;

public class ModuloToken {
    public boolean equals(final Object other) {
        return other instanceof ModuloToken;
    }
    public int hashCode() {
        return 14;
    }
    public String toString() {
        return "%";
    }
    
    
}
