public class CalendarioTest {
    public static void main(String[] args) {
        Calendario myCalendario = new Calendario();

        myCalendario.giorno = 31;
        myCalendario.mese = "febbraio".toLowerCase();
        myCalendario.viewCalendar();
    }
}
