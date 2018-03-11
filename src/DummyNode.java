import graph.Node;

public class DummyNode implements Node {
    int value;

    DummyNode(int value){
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
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
