package KaKao;

public class Pro_IdRecommend {
	 public String solution(String new_id) {
	        String answer = "";
	        
	        //1단계
	        String first=new_id.toLowerCase();
	        //2단계
	        char[] first_ar=first.toCharArray();
	        StringBuilder second=new StringBuilder();
	        for (char c : first_ar) {
				if((c>='a'&&c<='z')||(c>='0'&&c<='9')||c=='-'||c=='_'||c=='.') {
					second.append(c);
				}
			}
	        //3단계
	        String third=second.toString().replace("..", ".");
	        while(third.contains("..")) {
	        	third=third.replace("..",".");
	        }
	        //4단계
	        String fourth=third;
	        if(fourth.length()>0) {
	        	if(fourth.charAt(0)=='.') {
	        		fourth=fourth.substring(1,fourth.length());
	        	}
	        }
	        if(fourth.length()>0) {
	        	if(fourth.charAt(fourth.length()-1)=='.') {
	        		fourth=fourth.substring(0,fourth.length()-1);
	        	}
	        }
	        //5단계
	        String fifth=fourth;
	        if(fifth.equals("")) {
	        	fifth="a";
	        }
	        //6단계
	        String sixth=fifth;
	        if(sixth.length()>=16) {
	        	sixth=sixth.substring(0,15);
	        	if(sixth.charAt(sixth.length()-1)=='.') {
	        		sixth=sixth.substring(0,sixth.length()-1);
	        	}
	        }
	        //7단계
	        StringBuilder last=new StringBuilder(sixth);
	        if(last.length()<=2) {
	        	char c=last.charAt(last.length()-1);
	        	while(last.length()<3) {
	        		last.append(c);
	        	}
	        }
	        answer=String.valueOf(last);
	        return answer;
	    }

}
