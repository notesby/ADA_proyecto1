import graph.Node;

public class GeographicNode implements Node {
    double x;
    double y;

    GeographicNode(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String getId() {
        return "\""+x+","+y+"\"";
    }

    @Override
    public String getLabel() {
        return "\"("+x+","+y+")\"";
    }
}
