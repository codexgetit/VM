
public class StringHandling{
    public static void main(String[]args){
        // i want to go and define a string
        String name = "Dashrath Bogati";
        String name1 = "Dashrath Bogati";

        // i want to print the string
        System.out.println(name);
        System.out.println(name1);
        

        // operations on string
        // Length of the string
        System.out.println(name.length());

        // Accessing characters of  string
        System.out.println(name.charAt(0)); // first character

        // Print all the characters of the string
        for (int i=0;i<name.length();i++){
            System.out.println(name.charAt(i)+" ");
        }

        // String Concatenation
        String Firstname = " Dashrath";
        String Lastname= " Bogati";
        // String Fullname = Firstname + Lastname;
        // System.out.println(Fullname);

        String Fullname1 = Firstname.concat(Lastname);
        System.out.println(Fullname1);

        System.out.println(Fullname1.toUpperCase()); // Convert to uppercase
        System.out.println(Fullname1.toLowerCase()); // Convert to lowercase

        // Convert String to character array
        char[] arr = name.toCharArray();
        System.out.println(arr);

        System.out.println(arr.toString());

        // Test the reverse method ////////////////////////////////////////////
        String reversedName = reverse(name);
        System.out.println("Original: " + name);
        System.out.println("Reversed: " + reversedName);

    }
    // Reverse a String////////////////////////////////////////////////////////
    public static String reverse(String str){
        int i= str.length()-1;
        String reversed = "";
        for(int j=i;j>=0;j--){
            reversed += str.charAt(j);
        }
        return reversed;
    }

    // public static boolean isPalindrome(String str){
    //     int left =0;
    //     int right =str.length()-1;

    //     while(left<right){
    //         if(str.charAt(left)!=str.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
}