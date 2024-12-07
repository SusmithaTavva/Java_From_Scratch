public class stringBuilder {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder("Susmitha");
       System.out.println(sb);

    //    char at index 0
       System.out.println(sb.charAt(0)); 


    // set char at index0
    sb.setCharAt(4,'e');
    System.out.println(sb);

    // insert char
    sb.insert(3,'h');
    System.out.println(sb);

        // delete char
        sb.delete(3,4);
        System.out.println(sb);

        // append char
        sb.append("a");
        System.out.println(sb);

        // length
        System.out.println(sb.length());
    }
}
