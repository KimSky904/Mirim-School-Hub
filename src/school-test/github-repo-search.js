import React, { useState, useContext, createContext, useEffect } from "react"
import ReactDOM from "react-dom"

const GitRepoContext = createContext(null)

const Search = ({onsubmit}) => {
    const [inputValue, setInputValue] = useState('')
    return (
        <>
            <input type="text" value={inputValue} onChange={e => setInputValue(e.target.value)}/>
            <button onClick={e => inputValue.trim().length !== 0 ? onsubmit(inputValue) : null}> 검색</button>
        </>
    )
}

function RepoItem(props) {
    const {repoName, description, repoUrl, language} = props.repo

    return (
        <div>
            <p>name: {repoName}</p>
            <p>description: {description}</p>
            <p>url: {repoUrl}</p>
            <p>language: {language}</p>
        </div>
    )

}

function AllComponent(props) {
    const { repoInfo, setRepoInfo} = useContext(GitRepoContext)
    const [ fetching, setFetching ] = useState(false)
    const [ repos, setRepos ] = useState([])
    const [ keyword, setKeyword ] = useState('')

    useEffect(() => {
        if(keyword){
            setFetching(true)
            fetch(`https://api.github.com/users/${keyword}/repos`, { headers: { 'Authorization': "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" } })
            .then(res => res.json())
            .then(data => {
                console.log(data)                
                setRepoInfo(data);
                setFetching(false)
            })
        }
    },[keyword])

    const handleX = () => {
        setFetching(false)
        setRepoInfo(null)
    }

    return (
        <div>
            {
                !fetching? 
                <Search onsubmit={setKeyword}/>
                :
                <ul>
                    {
                        repos.map((repo,idx) => {
                            return(<li key={idx}>
                                <RepoItem repo={repo}/>
                            </li>)
                        })
                    }
                </ul> 

            }
        </div>
    )
}

function App() {
    const [ repoInfo, setRepoInfo ] = useState(null)

    return (
        <GitRepoContext.Provider value={ { repoInfo, setRepoInfo } }>
            <AllComponent/>
        </GitRepoContext.Provider>
    )
}

ReactDOM.render(<App />, document.getElementById("root"));