var gamePattern = [];
var userClickedPattern = [];
var level = 0;
var started = false;
//buttoncolors
var buttonColors = ["red","blue","green","yellow"];


$(document).on("keypress",function()
{
    if(!started)
    {
        $("#level-title").text("Level "+level);
        nextSequence();
        started=true;
    }
});

function nextSequence()
{
    
    userClickedPattern=[];
    level ++;
    $("#level-title").text("Level "+level);

    var randomNumber = Math.floor(Math.random()*4);
    var randomChosencolor = buttonColors[randomNumber];
    gamePattern.push(randomChosencolor);
    //console.log(randomChosencolor);

    $("#"+randomChosencolor).fadeIn(100).fadeOut(100).fadeIn(100);
    playSound(randomChosencolor);

}

//detect button click event
$(".btn").on("click",function()
{
    var userChosenColor = this.id;
    //alert(userChosenColor);
    userClickedPattern.push(userChosenColor);
    playSound(userChosenColor);
    animatePress(userChosenColor);
    checkAnswer(userClickedPattern.length-1);
});

function playSound(name)
{
    var audio = new Audio("sounds/" + name + ".mp3");
    audio.play();
}

function animatePress(currentColor) {

    $("#" + currentColor).addClass("pressed");

    setTimeout(function () {
      $("#" + currentColor).removeClass("pressed");
    }, 100);

}

function checkAnswer(currentLevel)
{
    if(gamePattern[currentLevel] == userClickedPattern[currentLevel])
    {    
        console.log("Correct")
        if(userClickedPattern.length === gamePattern.length)
        {
            setTimeout(function(){
                nextSequence();
            },1000);
        }
    }

    else{

        console.log("wrong");
        var gameOver = new Audio("sounds/wrong.mp3");
        gameOver.play();
        $("body").addClass("game-over");
        setTimeout(function(){
            $("body").removeClass("game-over");
        },200);
        $("#level-title").text("Game Over, Press any key to Restart!");
        startOver();

    }
}


function startOver()
{
    level=0;
    started=false;
    gamePattern=[];
}














// $(".btn").on("click",function(){
// nextSequence();
// });