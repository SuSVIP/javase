package tarena.javase.day02;

import java.util.Objects;

public class Node {
  private int i;
  private int j;
  public Node(){}//无参构造器
    public Node(int i,int j){//有参构造器
      super();
      this.i=i;
      this.j=j;
    }

    //getXx()与setXx()方法

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "["  + i + "," + j + ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return i == node.i && j == node.j;
    }

    @Override
    public int hashCode() {
        return (i<<16)|j;
    }
}
