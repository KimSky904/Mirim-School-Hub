import React, { useState,useEffect } from 'react'
import ReactDOM from 'react-dom'


const App = function(props) {
    const [count, setCount] = useState(0)
    const [timerState, setTimerState] = useState({
        time : props.time,
        timeout: false
    })
    useEffect(()=>{
        const id = setInterval(()=>{
            setTimerState(prev=>{
                //끝인지 판단
                if(prev.time === 1){
                    clearInterval(id)
                    return{timeout:true, time:prev.time-1}
                }
                else return{...prev, time:prev.time - 1}
            })
        },1000)
    },[])
    return (
        <div>
            <div>남은 시간 : {timerState.time}초</div>
            <div>클릭 횟수 : {count}</div>
            <button onClick={() => {
                // !timerState.timeout?setCount(count+1):null
                // if(timerState.timeout) {
                //     setCount(count+1)
                // }
                if(timerState.time > 0) setCount(count+1)
            }}>Click!!!</button>
        </div>
    )
}

ReactDOM.render(<App time={5} />, document.getElementById("root"))