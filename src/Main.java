import graph.Graph;

public class Main {

    public static void main(String[] args) {
        //Erdos And Reyis
        Graph graphErdos30 = Util.newErdosAndReyisModel(30,30);
        Util.addRandomWeight(graphErdos30);
        Util.saveGraph("ErdosAndReyis(30).gv",graphErdos30);
        Util.saveGraph("dijkstra_ErdosAndReyis(30).gv",graphErdos30.dijkstra(graphErdos30.getEdge(0).getN1()));
        graphErdos30 = null;

        //Graph graphErdos100 = Util.newErdosAndReyisModel(100,100);
        //Util.saveGraph("ErdosAndReyis(100).gv",graphErdos100);
        //graphErdos100 = null;

        Graph graphErdos500 = Util.newErdosAndReyisModel(500,500);
        Util.addRandomWeight(graphErdos500);
        Util.saveGraph("ErdosAndReyis(500).gv",graphErdos500);
        Util.saveGraph("dijkstra_ErdosAndReyis(500).gv",graphErdos500.dijkstra(graphErdos500.getEdge(0).getN1()));
        graphErdos500 = null;

        //Gilbert
        Graph graphGilbert30 = Util.newGilbertModel(30,0.05);
        Util.addRandomWeight(graphGilbert30);
        Util.saveGraph("Gilbert(30).gv",graphGilbert30);
        Util.saveGraph("dijkstra_Gilbert(30).gv",graphGilbert30.dijkstra(graphGilbert30.getEdge(0).getN1()));
        graphGilbert30 = null;

        //Graph graphGilbert100 = Util.newGilbertModel(100,0.025);
        //Util.saveGraph("Gilbert(100).gv",graphGilbert100);
        //graphGilbert100 = null;

        Graph graphGilbert500 = Util.newGilbertModel(500,0.1);
        Util.addRandomWeight(graphGilbert500);
        Util.saveGraph("Gilbert(500).gv",graphGilbert500);
        Util.saveGraph("dijkstra_Gilbert(500).gv",graphGilbert500.dijkstra(graphGilbert500.getEdge(0).getN1()));
        graphGilbert500 = null;

        //Geographic
        Graph graphGeographic30 = Util.newGeographicModel(30,0.1);
        Util.addRandomWeight(graphGeographic30);
        Util.saveGraph("Geographic(30).gv",graphGeographic30);
        Util.saveGraph("dijkstra_Geographic(30).gv",graphGeographic30.dijkstra(graphGeographic30.getEdge(0).getN1()));
        graphGeographic30 = null;

        //Graph graphGeographic100 = Util.newGeographicModel(100,0.05);
        //Util.saveGraph("Geographic(100).gv",graphGeographic100);
        //graphGeographic100 = null;

        Graph graphGeographic500 = Util.newGeographicModel(500,0.035);
        Util.addRandomWeight(graphGeographic500);
        Util.saveGraph("Geographic(500).gv",graphGeographic500);
        Util.saveGraph("dijkstra_Geographic(500).gv",graphGeographic500.dijkstra(graphGeographic500.getEdge(0).getN1()));
        graphGeographic500 = null;

        //Barabasi Albert
        Graph graphBarabasi30 = Util.newBarabasiAlbertModel(30,10);
        Util.addRandomWeight(graphBarabasi30);
        Util.saveGraph("BarabasiAlbert(30).gv",graphBarabasi30);
        Util.saveGraph("dijkstra_BarabasiAlbert(30).gv",graphBarabasi30.dijkstra(graphBarabasi30.getEdge(0).getN1()));
        graphBarabasi30 = null;

        //Graph graphBarabasi100 = Util.newBarabasiAlbertModel(100,25);
        //Util.saveGraph("BarabasiAlbert(100).gv",graphBarabasi100);
        //graphBarabasi100 = null;

        Graph graphBarabasi500 = Util.newBarabasiAlbertModel(500,50);
        Util.addRandomWeight(graphBarabasi500);
        Util.saveGraph("BarabasiAlbert(500).gv",graphBarabasi500);
        Util.saveGraph("dijkstra_BarabasiAlbert(500).gv",graphBarabasi500.dijkstra(graphBarabasi500.getEdge(0).getN1()));
        graphBarabasi500 = null;

    }
}
