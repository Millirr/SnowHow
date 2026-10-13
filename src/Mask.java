public class Mask extends Product{
    private int percentVLT;
    private String colorLens;
    private TypeLens typeLens;

    public enum TypeLens{SPHERICAL_POLYCARBONATE,SPHERICAL_MINERAL_GLASS,CYLINDRICAL_POLYCARBONATE;}

    public Mask (String articleNum,String brand,String model,int percentVLT,String colorLens,TypeLens typeLens,double price,int quantity){
        this(articleNum, brand, model, percentVLT, colorLens, typeLens, price);
        setQuantity(quantity);}

    public Mask (String articleNum,String brand,String model,int percentVLT,String colorLens,TypeLens typeLens,double price){
        super(articleNum,brand,model,price);
        this.typeLens = typeLens;
        this.colorLens = colorLens;
        setPercentVLT(percentVLT);}

    public void setPercentVLT(int percentVLT) {
        if (percentVLT>0 && percentVLT<100)
            this.percentVLT = percentVLT;}

    public int getPercentVLT() {return percentVLT;}
    public String getColorLens() {return colorLens;}
    public TypeLens getTypeLens() {return typeLens;}

    @Override
    public String toString() {return super.toString()+"тип линзы - "+getTypeLens()+", цвет линзы - "+getColorLens()+", светопропускание "+getPercentVLT()+"| склад "+ getQuantity();}
}
