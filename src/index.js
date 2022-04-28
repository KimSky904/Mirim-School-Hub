// import './jsxstudy/jsx-study1'
// import './jsxstudy/jsx-study2'
// import './school-test/HelloWorld'
// import './component-basic/props-basic'
// import './component-basic/props-children'
// import './component-intermediate/state-study-1'
// import './use-state-demo/counter-with-hook-caveat'
// import './component-intermediate/counter-demo'
// import './component-intermediate/lst-demo'
// import './component-intermediate/manipulate-list'
// import './component-intermediate/todo-app-demo'
// import './use-effect-demo/use-effect-intro'
// import './use-effect-demo/use-effect-deps'
// import './use-effect-demo/use-effect-using-local-storage'
// import './use-effect-demo/use-effect-unmount'
// import './use-effect-demo/use-effect-unmount-deps'
// import './use-effect-demo/use-effect-with-dom'
// import './use-effect-demo/timer-demo'
// import './school-test/click-game'
// import './use-effect-demo/use-effect-fetch-api'
// import './component-advanced/ref-demo'
// import './component-advanced/controlled-component'
// import './component-advanced/reservation-form'
// import './component-advanced/uncontrolled-component'
// import './use-ref-demo/use-ref-practice-form'
// import './school-test/news-page'
// import './component-advanced/use-context-using-user-context'
// import './component-advanced/context-api-theme-context'
// import './component-advanced/fake-login'
// import './school-test/fake-login-custom'
// import './school-test/github-repo-search'
// import './component-styling/using-css'
// import './component-styling/using-css-module'
// import './component-styling/using-sass'
// import './component-styling/using-styled-components'
// import './component-styling/using-svg'
// import './component-styling/using-react-icons'
// import './use-reducer-demo/use-reducer-counter-1'
// import './use-reducer-demo/use-reducer-todo-app-1'
// import './use-callback-memo-demo/use-callback-counter-demo'
// import './use-callback-memo-demo/use-memo-demo'
import './use-callback-memo-demo/user-manage-app'









