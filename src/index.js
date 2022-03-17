// import './jsxstudy/jsx-study1'
// import './jsxstudy/jsx-study2'

// import './school-test/HelloWorld'

//import './component-basic/props-basic'
import './component-basic/props-children'







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



*/