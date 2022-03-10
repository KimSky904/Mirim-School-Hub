import React from 'react'
import ReactDOM from 'react-dom'

// @@만 출력
<div>    
    @
    {true}    
    {false}    
    {undefined}    
    {null}
    @
</div>


const unreadMessages = []
const div2 = <div>
    <h1>Hello!</h1>
    {
        /* unreadMessages.length > 0에서 true일 경우 뒤의 식 실행, <h2>문이 return됨
        읽지 않은 메세지가 있을 경우 경고문을, 없을 경우 실행값이 없음 */
        unreadMessages.length > 0 && <h2>You have {unreadMessages.length} unread messages.</h2>
    }
</div>


function conditionalRender(age) {
    if(age >= 20) {
        return <div>성인</div>
    }
    else {
        return <div>미성년자</div>
    }
}
const div3 = <div>
    {conditionalRender(18)}
</div>






// JSX안에서 expression(식)은 사용 가능하지만, statement(구문)은 사용할 수 없음 => 삼항연산자 O, if / for문 X
const age = 20
const div4 = (
    <> {age >= 20? <div>성인</div> : <div>미성년자</div>} </>
)

const h1 = <h1 style={{color:"red", backgroundColor:"lightblue"}}>Hello, Style!</h1>

ReactDOM.render(h1, document.getElementById('root'))