public class StringReverse {

    public static void main(String[] args) {

        String str = "madhu babu manikala";
        String reversed ="";
        StringBuilder sb = new StringBuilder("");


        //approach 1
        System.out.println(new StringBuilder(str).reverse());

        //approach 2
        for(int i = str.length()-1; i>=0; i--){
             reversed = reversed + str.charAt(i);
        }
        System.out.println(reversed);

        //approach 3
        for(int i = str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb);

    }
}
