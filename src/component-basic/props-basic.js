import React from 'react'
import ReactDOM from 'react-dom'


const ComponentWithProps = function(props){
    console.log(props)
    return <p>{JSON.stringify(props)}</p>
}

// 객체 구조 분해 할당?
const user = {name : "HANEUL", age : 20};
const {name,age} = user;

// parameter의 객체 구조 분해 할당
function func(uesr) {
    let name = user.name;
    let age = user.age;
    console.log(name,age)
}
// 동일 - 축약형
function func_re({name, age}){
    console.log(name,age)
}


const Greeting = function(props){
    const {name} = props // props 객체 속 name 속성값을 name에 넣어줌
    // const {name : N} = props -> props객체 속 name속성값을 N에 넣어줌 (이름지정)
    return <h1>Hello, {name}</h1>
}
// 동일 - 축약형
const Greeting_re = function({name}){
    return <h1>Hello, {name}</h1>
} 



const Greeting2 = function(props) {
    return <h1>Hello, {props.name} {props.age} {props.likes} {props.job}</h1>
}
// 동일 - 축약형
const Greeting2_re = function({name,age,likes,job}) {
    return <h1>Hello, {name} {age} {likes} {job}</h1>
}
//<Greeting2_re name="HANEUL" age={19} likes="LIKES" job="학생" />


const PersonProfile=function({ name, age, gender, profile, highlight }) {
    return (
        <div className='person'style={highlight? {color: 'red'} : null}>
            <h1>Profile</h1>
            <img src={profile} />
            <p>name : {name}</p>
            <p>age : {age}</p>
            <p>gender : {gender}</p>
        </div>    
    )}
const anotherPerson= {
        name: 'Jane',
        age: 28,
        gender: 'female',
        profile: 'https://randomuser.me/api/portraits/women/75.jpg'
    }
// <PersonProfile name='Ken' gender='male' age={24} {...rest} />

const PersonProfile2=function(props) {
    const {name, age, gender, profile} = props.person
        return (
            <div className='person'style={props.highlight? {color: 'red'} : null}>
                <h1>Profile</h1>
                <img src={profile} />
                <p>name : {name}</p>
                <p>age : {age}</p>
                <p>gender : {gender}</p>
            </div>    
        )}

//console.log(rest) // {age: 28, profile:'https://...'} -> 비구조할당에서 ...연산자는 나머지값을 가짐


// props : 속성 개체, name : 객체의 속성 / 참조 없이 <Greeting/> 단독 사용 가능

//<PersonProfile name='John' age={35} gender='male' profile='https://randomuser.me/api/portraits/men/75.jpg'/>
//<PersonProfile {...anotherPerson} highlight/> -> 값없이 전달하면 true (highlight)

ReactDOM.render(<PersonProfile2 person={anotherPerson} />, document.getElementById('root')) //뒷 순서가 우선적으로 적용되기 때문에 ...rest등의 사용은 가장 앞부분에 넣는 것이 안전함
