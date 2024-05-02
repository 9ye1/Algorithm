package InToPost;

// DATE : 2024.04.02
// WRITER : 구예원
// CONTENT : 자료구조 과제2 - Infix -> Postfix 구현
// 교수님한테 질문 : Stack 클래스를 외부에서 작성해서 2개 파일로 내도 되는지

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixToPostfix {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int exe = Integer.parseInt(br.readLine());    //실행 횟수

        for (int i=0; i<exe; i++) {
            int n = Integer.parseInt(br.readLine());  //숫자 개수
            String str = br.readLine();               //입력받는 식
            StringBuilder sb = new StringBuilder();   //출력할 식 (후위표기법)

            Stack<Character> stack = new Stack<>();   //스택 생성

            for(char c : str.toCharArray()){          //문자 하나씩 분리
                switch (c){
                    case ')' :   //')'닫는 괄호가 나오면 '('나올 때까지 stack에 있는 연산자를 pop
                        char popEle = stack.pop();
                        while(popEle!='('){
                            sb.append(popEle);
                            popEle = stack.pop();
                        }
                        break;
                    case '(' :
                    case '+' :
                    case '-' :
                    case '*' :
                    case '/' :
                        stack.push(c);
                        break;
                    default:
                        //피연산자(숫자) 나오면 바로 후위표기법에 추가
                        sb.append(c);
                        break;

                }
            }

            //계산
            int a = 0; int b = 0;  //피연산자 담을 변수

            Stack<Integer> cal = new Stack<>(); //피연산자 담을 <Integer>형 Stack

            for(int j=0; j<sb.length(); j++) {
                switch (sb.charAt(j)){
                    //연산자이면 stack에서 피연산자 두 개 꺼내서(pop) 계산 후 다시 push
                    case '+' :
                        a=cal.pop();
                        b=cal.pop();
                        cal.push(a+b);
                        break;
                    case '-' :
                        a=cal.pop();
                        b=cal.pop();
                        cal.push(b-a);
                        break;
                    case '*' :
                        a=cal.pop();
                        b=cal.pop();
                        cal.push(a*b);
                        break;
                    case '/' :
                        a=cal.pop();
                        b=cal.pop();
                        cal.push(b/a);
                        break;

                    default:
                        //피연산자(숫자)이면 char->int 형변환 후 push
                        cal.push(Character.getNumericValue(sb.charAt(j)));
                }
            }
            System.out.print(sb);             //후위표기법 식
            System.out.println("="+cal.pop());  //답


        }

    }

}
