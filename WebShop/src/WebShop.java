public class WebShop {

    private final Kunde[] kunden;
    private final Artikel[] lager;

    public WebShop() {
        this.kunden = new Kunde[10];
        this.lager = new Artikel[10];
    }

    public void neuerArtikel(String name, double preis, int anzahl) {
        Artikel a = new Artikel(name, preis, anzahl);
        for (int i = 0; i < lager.length; i++) {
            if (lager[i] == null) {
                lager[i] = a;
                return;
            }
        }
    }

    public Kunde neuerKunde(String vorname, String nachname) {
        Kunde k = new Kunde(vorname, nachname);
        for (int i = 0; i < kunden.length; i++) {
            if (kunden[i] == null) {
                kunden[i] = k;
                return k;
            }
        }
        return null;
    }

    public Kunde neuerKunde(String vorname, String nachname, double rabatt) {
        GuterKunde gk = new GuterKunde(vorname, nachname, rabatt);
        for (int i = 0; i < kunden.length; i++) {
            if (kunden[i] == null) {
                kunden[i] = gk;
                return gk;
            }
        }
        return null;
    }

    public String bestellen(Kunde kunde, String[] einkaufsliste) {
        StringBuilder out = new StringBuilder();
        double gesamtpreis = 0.0;
        int i = 0;
        if (kunde instanceof GuterKunde gk) {
            out.append("Rechnung fuer unseren guten Kunden ")
                .append(gk.getVorname()).append(" ")
                .append(gk.getNachname())
                .append(", Preisnachlass: ")
                .append(gk.getRabattInProzent()).append("%:\n");
            for (String artikel : einkaufsliste) {
                for (Artikel value : lager) {
                    if ((value != null) && value.getName().equals(artikel)) {
                        if (value.getAnzahl() > 0) {
                            out.append(value.getName()).append(" : ")
                                .append(value.getPreis() * (1 - gk.getRabatt())).append("\n");
                            value.setAnzahl(value.getAnzahl() - 1);
                            gesamtpreis += value.getPreis() * (1 - gk.getRabatt());
                        } else {
                            out.append(artikel).append(" : nicht mehr vorhanden\n");
                        }
                    }
                }
                out.append(artikel).append(" : nicht gefunden\n");
            }
        } else {
            out.append("Rechnung fuer ")
                .append(kunde.getVorname()).append(" ")
                .append(kunde.getNachname()).append(":\n");
            for (String artikel : einkaufsliste) {
                for (Artikel value : lager) {
                    if ((value != null) && value.getName().equals(artikel)) {
                        if (value.getAnzahl() > 0) {
                            out.append(value.getName()).append(" : ").append(value.getPreis())
                                .append("\n");
                            value.setAnzahl(value.getAnzahl() - 1);
                            gesamtpreis += value.getPreis();
                        } else {
                            out.append(artikel).append(" : nicht mehr vorhanden\n");
                        }
                        i++;
                    }
                }
                out.append(artikel).append(" : nicht gefunden\n");
            }
        }
        return out.toString();
    }
}
