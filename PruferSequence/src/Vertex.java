
//T for any type
public class Vertex<T> {

    private T data;
    private T label;

    //Constructor
    public Vertex(){
    }

    public Vertex(T data) {
        this.data = data;
    }

    public Vertex(T data, T label) {
        this.data = data;
        this.label = label;
    }

    //Getters and Setters
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getLabel() {
        return label;
    }

    public void setLabel(T label) {
        this.label = label;
    }
}
