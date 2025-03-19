public class SegniZodiacali {

    int giorno;
    String mese;

    public void scopriSegno() {
        String segno = "";

        if ((giorno < 1 || giorno > 31) ||
            (mese.equals("aprile") || mese.equals("giugno") || mese.equals("settembre") || mese.equals("novembre")) && giorno > 30 ||
            (mese.equals("febbraio") && giorno > 28)) {
            System.out.println("Errore: Giorno inesistente nel mese di " + mese);
            return;
        }

        switch (mese.toLowerCase()) {
            case "gennaio":
                segno = (giorno <= 19) ? "Capricorno" : "Acquario";
                break;

            case "febbraio":
                segno = (giorno <= 18) ? "Acquario" : "Pesci";
                break;

            case "marzo":
                segno = (giorno <= 20) ? "Pesci" : "Ariete";
                break;

            case "aprile":
                segno = (giorno <= 19) ? "Ariete" : "Toro";
                break;

            case "maggio":
                segno = (giorno <= 20) ? "Toro" : "Gemelli";
                break;

            case "giugno":
                segno = (giorno <= 20) ? "Gemelli" : "Cancro";
                break;

            case "luglio":
                segno = (giorno <= 22) ? "Cancro" : "Leone";
                break;

            case "agosto":
                segno = (giorno <= 22) ? "Leone" : "Vergine";
                break;

            case "settembre":
                segno = (giorno <= 22) ? "Vergine" : "Bilancia";
                break;

            case "ottobre":
                segno = (giorno <= 22) ? "Bilancia" : "Scorpione";
                break;

            case "novembre":
                segno = (giorno <= 21) ? "Scorpione" : "Sagittario";
                break;

            case "dicembre":
                segno = (giorno <= 21) ? "Sagittario" : "Capricorno";
                break;
                
            default:
                segno = "Errore: Mese inesistente";
                break;
        }

        if (!segno.startsWith("Errore")) {
            System.out.println("Il segno zodiacale per il giorno " + giorno + " " + mese + " è: " + segno);
        } else {
            System.out.println(segno);
        }
    }
}
