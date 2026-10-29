// repository link

public class lab5Main {

    public static void main(String[] args) {

        // create a class called - Graph

        Graph g = new Graph(5);

        g.add_edges(0,1);
        g.add_edges(0,3);
        g.add_edges(1,4);
        g.add_edges(0,2);
        g.add_edges(2,3);

        System.out.println("This is the matrix: ");
        g.display_matrix();

        int to = 2;
        int from = 3;
        if (g.connectedness(to, from)) {
            System.out.printf("\nVertex %d is connected to vertex %d.", to, from);
        }
        else
            System.out.printf("\nVertex %d is not connected to vertex %d.", to, from);

        int vertex = 1;
        g.adjacent_nodes(vertex);

    }

}

