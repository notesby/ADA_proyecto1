import graph.Node;

public class DummyNode implements Node {
    int value;

    DummyNode(int value){
        this.value = value;
    }

    @Override
    public String getId() {
        return "\""+value+"\"";
    }

    @Override
    public String getLabel() {
        return "\"Node-"+value+"\"";
    }
}
