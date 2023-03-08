<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>SIGN UP</title>
        <style>
            .fs{
                width: 550px;
                height:450px;
                text-align: center;
                background-color:lightcyan;
                border-radius:30px;
                margin: auto;
                margin-top:auto;
            }
            .bg{
                background-image:url(form.jpg);
                background-size:cover;
            }
            .txtbox{
                margin-top: 10px;
                background:white;
                text-align:start;
                font-size: 15px;
                font-family: sans-serif;
                height: 3px;
                width: 300px;
                padding: 15px;
                border-radius: 15px;
                box-shadow: 0 4px 0 grey;    
            }
            .txtbox:hover{
                background-color:silver;
            }
            .btn{
                width: 340px;
                height: 35px;
                border-radius: 15px;
                font-size: 20px;
                background-color:aquamarine;  
            }
            a{
                color: red;
            }

        </style>

        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="">
    </head>
    <body class="bg">
        <div class="fs">
            <h1>Sign up/Register</h1>
            <form method="POST" action="form.php">
                <input type="text" class="txtbox" name="name" required placeholder="Enter Name"><br><br>
                <input type="password" class="txtbox" name="pwd" required placeholder="Password"><br><br>
                <input type="email" class="txtbox" name="email" required placeholder="Enter email"><br><br>
                <input type="password" class="txtbox" name="cpwd" required placeholder="Confirm Password"><br><br>
                <input type="submit" class="btn" name="submit" value="sign up"><br><br> 
                <a href="formboot.php">already a user?</a>
            </form>
        </div>
    </body>
</html>
<?php
$host        = "host=localhost";
$port        = "port=5432";
$dbname      = "dbname = mydb";
$credentials = "user = postgres password=thapa123";
$db = pg_connect("$host $port $dbname $credentials");

if(isset($_POST["submit"])){
    $name=$_POST["name"];
    $email=$_POST["email"];
    $password=$_POST["pwd"];
    $cpassword=$_POST["cpwd"];
    

    if($password==$cpassword){
        $sql = "select * from signup where email='$email'or name='$name'";
        //echo $sql;
        $ret = pg_query($db,$sql);
            if(pg_num_rows($ret)!=0){
                echo '<script type="text/javascript"> alert("User already registered!")</script>';
            }
            else{
                $sql ="INSERT INTO signup(name,email,password,cpassword)VALUES('$name','$email','$password','$cpassword')"; 
                //echo $sql;
                $ret = pg_query($db,$sql);
                if($ret){
                    echo '<script type="text/javascript"> alert("Signed in successfully")</script>';  //not showing an alert box.
                }
                else{
                echo '<script type="text/javascript"> alert("Signed in failed")</script>';
                }
            }
    }
    else{
        echo '<script type="text/javascript"> alert("Password and confirm password does not match")</script>';
    }

}
?>
