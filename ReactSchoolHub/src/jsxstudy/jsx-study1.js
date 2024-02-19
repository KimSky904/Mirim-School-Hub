import React from 'react'
import ReactDOM from 'react-dom'

const name = 'Josh Perez'
const element = <h1>Hello, {name}</h1>
const lst = [100,200,300]
const person = {
    name : 'Jhon',
    age : 20
}
function double(value){
    return value*2
}

const JSXwithExpressions = (<h1>
    {lst[0]}
    &nbsp;{person.name}
    &nbsp;{person.age}
    &nbsp;{2+2}
    &nbsp;{person.name.toUpperCase()}
    &nbsp;{person.name.length}
    &nbsp;{double(person.age)}
</h1>)

//JSX 내부 주석
const CommandTest = (
    /* */
    <h1>
        {/* */}
    </h1>)

ReactDOM.render(JSXwithExpressions, document.getElementById('root'))


// 중괄호{} 내부에 js코드를 작성하여 내용을 삽입하거나 속성값을 지정할 수 있다.

// 코드 작성 규칙
/*
1. const test = <h1>
    {lst[0]}
</h1>

2. const test =( <h1>
    {lst[0]}
</h1>)
*/


