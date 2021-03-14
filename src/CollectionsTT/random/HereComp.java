package CollectionsTT.random;

public class HereComp implements Comparable{

    int x;
    HereComp(){}
    HereComp(int x){
        this.x = x;
    }

    @Override
    public int compareTo(Object o) {

        HereComp hc = (HereComp)o;

        return hc.x - this.x;
    }
    @Override
    public String toString() {
        return " " + x;
    }
}
