import java.io.BufferedWriter;
import java.io.IOException;

public class Graph {
  public static class Edge {
    private int v1, v2;
    public Edge (int v1, int v2) {
      this.v1 = v1; this.v2 = v2;
    }
    public int v1 () { return this.v1; }
    public int v2 () { return this.v2; }
  }
  public int mat[][]; 
  private int numVertices;
  private int numEdges;
  private int pos[];

  public Graph (int numVertices) {
    this.mat = new int[numVertices][numVertices];
    this.pos = new int[numVertices]; 
    this.numVertices = numVertices; 
    for (int i = 0; i < this.numVertices; i++) {
      for (int j = 0; j < this.numVertices; j++) this.mat[i][j] = 0;
      this.pos[i] = -1; 
    }
  }
  public Graph (int numVertices, int numEdges) {
    this.mat = new int[numVertices][numEdges];
    this.pos = new int[numVertices]; 
    this.numVertices = numVertices; 
    this.numEdges = numEdges;
    for (int i = 0; i < this.numVertices; i++) {
      for (int j = 0; j < this.numEdges; j++) this.mat[i][j] = 0;
      this.pos[i] = -1; 
    }
  }
  public void insertEdge (int v1, int v2) {
    this.mat[v1][v2] = 1; 
  }

  public void print (BufferedWriter bw) throws IOException {
    for (int i = 1; i < this.numVertices; i++) { 
      for (int j = 1; j < this.numVertices; j++){
    	bw.write(this.mat[i][j] + "   ");
    	bw.flush();
      }
      bw.newLine();
    }
  }
  
  public int numVertices () { return this.numVertices; }
  public int numEdges () { return this.numEdges; }
}
