import graph.Node;

public class GeographicNode implements Node {
    int id;
    double x;
    double y;
    int value;

    GeographicNode(int id,double x, double y){
        this.id = id;
        this.x = x;
        this.y = y;
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

    @Override
    public void setValue(int value) {
        this.value = value;
    }
}
