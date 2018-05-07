import graph.Node;

public class DummyNode implements Node {
    int id;
    int value;

    DummyNode(int id){
        this.id = id;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String getId() {
        return id+"";
    }

    @Override
    public String getLabel() {
        return "Node-"+id+" ("+value+")";
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
