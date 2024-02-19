import "./post.css"

export default function Post() {
    return (
        <div className="post">
            <img className="postImg" src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDAzMDRfMTE0%2FMDAxNTgzMzAxMTU5NzA1.fvRF3-d6FrcsYic4V0Ylo41qo4gXifPi3dh9wMo3mJog.XyVdY8l495u5pimLWmDwxoKWWu0X9whla4bPIvahubkg.JPEG.liebest1997%2Fw3_%25284%2529.jpg&type=sc960_832"/>
            <div className="postInfo">
                <div className="postCats">
                    <span className="postCat">Music</span>
                    <span className="postCat">Life</span>
                </div>
                <span className="postTitle">Lorem ipsum dolor sit amet</span>
                <hr/>
                <span className="postDate">1 hour ago</span>
            </div>
            <p className="postDesc">
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Ipsam quas, numquam architecto iste molestiae nemo ex impedit beatae. A officiis fugit ab amet fugiat error molestias recusandae saepe distinctio quas?
                Lorem ipsum dolor sit amet consectetur, adipisicing elit. Voluptatem corporis repellat esse molestias necessitatibus quasi obcaecati culpa perspiciatis doloribus dolor, aliquid quis dolorem, laboriosam architecto placeat ipsum blanditiis. Laboriosam, consectetur?
            </p>
        </div>
    )
}