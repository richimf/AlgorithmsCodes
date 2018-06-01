
//T for any type
public class Vertex<T> {

    private T data;

    //Constructor
    public Vertex(){
    }

    public Vertex(T data) {
        this.data = data;
    }

    //Getters and Setters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}
