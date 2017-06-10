package pl.edu.agh.tkk17.sample;

public enum TokenType
{
    END("END"),
    NUM("NUM"),
    ADD("ADD"),
    MUL("MUL"),
    SUB("SUB"),
    DIV("DIV"),
    LB("LB"),
    RB("RB");

    private final String name;

    TokenType(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
}
