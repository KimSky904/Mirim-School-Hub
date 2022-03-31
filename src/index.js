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
import './use-effect-demo/use-effect-using-local-storage'

// 1주차
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




*/



