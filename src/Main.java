import graph.Graph;

public class Main {

    public static void main(String[] args) {
        /*Graph graphErdos30 = Util.newErdosAndReyisModel(30,30);
        Util.saveGraph("ErdosAndReyis(30).gdf",graphErdos30);
        graphErdos30 = null;

        Graph graphErdos100 = Util.newErdosAndReyisModel(100,100);
        Util.saveGraph("ErdosAndReyis(100).gdf",graphErdos100);
        graphErdos100 = null;

        Graph graphErdos500 = Util.newErdosAndReyisModel(500,500);
        Util.saveGraph("ErdosAndReyis(500).gdf",graphErdos500);
        graphErdos500 = null;

        Graph graphGilbert30 = Util.newGilbertModel(30,0.05);
        Util.saveGraph("Gilbert(30).gdf",graphGilbert30);
        graphGilbert30 = null;

        Graph graphGilbert100 = Util.newGilbertModel(100,0.025);
        Util.saveGraph("Gilbert(100).gdf",graphGilbert100);
        graphGilbert100 = null;

        Graph graphGilbert500 = Util.newGilbertModel(500,0.1);
        Util.saveGraph("Gilbert(500).gdf",graphGilbert500);
        graphGilbert500 = null;*/

        Graph graphGeographic30 = Util.newGeographicModel(30,0.1);
        Util.saveGraph("Geographic(30).gdf",graphGeographic30);
        graphGeographic30 = null;

        Graph graphGeographic100 = Util.newGeographicModel(100,0.05);
        Util.saveGraph("Geographic(100).gdf",graphGeographic100);
        graphGeographic100 = null;

        Graph graphGeographic500 = Util.newGeographicModel(500,0.035);
        Util.saveGraph("Geographic(500).gdf",graphGeographic500);
        graphGeographic500 = null;

        /*Graph graphBarabasi30 = Util.newBarabasiAlbertModel(30,30);
        Util.saveGraph("BarabasiAlbert(30).gdf",graphBarabasi30);
        graphBarabasi30 = null;

        Graph graphBarabasi100 = Util.newBarabasiAlbertModel(100,100);
        Util.saveGraph("BarabasiAlbert(100).gdf",graphBarabasi100);
        graphBarabasi100 = null;

        Graph graphBarabasi500 = Util.newBarabasiAlbertModel(500,50);
        Util.saveGraph("BarabasiAlbert(500).gdf",graphBarabasi500);
        graphBarabasi500 = null;*/
    }
}
