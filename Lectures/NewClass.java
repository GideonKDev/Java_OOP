public class NewClass{
        public static void main(String[] args) {
            String m1 = "Master";
            String m2 = "Master";
            String m4 = new String("Master");
            String m5 = new String("Master");

            System.out.println("m1 and m2->"+(m1==m2));
            System.out.println("m4 and m5->"+(m4.equals(m5)));

        }
}
