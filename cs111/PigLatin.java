public class PigLatin {
    
    public static void main(String[] args) {
        
        System.out.println( "Enter a string");
        
        translate(IO.readString());
        
        
    }
    
    public static String translate(String original) {
        
        original = original.toLowerCase();
        int length = original.length();
        
        if (length == 0) {
            
            IO.outputStringAnswer(original);
            
            return original;
        }
        
        if (original.charAt(0) == 'a' || original.charAt(0) == 'e' || original.charAt(0) == 'i' || original.charAt(0) == 'o' || original.charAt(0) == 'u') {
            
            IO.outputStringAnswer(original+"way");
            
            return original + "way";
            
            
        } else {
            
            String consonant = Character.toString(original.charAt(0));
            
            IO.outputStringAnswer(original.substring(1, length) + consonant + "ay");
            
            return original.substring(1, length) + consonant + "ay";
        }
        
        
    }
    
    
}
