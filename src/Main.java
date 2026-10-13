import java.util.*;

public class Main {
    public static ArrayList<Product> filterByBrand(String brand,ArrayList<Product> shop){
        ArrayList<Product>newShop = new ArrayList<>();
        for (Product product:shop){if (product.getBrand().equals(brand)) newShop.add(product);}
        return newShop;}

    public static void main (String[] args){
        Snowboard snowboard1 = new Snowboard("SB-001", "Burton", "Custom Camber", 158, Snowboard.Camber.CAMBER, 7, 54990, 7);
        Snowboard snowboard2 = new Snowboard("SB-002", "Jones", "Flagship", 161, Snowboard.Camber.HYBRID, 8, 62990, 7);
        Snowboard snowboard3 = new Snowboard("SB-003", "Lib Tech", "Skate Banana", 154, Snowboard.Camber.ROCKER, 4, 49990);
        Snowboard snowboard4 = new Snowboard("SB-004", "Nitro", "Team Pro", 159, Snowboard.Camber.CAMBER, 7, 44990, 7);
        Snowboard snowboard5 = new Snowboard("SB-005", "Bataleon", "Evil Twin", 156, Snowboard.Camber.HYBRID, 6, 51990, 6);
        Snowboard snowboard6 = new Snowboard("SB-006", "Völkl", "Revoltage", 158, Snowboard.Camber.CAMBER, 8, 46990, 7);
        Snowboard snowboard7 = new Snowboard("SB-007", "Versta", "Freeride One", 162, Snowboard.Camber.FLAT, 5, 34990);
        Snowboard snowboard8 = new Snowboard("SB-008", "Burton", "Process Flying V", 155, Snowboard.Camber.HYBRID, 5, 47990, 5);
        Snowboard snowboard9 = new Snowboard("SB-009", "Jones", "Mind Expander", 154, Snowboard.Camber.ROCKER, 3, 52990, 3);
        Snowboard snowboard10 = new Snowboard("SB-010", "Lib Tech", "Orca", 156, Snowboard.Camber.HYBRID, 7, 59990, 7);
        Boots boots1 = new Boots("BT-001", "Burton", "Photon", Boots.Lacing.DOUBLE_BOA, 43, 32990, 5);
        Boots boots2 = new Boots("BT-002", "Burton", "Ruler", Boots.Lacing.SPEED_LACING, 42, 24990, 3);
        Boots boots3 = new Boots("BT-003", "Nitro", "Club", Boots.Lacing.CLASSIC, 44, 18990, 8);
        Boots boots4 = new Boots("BT-004", "Nitro", "Team TLS", Boots.Lacing.SPEED_LACING, 43, 22990, 2);
        Boots boots5 = new Boots("BT-005", "Jones", "MTB", Boots.Lacing.BOA, 42, 34990, 7);
        Boots boots6 = new Boots("BT-006", "Versta", "Rider", Boots.Lacing.CLASSIC, 41, 14990, 4);
        Boots boots7 = new Boots("BT-007", "Nitro", "Venture Pro", Boots.Lacing.DOUBLE_BOA, 44, 29990, 6);
        Boots boots8 = new Boots("BT-008", "Burton", "Moto", Boots.Lacing.BOA, 43, 19990, 9);
        Boots boots9 = new Boots("BT-009", "Bataleon", "Lasso", Boots.Lacing.BOA, 42, 26990, 1);
        Boots boots10 = new Boots("BT-010", "Versta", "Speed", Boots.Lacing.SPEED_LACING, 43, 16990);
        Bindings bindings1 = new Bindings("BG-001", "Burton", "Cartel", Bindings.Size.M, 6, 24900.0, 3);
        Bindings bindings2 = new Bindings("BG-002", "Burton", "Malavita", Bindings.Size.L, 5, 27990.0, 7);
        Bindings bindings3 = new Bindings("BG-003", "Nitro", "Team", Bindings.Size.M, 7, 19990.0, 1);
        Bindings bindings4 = new Bindings("BG-004", "Nitro", "Staxx", Bindings.Size.S, 6, 22990.0, 5);
        Bindings bindings5 = new Bindings("BG-005", "Jones", "Apollo", Bindings.Size.L, 6, 26990.0, 8);
        Bindings bindings6 = new Bindings("BG-006", "Bataleon", "Astro", Bindings.Size.M, 5, 21990.0, 2);
        Bindings bindings7 = new Bindings("BG-007", "Völkl", "Fastec", Bindings.Size.L, 4, 18990.0, 6);
        Bindings bindings8 = new Bindings("BG-008", "Versta", "Base", Bindings.Size.M, 5, 11990.0);
        Bindings bindings9 = new Bindings("BG-009", "Burton", "Genesis", Bindings.Size.XL, 5, 29990.0, 4);
        Bindings bindings10 = new Bindings("BG-010", "Nitro", "Rambler", Bindings.Size.S, 6, 15990.0, 9);
        Pants pants1 = new Pants("PS-001", "Burton", "Cargo", Pants.Size.L, 10000, "Чёрный", 16990.0, 5);
        Pants pants2 = new Pants("PS-002", "Burton", "Covert", Pants.Size.M, 10000, "Хаки", 18990.0, 3);
        Pants pants3 = new Pants("PS-003", "Nitro", "Regret", Pants.Size.XL, 8000, "Серый", 12990.0, 7);
        Pants pants4 = new Pants("PS-004", "Jones", "Mountain", Pants.Size.M, 20000, "Синий", 24990.0, 2);
        Pants pants5 = new Pants("PS-005", "Versta", "Basic", Pants.Size.S, 5000, "Чёрный", 8990.0, 8);
        Pants pants6 = new Pants("PS-006", "Bataleon", "Wide", Pants.Size.L, 10000, "Оливковый", 15990.0, 4);
        Pants pants7 = new Pants("PS-007", "Völkl", "Slope", Pants.Size.M, 15000, "Тёмно‑синий", 19990.0, 6);
        Pants pants8 = new Pants("PS-008", "Nitro", "Grid", Pants.Size.XL, 8000, "Камуфляж", 13990.0, 1);
        Pants pants9 = new Pants("PS-009", "Burton", "AK Cyclic", Pants.Size.L, 20000, "Красный", 29990.0, 9);
        Pants pants10 = new Pants("PS-010", "Versta", "Storm", Pants.Size.M, 10000, "Бордовый", 11990.0);
        Mask mask1 = new Mask("MS-001", "Burton", "Anon M4", 16, "Золотая зеркальная", Mask.TypeLens.SPHERICAL_POLYCARBONATE, 27990.0, 9);
        Mask mask2 = new Mask("MS-002", "Burton", "Anon Helix", 30, "Розовая зеркальная", Mask.TypeLens.CYLINDRICAL_POLYCARBONATE, 14990.0, 5);
        Mask mask3 = new Mask("MS-003", "Nitro", "View", 22, "Дымчатая", Mask.TypeLens.CYLINDRICAL_POLYCARBONATE, 9990.0, 7);
        Mask mask4 = new Mask("MS-004", "Jones", "Alpine", 18, "Синяя зеркальная", Mask.TypeLens.SPHERICAL_POLYCARBONATE, 19990.0, 3);
        Mask mask5 = new Mask("MS-005", "Versta", "Vision", 46, "Оранжевая", Mask.TypeLens.CYLINDRICAL_POLYCARBONATE, 6990.0, 8);
        Mask mask6 = new Mask("MS-006", "Bataleon", "Scope", 20, "Серебряная зеркальная", Mask.TypeLens.SPHERICAL_POLYCARBONATE, 15990.0, 4);
        Mask mask7 = new Mask("MS-007", "Völkl", "Peak", 15, "Изумрудная зеркальная", Mask.TypeLens.SPHERICAL_MINERAL_GLASS, 22990.0, 6);
        Mask mask8 = new Mask("MS-008", "Nitro", "Night", 85, "Прозрачная", Mask.TypeLens.CYLINDRICAL_POLYCARBONATE, 7990.0, 2);
        Mask mask9 = new Mask("MS-009", "Burton", "Anon Sync", 19, "Красная зеркальная", Mask.TypeLens.SPHERICAL_MINERAL_GLASS, 24990.0, 1);
        Mask mask10 = new Mask("MS-010", "Versta", "Storm", 55, "Жёлтая", Mask.TypeLens.CYLINDRICAL_POLYCARBONATE, 5990.0);
        Overall overall1 = new Overall("OL-001", "Burton", "AK 3L", Overall.Size.L, 20000, "Чёрный", 54990.0, 2);
        Overall overall2 = new Overall("OL-002", "Jones", "Shralpinist", Overall.Size.M, 28000, "Синий", 62990.0, 5);
        Overall overall3 = new Overall("OL-003", "Nitro", "Squaw", Overall.Size.S, 10000, "Розовый", 24990.0, 3);
        Overall overall4 = new Overall("OL-004", "Versta", "One Piece", Overall.Size.M, 8000, "Чёрный", 18990.0, 7);
        Overall overall5 = new Overall("OL-005", "Bataleon", "Retro", Overall.Size.L, 15000, "Оранжевый", 29990.0, 1);
        Overall overall6 = new Overall("OL-006", "Völkl", "Alpine", Overall.Size.XL, 20000, "Серый", 34990.0, 4);
        Overall overall7 = new Overall("OL-007", "Burton", "Retro Onesie", Overall.Size.XL, 10000, "Красный", 27990.0, 6);
        Overall overall8 = new Overall("OL-008", "Nitro", "Powder", Overall.Size.M, 15000, "Голубой", 31990.0);
        Overall overall9 = new Overall("OL-009", "Versta", "Freeride", Overall.Size.M, 12000, "Зелёный", 21990.0, 8);
        Overall overall10 = new Overall("OL-010", "Jones", "Mountain Suit", Overall.Size.L, 20000, "Хаки", 44990.0, 9);

        /**Boots boots1 = new Boots("BT-001","Burton","Photon", Boots.Lacing.DOUBLE_BOA,43,32990,4);
        Pants pants1 = new Pants("PS-001","Burton","Cargo", Pants.Size.L,10000,"black",16990.0,5);
        Bindings bindings1 = new Bindings("BG-001","Burton","Cartel", Bindings.Size.M,6,24900.0);
        Mask mask1 = new Mask("MS-001","Burton","Anon M4",16,"Золотая зеркальная", Mask.TypeLens.SPHERICAL_POLYCARBONATE,27990.0,9);
        Overall overall1 = new Overall("OL-001","Burton","AK 3L", Overall.Size.L,20000,"Чёрный",54990.0,2);*/

        System.out.println(snowboard1);
        Discountable item = snowboard1;
        item.applyDiscountIntPercent(50);
        System.out.println(boots1);

        System.out.println("--------------------------");

        Product[] shop = {snowboard1,bindings1,boots1,pants1,mask1,overall1,snowboard2,snowboard3,snowboard4,snowboard5,snowboard6,snowboard7,snowboard8,snowboard9,snowboard10,boots2,boots3,boots4,boots5,boots6,boots7,boots8,boots9,boots10,bindings2,bindings3,bindings4,bindings5,bindings6,bindings7,bindings8,bindings9,bindings10,mask2,mask3,mask4,mask5,mask6,mask7,mask8,mask9,mask10,pants2,pants3,pants4,pants5,pants6,pants7,pants8,pants9,pants10,overall2,overall3,overall4,overall5,overall6,overall7,overall8,overall9,overall10};
        ArrayList<Product> products = new ArrayList<>();
        Map<String,Product> byArticle = new HashMap<>();
        Set<String>brands = new HashSet<>();
        Map<String,List<Product>> byBrand=new HashMap<>();
        //Arrays.sort(shop);
        int countSnowboard = 0;

        for (Product i:shop){
            if (i instanceof Snowboard){countSnowboard++;}
            System.out.println(i);
            products.add(i);
            byArticle.put(i.getArticleNum(),i);
            brands.add(i.getBrand());}

        for (Product product: shop){
            if (byBrand.get(product.getBrand())==null){
                ArrayList<Product> list=new ArrayList<>();
                list.add(product);
                byBrand.put(product.getBrand(),list);} else {
                byBrand.get(product.getBrand()).add(product);}}

        System.out.println("Board in the box: "+countSnowboard);

        System.out.println("------------------------");

        System.out.println(snowboard1.equals(boots1));
        System.out.println(snowboard1.hashCode() == boots1.hashCode());
        //System.out.println(snowboard1.applyDiscount(10));
        boots1.applyDiscountDoubleCash(5000.0);
        System.out.println(snowboard1);
        //byArticle.put("SB-001",boots1);

        System.out.println("-----------------------");

        Product search = byArticle.get("BG-001");
        if (search != null) System.out.println(search);
        else System.out.println("товар не найден");
        System.out.println(byArticle.get("SB-001"));

        System.out.println("--------------------------");

        System.out.println("Товаров всего: "+byArticle.size());
        System.out.println("Всего брендов: "+brands.size());
        System.out.println(brands);

        System.out.println("--------------------------");

        System.out.println(byBrand.get("Burton"));
        ArrayList<Product> backet=new ArrayList<>();
        Queue<String>queue=new Queue<String>() {
            @Override
            public boolean LinckedList() {return false;}
            @Override
            public boolean ArrayDeque() {return false;}};

        Stack<Product>stack=new Stack<>();
        backet.add(snowboard1);
        backet.add(boots1);
        backet.add(mask1);
        double sumBacket=0;
        ArrayList<Product> listByBrand=filterByBrand("Burton",products);
        for (Product product:backet){sumBacket+=product.getPrice();}
        backet.remove(boots1);
        if (backet.remove(boots1)) sumBacket-=boots1.getPrice();

        System.out.println("--------------------------");
        System.out.println(listByBrand);


    }


}
