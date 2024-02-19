import React from 'react'
import ReactDOM from 'react-dom'
import HelloSvg from './hello.svg'
// 컴포넌트처럼 사용하기 위해서 import
import { ReactComponent as HelloComponent } from './hello.svg'

const App = function(props) {
    return (
        <div>
            {/* 이미지의 src 속성으로 불러온 값을 전달 */}
            <img src={HelloSvg} style={ { width: "200px" } } /><br />
            <HelloComponent/>
        </div>
    )
}

ReactDOM.render(<App />, document.getElementById("root"))