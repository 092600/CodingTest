package level0;

public class 순서쌍의개수 {

    public static void main(String[] args) {
        // int n = 20;
        int n = 100;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 0;
        
        for (int i=1; i<=n; i++) {
            if (n%i == 0)  {
                answer += 1;
            }
        }

        return answer;
    }
    
}
