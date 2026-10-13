public class Pants extends Product{
    private Size size;
    private int membrane;
    private String color;

    public enum Size{XXS,XS,S,M,L,XL,XXL}

    public Pants(String articleNum,String brand,String model,Size size,int membrane,String color,double price,int quantity){
        this(articleNum, brand, model, size, membrane, color, price);
        setQuantity(quantity);}

    public Pants(String articleNum,String brand,String model,Size size,int membrane,String color,double price){
        super(articleNum,brand,model,price);
        this.size = size;
        this.color = color;
        setMembrane(membrane);}

    public void setMembrane(int membrane) {
        if (membrane>0)
            this.membrane = membrane;}

    public int getMembrane() {return membrane;}
    public Size getSize() {return size;}
    public String getColor() {return color;}

    @Override
    public String toString() {return super.toString()+"RUS "+getSize()+", мембрана "+getMembrane()+" mm., цвет - "+getColor()+" | склад "+ getQuantity();}

}
