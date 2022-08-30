
public class StringEx2 {
   public static void main(String[] args) {
      String lyrics = "I’m Not the Only One"+
            "Sam Smith"+
            "You and me we made a vow"+
            "For better or for worse"+
            "I can't believe you let me down"+
            "But the proof is in the way it hurts"+
            "For months on end I've had my doubts"+
            "Denying every tear"+
            "I wish this would be over now"+
            "But I know that I still need you here"+
            "You say I'm crazy"+
            "'Cause you don't think I know what you've done"+
            "But when you call me baby"+
            "I know I'm not the only one"+
            "You've been so unavailable"+
            "Now sadly I know why"+
            "Your heart is unobtainable"+
            "Even though Lord knows you kept mine"+
            "You say I'm crazy"+
            "'Cause you don't think I know what you've done"+
            "But when you call me baby"+
            "I know I'm not the only one"+
            "I have loved you for many years"+
            "Maybe I am just not enough"+
            "You've made me realize my deepest fear"+
            "By lying and tearing us up"+
            "You say I'm crazy"+
            "'Cause you don't think I know what…"; 
      
      
      int count = 0;
      for(int i=0;i<lyrics.length();i++) {
    	  char ch = lyrics.charAt(i);
    	  if(ch=='a') {
    		  count++;
    	  }
      }
      System.out.println(count);  
   }

}