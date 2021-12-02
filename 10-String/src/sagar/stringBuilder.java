package sagar;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sagar");
        System.out.println(sb); // Sagar

        // char at index 0
        System.out.println(sb.charAt(0));   // s

        // set char at index
        sb.setCharAt(0, 'k');
        System.out.println(sb);   // kagar

        // insert
        sb.insert(0, 'T');
        System.out.println(sb);  // Tkagar

        sb.insert(3, 'l');
        System.out.println(sb);  // Tkalgar

        // delete
        sb.delete(3, 4);
        System.out.println(sb);  // Tkagar

        sb.delete(0, 2);
        System.out.println(sb);  // agar


    }
}
