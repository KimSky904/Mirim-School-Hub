import React, { useState, useContext, createContext } from "react"
import ReactDOM from "react-dom"

const LoginUserContext = createContext(null)


function AllComponent(props) {
    const { loginUser, setLoginUser} = useContext(LoginUserContext)
    const [ fetching, setFetching ] = useState(false)

    

    //login, logout
    const handleLogin = () => {
        setFetching(true)
        fetch('https://randomuser.me/api/', { headers: { 'Content-Type': 'application/json' } })
            .then(res => res.json())
            .then(data => {
                const login = data.results[0].login
                
                setLoginUser({
                    picture: data.results[0].picture.large,
                    username: login.username,
                    email: data.results[0].email,
                    cell: data.results[0].cell,
                });
            })
    }
    const handleLogout = () => {
        setLoginUser(null)
    }

    return (
        <div>
            {
                loginUser === null? 
                    !fetching?
                        <button onClick={handleLogin}>Login</button> 
                        :
                        <button disabled>.....~~~~뿡뿡</button>
                : 
                <div>
                    <button onClick={handleLogout}>Logout</button>
                    <div>
                        <img src={loginUser.picture} style={{ borderRadius: '50%' }}/>
                        <p>username: {loginUser.username}</p>
                        <p>email: {loginUser.email}</p>
                        <p>cell: {loginUser.cell}</p>
                    </div>
                </div>
            }
        </div>
    )
}

function App() {
    const [ loginUser, setLoginUser ] = useState(null)

    return (
        <LoginUserContext.Provider value={ { loginUser, setLoginUser } }>
            <AllComponent/>
        </LoginUserContext.Provider>
    )
}

ReactDOM.render(<App />, document.getElementById("root"));