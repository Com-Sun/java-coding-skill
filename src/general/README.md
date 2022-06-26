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



