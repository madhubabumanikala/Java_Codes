public class FindVowels {


    public static void main(String[] args){

        String str = "madhubabu manikala";
        int count = 0;

        for(char vowel : str.toCharArray()){
            if(vowel=='a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u'){
                System.out.println(vowel+" "+count);
            }
            count++;
        }

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u'){
                System.out.println(str.charAt(i)+" "+i);
            }

        }


    }





}
