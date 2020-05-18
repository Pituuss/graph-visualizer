package transform;

import model.Coordinates;
import model.FaceNode;
import model.ModelGraph;
import model.Vertex;

public class Transform2341Closure {
    public static ModelGraph transform(ModelGraph g) {

        Vertex v1 = g.getVertex("n1").get();
        Vertex v2 = g.getVertex("n2").get();
        Vertex v3 = g.getVertex("n3").get();
        Vertex v4 = g.getVertex("n4").get();

        FaceNode t1 = g.getFace("t1").get();
        FaceNode t2 = g.getFace("t2").get();
        FaceNode t3 = g.getFace("t3").get();
        FaceNode t4 = g.getFace("t4").get();


        /*  T1  */

        Coordinates c5 = v3.getCoordinates().middlePoint(v4.getCoordinates());
        Vertex v5 = g.insertVertex("n5", c5);
        Coordinates c6 = v2.getCoordinates().middlePoint(v3.getCoordinates());
        Vertex v6 = g.insertVertex("n6", c6);

        g.insertEdge("e7", v2, v5, false);
        g.insertEdge("e8", v3, v6, false);

        g.removeFace("t1");
        g.insertFace("t1:1", v2, v4, v5);
        g.insertFace("t1:2", v2, v3, v5);

        /*  T2  */

        Coordinates c7 = v1.getCoordinates().middlePoint(v4.getCoordinates());
        Vertex v7 = g.insertVertex("n7", c7);

        g.insertEdge("e9", v5, v7, false);
        g.insertEdge("e10", v3, v7, false);

        g.removeFace("t2");
        g.insertFace("t2:1", v4, v5, v7);
        g.insertFace("t2:2", v3, v5, v7);
        g.insertFace("t2:3", v1, v3, v7);

        /*  T3  */

        Coordinates c8 = v1.getCoordinates().middlePoint(v2.getCoordinates());
        Vertex v8 = g.insertVertex("n8", c8);

        g.insertEdge("e11", v4, v8, false);
        g.insertEdge("e12", v4, v7, false);

        g.removeFace("t3");
        g.insertFace("t3:1", v2, v4, v8);
        g.insertFace("t3:2", v4, v7, v8);
        g.insertFace("t3:3", v1, v7, v8);

        /*  T4  */

        g.insertEdge("e13", v1, v6, false);
        g.insertEdge("e14", v6, v8, false);

        g.removeFace("t4");
        g.insertFace("t4:1", v1, v3, v6);
        g.insertFace("t4:2", v1, v6, v8);
        g.insertFace("t4:3", v2, v6, v8);

        /* INTERNALS */

        Coordinates c9 = v3.getCoordinates().middlePoint(c7);
        Vertex v9 = g.insertVertex("n9", c9);
        Coordinates c10 = v1.getCoordinates().middlePoint(v3.getCoordinates());
        Vertex v10 = g.insertVertex("n10", c10);
        Coordinates c11 = v1.getCoordinates().middlePoint(v6.getCoordinates());
        Vertex v11 = g.insertVertex("n11", c11);

        g.insertEdge("e15", v5, v9, false);
        g.insertEdge("e16", v9, v10, false);
        g.insertEdge("e17", v7, v10, false);
        g.insertEdge("e18", v6, v10, false);
        g.insertEdge("e19", v10, v11, false);
        g.insertEdge("e20", v8, v11, false);

        g.insertInterior("i1", v4, v5, v7, v8);
        g.insertInterior("i2", v5, v9, v7, v11);
        g.insertInterior("i3", v7, v9, v10, v11);
        g.insertInterior("i4", v7, v10, v11, v1);
        g.insertInterior("i5", v5, v3, v9, v6);
        g.insertInterior("i6", v3, v6, v10, v9);
        g.insertInterior("i7", v10, v11, v6, v9);
        g.insertInterior("i8", v5, v7, v8, v11);
        g.insertInterior("i9", v8, v11, v6, v5);
        g.insertInterior("i10", v6, v5, v2, v8);
        g.insertInterior("i11", v1, v7, v8, v11);


        g.removeFace("t4:1");
        g.removeFace("t4:2");
        g.removeFace("t2:2");
        g.removeFace("t2:3");

        g.insertFace("t1", v2, v5, v8);
        g.insertFace("t2", v4, v5, v8);
        g.insertFace("t3", v5, v7, v8);
        g.insertFace("t4", v7, v8, v11);
        g.insertFace("t5", v1, v7, v11);
        g.insertFace("t6", v5, v6, v8);
        g.insertFace("t7", v5, v8, v11);
        g.insertFace("t8", v7, v10, v11);
        g.insertFace("t9", v9, v10, v11);
        g.insertFace("t10", v7, v9, v11);
        g.insertFace("t11", v6, v9, v10);
        g.insertFace("t12", v3, v6, v9);
        g.insertFace("t13", v5, v6, v9);
        g.insertFace("t14", v5, v9, v11);
        g.insertFace("t15", v5, v7, v11);
        g.insertFace("t16", v6, v9, v11);
        g.insertFace("t17", v5, v6, v11);

        return g;
    }
}
