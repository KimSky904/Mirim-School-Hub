import React from "react"; 
import ReactDOM from "react-dom";

const Child = props => <div>{props.children}</div>

const SlotMachine = function(props){
    const {first,second,third} = props
    const check = (first===second && second===third)
    return (
        <div style={check && first=='7'? {color: 'red'} : null}>
            {first} {second} {third}  {check? <h2>Congrats!</h2>:null} </div>
    )}


/* 

    <SlotMachine first="X" second="Y" third="Z"/>
    <SlotMachine first="X" second="X" third="X"/>
    <SlotMachine first="7" second="7" third="7"/>

*/

    

ReactDOM.render(
    <SlotMachine first="7" second="7" third="7"/>
    , document.getElementById('root'))