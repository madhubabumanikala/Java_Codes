public class LastNonRepeatedChar {

    public static void main(String[] args) {
        String str = "madhubabu manikala";

        for(int i = str.length()-1; i>=0; i--){

            int count = 0;
            for(int j = 0; j<str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if(count == 1){  // adjust this to find the last non repeated char
                System.out.println(str.charAt(i));
//                break;
            }
        }
    }
}
