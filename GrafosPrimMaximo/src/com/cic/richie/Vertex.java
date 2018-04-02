package com.cic.richie;

//T for any type
public class Vertex<T> {

    private T data;

    public Vertex(){
    }

    public Vertex(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
