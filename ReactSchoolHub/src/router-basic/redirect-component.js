import React from "react"
import ReactDOM from 'react-dom'
import {
    BrowserRouter as Router,
    Routes, Route, Link, 
    Navigate, useNavigate
} from "react-router-dom"

const UserInfo = (props) => {
    const id = useParams()
    return (
        <div>{id}</div>
    )
}

function App() {
    return (
        <Router>
            <Link to="/users/1">1번 유저</Link><br />
            <Link to="/users/2">2번 유저</Link><br />
            <Link to="/users/3">3번 유저</Link><br />

            <Routes>
                <Route path="/users/:id" element={<UserInfo/>} />
            </Routes>
        </Router>
    )
}

ReactDOM.render(<App />, document.getElementById("root"))