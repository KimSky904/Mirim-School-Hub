import React from 'react'
import ReactDOM from 'react-dom'

function FirstComponent() {
    return <div>My First Component</div>
}
  

// ReactDOM.render(FirstComponent, document.getElementById('root')) -> X
ReactDOM.render(<FirstComponent/>, document.getElementById('root'))
