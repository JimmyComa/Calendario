public class SegniZodiacaliTest {
    public static void main(String[] args) {
        SegniZodiacali mioSegnoZodiacale = new SegniZodiacali();

        mioSegnoZodiacale.giorno = 21;
        mioSegnoZodiacale.mese = "marzo".toLowerCase();
        mioSegnoZodiacale.scopriSegno();
    }
}
