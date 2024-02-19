import "./sidebar.css";

export default function Sidebar() {
    return (
        <div className="sidebar">
            <div className="sidebarItem">
                <span className="sidebarTitle">ABOUT ME</span>
                <img src="https://avatars.githubusercontent.com/u/67359955?v=4"/>
                <p>
                    Lorem, ipsum dolor sit amet consectetur adipisicing elit. 
                    Sint quo amet soluta? 
                </p>
            </div>
            <div className="sidebarItem">
                <span className="sidebarTitle">CATEGORIES</span>
                <ul className="sidebarList">
                    <li className="sidebarListItem">Life</li>
                    <li className="sidebarListItem">Music</li>
                    <li className="sidebarListItem">Style</li>
                    <li className="sidebarListItem">Sports</li>
                    <li className="sidebarListItem">Tech</li>
                    <li className="sidebarListItem">Cinema</li>
                </ul>
            </div>
            <div className="sidebarItem">
                <span className="sidebarTitle">FOLLOW US</span>
                <div className="sidebarSocial">
                    <li className="sidebarIcon fa-brands fa-facebook-square"></li>
                    <li className="sidebarIcon fa-brands fa-instagram-square"></li>
                    <li className="sidebarIcon fa-brands fa-twitter-square"></li>
                    <li className="sidebarIcon fa-brands fa-github-square"></li>
                </div>
            </div>
        </div>
    );
}