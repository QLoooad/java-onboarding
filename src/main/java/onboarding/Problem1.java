package onboarding;

import java.util.List;


class Problem1 {
	public static int solution(List<Integer> pobi, List<Integer> crong) {
		int answer = Integer.MAX_VALUE;
		
		return answer;
	}
	
	public static int makePage() { //makePage와 동시 3~398까지 추출
		
        int Page = (int) (Math.random() * (398+1)-3)+3; //(최대+1)-최소)+최소 3~398
        do {
        	Page = (int) (Math.random() * (398+1)-3)+3;
        }while(Page <= 1 || Page >= 400); //조건 충족 시 리셋
        return Page;
	}

	public static int Odd_L_HighScore(int Page) {
		int PageL = 0;
		
		if(Page % 2 == 1) {//홀수
			PageL = Page;
	    }else {//짝수
	    	PageL = Page-1;
	    }
		int length = (int)(Math.log10(PageL)+1);//int자리수
		
		int hun = PageL / 100; // 백
		int ten = (PageL / 10) % 10; // 십
		int one = PageL % 10; // 일*/
		
		int plusL = 0;
		int multiL = 0;
		
		if(length == 3) { //자릿수에 따른 곱하기
			plusL = hun+ten+one;
			multiL = hun*ten*one;//100의자리 아니면 곱했을때 무조
		}else if(length == 2) {
			plusL = ten+one;
			multiL = ten*one;
		}else {
			plusL = PageL;
			multiL = PageL;//100의자리 아니면 곱했을때 무조
		}

		int HighSco = (plusL < multiL) ? multiL : plusL;
		return HighSco;
	}
	public static int Even_R_HighScore(int Page) {
        int PageR = 0;
        
		if(Page % 2 == 0) {//짝수
			PageR = Page;
	    }else {//짝수
	    	PageR = Page+1;
	    }
		int length = (int)(Math.log10(PageR)+1);//int자리수
		
		int hun = PageR / 100; // 백
		int ten = (PageR / 10) % 10; // 십
		int one = PageR % 10; // 일*/
		
		int plusR = 0;
		int multiR = 0;
		
		if(length == 3) { //자릿수에 따른 곱하기
			plusR = hun+ten+one;
			multiR = hun*ten*one;//100의자리 아니면 곱했을때 무조
		}else if(length == 2) {
			plusR = ten+one;
			multiR = ten*one;
		}else {
			plusR = PageR;
			multiR = PageR;//100의자리 아니면 곱했을때 무조
		}
		
		int HighSco = (plusR < multiR) ? multiR : plusR;
		return HighSco;
	}
	public static int HighScore(int Page) {
		int score = 0;
		return score;
	}
	
	
    public static void main(String[] args){
    	
    	int pobiPage = makePage();
    	System.out.println(pobiPage+ " pobiPage");
    	int crongPage = makePage();
    	System.out.println(crongPage+ " crongPage");
    	
    	int pobiLScore = Odd_L_HighScore(pobiPage);
    	int pobiRScore = Even_R_HighScore(pobiPage);
    	int crongLScore = Odd_L_HighScore(crongPage);
    	int crongRScore = Even_R_HighScore(crongPage);
       
    	/*int hun = i / 100; // 백
		int ten = (i / 10) % 10; // 십
		int one = i % 10; // 일*/
    	 
         
    	
    	}
    	
        
    }



/*
 * 랜덤번호 3~398 첫,막페이지 x **
 * 나온번호 올수짝수 구분 후 홀수 +1 짝수 -1 **
 * 나온 두 수 *페이지 번호의 각 자리 숫자를 모두 더함 || 모두 곱해 가장 큰 수를 구한다.
 * 더하거나 곱한 수 큰수로 비교
 * 포비 win = 1, 크롱 win = 2, 무승부 = 0, 각 페이지 차가 1이 아니면 -1 ex) 99,102 = -1
 */