/*
[0303 / 작동 원리]
barbel : ES6 code => ES5 code / JSX => ES- code / ... [언어 변환]
브라우저에서 띄우는 UI는 JSX코드가 아닌 barbel을 통해 변환된 JS코드를 통해 인식

* JSX -> barbel -> JS -> compiler -> browser

react는 기본적으로 2개의 가상DOM (Virtual Dom)을 소유
이전 상태를 저장하는 DOM, 변경된 상태를 저장하는 DOM을 비교 -> 차이점이 있을 경우 바뀐 부분에 대하여 실제 DOM(가상 x)을 수정 => 알고리즘 최적화
createElement는 실제 DOM이 아닌 가상 DOM에 대해 요소를 추가, react가 실제 DOM에 요소 적용-

* react 요소 생성 (실제로 사용 x)
const img = React.createElement (
  'img',
  {
    src : "-",
    title : ""
  }
)



[0308 / ]

ReactDOM.render(
  <div> {element} </div>,
  document.getElementById('root')
);
-> public/index.html의 root <div> 안에 작성한 UI가 들어감






[0322 / useState, camelCase]
useState를 이용하여 값 변경이 가능 (setState)
useState에서 객체에 대한 값을 바꿀 경우,, 객체는 참조값을 저장하고 있기 때문에 객체값을 ...연산자를 이용하여 복사한 후 변경
  const [state,setState] = useState({value1:3,value2:6})
  onClick={()=>{setState({...state,value1:state.value1*3})}}

jsx의 모든 속성은 camelCase로 작성, HTML에서는 모두 소문자로 구성되어있음
  React에서는 onClick, HTML에서는 onclick
  React에서는 onKeyPress, HTML에서는 onkeypress








[0324 / ]
setState로 이전값에 변동을 줄 경우에는 (이전값에 참조해야하는 경우)
setCount(count+1) 보단 setCount(provious => provious+1)의 형태를 사용하는 것이 바람직함 (use-state-demo/counter-with-hook-caveat.js 참고)

> React 상태 변경 렌더링 과정
1. for(int i=0;i<4;i++){
    setCount(count+1)
  }
상태 변경 대기줄 : setCount(0+1) > setCount(0+1) > setCount(0+1) > setCount(0+1) >> 큐(대기줄)에 쌓아놓은 후 한꺼번에 렌더링

2. for(int i=0;i<4;i++){
    setCount(prev => prev + 1)
  }
상태 변경 대기줄 : setCount(0+1) > setCount(1+1) > setCount(2+1) > setCount(3+1)

주의할점 : 파라미터를 받아 작동하는 함수를 호출할 경우 onClick={funcName(parameter)}로 호출하면 무한루프(무한 렌더링)이 발생
{ } 안에는 함수자체가 들어가야 하지만 위와 같이 작성하면 호출한 함수의 return값이 들어간다.
따라서 onClick={() => funcName(parameter)}로 작성해야 정상작동이 된다.




[0331 / 단방향 데이터 흐름]
부모 컴포넌트가 변경되는 경우에 자식 컴포넌트도 모두 re-render가 발생
상태 끌어올리기 -> 특정 상태값을 여러 컴포넌트에서 사용해야하는 경우 그 컴포넌트들의 가장 가까운 공통 조상 컴포넌트에 상태를 배치하는 전략



> 메인 이펙트 : 상태관리 및 상태변환에 따르는 뷰를 구성하는것 (컴포넌트 구성 과정)
> 사이드 이펙트
 : 그 외의 작업 (네트워크 통신, 타이머 설정, 로컬 스토리지 사용, DOM API 활용 ...)
 : useEffect 훅을 사용 -> 부작용(side-effect)에 해당하는 작업을 수행할 때 사용
 : 정리가 필요한 side-effect(타이머,,)와 정리가 필요없는 side-effect(네트워크,,) 구분 필요

side-effect는 re-render(렌더링) 이후에 호출된다.

re-render이 발생하는 경우
-> state값의 변경
-> props(상위 컴포넌트의 값)의 변경

> 의존 배열
* use-effect-demo/use-effect-deps.js에서 useEffect의 두번째 인자값에 따른 차이점 살펴보기



[0407 / 통신]
fetch('url')을 통해 http통신이 이루어지면
promise객체를 반환,
.then(함수)를 통해 json으로 변환, json도 마찬가지로 promise 객체를 반환하므로 다시 .then()메서드를 사용하여 이후 작업 진행

useRef훅
> 값이 변경되어도 re-render를 하지 않기 때문에 내부적으로 필요한 임의의 값을 저장할 때 사용
(useState는 값이 변경되면 해당 컴포넌트를 다시 불러오기 때문에(re-render) 차이가 있음)
보통 dom요소(input,canvas..)를 저장하는 데에 사용
> 사용방법
const inputEl = useRef() -> 선언
<input type='text' ref={inputEl} /> -> 연결

Controlled (권장)
> dom의 상태와 react(상태관리자)의 상태를 동기화

UnControlled
> 파일저장과 같은 작업시 uncontrolled작업이 필수







[0426 / CSS 모듈 불러오기]

특정 컴포넌트에 종속된 스타일을 적용해야 할 때 사용
CSS의 파일의 이름을 "컴포넌트이름.module.css"로 명명
CSS 파일의 이름이 ".module.css"로 끝나면 선택자 정보를 이용하여 내부적으로 고유한 클래스 이름을 부여
import 명령어로 모듈을 불러올 때 스타일과 관련된 정보가 담긴 객체로 불러옴

id값과 클래스 이름이 자동으로 css모듈의 속성명이 됨

import buttonStyle from './MyButton.module.css'를 넣을 경우
<style></style>코드를 자동으로 적용-생성함
요소의 className의 값으로 적용하고싶은 스타일을 지정
예시 ) <button className={`${buttonStyle.font}`}></button>
+ ) 클래스 이름을 쉽게 적용하는 모듈 -> npm install classnames

SASS : .scss를 .css로 변환하는 것

styled를 사용해서 style를 적용할 때, 특정 클래스를 불러와야 할 경우 &:hover와 같이 사용한다.
이때 &는 대명사와 같은 역할을 한다.


두 코드의 차이
import HelloSvg from './hello.svg' : img.svg를 img태그로서 불러옴
import { ReactComponent as HelloComponent } from './hello.svg' : 수많은 <g>태그 (svg그자체) 로딩

dispatch 함수를 호출할 경우 reducer 함수가 자동으로 호출됨




[0428 / reducer, useCallback, useMemo 훅]
1. useReducer 훅 -> reducer함수와 초기상태를 받는 훅
reducer함수가 작동하여 새 상태를 반환할 경우 리렌더링 유발 및 
새 상태를 반환해주는 역할을 수행

2. reducer 함수 => 상태와 액션(수행할 작업 정보가 담긴 객체)를 받아서 새 상태를 반환하는 함수
(단, 변경 사항이 없으면 기존 상태 반환 가능)

3. 액션 => dispatch함수를 통해 reducer함수로 전달할 작업에 대한 내용이 담긴 객체

4. 액션 상수(*) => 액션의 type문자열 값을 상수화(오타 방지 및 명령어 문자열 변경 가능 용이)

5. 액션 생성 함수(*) -> 액션을 매번 만들지 않고 함수 호출을 통해서 액션 객체를 반환해주는 함수
(실수 방지 및 코드 가독성 향상)

(*)는 필수 요소는 아님







*/



