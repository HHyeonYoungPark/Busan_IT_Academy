
public class StringEx3 {
   public static void main(String[] args) {
      //ses - 샤랄라 에서 "샤랄라"는 몇개 나오나?
      String lylics = "Woo don't turn around"+
      "cause we're into me and you"+
      "Woo don't bring me down"+
      "cause I'll be your forever"+       
      "이제 그만 널 잊는다는 게"+
      "한참이나 난 외롭겠지만"+
      "기다려 니가 오기를"+
      "까만 밤이 희게 새도록"+       
      "기억 속에선 너의 향기가"+
      "내 꿈 속에선 너의 목소리"+
      "Beautiful lady"+
      "내 귓가에 들려오는데"+    
      "Say I love you come back to me"+
      "외로움 속에서 울지 않을게"+
      "떠나지마 돌아와줘"+
      "널 기다리고 있는 내게로"+       
      "샤랄라라 샤랄라라"+
      "샤랄라 라라라 라라라라 yeah"+
      "샤랄라라 샤랄라라"+
      "샤랄라 라라라 라 Oh yeah";
     
  
      int count = 0;
      for(int i=0;i<lylics.length();i++) {
    	  char ch = lylics.charAt(i);
    	  if(ch =='샤') {
    		  count++;
    	  }
      }
      System.out.println(count);  
   }
}