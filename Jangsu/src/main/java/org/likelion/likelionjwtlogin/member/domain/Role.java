package org.likelion.likelionjwtlogin.member.domain;

// 사전에 정의된 상수들의 집합이다. 코드의 가독성을 향상시키고, 잘못된 값이 할당되는 것을 컴파일 시간에 방지할 수 있다.
public enum Role {
    ROLE_ADMIN, ROLE_USER
}
/*
    프로그램 안에 중복된 상수가 존재하는 경우 옳은 명령을 수행해도 잘못된 명령을 수행할 수 있으며 이는 컴파일러도 잡아주지 못한다.
    열거 형식은 이를 자동으로 설정에 따라 정수형, (배열처럼 0부터 시작) 이름을 넣을 수 있다.

    C# 교과서에서 퍼왔는데 생각나서 써봤습니다.
*/