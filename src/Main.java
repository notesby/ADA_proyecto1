import graph.Graph;

public class Main {

    public static void main(String[] args) {
        //Erdos And Reyis
        Graph graphErdos30 = Util.newErdosAndReyisModel(30,30);
        Util.saveGraph("ErdosAndReyis(30).gv",graphErdos30);
        graphErdos30 = null;

        Graph graphErdos100 = Util.newErdosAndReyisModel(100,100);
        Util.saveGraph("ErdosAndReyis(100).gv",graphErdos100);
        graphErdos100 = null;

        Graph graphErdos500 = Util.newErdosAndReyisModel(500,500);
        Util.saveGraph("ErdosAndReyis(500).gv",graphErdos500);
        graphErdos500 = null;

        //Gilbert
        Graph graphGilbert30 = Util.newGilbertModel(30,0.05);
        Util.saveGraph("Gilbert(30).gv",graphGilbert30);
        graphGilbert30 = null;

        Graph graphGilbert100 = Util.newGilbertModel(100,0.025);
        Util.saveGraph("Gilbert(100).gv",graphGilbert100);
        graphGilbert100 = null;

        Graph graphGilbert500 = Util.newGilbertModel(500,0.1);
        Util.saveGraph("Gilbert(500).gv",graphGilbert500);
        graphGilbert500 = null;

        //Geographic
        Graph graphGeographic30 = Util.newGeographicModel(30,0.1);
        Util.saveGraph("Geographic(30).gv",graphGeographic30);
        graphGeographic30 = null;

        Graph graphGeographic100 = Util.newGeographicModel(100,0.05);
        Util.saveGraph("Geographic(100).gv",graphGeographic100);
        graphGeographic100 = null;

        Graph graphGeographic500 = Util.newGeographicModel(500,0.035);
        Util.saveGraph("Geographic(500).gv",graphGeographic500);
        graphGeographic500 = null;

        //Barabasi Albert
        Graph graphBarabasi30 = Util.newBarabasiAlbertModel(30,10);
        Util.saveGraph("BarabasiAlbert(30).gv",graphBarabasi30);
        graphBarabasi30 = null;

        Graph graphBarabasi100 = Util.newBarabasiAlbertModel(100,25);
        Util.saveGraph("BarabasiAlbert(100).gv",graphBarabasi100);
        graphBarabasi100 = null;

        Graph graphBarabasi500 = Util.newBarabasiAlbertModel(500,50);
        Util.saveGraph("BarabasiAlbert(500).gv",graphBarabasi500);
        graphBarabasi500 = null;

    }
}
