import React, { useState, useEffect, useRef } from "react"
import ReactDOM from "react-dom"

// function Form() {
//     const nameInputRef = useRef()
//     const emailInputRef = useRef()
//     const passwordInputRef = useRef()

//     const handleSubmit = e => {
//         e.preventDefault()
//         console.log("name : "+nameInputRef.current.value)
//         console.log("email : "+emailInputRef.current.value)
//         console.log("password : "+passwordInputRef.current.value)
//     }

//     const handleReset = () => {
//         // 4. Reset 버튼을 누르면 모든 input 요소의 값을 ''로 초기화하기
//         nameInputRef.current.value = ''
//         emailInputRef.current.value = ''
//         passwordInputRef.current.value = ''
//     }   

//     return (
//         <>
//             <label>
//                 Name:
//                 <input type="text" placeholder="name" ref={nameInputRef} />
//             </label>
//             <label>
//                 Email:
//                 <input type="text" placeholder="email" ref={emailInputRef}/>
//             </label>
//             <label>
//                 Password:
//                 <input type="password" placeholder="password" ref={passwordInputRef}/>
//             </label>

//             <hr />

//             {/* 2. 버튼 누르면 해당되는 input 요소에 focus() 메소드 호출해서 입력 가능 상태로 만들어주기 */}
//             <button onClick={()=>{nameInputRef.current.focus()}}>
//                 Focus Name Input
//             </button>
//             <button onClick={()=>{emailInputRef.current.focus()}}>
//                 Focus Email Input
//             </button>
//             <button onClick={()=>{passwordInputRef.current.focus()}}>
//                 Focus Password Input
//             </button>

//             <hr />

//             <button type="submit" onClick={handleSubmit}>Submit</button>
//             <button onClick={handleReset}>Reset</button>
//         </>
//     )
// }





function Form(){
    const [state,setState] = useState({
        name : '',
        email : '',
        password : ''
    })

    //hendler
    const handleNameChange = e => setState({...state,name:e.target.value})
    const handleEmailChange = e => setState({...state,email:e.target.value})
    const handlePassWdChange = e => setState({...state,password:e.target.value})
    const handleSubmit = e => {
        e.preventDefault()
        console.log("name : "+state.name,"email : "+state.email,"password : "+state.password)
    }
    const handleReset = e => {
        setState({name:'',email:'',password:''})
    }  

    return(
        <>
        <label>
            Name:
            <input type="text" value={state.name} placeholder="name" onChange={handleNameChange} />
        </label>
        <label>
            Email:
            <input type="text" value={state.email} placeholder="email" onChange={handleEmailChange}/>
        </label>
        <label>
            Password:
            <input type="password" value={state.password} placeholder="password" onChange={handlePassWdChange}/>
        </label>

        <hr />

        {/* 2. 버튼 누르면 해당되는 input 요소에 focus() 메소드 호출해서 입력 가능 상태로 만들어주기 */}
        <button>
            Focus Name Input
        </button>
        <button>
            Focus Email Input
        </button>
        <button>
            Focus Password Input
        </button>

        <hr />

        <button type="submit" onClick={handleSubmit}>Submit</button>
        <button onClick={handleReset}>Reset</button>
    </>
    )


}

ReactDOM.render(<Form />, document.getElementById("root"))