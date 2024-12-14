package lien_ket_doi;

import Node.Node;

public class Dlist {
    Node header;
    Node trailer;

    public Dlist() {
        header = new Node(null, null, null);
        trailer = new Node(null, header, null);
    }

    public Node getHeader() {
        return header;
    }

    public void setHeader(Node header) {
        this.header = header;
    }

    public Node getTrailer() {
        return trailer;
    }

    public void setTrailer(Node trailer) {
        this.trailer = trailer;
    }

    public void print() {

    }

    public void addFirst(String data) {

    }

    public void addLast(String data) {

    }
}
