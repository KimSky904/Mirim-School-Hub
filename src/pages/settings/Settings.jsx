import "./settings.css"
import Sidebar from "../../components/sidebar/Sidebar"

export default function Setting() {
    return (
        <div className="settings">
            <div className="sattingsWrapper">
                <div className="settingsTitle">
                    <span className="settingsUpdateTitle">Update Your Account</span>
                    <span className="settingsDeleteTitle">Delete Your Account</span>
                </div>
                <form className="settingsForm">
                    <label>Profile Picture</label>
                    <div className="settingsPP"> 
                        <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/7/7e/Circle-icons-profile.svg/1024px-Circle-icons-profile.svg.png"/>
                        <label htmlFor="fileInput">
                            <i className="settingsPPIcon far fa-solid fa-circle-user"></i>
                        </label>
                        <input type="file" id="fileInput" style={{display: 'none'}}/>
                    </div>
                    <label>UserName</label>
                    <input type="text" placeholder="KimSky"/>
                    <label>Email</label>
                    <input type="email" placeholder="KimCloud52@gmail.com"/>
                    <label>Password</label>
                    <input type="password"/>
                    <button className="settingsSubmit">Update</button>
                </form>
            </div>
            <Sidebar/>
        </div>
    )
}