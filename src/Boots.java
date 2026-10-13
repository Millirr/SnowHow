public class Boots extends Product{
    private int sizeEU;
    private Lacing lacing;

    public enum Lacing{CLASSIC,BOA, DOUBLE_BOA,SPEED_LACING;}

    public Boots(String articleNum,String brand,String model,Lacing lacing,int size,double price,int quantity){
        this(articleNum, brand, model, lacing, size, price);
        setQuantity(quantity);}

    public Boots(String articleNum,String brand,String model,Lacing lacing,int size,double price){
        super(articleNum,brand,model,price);
        this.lacing = lacing;
        this.sizeEU = size;}

    @Override
    public String toString() {return super.toString()+"EU "+getSizeEU()+", завязывание "+getLacing()+" |  склад "+ getQuantity();}


    public int getSizeEU() {return sizeEU;}
    public Lacing getLacing() {return lacing;}
}
