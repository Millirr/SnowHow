
public class Snowboard extends Product{
    //public static int count=0;
    private double length;
    private Camber camber;
    private int hardness;

    public enum Camber{CAMBER,ROCKER,FLAT,HYBRID;}

    public Snowboard(String artNumber, String brand, String model, double length, Camber camber, int hardness, double price, int quantity){
        this(artNumber,brand,model,length, camber,hardness,price);
        setQuantity(quantity);}

    public Snowboard (String artNumber, String brand, String model, double length, Camber camber, int hardness, double price){
        super(artNumber,brand,model,price);
        this.camber = camber;
        setHardness(hardness);
        setLength(length);}

    @Override
    public String toString() {return super.toString()+"прогиб "+ getCamber()+", жесткость "+getHardness()+", "+getLength()+" cm. | склад "+ getQuantity();}

    public void setHardness(int hardness) {
        if (hardness>0&&hardness<10)
            this.hardness = hardness;}

    public void setLength(double length) {
        if (length>0)
            this.length = length;}

    public int getHardness() {return hardness;}
    public double getLength() {return length;}
    public Camber getCamber() {return camber;}
}
