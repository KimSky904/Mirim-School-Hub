import React, { useState } from "react"
import ReactDOM from "react-dom"


const DrawStar = (props) => {
    console.log(props.num)
    const arr = [] 
    for(let i=1;i<=props.num;i++){
        for(let j=1;j<=i;j++){
            arr.push('*')
        }
        arr.push(<br/>)
    }

    return (
        <div>{arr}</div>
    )
}

ReactDOM.render(<DrawStar num={3}/>, document.getElementById("root"));