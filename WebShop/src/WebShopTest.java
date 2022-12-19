public class WebShopTest {

    public static void main(String[] args) {
        WebShop w = new WebShop();
        Kunde k1 = w.neuerKunde("Helga", "Herrlich");
        Kunde k2 = w.neuerKunde("Werner", "Winzig", 0.05);
        w.neuerArtikel("Leberwurst", 1.95, 2);
        w.neuerArtikel("Nutella", 3.95, 1);
        String[] bk1 = {"Leberwurst", "Nutella"};
        String r1 = w.bestellen(k1, bk1);
        System.out.println(r1);
        String[] bk2 = {"Leberwurst", "Nutella", "Butter"};
        String r2 = w.bestellen(k2, bk2);
        System.out.println(r2);
    }

}
