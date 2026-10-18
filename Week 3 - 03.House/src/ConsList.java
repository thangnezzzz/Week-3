public class ConsList extends AList{
    private AHouse first;
    private AList rest;

    public ConsList(AHouse first, AList rest){
        this.first = first;
        this.rest = rest;
    }
}
