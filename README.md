# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 목록
* [X] 경주할 자동차 이름을 입력받는다.
    * [X] 이름은 쉼표(,)를 기준으로 구분한다.
    * [X] 사용자가 잘못된 값을 입력할 경우 "[ERROR]"로 시작하는 에러 메시지를 출력 후 입력을 다시 받는다.
        * [X] 이름이 1자 미만(공백 포함)일 경우
        * [X] 이름이 5자 초과일 경우
        * [X] 이름이 중복일 경우
* [X] 몆 번의 이동을 할 것인지를 입력할 수 있어야 한다.
    * [X] 사용자가 잘못된 값을 입력할 경우 "[ERROR]"로 시작하는 에러 메시지를 출력 후 입력을 다시 받는다.
        * [X] 입력한 값이 공백일 경우
        * [X] 입력한 값이 0 일 경우
        * [X] 입력한 값이 숫자가 아닐 경우
        * [X] 숫자에 공백이 포함된 경우
* [X] 전진하는 조건은 0에서 9사이인 random 값에서 4 이상일 경우 전진, 3 이하의 값이면 멈춘다.
* [X] 시도 횟수마다 각 자동차들이 얼마나 이동했는지 알려준다.
    * [X] 전진 여부는 `-`를 통해 표현한다.
* [ ] 자동차 경주 게임을 완료한 후 누가 우승했는지 알려준다.
    * [ ] 우승자가 한 명 이상일 경우 쉼표(,)로 이름을 구분해 출력한다.
