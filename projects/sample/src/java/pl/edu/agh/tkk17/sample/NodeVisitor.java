package pl.edu.agh.tkk17.sample;

public interface NodeVisitor
{
    void visit(NodeAdd node);
    void visit(NodeMul node);
    void visit(NodeSub node);
    void visit(NodeDiv node);
    void visit(NodeNumber node);
    void visit(NodeBracket node);
}
