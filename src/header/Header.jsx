import "./header.css";

export default function Header() {
    return (
        <div className="header">
            <div className="headerTitles">
                <span className="headerTitleSm">React & Node</span>
                <span className="headerTitleLg">Blog</span>
            </div>
            <img className="headerImg" src="https://twontow.com/wp-content/uploads/2017/05/watercolour-blog-header-purple.jpg" />
        </div>
    );
}