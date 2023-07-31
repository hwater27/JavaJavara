package test.java;

import java.util.*;

public class gyubranch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("<메뉴>");
        System.out.println("1. 스케줄 추가");
        System.out.println("2. 스케줄 조회");
        System.out.println("3. 종료");
        
        boolean a =true;

        while (a ==true) {
            System.out.print("\n메뉴를 선택하세요: ");
            int choice1 = sc.nextInt();

            switch (choice1) {
                case 1: //스케줄 추가
                    sc.nextLine(); 
                    System.out.print("스케줄 제목: ");
                    String title = sc.nextLine();
                    System.out.print("날짜 (yyyy-MM-dd): ");
                    String date = sc.nextLine();
                    System.out.print("시간: ");
                    String time = sc.nextLine();
                    
                    

                    
                    break;
                    
                   
                case 2: //스케줄 조회
                    sc.nextLine(); 
                    System.out.print("조회할 날짜 (yyyy-MM-dd): ");
                    String searchDate = sc.nextLine();
                    
                    
                    while (true) {
                    	System.out.print("\n메뉴를 선택하세요:");
                    	System.out.println("1. 스케줄 수정");
                    	System.out.println("2. 스케줄 삭제");
                    	System.out.println("3. 첫 화면으로 돌아가기 ");
                    	
                    	int choice2 = sc.nextInt();
                    	
                    	if(choice2 == 1) { //스케줄 수정
                    		
                    	}
                    	
                    	if(choice2 == 2) { //스케줄 삭제
                    		System.out.print("삭제할 스케줄 번호: ");
                            int Index = sc.nextInt();

                            System.out.println("스케줄이 삭제 되었습니다.");
                          
                    		
                    	}
                    	if(choice2 ==3) { //첫 화면
                    		break;
                    	}
                    	
                    	else { //그 외 숫자
                    		System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                    	}
                    			
                    	
                    	
                    }
                    break;
               
            
                case 3: //프로그램 종료
                    System.out.println("프로그램을 종료합니다.");
                    a = false;
                    break
                    
                default: //그 외 숫자
                    System.out.println("메뉴를 다시 선택해주세요.");
                    break;
            }
        }
    }
}