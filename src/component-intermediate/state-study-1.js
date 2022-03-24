import React, {useState} from 'react'
import ReactDOM from 'react-dom'

const Counter = function(props) {
    const [count,setCount] = useState(0)
    const [text,setText] = useState("a")
    // React에서는 onClick, HTML에서는 onclick
    // React에서는 onKeyPress, HTML에서는 onkeypress
    return (
        <div>
            <h1>{count}</h1>
            <button onClick={() => setCount(count+1)} style={{background:'lightyellow'}}>  PLUS</button>
            <h1>{count}</h1>
            <button onClick={() => setCount(provious => provious+1)} style={{background:'lightyellow'}}>  PLUS</button>
            <h1>{text}</h1>
            <button onClick={() => setText(text+"a")} style={{background:'lightgreen'}}>  ADD</button>
        </div>
    )
}


const UserProfile = function(props){
    const [userName,setUserName] = useState("BOB")
    const [userAge,setUserAge] = useState(13)
    return (
        <div>
            <h1>{userName}</h1>
            <h2>{userAge}</h2>
        </div>
    )
}

const StateDemoComponent = function(props) {
    // 저장할상태값과관련된제약이없으므로객체도저장가능
    const [state, setState] =useState({value1: "hello",value2: 1000    })
    return (
        <div>
            <button onClick={() => {
                    if(state.value1==="hello") {
                        // 기존객체를복사하는과정에서새롭게값을갱신해주는것을확인가능
                        setState({ ...state, value1: "bye" } )
                    } else {
                        setState({ ...state, value1: "hello" } )
                    }
                }}>{state.value1}
            </button>
            <br/>
            <button onClick={() => {setState({ ...state, value2: state.value2*2 } ) }}>{state.value2}</button></div>    
        )
    }

// React는 객체의 변경여부를 비교할 때 참조를 기준으로 비교하기 때문에 (가상DOM 참고)
// ...state와 같이 새로운 참조객체를 생성(복사)하여 값을 갱신해야 렌더링이 정상적으로 진행된다.

const Testing = function(props) {
    const [state,setState] = useState({value1:3,value2:6})
    return (
        <div>
            <h1>{state.value1}  {state.value2}</h1>
            <button onClick={()=>{setState({...state,value1:state.value1*3})}}>UPDATE VALUE1</button><br/>
            <button onClick={()=>{setState({...state,value2:state.value2*2})}}>UPDATE VALUE1</button><br/>
        </div>
    )
}

const StateDemoComponent2 =function(props) {
    // 저장할상태값과관련된제약이없으므로객체도저장가능
    const [state, setState] = useState(
        {
            value1: "hello",
            value2: {
                inner1: "world",
                inner2: 1234 
            },
            value3: {
                inner3: "react", 
                inner4: 9999        
            }    
        })
    return (
        <div>
            <h1>{state.value1}</h1>
            <h1>{JSON.stringify(state.value2)}</h1>
            <h1>{JSON.stringify(state.value3)}</h1>
            <button onClick={() => {
                // 중첩객체인 value2의 inner2 값만을수정하고싶다고가정
                setState(
                    {...state,
                    value2: {
                        // 중첩객체의내용도복사필요 (안그러면 inner1 값이사라지게됨)
                        ...state.value2,inner2: 5678                    
                    }                
            })}}>값변경</button>
        </div>    
        )}

ReactDOM.render(<Counter/>, document.getElementById('root')) 