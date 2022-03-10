import React from 'react'
import ReactDOM from 'react-dom'

function HelloWorld() {
    return <h1>Hello, World!</h1>
}
  

ReactDOM.render(
    /* React.Fragment : 실제로 부모태그가 생성되지 않음 => <></>가 React.Fragment를 축약한 버전 */
    <React.Fragment>
        <HelloWorld/>
    </React.Fragment>
    , document.getElementById('root'))

