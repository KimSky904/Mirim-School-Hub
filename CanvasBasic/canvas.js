var canvas = document.querySelector('canvas');
canvas.width = window.innerWidth*0.5;
canvas.height = canvas.width*7/12;

var c = canvas.getContext('2d');


//장애물 반지름 지정
var radius = 30;

function Circle(x, y){
    //x,y값 초기좌표
    this.x = x; 
    this.y = y;
    //x값 이동좌표
    this.movX = x;
    //장애물 이동 속도 조절
    this.speed = 2;

    this.draw = function(){
        console.log("draw func");
        c.beginPath();
        c.arc(this.x,100,radius,0,Math.PI*2,false);
        c.strokeStyle = 'black';
        c.stroke();
    }
    this.update = function(){
        console.log("update func");
        if(this.x+radius > canvas.width || this.x-radius < 0)  
            this.speed = -this.speed;
        this.x+=this.speed;

        this.draw();
    }
}

var circle = new Circle(200,200);


function animate(){
    console.log("animate func");
    requestAnimationFrame(animate);
    c.clearRect(0,0,innerWidth,innerHeight);
    circle.update();
}

animate();