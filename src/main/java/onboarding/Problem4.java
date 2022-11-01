package onboarding;

public class Problem4 {
    public static String solution(String word) {
        String answer = "";
        char[] chars = word.toCharArray();
        for(int i=0; i<word.length(); i++) {
        	int A = chars[i]+0; //바꾸기 전 아스키
        	int B = change(A);	//바꾼 후 아스키
        	if(chars[i]+0 >= 65 && chars[i]+0 <= 90) { //대문자면 대문자로 리버스
        		chars[i]=(char) B;
        	}
        	if(chars[i]+0 >= 97 && chars[i]+0 <= 122) {
        		chars[i]=(char) B;
        	}
        }
        StringBuilder sb = new StringBuilder();
        for (Character ch: chars) {
            sb.append(ch);
        } 
        String string = sb.toString();
        return answer = string;
    }
    public static int change(int Alphabet) { //Alphabet에 A의 char 들어오면 Z의 char값 리턴
    	int A = Alphabet;
    	if(Alphabet >= 65 && Alphabet <= 90) {
    		A = (Alphabet - 155)*-1;
    	}
    	if(Alphabet >= 97 && Alphabet <= 122) {
    		A = (Alphabet - 219)*-1;
    	}
    	return A;
    }
    public static void main(String[] args) {
    	String s = "I love you"; // R olev blf
    	char[] chars = s.toCharArray();
    	System.out.println(chars);
    	chars[0]='R';
    	System.out.println(chars);		
    	System.out.println(chars[0]);	// R
    	System.out.println(chars[0]+0);	// 82
    	System.out.println(chars[0]+1); // 83
    	char A = (char)(chars[0]+1);	// S
    	System.out.println(A);
    	int B = chars[0]+0;				//82
    	System.out.println(B);			//82
    	// 양수 변환 a * -1
    	System.out.println(solution("I love you") + " solution");
    }
}
