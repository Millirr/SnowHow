public class Bindings extends Product{
    private Size size;
    private int hardness;

    public enum Size{XXS,XS,S,L,M,XL,XXL;}

    public Bindings(String articleNum,String brand,String model,Size size,int hardness,double price,int quantity){
        this(articleNum, brand, model, size, hardness, price);
        setQuantity(quantity);}

    public Bindings(String articleNum,String brand,String model,Size size,int hardness,double price){
        super(articleNum,brand,model,price);
        setHardness(hardness);
        this.size = size;}

    @Override
    public String toString() {return super.toString()+"RUS "+getSize()+", жёсткость "+getHardness()+" |  склад "+ getQuantity();}

    public void setHardness(int hardness) {
        if (hardness>0&&hardness<10)
            this.hardness = hardness;}

    public int getHardness() {return hardness;}
    public Size getSize() {return size;}
}
