import React, { useState, useCallback, useMemo } from 'react'
import ReactDOM from "react-dom"

const UserManageApp = () => {
    const [users, setUsers] = useState([
        { name: "John", age: 23 },
        { name: "Jane", age: 18 },
        { name: "Paul", age: 43 },
        { name: "Sally", age: 14 },
    ])
    // input 요소와 동기화하도록 코드 작성
    const [name, setName] = useState('')
    const [age, setAge] = useState(20)

    // useCallback 사용하여 새 사용자 추가하는 함수 생성 및 저장
    // 의존배열에 users만 넣었을 경우 첫번째 user추가 상황에서 name과 age만 변경될 뿐,
    // users객체 자체는 변경사항이 없다. 따라서 버튼을 처음 눌렀을 때 기본값('',0)이 들어가는 것이다.
    const addUser = useCallback(() => {
        setUsers(users.concat({name,age}))
    },[users,name,age])
    // useMemo 사용하여 나이 20 미만인 미성년자 수 저장
    const minorCount = (
        useMemo(() => {
            return users.filter(u => u.age < 20).length
        },[users])
    )
    // useMemo 사용하여 나이 20 미만인 미성년자의 이름을 배열 형태로 저장
    const minorNames = (
        useMemo(() => {
            var list = [];
            for(const user of users){
                if(user.age < 20) list.push(user.name)
            }
            return list
        },[users])
    )

    return (
        <div>
            <div>
                <label>이름</label> <input type="text" value={name} onChange={(e) => { setName(e.target.value) }}/><br />
                <label>나이</label> <input type="number" value={age} onChange={(e) => { setAge(e.target.value) }}/><br />
                <button onClick={addUser}>회원 추가</button>
            </div>
            <hr />
            <div>미성년자 회원 수 : {minorCount}</div>
            <div>미성년자 회원 이름 : {JSON.stringify(minorNames)}</div>
            <ul>
            {
                users.map(u => <li>이름 : {u.name}, 나이 : {u.age}</li>)
            }
            </ul>
        </div>
    )
}

ReactDOM.render(<UserManageApp />, document.getElementById('root'))