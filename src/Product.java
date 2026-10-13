abstract class Product implements Discountable,Comparable<Product>{
    protected String articleNum;
    protected String brand;
    protected String model;
    protected double price;
    protected int quantity;

    protected Product(String articleNum,String brand,String model,double price,int quantity){
        this (articleNum, brand, model, price);
        setQuantity(quantity);}

    protected Product(String articleNum,String brand,String model,double price){
        this.brand = brand;
        this.model = model;
        this.articleNum = articleNum;
        setPrice(price);
        this.quantity = 0;}

    public void setQuantity(int quantity) {
        if (quantity >=0)
            this.quantity = quantity;
        else
            System.out.println("Error!");}

    public void setPrice(double newPrice) {
        if (newPrice>=0)
            this.price = newPrice;
        else
            //System.out.println("Error! Price can be only more 0 :(");
            this.price=0;}

    public String staticMet(double price){
        String nowPrice = String.valueOf(price);
        String newPrice = "";
        for (int i=0;i<nowPrice.length()-2;i++){
            newPrice += nowPrice.charAt(i);}
        newPrice = newPrice.substring(0,2)+" "+newPrice.substring(2,newPrice.length()-1)+"0 ₽";
        return newPrice;}

    @Override
    public void applyDiscountIntPercent(int percent){
        double newPercent = 1-((double) percent /100);
        if (0>percent||percent>100)
            return;
        else
            setPrice(getPrice()*newPercent);}

    @Override
    public void applyDiscountDoubleCash(double money) {
        if (money >= 0)
            setPrice(getPrice() - money);
        //else return "Error";
        //return getPrice()+" ₽";}
    }

    public int getQuantity() {return quantity;}
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public double getPrice() {return price;}
    public String getArticleNum() {return articleNum;}

    @Override
    public int compareTo(Product other){
        return Double.compare(this.price,other.price);}

    @Override
    public String toString() {return "["+articleNum+"] "+getBrand()+" "+getModel()+" - "+staticMet(getPrice())+" | " ;}

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        Product object = (Product) obj;
        if (articleNum.equals(object.getArticleNum())) return true;
        return false;}

    @Override
    public int hashCode() {return articleNum.hashCode();}
}
