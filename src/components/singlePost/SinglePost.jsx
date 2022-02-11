import "./singlepost.css"

export default function SinglePost() {
  return (
    <div className='singlepost'>
        <div className="singlePostWrapper">
            <img src="https://search.pstatic.net/sunny/?src=https%3A%2F%2Fi.pinimg.com%2Foriginals%2Fd5%2F2f%2Fd2%2Fd52fd2983141254bee0a69f74f3f7238.jpg&type=sc960_832 " alt="" className="singlePostImg" />
        </div>
        <h1 className="singlePostTitle">
            Lorem ipsum dolor sit amet
            <div className="singlePostEdit">
                <i className="singlePostIcon fa-solid fa-pen-to-square"></i>
                <i className="singlePostIcon fa-solid fa-trash-can"></i>
            </div>
        </h1>
        <div className="singlePostInfo">
            <span className="singlePostAuthor">Author : <b>Safak</b></span>
            <span className="singlePostDate">1 hour ago</span>
        </div>
        <p className="singlePostDesc">
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Omnis quisquam quasi nemo provident obcaecati consequuntur adipisci dolore officia totam tempora. Adipisci eius rerum aliquam dolorem dicta illo minima dignissimos quos.
                Lorem ipsum dolor sit, amet consectetur adipisicing elit. Deleniti dignissimos nihil officia minus quidem, harum autem pariatur veniam cumque provident, assumenda corrupti excepturi? Officiis eligendi voluptatibus assumenda autem fugit nesciunt!
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti cum soluta saepe ipsum, nihil ut deserunt odit ratione incidunt assumenda quasi voluptatem esse, ipsa expedita explicabo nemo unde? Placeat, qui.
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Omnis quisquam quasi nemo provident obcaecati consequuntur adipisci dolore officia totam tempora. Adipisci eius rerum aliquam dolorem dicta illo minima dignissimos quos.
                Lorem ipsum dolor sit, amet consectetur adipisicing elit. Deleniti dignissimos nihil officia minus quidem, harum autem pariatur veniam cumque provident, assumenda corrupti excepturi? Officiis eligendi voluptatibus assumenda autem fugit nesciunt!
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Deleniti cum soluta saepe ipsum, nihil ut deserunt odit ratione incidunt assumenda quasi voluptatem esse, ipsa expedita explicabo nemo unde? Placeat, qui.
            </p>
    </div>
  )
}
