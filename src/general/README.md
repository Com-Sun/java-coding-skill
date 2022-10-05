## 1장 - 우선 정리부터 (General)

### [1.1 쓸모없는 비교 피하기](./ex01_avoid_unneccessary_comparisons)

조건문에서 굳이 == true를 사용할 필요 없다.

### [1.2 부정 피하기](./ex02_avoid_negations)

제어할 수 있다면, 적절한 클래스에 메소드를 추가하는것을 망설이지 마라!
대부분의 경우 부정적 메소드를 모두 제거하는 것이 좋다.

### [1.3 불 표현식을 직접 반환](./ex03_return_boolean_expression_directly)

boolean을 반활할 경우 if문을 사용하기보단 boolean식을 직접 반환하라!

조건문을 세 개 이상 합칠 때는 간소화를 고려하라!(드모르간의 법칙)

### [1.4 불 표현식 간소화](./ex04_simplify_boolean_expressions)

여러 조건문을 하나로 합쳐야 할 경우, 좋은 그루핑을 고려하라!

- 한 메소드 안에서 추상화 수준이 비슷하도록 구성하라

### [1.5 조건문에서 NPE 피하기](./ex05_avoid_nullpointerexception_in_conditionals)

- 인수를 검증할 경우 순서는 매우 중요하다. 반드시 null을 먼저 확인한 후, 도메인에 따라 '유효하지 않은' 값을 검증하라

매개변수 검증은 protected, default, public만 하면 된다.

private 메소드를 생성하는 경우, null을 전달하지 않게 하라.

### [1.8 코드 대칭 이루기](./ex08_ensure_code_symmetry)

- 거의 같은 것들은 똑같은 것들과 완전히 다른 부분으로 나눌 수 있다!


## 2장 - 코드 스타일 레벨 업 (General)

### 2.1 매직 넘버를 상수로 대체

- 매직넘버: 특별한 맥락 없는 숫자 집합

을 static final 상수로 대체하라!

### 2.2 정수 상수 대신 열거형

- Enum을 사용하자!

### 2.3 For 루프 대신 ForEach

- 인덱스 변수를 자세히 알아야 할 경우는 드물다.

### [2.4 순회하며 컬렉션 수정하지 않기](./ex12_avoid_collection_modification_during_iteration)

- List를 순회하며 List를 수정할 수 없다!
  - ConcurrentModificationException 발생
- 대신, Iterator을 사용할 수 있다.
- Collection.removeIf() 도 있다.

### 2.5 순회하며 계산 집약적 연산하지 않기

- Pattern.matches(regex, supply.toString())는 유용하지만 많은 시간을 요구한다.
- 위에 들어있는 두 연산을 분리한 뒤, matcher를 사용하자.

### 2.6 새 줄로 그루핑

- 연관된 코드와 개념은 함께 그루핑
- 서로 다른 그룹은 빈 줄로 각각 분리
- 수직 서식화 (신문을 생각하자)
  - 제목 (클래스)
  - 머릿말(공개 멤버, 생성자, 메서드)
  - 세부내용(비공개 메서드)

### 2.7 이어붙이기 대신 서식화

- 문자열이 길면 강력한 템플릿 엔진인 StringTemplate을 사용하라

### 2.8 직접 만들지 않고 자바 API 사용하기

- Objects.requireNonNull
- Collections.frequency

API에 정통하자!

