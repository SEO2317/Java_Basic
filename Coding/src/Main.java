import java.util.Arrays;

public class Main {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations); //오름차순 정렬

        for (int i=citations.length-1;i>-1;i--) {
            //인용수가 현재 h보다 크지 않은 경우
            //현재 h가 h의 최댓값임
            if (citations[i] <= answer)
                break;
            answer++;
        }

        return answer;
    }
}
