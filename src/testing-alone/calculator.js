import React from 'react'
import ReactDOM from 'react-dom'



ReactDOM.render(<PersonProfile2 person={anotherPerson} />, document.getElementById('root')) //뒷 순서가 우선적으로 적용되기 때문에 ...rest등의 사용은 가장 앞부분에 넣는 것이 안전함
