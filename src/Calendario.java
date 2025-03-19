public class Calendario {
    int giorno;
    String mese;

    public void viewCalendar() {
        switch (mese.toLowerCase()) {
            case "gennaio","febbraio","marzo","aprile","maggio","giugno","luglio","agosto","settembre","ottobre","novembre","dicembre":
            
                if ((giorno == 25 && mese.equals("aprile")) || (giorno == 21 && mese.equals("aprile")) || (giorno == 1 && mese.equals("maggio"))) {
                    System.out.println("Giorno " + giorno + " " + mese + " è festivo");

                } else if (giorno >= 9 && giorno <= 21 && mese.equals("maggio")) {
                    System.out.println("Giorno " + giorno + " " + mese + " si svolge il Project Work");

                } else if ((giorno >= 24 && giorno <= 30 && mese.equals("aprile")) || (giorno >= 1 && giorno <= 8 && mese.equals("maggio"))) {
                    System.out.println("Giorno " + giorno + " " + mese + " si svolge Spring");

                } else if (giorno >= 18 && giorno <= 23 && mese.equals("aprile")) {
                    System.out.println("Giorno " + giorno + " " + mese + " si svolge il JDBC");

                } else if (giorno >= 9 && giorno <= 17 && mese.equals("aprile")) {
                    System.out.println("Giorno " + giorno + " " + mese + " si svolge la parte Database");

                } else if (giorno == 11 && mese.equals("marzo")) {
                    System.out.println("Giorno " + giorno + " " + mese + " si svolge GitHub");

                } else if ((giorno >= 6 && giorno <= 10 && mese.equals("marzo")) || (giorno >= 12 && giorno <= 31 && mese.equals("marzo")) || (giorno >= 1 && giorno <= 8 && mese.equals("aprile"))) {
                    System.out.println("Giorno " + giorno + " " + mese + " si svolge Java");

                } else if (giorno == 5 && mese.equals("marzo")) {
                    System.out.println("Giorno " + giorno + " " + mese + " si svolge il DASA");

                } else if ((giorno >= 13 && giorno <= 28 && mese.equals("febbraio")) || (giorno >= 1 && giorno <= 4 && mese.equals("marzo"))) {
                    System.out.println("Giorno " + giorno + " " + mese + " si svolge la parte Web");

                } else if ((giorno >= 1 && giorno <= 31 && mese.equals("gennaio")) || (giorno >= 1 && giorno <= 12 && mese.equals("febbraio"))) {
                    System.out.println("Giorno " + giorno + " " + mese + " non è ancora stato avviato il corso");

                } else if (giorno >= 22 && giorno <= 30 && mese.equals("maggio")) {
                    System.out.println("Giorno " + giorno + " " + mese + " il corso è terminato ");

                } else if (giorno >= 32) {
                    System.out.println("Errore: Giorno inesistente");
                } else if (giorno >= 29 && giorno <= 31 && mese.equals("febbraio")) {
                    System.out.println("Errore: Giorno inesistente nel mese di febbraio");
                } else if ((giorno == 31 && mese.equals("aprile")) || mese.equals("giugno") || mese.equals("settembre") || mese.equals("novembre")) {
                    System.out.println("Errore: Giorno inesistente nel mese di: " + mese);
                } else {
                    System.out.println("Corso non presente");
                }
                break;
            default:
                System.out.println("Errore: Mese inesistente");
                break;
        }
    }
}
