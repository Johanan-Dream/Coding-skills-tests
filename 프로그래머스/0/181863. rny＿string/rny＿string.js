function solution(rny_string) {

    // replaceAll() : 정규 표현식을 사용하지 않고 문자열 내의 모든 일치 항목을 대체
    var answer = rny_string.replaceAll("m", "rn");
    return answer;
}
