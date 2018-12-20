public class MyObj implements Comparable<MyObj>{
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(MyObj o) {

        if(getId() > o.getId())
            return 1;
        else if(getId() < o.getId())
            return -1;
        else
            return 0;
    }
}
