export class ball{
    constructor(stageWidth, stageHeight,radius,speed){
        this.radius = radius;
        this.vx = speed;
        this.vy = speed;

        const diameter = this.radius*2;
        this.x = diameter + (Math.random()*stageWidth - diameter);
        this.y = diameter + (Math.random()*stageHeight - diameter);

    }

    draw(){
        this.x = this.vx;
        this.y = this.vy;

        this.bounceWindow(stageWidth, stageHeight);

        ctx.fillStyle = '#fdd700';
        ctx.beginPath();
        ctx.arc(this.x, this.y,this.radius,0,2*Math.PI);
        ctx.fill();
    }

    bounceWindow(stageWidth, stageHeight){
        const minX = this.radius;
        const maxX = stageWidth - this.radius;
        const minY = this.radius;
        const maxY = stageHeight - this.radius;

        //공이 window 벽면에 닿을 경우 반대로 튀도록 정의
        if(this.x <= minX || this.x >=maxX){
            this.vx *= -1;
            this.x += this.vx;
        } else if(this.y <= minY || this.y >=maxY){
            this.vy *= -1;
            this.y += this.vy;
        }
    }
}